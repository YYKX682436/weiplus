package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes13.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f226945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f226946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f226948g;

    public l3(int i17, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, java.lang.String str, boolean z17) {
        this.f226945d = i17;
        this.f226946e = c10389xffc30b0;
        this.f226947f = str;
        this.f226948g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f226945d;
        if (i17 != 0) {
            boolean z17 = true;
            if (i17 == 1) {
                android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c9o);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
                android.graphics.Bitmap K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(drawable);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K0, "transformDrawableToBitmap(...)");
                if (this.f226946e.getUseRfx()) {
                    com.p314xaae8f345.mm.rfx.C20945xbc2db729 m77439xd9d5e999 = com.p314xaae8f345.mm.rfx.C20945xbc2db729.m77439xd9d5e999(K0);
                    java.lang.String str = this.f226947f;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(this.f226947f);
                    if (m77391x243906 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，targetFilePath is %s", this.f226947f);
                        if (com.p314xaae8f345.mm.vfs.w6.j(this.f226947f)) {
                            com.p314xaae8f345.mm.vfs.w6.h(this.f226947f);
                            return;
                        }
                        return;
                    }
                    m77391x243906.m77407x1a429707(0, m77439xd9d5e999);
                    this.f226946e.mo82566x3e3ac3e8(m77391x243906);
                } else {
                    org.p3363xbe4143f1.C29693x6232de85 m154757xd9d5e999 = org.p3363xbe4143f1.C29693x6232de85.m154757xd9d5e999(K0);
                    java.lang.String str2 = this.f226947f;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(this.f226947f);
                    if (m154716x243906 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，targetFilePath is %s", this.f226947f);
                        if (com.p314xaae8f345.mm.vfs.w6.j(this.f226947f)) {
                            com.p314xaae8f345.mm.vfs.w6.h(this.f226947f);
                            return;
                        }
                        return;
                    }
                    m154716x243906.m154734x1a429707(0, m154757xd9d5e999);
                    this.f226946e.mo82568x3e3ac3e8(m154716x243906);
                }
            } else if (i17 != 9) {
                this.f226946e.m82581x764e93a7(this.f226947f);
            }
            this.f226946e.m82582x3ae760af(0.0d);
            this.f226946e.d();
            if (this.f226948g) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k3(this.f226946e));
                return;
            }
            return;
        }
        if (!this.f226946e.m(this.f226947f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null：bubble，targetFilePath is %s", this.f226947f);
            if (com.p314xaae8f345.mm.vfs.w6.j(this.f226947f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "delete：bubble targetFilePath is %s", this.f226947f);
                com.p314xaae8f345.mm.vfs.w6.h(this.f226947f);
                return;
            }
            return;
        }
        this.f226946e.m82582x3ae760af(0.0d);
        this.f226946e.d();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j3(this.f226946e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(j3Var, 150L, false);
    }
}
