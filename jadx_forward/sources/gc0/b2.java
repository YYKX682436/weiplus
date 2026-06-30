package gc0;

/* loaded from: classes5.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f351636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f351638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351639h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f351640i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351641m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351642n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, java.util.List list, gc0.p2 p2Var, boolean z17, yz5.a aVar, gc0.b0 b0Var, yz5.l lVar, yz5.a aVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351635d = c21475x81dbaa18;
        this.f351636e = list;
        this.f351637f = p2Var;
        this.f351638g = z17;
        this.f351639h = aVar;
        this.f351640i = b0Var;
        this.f351641m = lVar;
        this.f351642n = aVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.b2(this.f351635d, this.f351636e, this.f351637f, this.f351638g, this.f351639h, this.f351640i, this.f351641m, this.f351642n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gc0.b2 b2Var = (gc0.b2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.a aVar;
        pz5.a aVar2 = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f351635d;
        android.content.Context context = c21475x81dbaa18.getContext();
        for (r45.kl5 kl5Var : this.f351636e) {
            java.lang.String m75945x2fec8307 = kl5Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                android.view.View O6 = gc0.p2.O6(this.f351637f, context, m75945x2fec8307);
                if (O6 != null) {
                    gc0.p2 p2Var = this.f351637f;
                    O6.setOnClickListener(new gc0.a2(this.f351641m, m75945x2fec8307, p2Var, kl5Var, this.f351642n));
                    c21475x81dbaa18.addView(O6);
                    p2Var.f351781m.a(kl5Var, O6, 1, this.f351640i.f351632a);
                }
            }
        }
        if (c21475x81dbaa18.getChildCount() > 0) {
            c21475x81dbaa18.setVisibility(0);
        } else {
            c21475x81dbaa18.setVisibility(8);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRecommendRemark() hasResult = ");
        boolean z17 = this.f351638g;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkUIC", sb6.toString());
        if (!z17 && (aVar = this.f351639h) != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
