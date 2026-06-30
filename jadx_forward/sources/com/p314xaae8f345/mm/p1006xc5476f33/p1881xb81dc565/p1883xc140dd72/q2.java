package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes8.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y70 f231281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r2 f231282f;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r2 r2Var, int i17, r45.y70 y70Var) {
        this.f231282f = r2Var;
        this.f231280d = i17;
        this.f231281e = y70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f231280d;
        boolean z17 = i17 == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r2 r2Var = this.f231282f;
        r45.y70 y70Var = this.f231281e;
        if (y70Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "roomInfo is NULL, errcode:%d", java.lang.Integer.valueOf(i17));
            r2Var.f231290a.f231313e.Y.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "add member error.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "addmember errcode:%d, roomid:%d, selfmemberid:%d, selfname:%s, groupid:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(y70Var.f472366d), java.lang.Integer.valueOf(y70Var.f472368f), r2Var.f231290a.f231313e.f231189y0, y70Var.f472367e);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = y70Var.f472369g;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            r45.x70 x70Var = (r45.x70) it.next();
            r45.y07 y07Var = new r45.y07();
            y07Var.f472222d = x70Var.f471370e;
            y07Var.f472223e = x70Var.f471369d;
            y07Var.f472224f = x70Var.f471372g;
            linkedList.add(y07Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s2 s2Var = r2Var.f231290a;
        java.util.LinkedList k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.k(s2Var.f231313e, linkedList, 4);
        if (k17.size() == linkedList2.size()) {
            s2Var.f231313e.Y.f(k17);
            return;
        }
        if (!k17.isEmpty()) {
            s2Var.f231313e.Y.f(k17);
        }
        s2Var.f231313e.Y.getClass();
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "add member ok.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "add member error.");
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "add fail %d", java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "danialguo add success, roomid:%d selfmemberid:%d ", java.lang.Long.valueOf(y70Var.f472366d), java.lang.Integer.valueOf(y70Var.f472368f));
        }
    }
}
