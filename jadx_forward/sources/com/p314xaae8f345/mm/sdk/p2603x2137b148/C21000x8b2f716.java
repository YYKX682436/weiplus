package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* renamed from: com.tencent.mm.sdk.platformtools.SensorController */
/* loaded from: classes12.dex */
public class C21000x8b2f716 extends android.content.BroadcastReceiver implements android.hardware.SensorEventListener {

    /* renamed from: o, reason: collision with root package name */
    public static double f273960o = -1.0d;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f273961p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.hardware.SensorManager f273962d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 f273963e;

    /* renamed from: f, reason: collision with root package name */
    public final android.hardware.Sensor f273964f;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f273967i;

    /* renamed from: m, reason: collision with root package name */
    public final float f273968m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f273965g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273966h = false;

    /* renamed from: n, reason: collision with root package name */
    public float f273969n = -1.0f;

    public C21000x8b2f716(android.content.Context context) {
        this.f273968m = -1.0f;
        if (context == null) {
            return;
        }
        this.f273967i = context;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f273962d = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.f273964f = defaultSensor;
        if (defaultSensor != null) {
            this.f273968m = java.lang.Math.min(10.0f, defaultSensor.getMaximumRange());
        }
        float f17 = this.f273968m;
        if (f17 < 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SensorController", "error, getMaximumRange return %s, set to 1", java.lang.Float.valueOf(f17));
            this.f273968m = 1.0f;
        }
    }

    public synchronized void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SensorController", "sensor callback removed");
        try {
            this.f273967i.unregisterReceiver(this);
        } catch (java.lang.Exception unused) {
        }
        this.f273962d.unregisterListener(this, this.f273964f);
        this.f273962d.unregisterListener(this);
        this.f273966h = false;
        this.f273963e = null;
        this.f273969n = -1.0f;
    }

    public synchronized void b(com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 q7Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SensorController", "sensor callback set, isRegistered:" + this.f273966h + ", proximitySensor: " + this.f273964f + ", maxValue: " + this.f273968m);
        if (!this.f273966h) {
            this.f273969n = -1.0f;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            this.f273967i.registerReceiver(this, intentFilter);
            this.f273962d.registerListener(this, this.f273964f, 2);
            this.f273966h = true;
        }
        this.f273963e = q7Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action;
        if (intent == null || (action = intent.getAction()) == null || !action.equals("android.intent.action.HEADSET_PLUG")) {
            return;
        }
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra == 1) {
            this.f273965g = true;
        }
        if (intExtra == 0) {
            this.f273965g = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r2 < 0.0f) goto L20;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onSensorChanged(android.hardware.SensorEvent r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
