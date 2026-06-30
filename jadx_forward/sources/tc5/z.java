package tc5;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 f499114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 f499115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3, com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94) {
        super(1);
        this.f499114d = activityC21814x1938a8b3;
        this.f499115e = c22478xb6499b94;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = this.f499114d;
        if (booleanValue) {
            activityC21814x1938a8b3.U = true;
            ed5.t tVar = activityC21814x1938a8b3.I;
            if (tVar != null) {
                tVar.f332919f = false;
            }
            activityC21814x1938a8b3.m7().D0();
            java.util.List t07 = kz5.n0.t0(activityC21814x1938a8b3.f283237v, activityC21814x1938a8b3.f283238w);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b32 = this.f499114d;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = ((java.util.ArrayList) t07).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                hashMap.put(next, 8);
            }
            com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b.g7(activityC21814x1938a8b32, hashMap, false, null, 6, null);
            activityC21814x1938a8b3.v7(true);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21819x24b6e7b5 p76 = activityC21814x1938a8b3.p7();
            if (p76 != null) {
                p76.animate().cancel();
                p76.animate().setStartDelay(150L).setDuration(150L).withStartAction(new vc5.v(p76)).alpha(1.0f).withEndAction(new vc5.w(p76)).start();
            }
            activityC21814x1938a8b3.x7(true);
            activityC21814x1938a8b3.m7().m7965x440a0e9(0);
        } else {
            activityC21814x1938a8b3.U = false;
            ed5.t tVar2 = activityC21814x1938a8b3.I;
            if (tVar2 != null) {
                tVar2.f332919f = true;
            }
            activityC21814x1938a8b3.m7().D0();
            activityC21814x1938a8b3.w7(this.f499115e.getWasLastGestureQuickTap());
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21819x24b6e7b5 p77 = activityC21814x1938a8b3.p7();
            if (p77 != null) {
                p77.animate().cancel();
                p77.animate().setStartDelay(0L).setDuration(150L).alpha(0.0f).withEndAction(new vc5.u(p77)).start();
            }
            activityC21814x1938a8b3.x7(false);
            activityC21814x1938a8b3.m7().postOnAnimation(new tc5.y(activityC21814x1938a8b3));
            activityC21814x1938a8b3.m7().m7965x440a0e9(90);
        }
        return jz5.f0.f384359a;
    }
}
