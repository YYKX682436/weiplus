package cl;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f124344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124345f;

    public w0(cl.q0 q0Var, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f124345f = q0Var;
        this.f124343d = str;
        this.f124344e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef m16389x2817c635 = this.f124345f.f().m16389x2817c635(this.f124343d);
        if (m16389x2817c635 == null) {
            m16389x2817c635 = com.p159x477cd522.p160x333422.V8.m16073xc18cd29a();
        }
        this.f124344e.onReceiveValue(m16389x2817c635);
    }
}
