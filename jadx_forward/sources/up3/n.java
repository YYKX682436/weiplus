package up3;

/* loaded from: classes12.dex */
public class n extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f511366a = com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f511367b = "action" + up3.o.f511372e;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f511368c = tp3.b.a("µ´¨£¤±°");

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f511369d = tp3.b.a("\u00ad\u00ad©£\u0098° ¶«");

    /* renamed from: e, reason: collision with root package name */
    public static up3.n f511370e = null;

    public static void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(f511367b);
        intent.putExtra("op", 3);
        intent.putExtra(f511369d, str);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        context.sendBroadcast(intent, f511366a);
    }

    /* renamed from: finalize */
    public void m168369xd764dc1e() {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this);
        } catch (java.lang.Throwable unused) {
        }
        super.finalize();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (!f511367b.equals(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.o.f511371d, "[-] Explained by src 12: %s", action);
            return;
        }
        int intExtra = intent.getIntExtra("op", 0);
        java.lang.String str = f511368c;
        if (intExtra == 1) {
            java.lang.String stringExtra = intent.getStringExtra(str);
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.o.f511371d, "[-] Explained by src 13.");
                return;
            }
            if (stringExtra.equals(bm5.f1.a())) {
                try {
                    com.p314xaae8f345.mm.vfs.r6 i17 = up3.b.i(stringExtra);
                    com.p314xaae8f345.mm.vfs.r6 c17 = up3.b.c(stringExtra.replace(':', '-') + "-" + tp3.b.a("\u00ad ²°"), ".zip");
                    up3.b.b(i17, c17, null, null);
                    a(context, c17.o());
                    return;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.o.f511371d, th6, "[-] Explained by src 14: %s", stringExtra);
                    return;
                }
            }
            return;
        }
        if (intExtra != 2) {
            if (intExtra != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.o.f511371d, "[-] Unknown op: %s", java.lang.Integer.valueOf(intExtra));
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                java.lang.String stringExtra2 = intent.getStringExtra(f511369d);
                if (stringExtra2 == null || stringExtra2.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.o.f511371d, "[-] Explained by src 17: %s", stringExtra2);
                    return;
                }
                try {
                    up3.o.a(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(stringExtra2)));
                    return;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.o.f511371d, th7, "[-] Explained by src 18.", new java.lang.Object[0]);
                    return;
                }
            }
            return;
        }
        java.lang.String stringExtra3 = intent.getStringExtra(str);
        if (android.text.TextUtils.isEmpty(stringExtra3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.o.f511371d, "[-] Explained by src 15.");
            return;
        }
        if (stringExtra3.equals(bm5.f1.a())) {
            try {
                com.p314xaae8f345.mm.vfs.r6 j17 = up3.b.j(stringExtra3);
                com.p314xaae8f345.mm.vfs.r6 c18 = up3.b.c(stringExtra3.replace(':', '-') + "-" + tp3.b.a("´\u00ad ²°"), ".zip");
                up3.b.b(j17, c18, null, null);
                a(context, c18.o());
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.o.f511371d, th8, "[-] Explained by src 16: %s", stringExtra3);
            }
        }
    }
}
