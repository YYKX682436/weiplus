package gc0;

/* loaded from: classes5.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f351740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f351741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f351742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f351743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351744h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.kl5 f351745i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351746m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351747n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351748o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, android.view.View view, android.view.View view2, gc0.p2 p2Var, r45.kl5 kl5Var, java.lang.String str, yz5.l lVar, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351740d = imageView;
        this.f351741e = bitmap;
        this.f351742f = view;
        this.f351743g = view2;
        this.f351744h = p2Var;
        this.f351745i = kl5Var;
        this.f351746m = str;
        this.f351747n = lVar;
        this.f351748o = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.l2(this.f351740d, this.f351741e, this.f351742f, this.f351743g, this.f351744h, this.f351745i, this.f351746m, this.f351747n, this.f351748o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gc0.l2 l2Var = (gc0.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.View view = this.f351743g;
        gc0.p2 p2Var = this.f351744h;
        android.view.View contentView = this.f351742f;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            this.f351740d.setImageBitmap(this.f351741e);
            db5.d5 d5Var = new db5.d5(contentView, -2, -2, false);
            d5Var.setOutsideTouchable(false);
            d5Var.showAsDropDown(view);
            contentView.setOnClickListener(new gc0.i2(this.f351747n, this.f351748o, p2Var, d5Var));
            gc0.e1 e1Var = p2Var.f351781m;
            r45.kl5 kl5Var = this.f351745i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentView, "$contentView");
            e1Var.a(kl5Var, contentView, 3, this.f351746m);
            p2Var.f351775d = new gc0.j2(d5Var);
            p2Var.f351776e = new gc0.k2(d5Var, view);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkUIC", jz5.a.b(th6));
        }
        return jz5.f0.f384359a;
    }
}
