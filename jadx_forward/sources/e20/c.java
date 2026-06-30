package e20;

/* loaded from: classes9.dex */
public final class c implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f328006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq.a f328007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e20.h f328008c;

    public c(android.webkit.ValueCallback valueCallback, pq.a aVar, e20.h hVar) {
        this.f328006a = valueCallback;
        this.f328007b = aVar;
        this.f328008c = hVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.Wxa", "fakeNativeResultReceiver: " + str);
        android.webkit.ValueCallback valueCallback = this.f328006a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
        yz5.p pVar = this.f328007b.f439086c;
        if (pVar != null) {
            bw5.i8 i8Var = new bw5.i8();
            i8Var.f110025d = bw5.k8.EcsOpenPlatform_Native;
            boolean[] zArr = i8Var.f110029h;
            zArr[1] = true;
            i8Var.f110026e = this.f328008c.f496083a;
            zArr[2] = true;
            i8Var.f110027f = str;
            zArr[3] = true;
            pVar.mo149xb9724478(bw5.j8.EcsOpenEventType_wxaNavBackToNative, i8Var);
        }
    }
}
