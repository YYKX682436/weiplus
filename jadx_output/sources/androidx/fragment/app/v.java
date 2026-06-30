package androidx.fragment.app;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11492d;

    public v(androidx.fragment.app.Fragment fragment) {
        this.f11492d = fragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11492d.startPostponedEnterTransition();
    }
}
