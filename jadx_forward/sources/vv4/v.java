package vv4;

/* loaded from: classes11.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f522045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f522047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75, java.lang.String str, android.graphics.RectF rectF, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522043d = activityC19216xc2476b75;
        this.f522044e = str;
        this.f522045f = rectF;
        this.f522046g = str2;
        this.f522047h = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vv4.v(this.f522043d, this.f522044e, this.f522045f, this.f522046g, this.f522047h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vv4.v vVar = (vv4.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75 = this.f522043d;
        android.view.View view = (android.view.View) ((jz5.n) activityC19216xc2476b75.f263170i).mo141623x754a37bb();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + com.p314xaae8f345.mm.ui.bl.h(view.getContext()), view.getPaddingRight(), view.getPaddingBottom());
        view.setOnClickListener(new vv4.p(activityC19216xc2476b75));
        activityC19216xc2476b75.m78513xc2a54588().setOnClickListener(new vv4.q(activityC19216xc2476b75));
        activityC19216xc2476b75.m78513xc2a54588().postDelayed(new vv4.u(this.f522043d, this.f522044e, this.f522045f, this.f522046g, this.f522047h), 100L);
        return jz5.f0.f384359a;
    }
}
