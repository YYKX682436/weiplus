package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes5.dex */
public final class e7 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f183658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f183660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ht0 f183661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f183663i;

    public e7(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, long j17, r45.ht0 ht0Var, java.lang.String str, int i18) {
        this.f183658d = abstractActivityC21394xb3d2c0cf;
        this.f183659e = i17;
        this.f183660f = j17;
        this.f183661g = ht0Var;
        this.f183662h = str;
        this.f183663i = i18;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f183658d;
        if (i18 == -1) {
            db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        }
        if (this.f183659e == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            boolean z17 = i18 == -1;
            long j17 = this.f183660f;
            r45.ht0 ht0Var = this.f183661g;
            java.lang.String m75945x2fec8307 = ht0Var != null ? ht0Var.m75945x2fec8307(0) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            o3Var.Nj(2, z17, "", j17, m75945x2fec8307, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        boolean z18 = i18 == -1;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f183662h;
        if (str == null) {
            str = "";
        }
        o3Var2.Xj(2, z18, str, this.f183659e, this.f183660f, "", this.f183663i);
    }
}
