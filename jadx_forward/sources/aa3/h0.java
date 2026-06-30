package aa3;

/* loaded from: classes15.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static aa3.q f84060b;

    /* renamed from: c, reason: collision with root package name */
    public static android.view.inputmethod.InputConnection f84061c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f84062d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f84063e;

    /* renamed from: a, reason: collision with root package name */
    public static final aa3.h0 f84059a = new aa3.h0();

    /* renamed from: f, reason: collision with root package name */
    public static final android.view.inputmethod.EditorInfo f84064f = new android.view.inputmethod.EditorInfo();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f84065g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f84066h = new java.util.ArrayList();

    public void a(q80.w handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        if (f84060b == null) {
            aa3.q qVar = new aa3.q();
            qVar.f84112a = new aa3.g0();
            f84060b = qVar;
        }
        ((java.util.ArrayList) f84066h).add(handler);
    }

    public void b() {
        aa3.q qVar = f84060b;
        if (qVar != null) {
            qVar.c(null, null);
        }
        java.lang.ref.WeakReference weakReference = f84062d;
        if (weakReference != null) {
            weakReference.clear();
        }
        f84062d = null;
        android.view.inputmethod.InputConnection inputConnection = f84061c;
        if (inputConnection != null) {
            inputConnection.closeConnection();
        }
        f84061c = null;
    }

    public void c(boolean z17) {
        aa3.c cVar;
        aa3.q qVar = f84060b;
        if (qVar == null || (cVar = qVar.f84113b) == null || !(cVar instanceof aa3.z)) {
            return;
        }
        aa3.p0 p0Var = ((aa3.z) cVar).f84161g;
        p0Var.f84108i = z17;
        p0Var.f84111o.f225395r.setEnabled(z17);
    }

    public void d(q80.w handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        ((java.util.ArrayList) f84066h).remove(handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.View r11, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa3.h0.e(android.view.View, io.flutter.embedding.engine.systemchannels.TextInputChannel$WxInputConfiguration):boolean");
    }
}
