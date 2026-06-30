package az0;

/* loaded from: classes16.dex */
public final class k8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.q f15636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.u f15637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(az0.s9 s9Var, java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar) {
        super(2);
        this.f15634d = s9Var;
        this.f15635e = str;
        this.f15636f = qVar;
        this.f15637g = uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g((com.tencent.maas.camstudio.MJCamSession) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager = this.f15634d.f15891d;
        az0.v8 v8Var = new az0.v8(cb6);
        mJCamResourceManager.n(this.f15635e, this.f15636f, this.f15637g, v8Var);
        return jz5.f0.f302826a;
    }
}
