package ry4;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f483187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f483188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f483189f;

    public k(ry4.c0 c0Var, android.widget.ScrollView scrollView, int i17) {
        this.f483187d = c0Var;
        this.f483188e = scrollView;
        this.f483189f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f483187d.f483127i;
        if (c21503x6e5a020a == null) {
            return;
        }
        int[] iArr = new int[2];
        c21503x6e5a020a.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        android.widget.ScrollView scrollView = this.f483188e;
        scrollView.getLocationOnScreen(iArr2);
        int height = iArr[1] + c21503x6e5a020a.getHeight();
        int height2 = (iArr2[1] + scrollView.getHeight()) - this.f483189f;
        if (height > height2) {
            scrollView.smoothScrollBy(0, height - height2);
        }
    }
}
