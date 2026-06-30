package im2;

/* loaded from: classes3.dex */
public final class e0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373835a;

    public e0(im2.z3 z3Var) {
        this.f373835a = z3Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        im2.z3 z3Var = this.f373835a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z3Var.f374168d, "#goMiniApp callback=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        z3Var.f374205z1 = null;
        cl0.e f17 = new cl0.g(str).f(ya.b.f77471x76d5cc26);
        if (f17 != null) {
            cl0.g k17 = f17.k(0);
            java.lang.String mo15082x48bce8a4 = k17.mo15082x48bce8a4("stockId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a4, "optString(...)");
            if (mo15082x48bce8a4.length() > 0) {
                im2.r rVar = new im2.r();
                java.lang.String mo15082x48bce8a42 = k17.mo15082x48bce8a4("stockId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
                rVar.f374045a = mo15082x48bce8a42;
                java.lang.String mo15082x48bce8a43 = k17.mo15082x48bce8a4("stockName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a43, "optString(...)");
                rVar.f374046b = mo15082x48bce8a43;
                z3Var.f374205z1 = rVar;
            }
        }
        android.widget.TextView m57280xb07cee8c = z3Var.Z6().m57280xb07cee8c();
        im2.s sVar = z3Var.f374205z1;
        im2.r rVar2 = sVar instanceof im2.r ? (im2.r) sVar : null;
        m57280xb07cee8c.setText(rVar2 != null ? rVar2.f374046b : null);
    }
}
