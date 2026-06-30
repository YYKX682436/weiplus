package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class h3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f273215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f273215d = f4Var;
        this.f273216e = activityC19730xa7b9756f;
        this.f273217f = str;
        this.f273218g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f273215d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273216e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19730xa7b9756f.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc pcVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc(mo55332x76847179, this.f273217f, this.f273218g, 4);
        activityC19730xa7b9756f.F = pcVar;
        pcVar.d();
        android.view.View m78513xc2a54588 = activityC19730xa7b9756f.m78513xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m78513xc2a54588, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) m78513xc2a54588).addView(activityC19730xa7b9756f.F);
        return jz5.f0.f384359a;
    }
}
