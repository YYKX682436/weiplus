package fr3;

/* loaded from: classes10.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f347325d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f347326e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347327f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f347328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(fr3.l.f347333a);
        this.f347325d = a17;
        this.f347326e = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(a17);
    }

    public final void O6(fr3.i intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MVI_Model", "dispatchIntent() called with: intent = " + intent);
        if (intent instanceof fr3.h) {
            if (this.f347328g != null) {
                r45.gh3 gh3Var = new r45.gh3();
                gh3Var.f456778d = this.f347327f;
                gh3Var.b().l().I(m158354x19263085()).K(new fr3.e(this));
                return;
            }
            return;
        }
        if (intent instanceof fr3.g) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            hr3.z8 z8Var = (hr3.z8) pf5.z.f435481a.a(activity).a(hr3.z8.class);
            fr3.c cVar = new fr3.c(this);
            z8Var.getClass();
            java.util.List list = ((fr3.g) intent).f347329a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                return;
            }
            z8Var.f365770f = cVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactUIC", "deleteContact() called with: userNameList = " + list);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = z8Var.m158354x19263085();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
            e4Var.f293309c = z8Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.omp);
            e4Var.f293313g = 2;
            e4Var.f293311e = true;
            z8Var.f365768d = e4Var.c();
            gm0.j1.n().f354821b.g(new w11.h0(list, 1, 2, z8Var.f365769e));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("INTENT_KEY_LAST_CGI_CONTEXT");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f347327f = stringExtra;
    }
}
