package cl;

/* loaded from: classes7.dex */
public class d3 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f124148a;

    public d3(cl.l3 l3Var, android.webkit.ValueCallback valueCallback) {
        this.f124148a = valueCallback;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        this.f124148a.onReceiveValue(str);
    }
}
