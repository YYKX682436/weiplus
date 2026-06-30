package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes13.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f226867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f226868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f226870g;

    public i3(int i17, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, java.lang.String str, boolean z17) {
        this.f226867d = i17;
        this.f226868e = c22789xd23e9a9b;
        this.f226869f = str;
        this.f226870g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f226867d;
        if (i17 != 0) {
            boolean z17 = true;
            if (i17 == 1) {
                android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c9o);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
                android.graphics.Bitmap K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(drawable);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K0, "transformDrawableToBitmap(...)");
                if (this.f226868e.getUseRfx()) {
                    com.p314xaae8f345.mm.rfx.C20945xbc2db729 m77439xd9d5e999 = com.p314xaae8f345.mm.rfx.C20945xbc2db729.m77439xd9d5e999(K0);
                    java.lang.String str = this.f226869f;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(this.f226869f);
                    if (m77391x243906 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，cover targetFilePath is %s", this.f226869f);
                        if (com.p314xaae8f345.mm.vfs.w6.j(this.f226869f)) {
                            com.p314xaae8f345.mm.vfs.w6.h(this.f226869f);
                            return;
                        }
                        return;
                    }
                    m77391x243906.m77407x1a429707(0, m77439xd9d5e999);
                    this.f226868e.mo82566x3e3ac3e8(m77391x243906);
                } else {
                    org.p3363xbe4143f1.C29693x6232de85 m154757xd9d5e999 = org.p3363xbe4143f1.C29693x6232de85.m154757xd9d5e999(K0);
                    java.lang.String str2 = this.f226869f;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(this.f226869f);
                    if (m154716x243906 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，cover targetFilePath is %s", this.f226869f);
                        if (com.p314xaae8f345.mm.vfs.w6.j(this.f226869f)) {
                            com.p314xaae8f345.mm.vfs.w6.h(this.f226869f);
                            return;
                        }
                        return;
                    }
                    m154716x243906.m154734x1a429707(0, m154757xd9d5e999);
                    this.f226868e.mo82568x3e3ac3e8(m154716x243906);
                }
            } else if (i17 != 9) {
                if (i17 == 13) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
                    java.lang.String str3 = this.f226869f;
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f226868e;
                    if (c22789xd23e9a9b != null) {
                        if (str3 != null && str3.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            return;
                        }
                        boolean m17 = c22789xd23e9a9b.m(str3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "[doPlayFullAtmos] success: " + m17 + "、targetFilePath：" + str3);
                        if (!m17) {
                            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "[doPlayFullAtmos] delete file");
                                com.p314xaae8f345.mm.vfs.w6.h(str3);
                                return;
                            }
                            return;
                        }
                        c22789xd23e9a9b.m82582x3ae760af(0.0d);
                        ku5.u0 u0Var = ku5.t0.f394148d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c3(c22789xd23e9a9b);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(c3Var, 120L, false);
                        return;
                    }
                    return;
                }
                if (!this.f226868e.m(this.f226869f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，type：%s，targetFilePath is %s", java.lang.Integer.valueOf(this.f226867d), this.f226869f);
                    if (com.p314xaae8f345.mm.vfs.w6.j(this.f226869f)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "delete file，type：%s，targetFilePath is %s", java.lang.Integer.valueOf(this.f226867d), this.f226869f);
                        com.p314xaae8f345.mm.vfs.w6.h(this.f226869f);
                        return;
                    }
                    return;
                }
            }
            this.f226868e.m82582x3ae760af(0.0d);
            this.f226868e.d();
            if (this.f226870g) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h3(this.f226868e));
                return;
            }
            return;
        }
        this.f226868e.m82581x764e93a7(this.f226869f);
        this.f226868e.m82582x3ae760af(0.0d);
        this.f226868e.d();
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g3 g3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g3(this.f226868e);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.z(g3Var, 150L, false);
    }
}
