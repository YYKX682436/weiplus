package co1;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.m0 f43765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f43766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f43767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xg3.m0 m0Var, long j17, java.lang.String str) {
        super(2);
        this.f43765d = m0Var;
        this.f43766e = j17;
        this.f43767f = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.f9 msgInfo = (com.tencent.mm.storage.f9) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) this.f43765d;
        long R9 = booleanValue ? g9Var.R9(msgInfo) : g9Var.Q9(msgInfo);
        if (R9 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InsertFailed: pkgId=");
            sb6.append(this.f43766e);
            sb6.append(", convId=");
            sb6.append(this.f43767f);
            sb6.append(", err=");
            sb6.append(R9);
            sb6.append(", ");
            fo1.m mVar = fo1.m.f264882a;
            sb6.append(mVar.e(msgInfo));
            java.lang.String sb7 = sb6.toString();
            mVar.c("Restore", sb7, new java.lang.Object[0]);
            kn1.q.b((r23 & 1) != 0 ? kn1.m.f309632e : kn1.m.f309640p, (r23 & 2) != 0 ? kn1.o.f309649e : null, (r23 & 4) != 0 ? "" : sb7, (r23 & 8) != 0 ? 0L : 0L, (r23 & 16) != 0 ? 0L : this.f43766e, (r23 & 32) != 0 ? 0L : R9, (r23 & 64) == 0 ? msgInfo.getType() : 0L);
        }
        return java.lang.Long.valueOf(R9);
    }
}
