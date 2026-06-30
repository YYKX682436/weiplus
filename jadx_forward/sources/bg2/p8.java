package bg2;

/* loaded from: classes2.dex */
public final class p8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f101922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(so2.h1 h1Var) {
        super(0);
        this.f101922d = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId = ");
        so2.h1 h1Var = this.f101922d;
        sb6.append(pm0.v.u(h1Var.getFeedObject().getFeedObject().m76784x5db1b11()));
        sb6.append(", liveId = ");
        r45.nw1 m76794xd0557130 = h1Var.getFeedObject().getFeedObject().m76794xd0557130();
        sb6.append(m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null);
        return sb6.toString();
    }
}
