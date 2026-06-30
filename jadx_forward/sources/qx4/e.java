package qx4;

/* loaded from: classes8.dex */
public final class e extends av4.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qx4.b uiComponent) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
    }

    @Override // av4.q
    public boolean d() {
        return com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: handleJSCall */
    public final java.lang.String m161075xa1e95b6f(java.lang.String str) {
        java.lang.String c17;
        av4.q qVar = this.f95860b;
        if (qVar != null && (c17 = qVar.c(str)) != null) {
            return c17;
        }
        java.lang.String jSONObject = f().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
