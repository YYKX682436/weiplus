package co1;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.m0 f125298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f125299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f125300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xg3.m0 m0Var, long j17, java.lang.String str) {
        super(2);
        this.f125298d = m0Var;
        this.f125299e = j17;
        this.f125300f = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) this.f125298d;
        long R9 = booleanValue ? g9Var.R9(msgInfo) : g9Var.Q9(msgInfo);
        if (R9 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InsertFailed: pkgId=");
            sb6.append(this.f125299e);
            sb6.append(", convId=");
            sb6.append(this.f125300f);
            sb6.append(", err=");
            sb6.append(R9);
            sb6.append(", ");
            fo1.m mVar = fo1.m.f346415a;
            sb6.append(mVar.e(msgInfo));
            java.lang.String sb7 = sb6.toString();
            mVar.c("Restore", sb7, new java.lang.Object[0]);
            kn1.q.b((r23 & 1) != 0 ? kn1.m.f391165e : kn1.m.f391173p, (r23 & 2) != 0 ? kn1.o.f391182e : null, (r23 & 4) != 0 ? "" : sb7, (r23 & 8) != 0 ? 0L : 0L, (r23 & 16) != 0 ? 0L : this.f125299e, (r23 & 32) != 0 ? 0L : R9, (r23 & 64) == 0 ? msgInfo.mo78013xfb85f7b0() : 0L);
        }
        return java.lang.Long.valueOf(R9);
    }
}
