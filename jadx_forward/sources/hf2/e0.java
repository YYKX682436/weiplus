package hf2;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f362583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(hf2.h0 h0Var) {
        super(2);
        this.f362583d = h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.ei0 restoreData = (r45.ei0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restoreData, "restoreData");
        hf2.h0 h0Var = this.f362583d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h0Var.f362604b, "launchStickerOperationContainer onError: " + ((java.lang.Exception) obj) + ",restoreData:" + restoreData.hashCode());
        h0Var.f362603a.n7("operation error");
        h0Var.a();
        return jz5.f0.f384359a;
    }
}
