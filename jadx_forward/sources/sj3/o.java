package sj3;

/* loaded from: classes14.dex */
public class o extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 f490194f;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812, android.view.View view, int i17) {
        this.f490194f = c16584x79838812;
        this.f490192d = view;
        this.f490193e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17;
        this.f490194f.f231859y = f17 == 1.0f;
        android.view.View view = this.f490192d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i18 = this.f490193e;
        layoutParams.height = f17 == 1.0f ? -2 : sj3.i1.f490099k + ((int) (i18 * f17));
        view.getLayoutParams().width = f17 != 1.0f ? sj3.i1.f490099k + ((int) (i18 * f17)) : -2;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        if (f17 == 1.0f) {
            i17 = sj3.i1.f490096h;
        } else {
            i17 = sj3.i1.f490095g + ((int) ((sj3.i1.f490096h - r0) * f17));
        }
        layoutParams2.bottomMargin = i17;
        ((android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (sj3.i1.f490095g * (1.0f - f17));
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
