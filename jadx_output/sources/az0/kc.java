package az0;

/* loaded from: classes5.dex */
public final class kc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJAsyncTaskInfo f15650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(java.lang.String str, long j17, yz5.l lVar, com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo) {
        super(1);
        this.f15647d = str;
        this.f15648e = j17;
        this.f15649f = lVar;
        this.f15650g = mJAsyncTaskInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bz0.b bVar = bz0.b.f36724a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f15648e;
        int i17 = bz0.a.f36723b;
        java.lang.String funName = this.f15647d;
        kotlin.jvm.internal.o.g(funName, "funName");
        bVar.e(100, funName, "cancel", currentTimeMillis, i17);
        yz5.l lVar = this.f15649f;
        if (lVar != null) {
            lVar.invoke(this.f15650g);
        }
        return jz5.f0.f302826a;
    }
}
