package va2;

/* loaded from: classes3.dex */
public final class b extends x92.l {

    /* renamed from: q, reason: collision with root package name */
    public final int f515765q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f515765q = i65.a.b(activity, 260);
    }

    @Override // x92.l
    public void W6(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159;
        super.W6(z17);
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564067h0);
        java.lang.Object layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
            layoutParams2.setMarginStart(0);
            layoutParams2.leftMargin = 0;
            findViewById.setLayoutParams(layoutParams2);
        }
        if (!a2() || (c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.cje)) == null) {
            return;
        }
        float dimension = m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        c22645x24069159.c(dimension, dimension, 0.0f, 0.0f);
        c22645x24069159.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        int dimensionPixelSize = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay) + com.p314xaae8f345.mm.ui.bl.h(m158354x19263085());
        android.view.ViewGroup.LayoutParams layoutParams3 = c22645x24069159.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3)).topMargin = (this.f515765q - dimensionPixelSize) - ((int) dimension);
        android.view.ViewGroup viewGroup = this.f534238i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // x92.l
    public int X6(int i17) {
        return this.f515765q;
    }
}
