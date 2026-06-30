package gx0;

/* loaded from: classes5.dex */
public final class dc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.kc f357865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f357866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f357867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f357868h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f357869i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(gx0.kc kcVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, yz5.a aVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357865e = kcVar;
        this.f357866f = c4190xd8dd3713;
        this.f357867g = c4129xdee64553;
        this.f357868h = aVar;
        this.f357869i = c3971x241f78;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.dc(this.f357865e, this.f357866f, this.f357867g, this.f357868h, this.f357869i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.dc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357864d;
        gx0.kc kcVar = this.f357865e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99 = this.f357867g.m34009x8082fb99();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34009x8082fb99, "getStartTime(...)");
            this.f357864d = 1;
            if (gx0.kc.i7(kcVar, this.f357866f, m34009x8082fb99, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yz5.a aVar2 = this.f357868h;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        du0.o.o7((gx0.x4) ((jz5.n) kcVar.f358165n).mo141623x754a37bb(), this.f357869i, true, false, 4, null);
        return jz5.f0.f384359a;
    }
}
