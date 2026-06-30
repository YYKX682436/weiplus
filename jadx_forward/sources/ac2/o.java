package ac2;

/* loaded from: classes2.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f84578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f84579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ac2.t tVar, long j17) {
        super(1);
        this.f84578d = tVar;
        this.f84579e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        ac2.t tVar = this.f84578d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.B, "showPromotionCountDownToast onCountDownFinish, hostFeedId=".concat(pm0.v.u(this.f84579e)));
        ac2.y yVar = tVar.E;
        if (yVar != null && yVar.f84603v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.B, "resume auto scroll");
            ac2.y yVar2 = tVar.E;
            if (yVar2 != null) {
                yVar2.f84603v = false;
            }
            if (yVar2 != null) {
                yVar2.v(true);
            }
        }
        tVar.i0("countDownFinish");
        return jz5.f0.f384359a;
    }
}
