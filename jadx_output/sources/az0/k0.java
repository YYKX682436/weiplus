package az0;

/* loaded from: classes16.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(az0.f2 f2Var) {
        super(1);
        this.f15622d = f2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15622d.f15460d;
        az0.i1 i1Var = new az0.i1(it);
        mJCamSession.getClass();
        mJCamSession.H(new com.tencent.maas.camstudio.MJBeautyAdjustmentDesc(), i1Var);
        return jz5.f0.f302826a;
    }
}
