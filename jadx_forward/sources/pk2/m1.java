package pk2;

/* loaded from: classes3.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437511d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437512e;

    /* renamed from: f, reason: collision with root package name */
    public int f437513f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f437514g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.n1 f437515h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437516i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437517m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437518n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(pk2.n1 n1Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437515h = n1Var;
        this.f437516i = view;
        this.f437517m = c15371xf336b8cc;
        this.f437518n = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.m1 m1Var = new pk2.m1(this.f437515h, this.f437516i, this.f437517m, this.f437518n, interfaceC29045xdcb5ca57);
        m1Var.f437514g = ((java.lang.Boolean) obj).booleanValue();
        return m1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.m1) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437513f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f437514g;
            android.view.View view = this.f437516i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.c9s)).getText().toString();
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hw6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            pk2.n1 n1Var = this.f437515h;
            n1Var.v(obj2, findViewById, this.f437517m);
            qk2.f.f(n1Var, false, 1, null);
            pk2.o9 o9Var = this.f437518n;
            this.f437511d = o9Var;
            this.f437512e = n1Var;
            this.f437514g = z17;
            this.f437513f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(512, !z17, n1Var.n(), new pk2.l1(z17, o9Var, n1Var, new v65.n(rVar)));
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
