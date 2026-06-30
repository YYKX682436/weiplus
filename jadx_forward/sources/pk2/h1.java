package pk2;

/* loaded from: classes3.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437333e;

    /* renamed from: f, reason: collision with root package name */
    public int f437334f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f437335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.i1 f437336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437338m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437339n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(pk2.i1 i1Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437336h = i1Var;
        this.f437337i = view;
        this.f437338m = c15371xf336b8cc;
        this.f437339n = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.h1 h1Var = new pk2.h1(this.f437336h, this.f437337i, this.f437338m, this.f437339n, interfaceC29045xdcb5ca57);
        h1Var.f437335g = ((java.lang.Boolean) obj).booleanValue();
        return h1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.h1) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437334f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f437335g;
            android.view.View view = this.f437337i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.onh)).getText().toString();
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f567040hx3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            pk2.i1 i1Var = this.f437336h;
            i1Var.v(obj2, findViewById, this.f437338m);
            pk2.o9 o9Var = this.f437339n;
            this.f437332d = o9Var;
            this.f437333e = i1Var;
            this.f437335g = z17;
            this.f437334f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(2097152, !z17, i1Var.n(), new pk2.g1(o9Var, i1Var, z17, new v65.n(rVar)));
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
