package androidx.fragment.app;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.g f11311d;

    public f(androidx.fragment.app.g gVar) {
        this.f11311d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.g gVar = this.f11311d;
        gVar.f11316a.endViewTransition(gVar.f11317b);
        gVar.f11318c.a();
    }
}
