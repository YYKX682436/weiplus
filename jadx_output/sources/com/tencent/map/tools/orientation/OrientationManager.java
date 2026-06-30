package com.tencent.map.tools.orientation;

/* loaded from: classes13.dex */
public class OrientationManager extends android.view.OrientationEventListener implements android.hardware.SensorEventListener {
    private static final float THRESHOLD = 1.0E-6f;
    private android.content.Context contextObj;
    private float mLastAngle;
    private java.util.List<com.tencent.map.tools.orientation.OrientationListener> mListeners;
    private int mOrientation;

    public OrientationManager(android.content.Context context) {
        super(context, 3);
        this.mListeners = new java.util.ArrayList();
        this.contextObj = context;
    }

    public void addOrientationListener(com.tencent.map.tools.orientation.OrientationListener orientationListener) {
        if (this.mListeners.contains(orientationListener)) {
            return;
        }
        this.mListeners.add(orientationListener);
        if (this.mListeners.size() == 1) {
            try {
                enable();
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.contextObj.getSystemService("sensor");
                java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(11);
                if (sensorList.isEmpty()) {
                    return;
                }
                sensorManager.registerListener(this, sensorList.get(0), 2);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void destroy() {
        this.mListeners.clear();
        try {
            disable();
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.contextObj.getSystemService("sensor");
            if (!sensorManager.getSensorList(11).isEmpty()) {
                sensorManager.unregisterListener(this);
            }
        } catch (java.lang.Exception unused) {
        }
        this.contextObj = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (i17 >= 0) {
            this.mOrientation = i17;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float f17;
        if (sensorEvent.sensor.getType() == 11) {
            float[] fArr = new float[16];
            android.hardware.SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            android.hardware.SensorManager.getOrientation(fArr, new float[3]);
            boolean z17 = false;
            float degrees = (float) java.lang.Math.toDegrees(r1[0]);
            float degrees2 = (float) java.lang.Math.toDegrees(r1[1]);
            float degrees3 = (float) java.lang.Math.toDegrees(r1[2]);
            if (java.lang.Math.abs(degrees) <= THRESHOLD) {
                return;
            }
            if (java.lang.Math.abs(this.mLastAngle - degrees) > 30.0f) {
                this.mLastAngle = degrees;
                return;
            }
            float f18 = (degrees + this.mLastAngle) / 2.0f;
            this.mLastAngle = f18;
            try {
                if (this.contextObj.getResources().getConfiguration().orientation == 2) {
                    z17 = true;
                }
            } catch (java.lang.Exception unused) {
            }
            int i17 = this.mOrientation;
            if (z17) {
                if (i17 > 45 && i17 <= 135) {
                    f17 = 270.0f;
                } else if (i17 > 135 && i17 <= 225) {
                    f17 = 180.0f;
                } else if (i17 > 225 && i17 < 315) {
                    f17 = 90.0f;
                }
                f18 = (f18 + f17) % 360.0f;
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(this.mListeners);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.map.tools.orientation.OrientationListener orientationListener = (com.tencent.map.tools.orientation.OrientationListener) it.next();
                    if (orientationListener != null) {
                        orientationListener.onOrientationChanged(f18, degrees2, degrees3);
                    }
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.OutOfMemoryError unused2) {
            }
        }
    }

    public void removeOrientationListener(com.tencent.map.tools.orientation.OrientationListener orientationListener) {
        if (this.mListeners.contains(orientationListener)) {
            this.mListeners.remove(orientationListener);
            if (this.mListeners.isEmpty()) {
                try {
                    disable();
                    android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.contextObj.getSystemService("sensor");
                    if (sensorManager.getSensorList(11).isEmpty()) {
                        return;
                    }
                    sensorManager.unregisterListener(this);
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
