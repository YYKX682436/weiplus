package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class h implements android.hardware.SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    public android.hardware.SensorManager f253319f;

    /* renamed from: h, reason: collision with root package name */
    public android.hardware.Sensor f253321h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f253322i;

    /* renamed from: d, reason: collision with root package name */
    public long f253317d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f253318e = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.a0 f253320g = null;

    public h() {
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e();
        this.f253322i = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.MMSportStepDetector", "isSupportDeviceStep %b", java.lang.Boolean.valueOf(z17));
        if (this.f253322i) {
            a();
        }
    }

    public final boolean a() {
        try {
            if (this.f253319f == null) {
                this.f253319f = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
            }
            if (this.f253320g == null) {
                this.f253320g = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.a0(this);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.MMSportStepDetector", "Exception in registerDetector %s", e17.getMessage());
        }
        if (this.f253319f == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter") || !((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.HEALTHY, d85.f0.F)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.MMSportStepDetector", "no step sensor");
            return false;
        }
        android.hardware.Sensor defaultSensor = this.f253319f.getDefaultSensor(19);
        this.f253321h = defaultSensor;
        if (defaultSensor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.MMSportStepDetector", " TYPE_STEP_COUNTER sensor null");
            return false;
        }
        boolean registerListener = this.f253319f.registerListener(this.f253320g, this.f253321h, com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().optInt("stepCounterRateUs", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
        if (registerListener) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REGISTER_STEP_COUNTER_FAIL_INT, 0);
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REGISTER_STEP_COUNTER_FAIL_INT, 1);
            b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.MMSportStepDetector", "registerDetector() ok.(result : %s)", java.lang.Boolean.valueOf(registerListener));
        return registerListener;
    }

    public final void b() {
        try {
            if (this.f253319f == null) {
                this.f253319f = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.a0 a0Var = this.f253320g;
            if (a0Var != null) {
                this.f253319f.unregisterListener(a0Var);
                this.f253320g = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.MMSportStepDetector", "unregisterDetector() success!");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.MMSportStepDetector", "Exception in unregisterDetector %s", e17.getMessage());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        int i17 = 0;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null && fArr.length > 0) {
            long j17 = fArr[0];
            long j18 = sensorEvent.timestamp;
            long c17 = c01.id.c();
            if (java.lang.Math.abs(j17 - this.f253317d) >= 20 || c17 - this.f253318e >= 60000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.MMSportStepDetector", "Step change %d, sensorNanoTime %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
                this.f253317d = j17;
                this.f253318e = c17;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("lastTickTime", this.f253318e);
                bundle.putLong("lastStep", this.f253317d);
                bundle.putLong("lastTime", j18);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.l.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.g(this));
                return;
            }
            return;
        }
        if (sensorEvent == null || sensorEvent.values == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(sensorEvent == null);
            objArr[1] = java.lang.Boolean.valueOf(sensorEvent != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", objArr);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", java.lang.Integer.valueOf(sensorEvent.accuracy), java.lang.Long.valueOf(sensorEvent.timestamp));
        float[] fArr2 = sensorEvent.values;
        int length = fArr2.length;
        int i18 = 0;
        while (i17 < length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(fArr2[i17]));
            i17++;
            i18++;
        }
    }
}
