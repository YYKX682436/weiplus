package a12;

/* loaded from: classes7.dex */
public final class n implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a12.s f82049a;

    public n(a12.s sVar) {
        this.f82049a = sVar;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data;
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        yz5.a aVar;
        android.view.View view = (android.view.View) obj;
        org.json.JSONObject viewAttribute = (org.json.JSONObject) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = viewAttribute.optJSONObject("position");
        int optInt = optJSONObject != null ? optJSONObject.optInt("height", 0) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "onRequestUpdateCoverViewPositionAndSize height: " + optInt);
        if (optInt > 0) {
            a12.s sVar = this.f82049a;
            java.lang.ref.WeakReference weakReference = sVar.f82062m;
            if (weakReference != null && (aVar = (yz5.a) weakReference.get()) != null) {
                aVar.mo152xb9724478();
            }
            sVar.f82062m = null;
        }
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return new a12.m();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        org.json.JSONObject viewAttribute = (org.json.JSONObject) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }
}
