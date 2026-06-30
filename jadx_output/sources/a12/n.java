package a12;

/* loaded from: classes7.dex */
public final class n implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a12.s f516a;

    public n(a12.s sVar) {
        this.f516a = sVar;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data;
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        yz5.a aVar;
        android.view.View view = (android.view.View) obj;
        org.json.JSONObject viewAttribute = (org.json.JSONObject) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = viewAttribute.optJSONObject("position");
        int optInt = optJSONObject != null ? optJSONObject.optInt("height", 0) : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "onRequestUpdateCoverViewPositionAndSize height: " + optInt);
        if (optInt > 0) {
            a12.s sVar = this.f516a;
            java.lang.ref.WeakReference weakReference = sVar.f529m;
            if (weakReference != null && (aVar = (yz5.a) weakReference.get()) != null) {
                aVar.invoke();
            }
            sVar.f529m = null;
        }
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        return new a12.m();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        org.json.JSONObject viewAttribute = (org.json.JSONObject) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
    }
}
