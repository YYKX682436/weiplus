package si1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f489765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489766e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str) {
        this.f489765d = c11510xdd90c2f2;
        this.f489766e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = this.f489765d.x0();
        if (x07 == null || (m52169xfdaa7672 = x07.m52169xfdaa7672()) == null || (mo14682x9dee9c37 = m52169xfdaa7672.mo14682x9dee9c37()) == null) {
            return;
        }
        ul1.e P1 = mo14682x9dee9c37.P1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = P1.f510103a;
        if (v5Var.mo50262x39e05d35()) {
            ul1.g c17 = P1.c();
            al1.b r17 = P1.f510103a.r1();
            if (r17 != null) {
                P1.d(r17.getTop() + r17.getMeasuredHeight());
            }
            if (P1.f510105c == null) {
                ul1.d dVar = new ul1.d(v5Var.getF229340d());
                P1.f510105c = dVar;
                c17.addView(dVar, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
            }
            ul1.d dVar2 = (ul1.d) P1.f510105c;
            dVar2.f510098d.setText(this.f489766e);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = dVar2.f510100f;
            java.lang.Runnable runnable = dVar2.f510099e;
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50297x7c4d7ca2(runnable, ul1.n.f510121m1);
            if (dVar2.getAlpha() == 1.0f || dVar2.f510101g != null) {
                return;
            }
            dVar2.setVisibility(0);
            dVar2.animate().cancel();
            android.view.ViewPropertyAnimator animate = dVar2.animate();
            dVar2.f510101g = animate;
            animate.alpha(1.0f).setListener(new ul1.b(dVar2)).start();
            dVar2.setVisibility(0);
        }
    }
}
