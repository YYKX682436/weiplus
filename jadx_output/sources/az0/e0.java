package az0;

/* loaded from: classes16.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamMusicDesc f15426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(az0.f2 f2Var, com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc) {
        super(1);
        this.f15425d = f2Var;
        this.f15426e = mJCamMusicDesc;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f15425d.f15460d.b(this.f15426e, new az0.i1(it));
        return jz5.f0.f302826a;
    }
}
