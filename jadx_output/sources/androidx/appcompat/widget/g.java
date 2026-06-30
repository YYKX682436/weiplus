package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f9586d;

    public g(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9586d = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f9586d;
        actionBarOverlayLayout.b();
        actionBarOverlayLayout.C = actionBarOverlayLayout.f9318g.animate().translationY(-actionBarOverlayLayout.f9318g.getHeight()).setListener(actionBarOverlayLayout.D);
    }
}
