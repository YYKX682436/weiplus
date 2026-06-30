package fk2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f344836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 f344837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f344838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f344839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f344840h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f344841i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405, java.lang.CharSequence charSequence, android.view.ViewGroup viewGroup, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f344837e = c14315xbe4ed405;
        this.f344838f = charSequence;
        this.f344839g = viewGroup;
        this.f344840h = i17;
        this.f344841i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fk2.a1 a1Var = new fk2.a1(this.f344837e, this.f344838f, this.f344839g, this.f344840h, this.f344841i, interfaceC29045xdcb5ca57);
        a1Var.f344836d = obj;
        return a1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fk2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean h17 = p3325xe03a0797.p3326xc267989b.z0.h((p3325xe03a0797.p3326xc267989b.y0) this.f344836d);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!h17) {
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405 = this.f344837e;
        int m84154x92d2fac5 = c14315xbe4ed405.m84154x92d2fac5();
        android.view.ViewGroup viewGroup = this.f344839g;
        if (m84154x92d2fac5 <= 1 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14315xbe4ed405.a(), this.f344838f)) {
            viewGroup.setPadding(0, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        } else {
            viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, viewGroup.getPaddingBottom());
            c14315xbe4ed405.m84182x42191760(5);
            fk2.c1 c1Var = fk2.d1.f344877m;
            java.lang.CharSequence charSequence = this.f344838f;
            int m84154x92d2fac52 = c14315xbe4ed405.m84154x92d2fac5();
            int i17 = this.f344840h;
            boolean z17 = this.f344841i;
            if (i17 > 0) {
                c14315xbe4ed405.o(charSequence, 5, i17, z17, new fk2.b1(m84154x92d2fac52), true, true);
            } else {
                c14315xbe4ed405.b(c1Var.b(charSequence, m84154x92d2fac52));
            }
        }
        return f0Var;
    }
}
