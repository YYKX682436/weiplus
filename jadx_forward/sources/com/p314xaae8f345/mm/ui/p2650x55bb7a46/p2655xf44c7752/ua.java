package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class ua implements k70.w {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ua f283029f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f283030d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public k70.w f283031e;

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ua a() {
        if (f283029f == null) {
            f283029f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ua();
        }
        return f283029f;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str3;
        k70.w wVar = this.f283031e;
        if (wVar != null) {
            str3 = str;
            wVar.f(j17, j18, str, i17, i18, obj, i19, i27, str2, m1Var);
        } else {
            str3 = str;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str3, j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] hdImg end at background, msgLocalId:%d", java.lang.Long.valueOf(Li.m124847x74d37ac6()));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, Li, false);
        }
        this.f283030d.remove(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j18, str3));
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        k70.w wVar = this.f283031e;
        if (wVar != null) {
            wVar.l(j17, j18, str, i17, i18, obj);
        }
        this.f283030d.remove(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j18, str));
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        k70.w wVar = this.f283031e;
        if (wVar != null) {
            wVar.o(j17, j18, str, i17, i18, obj, i19, i27, m1Var);
        }
    }
}
