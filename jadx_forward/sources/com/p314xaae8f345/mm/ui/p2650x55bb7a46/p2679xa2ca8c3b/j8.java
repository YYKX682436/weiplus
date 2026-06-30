package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes3.dex */
public final class j8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f285769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f285770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f285771g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f285772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(android.widget.LinearLayout linearLayout, android.content.Context context, float f17, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f285769e = linearLayout;
        this.f285770f = context;
        this.f285771g = f17;
        this.f285772h = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j8(this.f285769e, this.f285770f, this.f285771g, this.f285772h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f285768d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.widget.LinearLayout linearLayout = this.f285769e;
            linearLayout.setVisibility(0);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            float f17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l8.f285937a;
            float f18 = this.f285771g;
            os5.u uVar = new os5.u((int) (f17 * f18), (int) (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l8.f285938b * f18), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l8.f285939c);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
            android.content.Context context = this.f285770f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            xt2.k1 k1Var = new xt2.k1(context, uVar);
            k1Var.b("MicroMsg.ChattingItemAppMsgFinderProduct", linearLayout);
            int a17 = i65.a.a(context, 175.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFinderProduct", "parse showbox " + this.f285772h + " with space " + a17);
            java.util.List list = this.f285772h;
            android.widget.LinearLayout linearLayout2 = this.f285769e;
            this.f285768d = 1;
            if (os5.v.a(k1Var, "MicroMsg.ChattingItemAppMsgFinderProduct", list, false, linearLayout2, a17, null, this, 32, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
