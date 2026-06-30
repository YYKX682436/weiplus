package j00;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.l lVar) {
        super(1);
        this.f378358d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchPresentJumpInfoAsync callback jumpInfo.isNull ");
        sb6.append(x7Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEntrancePreloadLogicNew", sb6.toString());
        this.f378358d.mo146xb9724478(x7Var);
        return jz5.f0.f384359a;
    }
}
