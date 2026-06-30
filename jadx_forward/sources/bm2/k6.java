package bm2;

/* loaded from: classes10.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f103569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.i6 f103570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(bm2.o6 o6Var, bm2.i6 i6Var, hn2.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f103569d = o6Var;
        this.f103570e = i6Var;
        this.f103571f = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bm2.k6(this.f103569d, this.f103570e, this.f103571f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bm2.k6 k6Var = (bm2.k6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bm2.i6 i6Var = this.f103570e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = i6Var.f103514g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22627xa933f8e4, "<get-btnProgress>(...)");
        bm2.o6 o6Var = this.f103569d;
        o6Var.K(c22627xa933f8e4, false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = i6Var.f103513f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22661xa3a2b3c0, "<get-btnRequestSong>(...)");
        hn2.d dVar = this.f103571f;
        o6Var.K(c22661xa3a2b3c0, !dVar.c());
        android.widget.TextView textView = i6Var.f103515h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-tvHasReqeusted>(...)");
        o6Var.K(textView, dVar.c());
        return jz5.f0.f384359a;
    }
}
