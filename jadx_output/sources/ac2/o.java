package ac2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f3045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ac2.t tVar, long j17) {
        super(1);
        this.f3045d = tVar;
        this.f3046e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        ac2.t tVar = this.f3045d;
        com.tencent.mars.xlog.Log.i(tVar.B, "showPromotionCountDownToast onCountDownFinish, hostFeedId=".concat(pm0.v.u(this.f3046e)));
        ac2.y yVar = tVar.E;
        if (yVar != null && yVar.f3070v) {
            com.tencent.mars.xlog.Log.i(tVar.B, "resume auto scroll");
            ac2.y yVar2 = tVar.E;
            if (yVar2 != null) {
                yVar2.f3070v = false;
            }
            if (yVar2 != null) {
                yVar2.v(true);
            }
        }
        tVar.i0("countDownFinish");
        return jz5.f0.f302826a;
    }
}
