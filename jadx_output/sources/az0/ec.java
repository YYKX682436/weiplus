package az0;

/* loaded from: classes5.dex */
public final class ec extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJAsyncTaskInfo f15453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(java.lang.String str, long j17, yz5.l lVar, com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo) {
        super(1);
        this.f15450d = str;
        this.f15451e = j17;
        this.f15452f = lVar;
        this.f15453g = mJAsyncTaskInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bz0.b bVar = bz0.b.f36724a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f15451e;
        int i17 = bz0.a.f36723b;
        java.lang.String funName = this.f15450d;
        kotlin.jvm.internal.o.g(funName, "funName");
        bVar.e(100, funName, "cancel", currentTimeMillis, i17);
        this.f15452f.invoke(this.f15453g);
        return jz5.f0.f302826a;
    }
}
