package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class w0 implements n3.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.y0 f9228a;

    public w0(androidx.appcompat.app.y0 y0Var) {
        this.f9228a = y0Var;
    }

    @Override // n3.e2
    public void a(android.view.View view) {
        ((android.view.View) this.f9228a.f9241d.getParent()).invalidate();
    }
}
