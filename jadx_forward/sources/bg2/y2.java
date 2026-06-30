package bg2;

/* loaded from: classes2.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f102195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.b3 f102196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f102197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, bg2.b3 b3Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102195e = h0Var;
        this.f102196f = b3Var;
        this.f102197g = h0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.y2(this.f102195e, this.f102196f, this.f102197g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.y2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f102194d;
        bg2.b3 b3Var = this.f102196f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long m75939xb282bd08 = ((r45.vg6) this.f102195e.f391656d) != null ? r8.m75939xb282bd08(0) : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b3Var.f101470e, "[onFocusFeedCenter] type(1), delay=" + m75939xb282bd08);
            this.f102194d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(m75939xb282bd08, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bg2.b3.Y6(b3Var, ((java.lang.Number) this.f102197g.f391656d).intValue());
        return jz5.f0.f384359a;
    }
}
