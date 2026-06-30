package androidx.fragment.app;

/* loaded from: classes14.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f11319d;

    public g1(androidx.fragment.app.FragmentManager fragmentManager) {
        this.f11319d = fragmentManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11319d.execPendingActions(true);
    }
}
