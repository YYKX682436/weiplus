package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class u9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm3 f229025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa f229026f;

    public u9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, r45.vm3 vm3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar) {
        this.f229024d = activityC16371xf216ae6d;
        this.f229025e = vm3Var;
        this.f229026f = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f229024d;
        if (!(activityC16371xf216ae6d != null && activityC16371xf216ae6d.isFinishing())) {
            if (!(activityC16371xf216ae6d != null && activityC16371xf216ae6d.isDestroyed())) {
                r45.vm3 vm3Var = this.f229025e;
                if (vm3Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doGetExtraInfoCgi] response == null");
                    return;
                }
                r45.nm5 nm5Var = vm3Var.f469891d;
                if (nm5Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar = this.f229026f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d2 = this.f229024d;
                    nm5Var.G = vm3Var.f469892e;
                    r45.f34 f34Var = nm5Var.E;
                    if (f34Var != null) {
                        faVar.P6(f34Var.f455516d, f34Var.f455517e, f34Var.f455518f, nm5Var.f463048x, nm5Var.f463041q, activityC16371xf216ae6d2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doGetExtraInfoCgi] is finishing or destory");
    }
}
