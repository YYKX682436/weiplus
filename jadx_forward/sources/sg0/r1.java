package sg0;

/* loaded from: classes8.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f489327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(sg0.a2 a2Var, java.lang.String str) {
        super(0);
        this.f489327d = a2Var;
        this.f489328e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sg0.a2 a2Var = this.f489327d;
        java.util.List list = a2Var.f489204i;
        java.lang.String str = this.f489328e;
        kz5.h0.B(list, new sg0.q1(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "delSubscribeLiteAppStoreListener, subscribeListeners: " + ((java.util.ArrayList) a2Var.f489204i).size() + ", " + str);
        return jz5.f0.f384359a;
    }
}
