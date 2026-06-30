package vf5;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f517951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f517952e;

    public h(android.widget.FrameLayout frameLayout, int i17) {
        this.f517951d = frameLayout;
        this.f517952e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = this.f517951d;
        boolean z17 = frameLayout instanceof android.widget.ScrollView;
        int i17 = this.f517952e;
        if (z17) {
            ((android.widget.ScrollView) frameLayout).smoothScrollBy(0, i17);
        } else if (frameLayout instanceof p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) {
            ((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) frameLayout).s(0, i17, 250, false);
        }
    }
}
