package zi3;

/* loaded from: classes14.dex */
public final class b implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zi3.f f554697a;

    public b(zi3.f fVar) {
        this.f554697a = fVar;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        cv.v0 v0Var = (cv.v0) obj;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s == sj3.e4.Init) {
            return;
        }
        zi3.f fVar = this.f554697a;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "audioRouteConsumer: " + v0Var);
        int i17 = v0Var.f304051c;
        int i18 = v0Var.f304049a;
        if (i17 == 1) {
            cv.v0 v0Var2 = fVar.f554710r;
            boolean z17 = v0Var2 != null && v0Var2.f304049a == i18;
            fVar.f554710r = v0Var;
            if (i18 == 1) {
                zi3.f.C(fVar, v0Var, z17);
                fVar.f554709q = 1;
                return;
            } else if (i18 == 2) {
                zi3.f.C(fVar, v0Var, z17);
                fVar.f554709q = 2;
                return;
            } else if (i18 == 3) {
                zi3.f.C(fVar, v0Var, z17);
                return;
            } else {
                if (i18 != 4) {
                    return;
                }
                zi3.f.C(fVar, v0Var, false);
                return;
            }
        }
        xm1.o oVar = fVar.f554707o;
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            if (i18 == 3) {
                zi3.f.P(fVar, 3, false, 2, null);
            } else if (i18 == 4) {
                zi3.f.P(fVar, 4, false, 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = fVar.f554711s;
            if (serviceConnectionC16581x3d1d6bd2 != null) {
                serviceConnectionC16581x3d1d6bd2.q2(oVar.a());
                return;
            }
            return;
        }
        if (i18 == 3) {
            oVar.getClass();
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f304049a == 3) {
                if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                    zi3.f.P(fVar, 4, false, 2, null);
                } else {
                    int i19 = fVar.f554709q;
                    if (i19 != -1) {
                        zi3.f.P(fVar, i19, false, 2, null);
                    } else {
                        zi3.f.P(fVar, 1, false, 2, null);
                    }
                }
            }
        } else if (i18 == 4) {
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                zi3.f.P(fVar, 3, false, 2, null);
            } else {
                int i27 = fVar.f554709q;
                if (i27 != -1) {
                    zi3.f.P(fVar, i27, false, 2, null);
                } else {
                    zi3.f.P(fVar, 1, false, 2, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd22 = fVar.f554711s;
        if (serviceConnectionC16581x3d1d6bd22 != null) {
            serviceConnectionC16581x3d1d6bd22.q2(oVar.a());
        }
    }
}
