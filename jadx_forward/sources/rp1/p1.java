package rp1;

/* loaded from: classes14.dex */
public class p1 extends mp1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 f480045a;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700) {
        this.f480045a = c12931xa4a39700;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = this.f480045a;
        if (c12931xa4a39700.f175112g.mo1894x7e414b06() != 0 || (c12919x6cd8224f = c12931xa4a39700.f175114i) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBackgroundView", "animateHideBackgroundView");
        if (c12919x6cd8224f.f174974f) {
            return;
        }
        c12919x6cd8224f.f174974f = true;
        android.view.ViewPropertyAnimator animate = c12919x6cd8224f.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(200L)) == null) {
            return;
        }
        duration.withEndAction(new rp1.a0(c12919x6cd8224f));
    }
}
