package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rr extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m3 f195711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(bm2.m3 m3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        super(1);
        this.f195711d = m3Var;
        this.f195712e = etVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        bm2.j3 j3Var = (bm2.j3) kz5.n0.a0(this.f195711d.f103630f, intValue);
        if (j3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveInputPlugin", "cannot get fastCommentInfo at " + intValue);
        } else {
            boolean z17 = j3Var.f103539b == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195712e;
            if (z17) {
                etVar.getClass();
                if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308697o, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cr())) {
                    long a17 = c01.id.a();
                    if (a17 - etVar.f193995y0 > com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.H1 || etVar.F1) {
                        etVar.f193995y0 = a17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: check permission and cache, currentTime:" + a17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dr drVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dr(etVar);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fr frVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fr(etVar);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gr grVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gr(etVar);
                        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class));
                        if (!k0Var.N6()) {
                            drVar.mo152xb9724478();
                        } else if (c01.id.a() - k0Var.Q6() < 300000) {
                            grVar.mo152xb9724478();
                        } else {
                            frVar.mo152xb9724478();
                        }
                        if (etVar.f193980l1 != null) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_room_fastcomment_event", etVar.K, null, 25561);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: too fast, currentTime:" + a17 + ", lastPoiSendTime:" + etVar.f193995y0);
                        android.content.Context context = etVar.R;
                        db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dlf));
                    }
                }
            } else {
                etVar.V1(j3Var, ((mm2.j2) etVar.P0(mm2.j2.class)).S6());
            }
            ((mm2.u0) etVar.P0(mm2.u0.class)).O6(j3Var.f103541d, j3Var.f103538a, j3Var.f103542e);
            if (((mm2.e0) etVar.P0(mm2.e0.class)).P6()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "inBox, keep show keyboard");
            } else {
                etVar.D1(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
