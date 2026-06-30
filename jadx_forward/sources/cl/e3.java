package cl;

/* loaded from: classes7.dex */
public class e3 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f124157a;

    public e3(cl.f3 f3Var, android.webkit.ValueCallback valueCallback) {
        this.f124157a = valueCallback;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        android.webkit.ValueCallback valueCallback = this.f124157a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }
}
