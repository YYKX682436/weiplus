package av4;

/* loaded from: classes.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e f95873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e, java.lang.String str2) {
        super(0);
        this.f95872d = str;
        this.f95873e = abstractC19224x1fe3df6e;
        this.f95874f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyJsEvent, funcName: ");
        java.lang.String str = this.f95872d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", sb6.toString());
        this.f95873e.mo14660x738236e6(this.f95874f, null);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "onFlutterResultReady") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "onUiInit")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "end notifyJsEvent: %s", str);
        }
        return jz5.f0.f384359a;
    }
}
