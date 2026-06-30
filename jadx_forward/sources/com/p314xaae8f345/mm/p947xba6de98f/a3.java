package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.g f152408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f152409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152410g;

    public a3(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, java.lang.String str, dn.g gVar, dn.h hVar) {
        this.f152410g = l3Var;
        this.f152407d = str;
        this.f152408e = gVar;
        this.f152409f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = this.f152410g;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f152596f;
        java.lang.String str = this.f152407d;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar == null) {
            if (str.contains("AdLandingGeneralVideo_")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, 11);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "download adLandingGeneralVideo task callback but task is null, %s, %s", str, java.lang.Integer.valueOf(l3Var.hashCode()));
                return;
            }
            return;
        }
        dn.n nVar = oVar.f323348c2;
        dn.g gVar = this.f152408e;
        dn.h hVar = this.f152409f;
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback", str);
            if (gVar != null) {
                oVar.f323348c2.f(this.f152407d, gVar.f69496x83ec3dd, gVar.f69500x8ab84c59);
                return;
            }
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback, sceneResult.retCode:%s", str, java.lang.Integer.valueOf(hVar.f69553xb5f54fe9));
                oVar.f323348c2.g(str, hVar.f69553xb5f54fe9, hVar);
                ((java.util.HashMap) l3Var.f152596f).remove(str);
                if (hVar.f69553xb5f54fe9 == 0) {
                    ((java.util.HashMap) l3Var.f152597g).put(oVar.f69601xaca5bdda, oVar);
                    ((java.util.HashMap) l3Var.f152598h).put(oVar.f69601xaca5bdda, hVar);
                    return;
                }
                return;
            }
            return;
        }
        t21.v2 i17 = t21.d3.i(oVar.E1, oVar.f323347b2, oVar.X1);
        if (i17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "stream download video callback, but video info is null.[%s]", oVar.E1);
            return;
        }
        dn.k kVar = oVar.f323320f;
        if (kVar != null) {
            kVar.r4(this.f152407d, 0, this.f152408e, this.f152409f, oVar.f69607x9bef5d80);
            if (hVar != null) {
                ((java.util.HashMap) l3Var.f152596f).remove(str);
                return;
            }
            return;
        }
        if (gVar != null) {
            if (gVar.f69496x83ec3dd == i17.f496541f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "stream download finish.");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "callback progress info " + gVar.f69496x83ec3dd);
            i17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            i17.f496540e = (int) gVar.f69496x83ec3dd;
            i17.U = 1040;
            t21.d3.Q(i17);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2();
            am.hn hnVar = c5814x771f4db2.f136121g;
            hnVar.f88377a = 5;
            hnVar.f88379c = str;
            hnVar.f88380d = (int) gVar.f69496x83ec3dd;
            hnVar.f88381e = (int) gVar.f69500x8ab84c59;
            c5814x771f4db2.e();
            return;
        }
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "callback result info " + hVar.f69553xb5f54fe9 + ", filesize:" + hVar.f69523x17c343e7 + ",recved:" + hVar.f69548xe026fea1);
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                if (i18 != -10012) {
                    t21.d3.G(i17.d());
                }
                boolean h17 = oVar.h();
                int i19 = hVar.f69553xb5f54fe9;
                int i27 = oVar.H1;
                l3Var.getClass();
                if (h17) {
                    if (i27 == 1) {
                        if (i19 == -5103059) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 111L, 1L, false);
                        } else if (i19 == -5103087) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 112L, 1L, false);
                        } else if (i19 == -10012) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 113L, 1L, false);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 114L, 1L, false);
                        }
                    } else if (i19 == -5103059) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 116L, 1L, false);
                    } else if (i19 == -5103087) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 117L, 1L, false);
                    } else if (i19 == -10012) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 118L, 1L, false);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 119L, 1L, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13836, 101, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), java.lang.Integer.valueOf(i19));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.mo68477x336bdfd8(354L, 213L, 1L, false);
                    if (i27 == 1) {
                        g0Var.mo68477x336bdfd8(354L, 214L, 1L, false);
                    } else {
                        g0Var.mo68477x336bdfd8(354L, 215L, 1L, false);
                    }
                    g0Var.d(13836, 201, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), java.lang.Integer.valueOf(i19));
                }
            } else {
                l3Var.l(i17, (int) hVar.f69523x17c343e7, oVar.F1, oVar);
                ((java.util.HashMap) l3Var.f152597g).put(oVar.f69601xaca5bdda, oVar);
                ((java.util.HashMap) l3Var.f152598h).put(oVar.f69601xaca5bdda, hVar);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db22 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2();
            am.hn hnVar2 = c5814x771f4db22.f136121g;
            hnVar2.f88377a = 4;
            hnVar2.f88379c = str;
            hnVar2.f88380d = 0;
            hnVar2.f88378b = hVar.f69553xb5f54fe9;
            hnVar2.f88381e = (int) hVar.f69523x17c343e7;
            c5814x771f4db22.e();
            ((java.util.HashMap) l3Var.f152596f).remove(str);
        }
    }
}
