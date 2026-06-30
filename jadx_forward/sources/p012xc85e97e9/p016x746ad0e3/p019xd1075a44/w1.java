package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class w1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d f91266d;

    public w1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d) {
        this.f91266d = c0100x4c79dc8d;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d = this.f91266d;
        android.view.View view2 = c0100x4c79dc8d.D;
        if (view2.getWidth() > 1) {
            android.content.res.Resources resources = c0100x4c79dc8d.getContext().getResources();
            int paddingLeft = c0100x4c79dc8d.f90976x.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean a17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(c0100x4c79dc8d);
            int dimensionPixelSize = c0100x4c79dc8d.T ? resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561518kx) + resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561519ky) : 0;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = c0100x4c79dc8d.f90974v;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(a17 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
