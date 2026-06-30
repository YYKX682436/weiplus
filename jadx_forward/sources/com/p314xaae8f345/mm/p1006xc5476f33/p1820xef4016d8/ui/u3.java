package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f229016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm3 f229017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4 f229018f;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d, r45.vm3 vm3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4 d4Var) {
        this.f229016d = activityC16363x8a0a619d;
        this.f229017e = vm3Var;
        this.f229018f = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f229016d;
        if (!(activityC16363x8a0a619d != null && activityC16363x8a0a619d.isFinishing())) {
            if (!(activityC16363x8a0a619d != null && activityC16363x8a0a619d.isDestroyed())) {
                r45.vm3 vm3Var = this.f229017e;
                if (vm3Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doGetExtraInfoCgi] response == null");
                    return;
                }
                r45.nm5 nm5Var = vm3Var.f469891d;
                if (nm5Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4 d4Var = this.f229018f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d2 = this.f229016d;
                    nm5Var.G = vm3Var.f469892e;
                    r45.f34 f34Var = nm5Var.E;
                    if (f34Var != null) {
                        d4Var.P6(f34Var.f455516d, f34Var.f455517e, f34Var.f455518f, nm5Var.f463048x, nm5Var.f463041q, activityC16363x8a0a619d2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doGetExtraInfoCgi] is finishing or destory");
    }
}
