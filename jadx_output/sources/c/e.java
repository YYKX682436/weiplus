package c;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f36852d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.design.widget.MMBottomSheetBehavior f36854f;

    public e(android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior, android.view.View view, int i17) {
        this.f36854f = mMBottomSheetBehavior;
        this.f36852d = view;
        this.f36853e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = this.f36854f;
        androidx.customview.widget.l lVar = mMBottomSheetBehavior.f8892p;
        if (lVar == null || !lVar.h(true)) {
            mMBottomSheetBehavior.D(this.f36853e);
        } else {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(this.f36852d, this);
        }
    }
}
