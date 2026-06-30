package lc5;

/* loaded from: classes8.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: x, reason: collision with root package name */
    public static final lc5.n f399556x = new lc5.n(null);

    /* renamed from: v, reason: collision with root package name */
    public long f399557v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Boolean f399558w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(dp1.x pageAdapter) {
        super(pageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        this.f399557v = -1L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        this.f174779u = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent");
        dp1.x xVar = this.f174772n;
        if (xVar != null) {
            xVar.q(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean g0(java.lang.Runnable runnable) {
        boolean g07 = super.g0(runnable);
        if (g07) {
            dp1.x xVar = this.f174772n;
            if (xVar instanceof lc5.u) {
                lc5.u uVar = xVar instanceof lc5.u ? (lc5.u) xVar : null;
                android.view.View view = uVar != null ? uVar.f399570o : null;
                lc5.u uVar2 = xVar instanceof lc5.u ? (lc5.u) xVar : null;
                t0(view, uVar2 != null ? uVar2.f399571p : null);
            }
        }
        return g07;
    }

    public final void t0(android.view.View view, android.view.View view2) {
        android.view.ViewPropertyAnimator animate;
        if (view2 == null || (animate = view2.animate()) == null) {
            return;
        }
        animate.alpha(0.0f);
        animate.setDuration(300L);
        animate.withEndAction(new lc5.o(view2));
        animate.start();
    }

    public final void u0(int i17, long j17, long j18, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        sb6.append(j18);
        super.b(i17, sb6.toString());
        boolean z17 = true;
        Q(1);
        lc5.t tVar = lc5.t.f399565d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo = this.f174665d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ballInfo, "ballInfo");
        java.lang.String str2 = str == null ? "" : str;
        if (str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageFloatBallMgr", "addImageFloatBall talker is empty");
        }
        if (!lc5.t.f399567f) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().H(tVar);
            lc5.t.f399567f = true;
        }
        java.util.LinkedList<lc5.s> linkedList = lc5.t.f399566e;
        if (!(linkedList instanceof java.util.Collection) || !linkedList.isEmpty()) {
            for (lc5.s sVar : linkedList) {
                if (sVar.f399562a == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f399564c, str2)) {
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageFloatBallMgr", "addImageFloatBall exists");
        } else {
            linkedList.add(new lc5.s(j17, ballInfo, str2));
        }
        android.os.Bundle bundle = this.f174665d.G;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageFloatBallHelper", "onCreate, ballInfo.extra is null");
            return;
        }
        bundle.putLong("img_gallery_msg_id", j17);
        this.f174665d.G.putLong("img_gallery_msg_svr_id", j18);
        this.f174665d.G.putString("img_gallery_talker", str);
        this.f174665d.G.putString("img_gallery_chatroom_name", str);
    }
}
