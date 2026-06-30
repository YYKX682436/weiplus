package tv0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f503721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f503723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tv0.j0 j0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503722e = j0Var;
        this.f503723f = c4181x2248e1a3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tv0.f(this.f503722e, this.f503723f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tv0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503721d;
        tv0.j0 j0Var = this.f503722e;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f503723f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = j0Var.p7();
            rv0.c7 c7Var = rv0.c7.f481493d;
            this.f503721d = 1;
            if (p76.Z6(c4181x2248e1a3, c7Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Double d17 = new java.lang.Double(c4181x2248e1a3.v1());
        double doubleValue = d17.doubleValue();
        if (!((java.lang.Double.isInfinite(doubleValue) || java.lang.Double.isNaN(doubleValue)) ? false : true)) {
            d17 = null;
        }
        double doubleValue2 = 1 / (d17 != null ? d17.doubleValue() : 1.0d);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = j0Var.f503746z.sub(c4181x2248e1a3.A()).add(c4181x2248e1a3.x1().m34009x8082fb99().m33984x636d539(doubleValue2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(add, "add(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = c4181x2248e1a3.x1().m34007xde00a612().m33984x636d539(doubleValue2).sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub, "sub(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = ou0.f.b(add, sub);
        if (j0Var.p7().L) {
            j0Var.p7().b7(b17, true);
        }
        return jz5.f0.f384359a;
    }
}
