package wj2;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528248d;

    public s(wj2.w wVar) {
        this.f528248d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        wj2.w wVar = this.f528248d;
        if (wVar.D > 0) {
            km2.q m145849x949ba2a5 = wVar.m145849x949ba2a5();
            if (m145849x949ba2a5 != null && (str = m145849x949ba2a5.f390708f) != null) {
                dk2.xf z17 = wVar.f528252i.z();
                if (z17 != null) {
                    int i17 = wVar.D;
                    wj2.p pVar = new wj2.p(wVar);
                    dk2.r4 r4Var = (dk2.r4) z17;
                    pq5.g l17 = new ek2.m1(((mm2.e1) r4Var.m(mm2.e1.class)).f410518o, ((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) r4Var.m(mm2.e1.class)).f410516m, ((mm2.e1) r4Var.m(mm2.e1.class)).f410525v, xy2.c.f(r4Var.f315541c), str, i17).l();
                    l17.K(new dk2.q1(pVar));
                    if (r4Var.M() != null && (r4Var.M() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                        android.content.Context M = r4Var.M();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) M);
                    }
                }
                if (wVar.E > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 2);
                    jSONObject.put("element", 2);
                    km2.q m145849x949ba2a52 = wVar.m145849x949ba2a5();
                    jSONObject.put("mic_finderusername", m145849x949ba2a52 != null ? m145849x949ba2a52.f390705c : null);
                    km2.q m145849x949ba2a53 = wVar.m145849x949ba2a5();
                    jSONObject.put("mic_id", m145849x949ba2a53 != null ? m145849x949ba2a53.f390708f : null);
                    jSONObject.put("like_cnt", wVar.E);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    if (wVar.F()) {
                        i95.m c17 = i95.n0.c(ml2.r0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408756d3, jSONObject2, 0L, null, null, null, null, null, 252, null);
                    } else {
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        zy2.zb.y6((zy2.zb) c18, ml2.z4.E2, jSONObject2, null, 4, null);
                    }
                }
                int i18 = wVar.D - wVar.E;
                if (i18 > 0) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("type", 2);
                    jSONObject3.put("element", 1);
                    km2.q m145849x949ba2a54 = wVar.m145849x949ba2a5();
                    jSONObject3.put("mic_finderusername", m145849x949ba2a54 != null ? m145849x949ba2a54.f390705c : null);
                    km2.q m145849x949ba2a55 = wVar.m145849x949ba2a5();
                    jSONObject3.put("mic_id", m145849x949ba2a55 != null ? m145849x949ba2a55.f390708f : null);
                    jSONObject3.put("like_cnt", i18);
                    java.lang.String jSONObject4 = jSONObject3.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                    if (wVar.F()) {
                        i95.m c19 = i95.n0.c(ml2.r0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        ml2.r0.hj((ml2.r0) c19, ml2.b4.f408756d3, jSONObject4, 0L, null, null, null, null, null, 252, null);
                    } else {
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        zy2.zb.y6((zy2.zb) c27, ml2.z4.E2, jSONObject4, null, 4, null);
                    }
                }
            }
            wVar.D = 0;
            wVar.E = 0;
        }
        wVar.A.postDelayed(this, wVar.C * 1000);
    }
}
