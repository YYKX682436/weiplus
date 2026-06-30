package ry4;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f483215d;

    public v(android.widget.ScrollView scrollView) {
        this.f483215d = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f483215d.scrollTo(0, 0);
    }
}
