package sg0;

/* loaded from: classes8.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f489285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f489286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.lang.String str, java.lang.ref.WeakReference weakReference, sg0.a2 a2Var) {
        super(0);
        this.f489284d = str;
        this.f489285e = weakReference;
        this.f489286f = a2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f489284d;
        sg0.k1 k1Var = new sg0.k1(str, this.f489285e);
        sg0.a2 a2Var = this.f489286f;
        kz5.h0.B(a2Var.f489204i, new sg0.l1(str));
        java.util.List list = a2Var.f489204i;
        ((java.util.ArrayList) list).add(k1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "addSubscribeLiteAppStoreListener, subscribeListeners: " + ((java.util.ArrayList) list).size() + ", " + str);
        return jz5.f0.f384359a;
    }
}
