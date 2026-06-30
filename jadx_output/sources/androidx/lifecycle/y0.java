package androidx.lifecycle;

/* loaded from: classes13.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f11667d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.m f11668e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11669f = false;

    public y0(androidx.lifecycle.b0 b0Var, androidx.lifecycle.m mVar) {
        this.f11667d = b0Var;
        this.f11668e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f11669f) {
            return;
        }
        this.f11667d.f(this.f11668e);
        this.f11669f = true;
    }
}
