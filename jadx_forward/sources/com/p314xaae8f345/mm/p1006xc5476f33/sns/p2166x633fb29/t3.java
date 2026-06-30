package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class t3 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f246219e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f246220f = new char[36];

    /* renamed from: a, reason: collision with root package name */
    public boolean f246221a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f246222b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f246223c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f246224d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r3(this, android.os.Looper.getMainLooper());

    static {
        int i17 = 0;
        int i18 = 48;
        while (i18 <= 57) {
            f246220f[i17] = (char) i18;
            i18++;
            i17++;
        }
        int i19 = 97;
        while (i19 <= 122) {
            f246220f[i17] = (char) i19;
            i19++;
            i17++;
        }
    }

    public static boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        boolean z17 = false;
        java.util.Iterator it = com.p314xaae8f345.mm.vfs.w6.s(str, false).iterator();
        while (true) {
            if (!it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                z17 = true;
                break;
            }
            com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) it.next();
            if (!f246219e) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                break;
            }
            if (x1Var.f294765b != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str3 != null) {
                java.lang.String str4 = x1Var.f294765b;
                if (!str4.contains(str2) && !str4.contains(str3)) {
                }
            }
            if (!x1Var.f294769f) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (java.lang.System.currentTimeMillis() - x1Var.f294768e > 604800000) {
                    x1Var.a();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        return z17;
    }
}
