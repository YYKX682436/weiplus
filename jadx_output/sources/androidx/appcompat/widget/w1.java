package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class w1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9733d;

    public w1(androidx.appcompat.widget.SearchView searchView) {
        this.f9733d = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        androidx.appcompat.widget.SearchView searchView = this.f9733d;
        android.view.View view2 = searchView.D;
        if (view2.getWidth() > 1) {
            android.content.res.Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f9443x.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean a17 = androidx.appcompat.widget.h3.a(searchView);
            int dimensionPixelSize = searchView.T ? resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479985kx) + resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479986ky) : 0;
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f9441v;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(a17 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
