package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f9575d;

    public f(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9575d = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f9575d;
        actionBarOverlayLayout.b();
        actionBarOverlayLayout.C = actionBarOverlayLayout.f9318g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.D);
    }
}
