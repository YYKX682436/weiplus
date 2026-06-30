package sc3;

/* loaded from: classes7.dex */
public final class r implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f488061b;

    public r(sc3.k1 k1Var, int i17) {
        this.f488060a = k1Var;
        this.f488061b = i17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f488060a.H0().F2(this.f488061b, (java.lang.String) obj);
    }
}
