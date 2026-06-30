package qx4;

/* loaded from: classes8.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f448957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f448957d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        qx4.d0 d0Var = (qx4.d0) this.f448957d.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onDispatchLiteAppAction: jsapi->" + d0Var + ", action->" + it);
        if (d0Var != null) {
            d0Var.m("onDispatchLiteAppAction", it);
        }
        return jz5.f0.f384359a;
    }
}
