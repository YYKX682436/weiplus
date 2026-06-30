package xt2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f538366d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f538367e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f538368f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f538369g;

    /* renamed from: h, reason: collision with root package name */
    public int f538370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538371i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f538372m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xt2.m f538373n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f538374o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.widget.ImageView imageView, xt2.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538371i = c22789xd23e9a9b;
        this.f538372m = imageView;
        this.f538373n = mVar;
        this.f538374o = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.k(this.f538371i, this.f538372m, this.f538373n, this.f538374o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f538370h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f538371i;
            c22789xd23e9a9b.setVisibility(0);
            android.widget.ImageView imageView = this.f538372m;
            imageView.setVisibility(8);
            xt2.m mVar = this.f538373n;
            this.f538366d = mVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f538374o;
            this.f538367e = h0Var;
            this.f538368f = c22789xd23e9a9b;
            this.f538369g = imageView;
            this.f538370h = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            java.lang.String str = mVar.f538415n;
            java.lang.String str2 = "play animate before " + ((java.lang.String) h0Var.f391656d);
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, null);
            c22789xd23e9a9b.a(new xt2.j(mVar, h0Var, nVar, imageView));
            c22789xd23e9a9b.g();
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
