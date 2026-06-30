package b92;

/* loaded from: classes10.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f18511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(b92.v1 v1Var) {
        super(0);
        this.f18511d = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            pm0.v.X(new b92.r1(this.f18511d));
        }
        return jz5.f0.f302826a;
    }
}
