package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class mr extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f195088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195092h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f195093i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, java.lang.String str, java.lang.String str2, yz5.a aVar) {
        super(0);
        this.f195088d = i17;
        this.f195089e = i18;
        this.f195090f = etVar;
        this.f195091g = str;
        this.f195092h = str2;
        this.f195093i = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.a aVar;
        um2.x5 m129745xca56ce03;
        int i17 = this.f195089e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195090f;
        int i18 = this.f195088d;
        if (i18 == 0 && i17 == 0) {
            r45.nw1 nw1Var = ((mm2.e1) etVar.P0(mm2.e1.class)).f410521r;
            if (nw1Var != null) {
                dk2.Cif.b(dk2.Cif.f315159a, etVar.f193981p, nw1Var.m75942xfb822ef2(0), dk2.hf.f315126n, false, 8, null);
            }
        } else {
            java.lang.String str = this.f195091g;
            if (i17 == -200016) {
                etVar.V = str;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str2 = this.f195092h;
                bundle.putString("PARAM_FINDER_LIVE_URL", str2);
                bundle.putString("PARAM_FINDER_LIVE_COMMENT", str);
                etVar.f193981p.mo46557x60d69242(qo0.b.X2, bundle);
                if (!(str2 == null || str2.length() == 0)) {
                    if (etVar.x0()) {
                        etVar.R0().m57648x167921cd();
                        etVar.R0().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lr(etVar, str2));
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = etVar.R0();
                        fm2.c cVar = R0 instanceof fm2.c ? (fm2.c) R0 : null;
                        if (cVar != null && (m129745xca56ce03 = cVar.m129745xca56ce03()) != null) {
                            m129745xca56ce03.a0(str2);
                        }
                    }
                }
            } else if (i17 == -200014) {
                ((mm2.c1) etVar.P0(mm2.c1.class)).f410417t = false;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("PARAM_FINDER_LIVE_COMMENT", str);
                etVar.f193981p.mo46557x60d69242(qo0.b.Y2, bundle2);
                db5.t7.m123883x26a183b(etVar.f446856d.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebz), 0).show();
            } else if (i17 == -200031) {
                ((mm2.c1) etVar.P0(mm2.c1.class)).f410435w = false;
            } else if (i17 == -200015 || i17 == -200018) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("PARAM_FINDER_LIVE_COMMENT", str);
                etVar.f193981p.mo46557x60d69242(qo0.b.Y2, bundle3);
            } else if (i17 == -200251) {
                df2.oh ohVar = (df2.oh) etVar.U0(df2.oh.class);
                if (ohVar != null) {
                    ohVar.Z6("dealWithErrCode");
                }
            } else if (i17 == -100075) {
                db5.t7.m123882x26a183b(etVar.f446856d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lom, 0).show();
            } else if (i18 != 0 && (aVar = this.f195093i) != null) {
                aVar.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
