package ww1;

/* loaded from: classes15.dex */
public class v2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.b0 f531849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f531850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.x2 f531851c;

    public v2(ww1.x2 x2Var, ww1.b0 b0Var, int i17) {
        this.f531851c = x2Var;
        this.f531849a = b0Var;
        this.f531850b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ww1.x2 x2Var = this.f531851c;
        x2Var.f531879e.f531655a0.setVisibility(8);
        ww1.b0 b0Var = this.f531849a;
        java.lang.String str = b0Var.f531729e;
        int i17 = 0;
        while (true) {
            if (i17 >= ((java.util.LinkedList) x2Var.f531878d.f531646w).size()) {
                break;
            }
            if (((ww1.b0) ((java.util.LinkedList) x2Var.f531878d.f531646w).get(i17)).f531729e.equals(b0Var.f531729e)) {
                ((ww1.b0) ((java.util.LinkedList) x2Var.f531878d.f531646w).get(i17)).f531650s = true;
                java.lang.String str2 = b0Var.f531729e;
                break;
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = x2Var.f531881g;
        int i18 = this.f531850b;
        activityC13149x63b02cb3.y7(i18);
        x2Var.f531875a = false;
        x2Var.a(i18);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
