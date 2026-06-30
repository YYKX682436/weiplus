package pk2;

/* loaded from: classes3.dex */
public final class k5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437443e;

    /* renamed from: f, reason: collision with root package name */
    public int f437444f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f437445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.l5 f437446h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437447i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437448m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437449n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(pk2.l5 l5Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437446h = l5Var;
        this.f437447i = view;
        this.f437448m = c15371xf336b8cc;
        this.f437449n = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.k5 k5Var = new pk2.k5(this.f437446h, this.f437447i, this.f437448m, this.f437449n, interfaceC29045xdcb5ca57);
        k5Var.f437445g = ((java.lang.Boolean) obj).booleanValue();
        return k5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.k5) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437444f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f437445g;
            android.view.View view = this.f437447i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.rbp)).getText().toString();
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f567036ra4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            pk2.l5 l5Var = this.f437446h;
            l5Var.v(obj2, findViewById, this.f437448m);
            pk2.o9 o9Var = this.f437449n;
            this.f437442d = o9Var;
            this.f437443e = l5Var;
            this.f437445g = z17;
            this.f437444f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(8388608, z17, true, new pk2.j5(o9Var, l5Var, new v65.n(rVar)));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return java.lang.Boolean.TRUE;
    }
}
