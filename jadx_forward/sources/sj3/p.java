package sj3;

/* loaded from: classes14.dex */
public class p extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 f490208f;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812, android.view.View view, int i17) {
        this.f490208f = c16584x79838812;
        this.f490206d = view;
        this.f490207e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        this.f490208f.f231859y = f17 == 1.0f;
        android.view.View view = this.f490206d;
        if (view.getLayoutParams().height == sj3.i1.f490099k || f17 == 1.0f) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i17 = sj3.i1.f490103o;
        int i18 = this.f490207e;
        layoutParams.height = i17 - ((int) (i18 * f17));
        view.getLayoutParams().width = i17 - ((int) (i18 * f17));
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        int i19 = sj3.i1.f490096h;
        int i27 = sj3.i1.f490095g;
        layoutParams2.bottomMargin = i19 - ((int) ((i19 - i27) * f17));
        ((android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (i27 * f17);
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
