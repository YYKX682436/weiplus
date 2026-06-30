package az0;

/* loaded from: classes5.dex */
public final class j7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f97137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f97138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f97139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, az0.n7 n7Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        super(1);
        this.f97137d = c4129xdee64553;
        this.f97138e = n7Var;
        this.f97139f = c4128x879fba0a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete it = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        az0.n7 n7Var = this.f97138e;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = this.f97137d;
        if (c4129xdee64553 == null) {
            c4129xdee64553 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33999xbdf18ae3(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, n7Var.f97275a.m33398xebfaa445());
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33459xda91516c = n7Var.f97275a.m33459xda91516c(c4129xdee64553, this.f97139f, 999, true, it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "startPlay: err=" + m33459xda91516c);
        return m33459xda91516c;
    }
}
