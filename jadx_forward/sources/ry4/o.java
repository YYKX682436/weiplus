package ry4;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f483200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f483201e;

    public o(android.widget.ScrollView scrollView, int i17) {
        this.f483200d = scrollView;
        this.f483201e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f483200d.smoothScrollBy(0, this.f483201e);
    }
}
