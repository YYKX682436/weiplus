package mz0;

/* loaded from: classes5.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0 f414600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mz0.b2 b2Var, com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0 c11009x358a2db0) {
        super(2);
        this.f414599d = b2Var;
        this.f414600e = c11009x358a2db0;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l visibleCallback = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibleCallback, "visibleCallback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f414599d.m158345xefc66565(), null, null, new mz0.t0(booleanValue, this.f414599d, this.f414600e, visibleCallback, null), 3, null);
        return jz5.f0.f384359a;
    }
}
