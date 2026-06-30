package az0;

/* loaded from: classes16.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f16068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSegmentationDesc f16069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(az0.f2 f2Var, com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc) {
        super(1);
        this.f16068d = f2Var;
        this.f16069e = mJCamSegmentationDesc;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f16068d.f15460d.V(this.f16069e, new az0.i1(it));
        return jz5.f0.f302826a;
    }
}
