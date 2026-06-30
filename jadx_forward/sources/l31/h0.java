package l31;

/* loaded from: classes9.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.i0 f396892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l31.i0 i0Var) {
        super(0);
        this.f396892d = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        l31.i0 i0Var = this.f396892d;
        k31.a aVar = i0Var.f396896e;
        if (aVar != null) {
            java.lang.String bizUsername = i0Var.f396846a;
            java.util.List subscribeMsgList = i0Var.f396897f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeMsgList, "subscribeMsgList");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateSubscribeMsgUiStatusTimestamp bizUsername: %s, size: %s", bizUsername, java.lang.Integer.valueOf(((java.util.ArrayList) subscribeMsgList).size()));
            ((k31.h) aVar).b(bizUsername, subscribeMsgList, false, false, false, true);
        }
        k31.o.f385383a.a(i0Var);
        return jz5.f0.f384359a;
    }
}
