package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g f296427a;

    public static void a() {
        if (f296427a != null) {
            return;
        }
        boolean h17 = com.p314xaae8f345.p3210x3857dc.b.m().h("disable_kill_child_process_in_deep_background", "tools", false);
        int i17 = com.p314xaae8f345.p3210x3857dc.b.m().i("timeout_kill_child_process_in_deep_background", "tools", 30000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "initDeepBackgroundCallback, configValue:%s, configTimeout:%s", java.lang.Boolean.valueOf(h17), java.lang.Integer.valueOf(i17));
        if (h17 || f296427a != null) {
            return;
        }
        f296427a = new com.p314xaae8f345.mm.p2829xfa87f9de.w0(i17);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40963x40b15f2e(f296427a);
    }

    public static void b(com.p314xaae8f345.p3210x3857dc.f1 f1Var, com.p314xaae8f345.p3210x3857dc.e1 e1Var) {
        c();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null) {
            a17 = "";
        } else if (a17.contains(":")) {
            a17 = a17.substring(a17.lastIndexOf(":") + 1).toLowerCase();
            if (a17.startsWith("appbrand")) {
                a17 = "appbrand";
            }
        } else if (a17.contains(".")) {
            a17 = a17.substring(a17.lastIndexOf(".") + 1).toLowerCase();
        }
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.v0(context, f1Var, a17, new com.p314xaae8f345.mm.p2829xfa87f9de.x0(e1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c() {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2829xfa87f9de.y0.c():void");
    }

    public static boolean d() {
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "isGPVersion, get from channel util:" + c17);
        return c17;
    }
}
