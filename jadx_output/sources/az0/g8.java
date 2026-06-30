package az0;

/* loaded from: classes16.dex */
public final class g8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.u f15505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(az0.s9 s9Var, java.lang.String str, com.tencent.maas.camstudio.u uVar) {
        super(2);
        this.f15503d = s9Var;
        this.f15504e = str;
        this.f15505f = uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g((com.tencent.maas.camstudio.MJCamSession) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(cb6, "cb");
        this.f15503d.f15891d.k(this.f15504e, this.f15505f, new az0.v8(cb6));
        return jz5.f0.f302826a;
    }
}
