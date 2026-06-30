package jm3;

/* loaded from: classes8.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 f381886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f381887e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf62, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f381886d = activityC16654xdc9bdf62;
        this.f381887e = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf62 = this.f381886d;
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent(activityC16654xdc9bdf62, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.class);
            intent.putExtra("KEY_MUSIC_ROUTER", 2);
            activityC16654xdc9bdf62.f232420i = true;
            activityC16654xdc9bdf62.startActivityForResult(intent, 1000);
            return;
        }
        if (itemId != 2) {
            this.f381887e.u();
            return;
        }
        activityC16654xdc9bdf62.f232420i = true;
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf622 = this.f381886d;
        ((ub0.r) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(activityC16654xdc9bdf622, 1001, 1, 27, 1, false, null);
    }
}
