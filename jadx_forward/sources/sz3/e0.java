package sz3;

/* loaded from: classes15.dex */
public final class e0 implements android.hardware.SensorEventListener {
    public final void a(int i17) {
        if (sz3.k0.f495595x <= 0 || java.lang.System.currentTimeMillis() - sz3.k0.f495595x >= 200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsSensorDetectManager", "updateMotionDetectStatus type: " + i17);
            sz3.k0.f495595x = java.lang.System.currentTimeMillis();
            vz3.t tVar = vz3.t.f523243a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n nVar = sz3.k0.f495594w;
            nVar.f298638e = !sz3.k0.f495572a.a();
            nVar.f298639f[2] = true;
            nVar.f298637d = java.lang.System.currentTimeMillis();
            nVar.f298639f[1] = true;
            tVar.f(nVar);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        if ((sensorEvent != null ? sensorEvent.sensor : null) == null || (fArr = sensorEvent.values) == null || fArr.length < 3) {
            return;
        }
        sensorEvent.sensor.getType();
        if (sensorEvent.sensor.getType() == 10) {
            sz3.k0 k0Var = sz3.k0.f495572a;
            float[] fArr2 = sensorEvent.values;
            sz3.k0.f495581j = fArr2[0];
            sz3.k0.f495582k = fArr2[1];
            sz3.k0.f495583l = fArr2[2];
            sz3.k0.f495588q = java.lang.System.currentTimeMillis();
            a(sensorEvent.sensor.getType());
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float[] fArr3 = sensorEvent.values;
            float f17 = fArr3[0];
            float f18 = fArr3[1];
            float f19 = fArr3[2];
            sz3.k0 k0Var2 = sz3.k0.f495572a;
            sz3.k0.f495590s = java.lang.System.currentTimeMillis();
            double sqrt = java.lang.Math.sqrt((f17 * f17) + (f18 * f18) + (f19 * f19));
            sz3.k0 k0Var3 = sz3.k0.f495572a;
            sz3.k0.f495591t = sqrt > ((double) ((java.lang.Number) ((jz5.n) sz3.k0.f495574c).mo141623x754a37bb()).floatValue());
            a(sensorEvent.sensor.getType());
        }
    }
}
