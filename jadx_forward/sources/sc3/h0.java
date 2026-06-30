package sc3;

/* loaded from: classes7.dex */
public final class h0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487984a;

    public h0(sc3.k1 k1Var) {
        this.f487984a = k1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        java.lang.Object obj2 = lVar.f384366d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "<get-first>(...)");
        java.lang.Object obj3 = lVar.f384367e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "<get-second>(...)");
        this.f487984a.X0((java.lang.String) obj2, (java.lang.String) obj3, "JSBridge");
    }
}
