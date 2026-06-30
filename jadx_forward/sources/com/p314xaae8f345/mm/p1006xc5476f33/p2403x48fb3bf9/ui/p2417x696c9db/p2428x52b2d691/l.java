package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class l extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l f267857d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f267858e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f267859f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        f267858e = env;
        f267859f = msg;
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c()) {
            env.f422396d.e(msg.f422546c, "bindPhone:hasBinded", null);
            return true;
        }
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(this);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("back_to_status", false);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.h(env.f422393a, intent, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 538;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "bindPhone";
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        nw4.g gVar;
        nw4.g gVar2;
        if (i17 != 222 || f267858e == null || f267859f == null) {
            return;
        }
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiBindPhone", "mmOnActivityResult isUserBindOpMobile: " + c17 + " data: " + intent);
        if (c17) {
            nw4.k kVar = f267858e;
            if (kVar == null || (gVar2 = kVar.f422396d) == null) {
                return;
            }
            nw4.y2 y2Var = f267859f;
            gVar2.e(y2Var != null ? y2Var.f422546c : null, "bindPhone:ok", null);
            return;
        }
        nw4.k kVar2 = f267858e;
        if (kVar2 == null || (gVar = kVar2.f422396d) == null) {
            return;
        }
        nw4.y2 y2Var2 = f267859f;
        gVar.e(y2Var2 != null ? y2Var2.f422546c : null, "bindPhone:cancel", null);
    }
}
