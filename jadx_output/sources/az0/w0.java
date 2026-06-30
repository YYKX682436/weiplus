package az0;

/* loaded from: classes16.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.u f15988f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(az0.f2 f2Var, java.lang.String str, com.tencent.maas.camstudio.u uVar) {
        super(1);
        this.f15986d = f2Var;
        this.f15987e = str;
        this.f15988f = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f15986d.f15461e.m(this.f15987e, this.f15988f, new az0.g1(it));
        return jz5.f0.f302826a;
    }
}
