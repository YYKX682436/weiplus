package cy5;

/* loaded from: classes13.dex */
public class x implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f306455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cy5.y f306456c;

    public x(cy5.y yVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f306456c = yVar;
        this.f306454a = str;
        this.f306455b = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        cy5.y yVar = this.f306456c;
        by5.c4.f(yVar.m(), "readFile onReceiveValue: " + num);
        com.p314xaae8f345.p3210x3857dc.g.b(this.f306454a);
        cy5.y.v(yVar);
        yVar.G(this.f306455b, num.intValue());
    }
}
