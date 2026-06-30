package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class o9 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21393xf9902968 f290997a;

    public o9(com.p314xaae8f345.mm.ui.C21393xf9902968 c21393xf9902968) {
        this.f290997a = c21393xf9902968;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.mm.ui.C21393xf9902968 c21393xf9902968 = this.f290997a;
        c21393xf9902968.f278404e.setVisibility(8);
        if (c21393xf9902968.f278415s) {
            return;
        }
        c21393xf9902968.f278404e.setVisibility(8);
        c21393xf9902968.setVisibility(8);
        c21393xf9902968.m78470xc68cad45(false);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj6);
        if (!fj6 || (c22789xd23e9a9b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) c21393xf9902968.f278417u).f212737i) == null) {
            return;
        }
        c22789xd23e9a9b.n();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
