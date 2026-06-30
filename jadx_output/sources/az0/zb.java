package az0;

/* loaded from: classes5.dex */
public final class zb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f16113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJAsyncTaskInfo f16115g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(java.lang.String str, long j17, yz5.l lVar, com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo) {
        super(1);
        this.f16112d = str;
        this.f16113e = j17;
        this.f16114f = lVar;
        this.f16115g = mJAsyncTaskInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String funName = this.f16112d;
        sb6.append(funName);
        sb6.append(" call cancel");
        com.tencent.mars.xlog.Log.w("MaasFuncUtils", sb6.toString());
        bz0.b bVar = bz0.b.f36724a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f16113e;
        int i17 = bz0.a.f36723b;
        kotlin.jvm.internal.o.g(funName, "funName");
        bVar.e(100, funName, "cancel", currentTimeMillis, i17);
        this.f16114f.invoke(this.f16115g);
        return jz5.f0.f302826a;
    }
}
