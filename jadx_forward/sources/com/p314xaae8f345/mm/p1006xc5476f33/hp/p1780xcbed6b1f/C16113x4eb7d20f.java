package com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f;

/* renamed from: com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService */
/* loaded from: classes11.dex */
public class C16113x4eb7d20f implements ak0.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f f223936a = new com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f();

    /* renamed from: b, reason: collision with root package name */
    public static b83.m f223937b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f223938c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f223939d = {"com.tencent.mm.plugin.base.stub.WXPayEntryActivity", "com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI", "com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI"};

    /* renamed from: e, reason: collision with root package name */
    public static boolean f223940e = false;

    /* JADX WARN: Multi-variable type inference failed */
    public static int a() {
        boolean d17 = d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        c6231x4f3054ba.f136478g.f89948b = 2;
        c6231x4f3054ba.e();
        boolean z17 = d17;
        if (c6231x4f3054ba.f136479h.f90034b) {
            z17 = (d17 ? 1 : 0) | 2;
        }
        boolean z18 = z17;
        if (iq.b.H()) {
            z18 = (z17 ? 1 : 0) | 4;
        }
        int i17 = z18;
        if (c()) {
            i17 = (z18 ? 1 : 0) | 8;
        }
        boolean z19 = false;
        try {
            jm4.u2 a17 = jm4.w2.f381968d.a();
            if (a17 != null) {
                if (((jm4.g3) p3380x6a61f93.p3381xf512d0a5.C30458x21b3ff21.m169109x21ba2d75(((jm4.w2) a17).m105978x2737f10())) != null) {
                    z19 = true;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.TinkerPatchResultService", th6, "fail to check if ting audio is playing.", new java.lang.Object[0]);
        }
        if (z19) {
            i17 = (i17 == true ? 1 : 0) | 16;
        }
        if (i17 == 0) {
            b(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.TinkerPatchResultService", "not hit condition, skip suicide this time. reason code: %d", java.lang.Integer.valueOf(i17));
        }
        return i17;
    }

    public static void b(boolean z17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (f223940e) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.TinkerPatchResultService", "[+] do not call suicide more than one time @ %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        } else {
            f223940e = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "app is background now, i can kill quietly");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
            ((bt.b1) k35.p.f385476a).a(context, z17);
        }
    }

    public static boolean c() {
        try {
            for (java.lang.String str : f223939d) {
                if (b83.l.f99858d.contains(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.TinkerPatchResultService", "found activity '%s' belongs to pay routine.", str);
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.TinkerPatchResultService", th6, "fail to check if we're in pay routine.", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean d(android.content.Context context) {
        try {
            for (android.view.Display display : ((android.hardware.display.DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays()) {
                if (display.getState() == 2) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.TinkerPatchResultService", th6, "Fail to fetch status of displays.", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: prepareSuicide */
    public static void m65147xbaebff27() {
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20326x17a99a51()) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "Use tinker suicide strategy V1.");
            new w11.f1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new b83.k(), false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "Use tinker suicide strategy V2.");
        if (f223938c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "Skip waiting for suicide, it is already prepared.");
        } else {
            f223938c = true;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(new b83.n(null));
        }
    }
}
