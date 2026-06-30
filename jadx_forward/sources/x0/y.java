package x0;

/* loaded from: classes14.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f532494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yz5.l lVar) {
        super(1);
        this.f532494d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        x0.s invalid = (x0.s) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalid, "invalid");
        x0.m mVar = (x0.m) this.f532494d.mo146xb9724478(invalid);
        synchronized (x0.z.f532496b) {
            x0.z.f532497c = x0.z.f532497c.j(mVar.d());
        }
        return mVar;
    }
}
