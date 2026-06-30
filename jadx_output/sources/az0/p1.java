package az0;

/* loaded from: classes16.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJBeautyAdjustmentDesc f15799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(az0.f2 f2Var, com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc) {
        super(1);
        this.f15798d = f2Var;
        this.f15799e = mJBeautyAdjustmentDesc;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f15798d.f15460d.H(this.f15799e, new az0.i1(it));
        return jz5.f0.f302826a;
    }
}
