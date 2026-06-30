package h5;

/* loaded from: classes13.dex */
public class a extends h5.d {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f360512i = a5.a0.e("BatteryChrgTracker");

    @Override // h5.f
    public java.lang.Object a() {
        android.content.Intent registerReceiver = this.f360521b.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            a5.a0.c().b(f360512i, "getInitialState - null intent received", new java.lang.Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return java.lang.Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // h5.d
    public android.content.IntentFilter e() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r5.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // h5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = r6.getAction()
            if (r5 != 0) goto L7
            return
        L7:
            a5.a0 r6 = a5.a0.c()
            java.lang.String r0 = "Received %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            java.lang.String r3 = h5.a.f360512i
            r6.a(r3, r0, r2)
            int r6 = r5.hashCode()
            r0 = -1
            switch(r6) {
                case -1886648615: goto L48;
                case -54942926: goto L3d;
                case 948344062: goto L32;
                case 1019184907: goto L27;
                default: goto L25;
            }
        L25:
            r1 = r0
            goto L51
        L27:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L30
            goto L25
        L30:
            r1 = 3
            goto L51
        L32:
            java.lang.String r6 = "android.os.action.CHARGING"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3b
            goto L25
        L3b:
            r1 = 2
            goto L51
        L3d:
            java.lang.String r6 = "android.os.action.DISCHARGING"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L46
            goto L25
        L46:
            r1 = 1
            goto L51
        L48:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L51
            goto L25
        L51:
            switch(r1) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L6c
        L55:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.b(r5)
            goto L6c
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.b(r5)
            goto L6c
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.b(r5)
            goto L6c
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.b(r5)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.a.f(android.content.Context, android.content.Intent):void");
    }
}
