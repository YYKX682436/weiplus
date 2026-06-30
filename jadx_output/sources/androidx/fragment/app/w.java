package androidx.fragment.app;

/* loaded from: classes14.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11498d;

    public w(androidx.fragment.app.Fragment fragment) {
        this.f11498d = fragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11498d.callStartTransitionListener(false);
    }
}
