package oq5;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    public static final oq5.f f428939g = new oq5.f();

    /* renamed from: a, reason: collision with root package name */
    public boolean f428940a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f428941b = true;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f428942c = new oq5.c(this);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f428943d = new oq5.d(this);

    /* renamed from: e, reason: collision with root package name */
    public final android.os.HandlerThread f428944e = new android.os.HandlerThread("LogcatCatcher");

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f428945f = null;

    public static java.lang.String a(oq5.f fVar) {
        fVar.getClass();
        java.lang.String a17 = bm5.f1.a();
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? "LOGCATMM" : a17.endsWith(":push") ? "LOGCATPUSH" : a17.endsWith(":tools") ? "LOGCATTOOLS" : a17.endsWith(":appbrand0") ? "LOGCATAPPBRAND0" : a17.endsWith(":appbrand1") ? "LOGCATAPPBRAND1" : a17.endsWith(":appbrand2") ? "LOGCATAPPBRAND2" : a17.endsWith(":appbrand3") ? "LOGCATAPPBRAND3" : a17.endsWith(":appbrand4") ? "LOGCATAPPBRAND4" : "";
    }
}
