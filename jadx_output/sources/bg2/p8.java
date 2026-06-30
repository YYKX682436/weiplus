package bg2;

/* loaded from: classes2.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f20389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(so2.h1 h1Var) {
        super(0);
        this.f20389d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId = ");
        so2.h1 h1Var = this.f20389d;
        sb6.append(pm0.v.u(h1Var.getFeedObject().getFeedObject().getId()));
        sb6.append(", liveId = ");
        r45.nw1 liveInfo = h1Var.getFeedObject().getFeedObject().getLiveInfo();
        sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
        return sb6.toString();
    }
}
