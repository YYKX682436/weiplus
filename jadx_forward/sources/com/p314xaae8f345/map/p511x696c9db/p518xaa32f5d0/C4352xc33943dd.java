package com.p314xaae8f345.map.p511x696c9db.p518xaa32f5d0;

/* renamed from: com.tencent.map.tools.orientation.OrientationManager */
/* loaded from: classes13.dex */
public class C4352xc33943dd extends android.view.OrientationEventListener implements android.hardware.SensorEventListener {

    /* renamed from: THRESHOLD */
    private static final float f17032x49f9f44b = 1.0E-6f;

    /* renamed from: contextObj */
    private android.content.Context f17033x10516cc8;

    /* renamed from: mLastAngle */
    private float f17034xf10e6df0;

    /* renamed from: mListeners */
    private java.util.List<com.p314xaae8f345.map.p511x696c9db.p518xaa32f5d0.InterfaceC4351xecd31684> f17035x32131c52;

    /* renamed from: mOrientation */
    private int f17036x54400723;

    public C4352xc33943dd(android.content.Context context) {
        super(context, 3);
        this.f17035x32131c52 = new java.util.ArrayList();
        this.f17033x10516cc8 = context;
    }

    /* renamed from: addOrientationListener */
    public void m36062x4c767043(com.p314xaae8f345.map.p511x696c9db.p518xaa32f5d0.InterfaceC4351xecd31684 interfaceC4351xecd31684) {
        if (this.f17035x32131c52.contains(interfaceC4351xecd31684)) {
            return;
        }
        this.f17035x32131c52.add(interfaceC4351xecd31684);
        if (this.f17035x32131c52.size() == 1) {
            try {
                enable();
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.f17033x10516cc8.getSystemService("sensor");
                java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(11);
                if (sensorList.isEmpty()) {
                    return;
                }
                sensorManager.registerListener(this, sensorList.get(0), 2);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: destroy */
    public void m36063x5cd39ffa() {
        this.f17035x32131c52.clear();
        try {
            disable();
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.f17033x10516cc8.getSystemService("sensor");
            if (!sensorManager.getSensorList(11).isEmpty()) {
                sensorManager.unregisterListener(this);
            }
        } catch (java.lang.Exception unused) {
        }
        this.f17033x10516cc8 = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (i17 >= 0) {
            this.f17036x54400723 = i17;
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
            if (java.lang.Math.abs(degrees) <= f17032x49f9f44b) {
                return;
            }
            if (java.lang.Math.abs(this.f17034xf10e6df0 - degrees) > 30.0f) {
                this.f17034xf10e6df0 = degrees;
                return;
            }
            float f18 = (degrees + this.f17034xf10e6df0) / 2.0f;
            this.f17034xf10e6df0 = f18;
            try {
                if (this.f17033x10516cc8.getResources().getConfiguration().orientation == 2) {
                    z17 = true;
                }
            } catch (java.lang.Exception unused) {
            }
            int i17 = this.f17036x54400723;
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
                arrayList.addAll(this.f17035x32131c52);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.map.p511x696c9db.p518xaa32f5d0.InterfaceC4351xecd31684 interfaceC4351xecd31684 = (com.p314xaae8f345.map.p511x696c9db.p518xaa32f5d0.InterfaceC4351xecd31684) it.next();
                    if (interfaceC4351xecd31684 != null) {
                        interfaceC4351xecd31684.m36061x8bdd8b03(f18, degrees2, degrees3);
                    }
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.OutOfMemoryError unused2) {
            }
        }
    }

    /* renamed from: removeOrientationListener */
    public void m36064x5367a780(com.p314xaae8f345.map.p511x696c9db.p518xaa32f5d0.InterfaceC4351xecd31684 interfaceC4351xecd31684) {
        if (this.f17035x32131c52.contains(interfaceC4351xecd31684)) {
            this.f17035x32131c52.remove(interfaceC4351xecd31684);
            if (this.f17035x32131c52.isEmpty()) {
                try {
                    disable();
                    android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.f17033x10516cc8.getSystemService("sensor");
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
