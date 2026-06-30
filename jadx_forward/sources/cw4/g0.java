package cw4;

/* loaded from: classes8.dex */
public final class g0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f305753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f305754b;

    public g0(cw4.m0 m0Var, yz5.a aVar) {
        this.f305753a = m0Var;
        this.f305754b = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305753a.f305772e, "execute js success!");
        yz5.a aVar = this.f305754b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
