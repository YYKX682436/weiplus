package fs1;

/* loaded from: classes7.dex */
public final class f implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f347814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347815b;

    public f(yz5.p pVar, java.lang.String str) {
        this.f347814a = pVar;
        this.f347815b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f347814a.mo149xb9724478(java.lang.Boolean.TRUE, this.f347815b);
    }
}
