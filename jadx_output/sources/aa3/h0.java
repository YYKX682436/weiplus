package aa3;

/* loaded from: classes15.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static aa3.q f2527b;

    /* renamed from: c, reason: collision with root package name */
    public static android.view.inputmethod.InputConnection f2528c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f2529d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f2530e;

    /* renamed from: a, reason: collision with root package name */
    public static final aa3.h0 f2526a = new aa3.h0();

    /* renamed from: f, reason: collision with root package name */
    public static final android.view.inputmethod.EditorInfo f2531f = new android.view.inputmethod.EditorInfo();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f2532g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f2533h = new java.util.ArrayList();

    public void a(q80.w handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        if (f2527b == null) {
            aa3.q qVar = new aa3.q();
            qVar.f2579a = new aa3.g0();
            f2527b = qVar;
        }
        ((java.util.ArrayList) f2533h).add(handler);
    }

    public void b() {
        aa3.q qVar = f2527b;
        if (qVar != null) {
            qVar.c(null, null);
        }
        java.lang.ref.WeakReference weakReference = f2529d;
        if (weakReference != null) {
            weakReference.clear();
        }
        f2529d = null;
        android.view.inputmethod.InputConnection inputConnection = f2528c;
        if (inputConnection != null) {
            inputConnection.closeConnection();
        }
        f2528c = null;
    }

    public void c(boolean z17) {
        aa3.c cVar;
        aa3.q qVar = f2527b;
        if (qVar == null || (cVar = qVar.f2580b) == null || !(cVar instanceof aa3.z)) {
            return;
        }
        aa3.p0 p0Var = ((aa3.z) cVar).f2628g;
        p0Var.f2575i = z17;
        p0Var.f2578o.f143862r.setEnabled(z17);
    }

    public void d(q80.w handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        ((java.util.ArrayList) f2533h).remove(handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.View r11, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa3.h0.e(android.view.View, io.flutter.embedding.engine.systemchannels.TextInputChannel$WxInputConfiguration):boolean");
    }
}
