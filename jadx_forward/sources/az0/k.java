package az0;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f97150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f97151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f97152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f97153g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f97154h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(az0.a0 a0Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z17) {
        super(1);
        this.f97150d = a0Var;
        this.f97151e = c4129xdee64553;
        this.f97152f = c4128x879fba0a;
        this.f97153g = i17;
        this.f97154h = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        az0.a0 a0Var = this.f97150d;
        java.lang.String str = a0Var.f96844c;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = this.f97151e;
        if (c4129xdee64553 == null) {
            c4129xdee64553 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33999xbdf18ae3(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, a0Var.f96842a.m33239xebfaa445());
        }
        return a0Var.f96842a.m33250xda91516c(c4129xdee64553, this.f97152f, this.f97153g, this.f97154h, onComplete);
    }
}
