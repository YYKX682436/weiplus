package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u000f\u001a\u00020\u0007R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/tencent/kinda/framework/app/KindaShakeSensor;", "", "", "hasASensor", "hasGSensor", "hasGYSensor", "hasListen", "Ljz5/f0;", "resetThreshold", "", "threshold", "setThreshold", "Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "shakeListener", "startListen", "stopListen", "Landroid/hardware/SensorManager;", com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46637xcc18ebaa, "Landroid/hardware/SensorManager;", "<set-?>", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "getListener", "()Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "isShakeSupported", "()Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "ShakeSensorListener", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.app.KindaShakeSensor */
/* loaded from: classes13.dex */
public final class C3143xa2c7c4f3 {
    private static final java.lang.String TAG = "MicroMsg.ShakeSensorService";
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener listener;
    private final android.hardware.SensorManager manager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0007H&J\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "Landroid/hardware/SensorEventListener;", "", "result", "selfAdaptation", "", "shaken", "Ljz5/f0;", "onShake", "", "values", "onRelease", "reset", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "mScale", "[F", "mPrev", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.kinda.framework.app.KindaShakeSensor$ShakeSensorListener */
    /* loaded from: classes13.dex */
    public static abstract class ShakeSensorListener implements android.hardware.SensorEventListener {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.Companion INSTANCE = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.Companion(null);

        /* renamed from: LG_E510 */
        private static final java.lang.String f12111x32dc8ef3 = "LG-E510";
        private static final java.lang.String TAG = "MicroMsg.ShakeSensorListener";

        /* renamed from: THREAHOLD */
        private static int f12112x48fc4d39 = 0;

        /* renamed from: defaultThreahold */
        private static final int f12113xed90018 = 5;

        /* renamed from: defaultThreaholdLG */
        private static final int f12114xbc996393 = 4;
        private final float[] mScale = {2.0f, 2.5f, 0.5f};
        private final float[] mPrev = new float[3];

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener$Companion;", "", "", "threshold", "Ljz5/f0;", "setThreshold", "getDefaultThreshold", "", "LG_E510", "Ljava/lang/String;", "TAG", "THREAHOLD", "I", "defaultThreahold", "defaultThreaholdLG", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.tencent.kinda.framework.app.KindaShakeSensor$ShakeSensorListener$Companion, reason: from kotlin metadata */
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
                this();
            }

            /* renamed from: getDefaultThreshold */
            public final int m25395xb7af0ea0() {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wo.w0.m(), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.f12111x32dc8ef3) ? 4 : 5;
            }

            /* renamed from: setThreshold */
            public final void m25396xffa31629(int i17) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.f12112x48fc4d39 = e06.p.f(i17, 2, 20);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.TAG, "setThreshold: " + com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.f12112x48fc4d39);
            }
        }

        static {
            f12112x48fc4d39 = 5;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wo.w0.m(), f12111x32dc8ef3)) {
                f12112x48fc4d39 = 4;
            }
        }

        /* renamed from: getDefaultThreshold */
        public static final int m25390xb7af0ea0() {
            return INSTANCE.m25395xb7af0ea0();
        }

        /* renamed from: selfAdaptation */
        private final float m25391x6050857f(float result) {
            int i17 = f12112x48fc4d39;
            if (i17 >= 9) {
                return result;
            }
            if (result >= 14.0f) {
                f12112x48fc4d39 = 9;
                return result;
            }
            int i18 = ((int) result) - 4;
            if (i17 < i18) {
                f12112x48fc4d39 = i18;
            }
            return result;
        }

        /* renamed from: setThreshold */
        public static final void m25392xffa31629(int i17) {
            INSTANCE.m25396xffa31629(i17);
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        }

        /* renamed from: onRelease */
        public abstract void mo25374x90a72928();

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent event) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            float[] fArr = new float[3];
            float[] fArr2 = event.values;
            boolean z17 = false;
            for (int i17 = 0; i17 < 3; i17++) {
                float round = java.lang.Math.round(this.mScale[i17] * (fArr2[i17] - this.mPrev[i17]) * 0.45f);
                fArr[i17] = round;
                if (m25391x6050857f(java.lang.Math.abs(round)) > f12112x48fc4d39) {
                    z17 = true;
                }
                this.mPrev[i17] = fArr2[i17];
            }
            if (z17) {
                event.sensor.getName();
                float f17 = fArr2[0];
                float f18 = fArr2[1];
                float f19 = fArr2[2];
                mo25375xb04b2467(true);
                m25393xb04b2467(event.values);
            }
        }

        /* renamed from: onShake */
        public abstract void mo25375xb04b2467(boolean z17);

        /* renamed from: onShake */
        public final void m25393xb04b2467(float[] fArr) {
        }

        /* renamed from: reset */
        public final void m25394x6761d4f() {
            f12112x48fc4d39 = 5;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wo.w0.m(), f12111x32dc8ef3)) {
                f12112x48fc4d39 = 4;
            }
        }
    }

    public C3143xa2c7c4f3(android.content.Context context) {
    }

    /* renamed from: hasASensor */
    private final boolean m25377x17c57781() {
        android.hardware.SensorManager sensorManager = this.manager;
        if (sensorManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "cannot init sensor manager");
            return false;
        }
        java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
        return sensorList != null && sensorList.size() > 0;
    }

    /* renamed from: hasGSensor */
    private final boolean m25378x552adb07() {
        return false;
    }

    /* renamed from: hasGYSensor */
    private final boolean m25379x6e5da3e6() {
        return false;
    }

    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener getListener() {
        return this.listener;
    }

    /* renamed from: hasListen */
    public final boolean m25381xe339b101() {
        return this.listener != null;
    }

    /* renamed from: isShakeSupported */
    public final boolean m25382xffabb412() {
        return m25377x17c57781() || m25378x552adb07() || m25379x6e5da3e6();
    }

    /* renamed from: resetThreshold */
    public final void m25383xae186fdc() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener shakeSensorListener = this.listener;
        if (shakeSensorListener != null) {
            shakeSensorListener.m25394x6761d4f();
        }
    }

    /* renamed from: setThreshold */
    public final void m25384xffa31629(int i17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.INSTANCE.m25396xffa31629(i17);
    }

    /* renamed from: startListen */
    public final void m25385x84386cc9(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener shakeSensorListener) {
        m25386xa30a7869();
        if (!m25377x17c57781()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no sensor found for shake detection");
            return;
        }
        this.listener = shakeSensorListener;
        android.hardware.SensorManager sensorManager = this.manager;
        if (sensorManager != null) {
            sensorManager.registerListener(shakeSensorListener, sensorManager.getDefaultSensor(1), 1);
        }
    }

    /* renamed from: stopListen */
    public final void m25386xa30a7869() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener shakeSensorListener = this.listener;
        if (shakeSensorListener != null) {
            if (shakeSensorListener != null) {
                shakeSensorListener.mo25374x90a72928();
            }
            android.hardware.SensorManager sensorManager = this.manager;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.listener, sensorManager.getDefaultSensor(1));
            }
            this.listener = null;
        }
    }
}
