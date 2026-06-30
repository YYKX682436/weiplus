package androidx.preference;

/* loaded from: classes13.dex */
public class t extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f11838d;

    /* renamed from: e, reason: collision with root package name */
    public int f11839e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11840f = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.PreferenceFragmentCompat f11841g;

    public t(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat) {
        this.f11841g = preferenceFragmentCompat;
    }

    public final boolean d(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.k3 w07 = recyclerView.w0(view);
        boolean z17 = false;
        if (!((w07 instanceof androidx.preference.f0) && ((androidx.preference.f0) w07).f11814f)) {
            return false;
        }
        boolean z18 = this.f11840f;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z18;
        }
        androidx.recyclerview.widget.k3 w08 = recyclerView.w0(recyclerView.getChildAt(indexOfChild + 1));
        if ((w08 instanceof androidx.preference.f0) && ((androidx.preference.f0) w08).f11813e) {
            z17 = true;
        }
        return z17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        if (d(view, recyclerView)) {
            rect.bottom = this.f11839e;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f11838d == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            if (d(childAt, recyclerView)) {
                int y17 = ((int) childAt.getY()) + childAt.getHeight();
                this.f11838d.setBounds(0, y17, width, this.f11839e + y17);
                this.f11838d.draw(canvas);
            }
        }
    }
}
