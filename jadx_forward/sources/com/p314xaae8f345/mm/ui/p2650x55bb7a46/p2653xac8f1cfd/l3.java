package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes10.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f280926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f280927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f280928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 f280929g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 u3Var) {
        super(0);
        this.f280926d = g0Var;
        this.f280927e = h0Var;
        this.f280928f = h0Var2;
        this.f280929g = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String jSONObject;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrameRendStart: liveId=");
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f280926d;
        sb6.append(g0Var.f391654d);
        sb6.append(", feedId=");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f280927e;
        sb6.append(pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var.f391656d).m76784x5db1b11()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingFinderLiveNotifyComponent", sb6.toString());
        ((android.view.View) this.f280928f.f391656d).setTag(com.p314xaae8f345.mm.R.id.rus, java.lang.Boolean.TRUE);
        i95.m c17 = i95.n0.c(zy2.pa.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long m76784x5db1b11 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var.f391656d).m76784x5db1b11();
        long j17 = g0Var.f391654d;
        java.lang.String m76836x6c03c64c = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var.f391656d).m76836x6c03c64c();
        java.lang.String m76801x8010e5e4 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var.f391656d).m76801x8010e5e4();
        java.lang.String str = m76801x8010e5e4 == null ? "" : m76801x8010e5e4;
        ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
        ml2.q1 q1Var = ml2.q1.f409345e;
        org.json.JSONObject jSONObject2 = this.f280929g.f281586m;
        zy2.pa.Gc(paVar, m76784x5db1b11, j17, m76836x6c03c64c, str, 14L, "temp_7", 0, (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : r26.i0.t(jSONObject, ",", ";", false), null, 256, null);
        return jz5.f0.f384359a;
    }
}
