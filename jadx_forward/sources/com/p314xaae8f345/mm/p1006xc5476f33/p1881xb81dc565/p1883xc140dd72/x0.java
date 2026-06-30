package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d80 f231387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y0 f231388e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y0 y0Var, r45.d80 d80Var) {
        this.f231388e = y0Var;
        this.f231387d = d80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "recv invite busy callback!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y0 y0Var = this.f231388e;
        r45.d80 d80Var = this.f231387d;
        if (d80Var != null) {
            java.util.Map map = y0Var.f231393a.f231167l2;
            if (map != null && ((java.util.concurrent.ConcurrentHashMap) map).size() > 0) {
                ((java.util.concurrent.ConcurrentHashMap) y0Var.f231393a.f231167l2).clear();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "recv invite busy, imroomid:%d roomid:%d selfmemberid:%d", java.lang.Long.valueOf(d80Var.f453749d), java.lang.Long.valueOf(d80Var.f453750e), java.lang.Integer.valueOf(d80Var.f453752g));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = y0Var.f231393a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
        i4Var.u();
    }
}
