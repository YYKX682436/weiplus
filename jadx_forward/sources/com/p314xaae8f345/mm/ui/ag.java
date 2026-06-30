package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class ag implements db5.x8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f278667a;

    public ag(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f278667a = c21427xe5bb8a3;
    }

    @Override // db5.x8
    public void a() {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f278667a;
        if (c21427xe5bb8a3.f278566t == null) {
            c21427xe5bb8a3.f278566t = android.view.animation.AnimationUtils.loadAnimation(c21427xe5bb8a3.f278547a, com.p314xaae8f345.mm.ui.uc.f292611a);
            c21427xe5bb8a3.f278566t.setAnimationListener(new com.p314xaae8f345.mm.ui.yf(this));
        }
        if (c21427xe5bb8a3.f278556j) {
            c21427xe5bb8a3.f278549c.m81107xd394853f(new com.p314xaae8f345.mm.ui.zf(this));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(c21427xe5bb8a3.f278559m);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(c21427xe5bb8a3.f278559m, 1500L);
            c21427xe5bb8a3.f278556j = false;
        } else {
            com.p314xaae8f345.mm.ui.C21427xe5bb8a3.b(c21427xe5bb8a3);
            com.p314xaae8f345.mm.ui.C21427xe5bb8a3.c(c21427xe5bb8a3);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba c21527x310c6aba = c21427xe5bb8a3.f278552f;
        if (c21527x310c6aba != null) {
            c21527x310c6aba.f279219d = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem CHATTING ONLAYOUT ");
    }
}
