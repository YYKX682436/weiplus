package sm3;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f491381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16709x6913f423 f491382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f491383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16709x6913f423 c16709x6913f423, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491382e = c16709x6913f423;
        this.f491383f = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sm3.d0(this.f491382e, this.f491383f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm3.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f491381d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16709x6913f423 c16709x6913f423 = this.f491382e;
            float f17 = c16709x6913f423.G;
            java.lang.Object upper = c16709x6913f423.A.getUpper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upper, "getUpper(...)");
            if (f17 > ((java.lang.Number) upper).floatValue()) {
                float f18 = c16709x6913f423.G;
                java.lang.Object upper2 = c16709x6913f423.A.getUpper();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upper2, "getUpper(...)");
                b17 = a06.d.b(f18 - ((java.lang.Number) upper2).floatValue());
            } else {
                float f19 = c16709x6913f423.G;
                java.lang.Object lower = c16709x6913f423.A.getLower();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower, "getLower(...)");
                b17 = a06.d.b(f19 - ((java.lang.Number) lower).floatValue());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f491383f;
            c16709x6913f423.b(f0Var.f391649d + b17, true);
            f0Var.f391649d += b17;
            this.f491381d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(100L, this) != aVar);
        return aVar;
    }
}
