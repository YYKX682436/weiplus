package rp1;

/* loaded from: classes14.dex */
public class k1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f479982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f479983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f479984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f479985g;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, android.graphics.Point point, android.graphics.Point point2) {
        this.f479985g = c12929x567537a0;
        this.f479982d = c12886x91aa2b6d;
        this.f479983e = point;
        this.f479984f = point2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f479982d;
        int i17 = c12886x91aa2b6d.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f479985g;
        if (i17 == 512) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0.d(c12929x567537a0, 1024);
            android.graphics.Point point = c12929x567537a0.P1;
            point.x = 0;
            point.y = 0;
            c12929x567537a0.O1 = c12929x567537a0.L1.P.f420325b;
            c12886x91aa2b6d.f174584i = new android.graphics.Point(c12929x567537a0.O1);
        } else if (i17 == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0.d(c12929x567537a0, 16);
            android.graphics.Point point2 = c12929x567537a0.P1;
            android.graphics.Point point3 = this.f479983e;
            int i18 = point3.x;
            android.graphics.Point point4 = this.f479984f;
            point2.x = java.lang.Math.max(0, i18 - point4.x);
            point2.y = java.lang.Math.max(0, point3.y - point4.y);
            c12929x567537a0.O1 = c12929x567537a0.L1.P.f420325b;
            c12886x91aa2b6d.f174584i = new android.graphics.Point(c12929x567537a0.O1);
        }
        android.graphics.Point point5 = c12929x567537a0.O1;
    }
}
