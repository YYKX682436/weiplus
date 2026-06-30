package in4;

/* loaded from: classes8.dex */
public class w extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f374529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 f374530e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 c18765xae0673c5, int i17) {
        this.f374530e = c18765xae0673c5;
        this.f374529d = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 c18765xae0673c5 = this.f374530e;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c18765xae0673c5.f256789d.getLayoutParams();
        layoutParams.bottomMargin = (int) (this.f374529d * f17);
        c18765xae0673c5.f256789d.setLayoutParams(layoutParams);
    }
}
