package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c2 f231044d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c2 c2Var, int i17) {
        this.f231044d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c2 c2Var = this.f231044d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = c2Var.f231064a;
        boolean z17 = i4Var.f231165k2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = c2Var.f231064a;
        if (z17) {
            i4Var.Y();
        } else {
            i4Var.f231168m.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.h4(i4Var.f231177p2), 1000L);
            i4Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "It should launch timer about uninit engine! isUninitEngineWhenCallEnd %b, mIsNotSendBanner %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(i4Var2.f231165k2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = i4Var2.Y;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onCallEndMultiTalk");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j(cVar));
        if (i4Var2.f231170n != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Multitalk.ILinkService", "hy: current not in room");
            i4Var2.getClass();
            i4Var2.f231170n = 0;
            i4Var2.S = false;
            return;
        }
        i4Var2.getClass();
        i4Var2.f231192z1 = false;
        i4Var2.A1 = false;
        i4Var2.f231170n = 0;
        i4Var2.S = false;
    }
}
