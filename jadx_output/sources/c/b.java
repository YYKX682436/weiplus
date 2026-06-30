package c;

/* loaded from: classes14.dex */
public class b extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.support.design.widget.MMBottomSheetBehavior f36851a;

    public b(android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior) {
        this.f36851a = mMBottomSheetBehavior;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View view, int i17, int i18) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View view, int i17, int i18) {
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = this.f36851a;
        return h3.a.b(i17, mMBottomSheetBehavior.f8887h, mMBottomSheetBehavior.f8889m ? mMBottomSheetBehavior.f8896t : mMBottomSheetBehavior.f8888i);
    }

    @Override // androidx.customview.widget.k
    public int d(android.view.View view) {
        int i17;
        int i18;
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = this.f36851a;
        if (mMBottomSheetBehavior.f8889m) {
            i17 = mMBottomSheetBehavior.f8896t;
            i18 = mMBottomSheetBehavior.f8887h;
        } else {
            i17 = mMBottomSheetBehavior.f8888i;
            i18 = mMBottomSheetBehavior.f8887h;
        }
        return i17 - i18;
    }

    @Override // androidx.customview.widget.k
    public void h(int i17) {
        if (i17 == 1) {
            this.f36851a.D(1);
        }
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f36851a.y(i18);
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View view, float f17, float f18) {
        int i17;
        int i18 = 3;
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = this.f36851a;
        if (f18 < 0.0f) {
            i17 = mMBottomSheetBehavior.f8887h;
        } else if (mMBottomSheetBehavior.f8889m && mMBottomSheetBehavior.E(view, f18)) {
            i17 = mMBottomSheetBehavior.f8896t;
            i18 = 5;
        } else {
            if (f18 == 0.0f) {
                int top = view.getTop();
                if (java.lang.Math.abs(top - mMBottomSheetBehavior.f8887h) < java.lang.Math.abs(top - mMBottomSheetBehavior.f8888i)) {
                    i17 = mMBottomSheetBehavior.f8887h;
                } else {
                    i17 = mMBottomSheetBehavior.f8888i;
                }
            } else {
                i17 = mMBottomSheetBehavior.f8888i;
            }
            i18 = 4;
        }
        if (!mMBottomSheetBehavior.f8892p.s(view.getLeft(), i17)) {
            mMBottomSheetBehavior.D(i18);
            return;
        }
        mMBottomSheetBehavior.D(2);
        c.e eVar = new c.e(mMBottomSheetBehavior, view, i18);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(view, eVar);
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View view, int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view2;
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = this.f36851a;
        int i18 = mMBottomSheetBehavior.f8891o;
        if (i18 == 1 || mMBottomSheetBehavior.D) {
            return false;
        }
        return ((i18 == 3 && mMBottomSheetBehavior.f8901y == i17 && (view2 = (android.view.View) mMBottomSheetBehavior.f8898v.get()) != null && view2.canScrollVertically(-1)) || (weakReference = mMBottomSheetBehavior.f8897u) == null || weakReference.get() != view) ? false : true;
    }
}
