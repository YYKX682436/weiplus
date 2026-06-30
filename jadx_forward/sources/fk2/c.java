package fk2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f344852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 f344853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f344854f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f344855g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.s f344856h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f344857i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f344858m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405, java.lang.CharSequence charSequence, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.s sVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f344853e = c14315xbe4ed405;
        this.f344854f = charSequence;
        this.f344855g = h0Var;
        this.f344856h = sVar;
        this.f344857i = i17;
        this.f344858m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fk2.c cVar = new fk2.c(this.f344853e, this.f344854f, this.f344855g, this.f344856h, this.f344857i, this.f344858m, interfaceC29045xdcb5ca57);
        cVar.f344852d = obj;
        return cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fk2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean h17 = p3325xe03a0797.p3326xc267989b.z0.h((p3325xe03a0797.p3326xc267989b.y0) this.f344852d);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!h17) {
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405 = this.f344853e;
        int m84154x92d2fac5 = c14315xbe4ed405.m84154x92d2fac5();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f344855g;
        if (m84154x92d2fac5 <= 1 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14315xbe4ed405.a(), this.f344854f)) {
            java.lang.Object obj2 = h0Var.f391656d;
            ((android.view.ViewGroup) obj2).setPadding(0, ((android.view.ViewGroup) obj2).getPaddingTop(), ((android.view.ViewGroup) h0Var.f391656d).getPaddingRight(), ((android.view.ViewGroup) h0Var.f391656d).getPaddingBottom());
        } else {
            java.lang.Object obj3 = h0Var.f391656d;
            ((android.view.ViewGroup) obj3).setPadding(0, ((android.view.ViewGroup) obj3).getPaddingTop(), 0, ((android.view.ViewGroup) h0Var.f391656d).getPaddingBottom());
            c14315xbe4ed405.m84182x42191760(5);
            yz5.s sVar = this.f344856h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed4052 = this.f344853e;
            sVar.v(c14315xbe4ed4052, this.f344854f, new java.lang.Integer(c14315xbe4ed4052.m84154x92d2fac5()), new java.lang.Integer(this.f344857i), java.lang.Boolean.valueOf(this.f344858m));
        }
        return f0Var;
    }
}
