package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 f231090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c f231091e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var) {
        this.f231091e = cVar;
        this.f231090d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = this.f231091e;
        if (cVar.f231047a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onInviteOrAcceptTimeout");
            com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a a17 = cVar.a(this.f231090d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = cVar.f231047a;
            v0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.e(2, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.e(a17));
            v0Var.j(a17, sj3.e4.Inviting, false, true, true, false);
        }
    }
}
