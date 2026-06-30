package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p70 f231389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y1 f231391f;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y1 y1Var, r45.p70 p70Var, int i17) {
        this.f231391f = y1Var;
        this.f231389d = p70Var;
        this.f231390e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.p70 p70Var = this.f231389d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "update avmembers, imroomid:%d roomid:%d memberList:%s", java.lang.Long.valueOf(p70Var.f464343d), java.lang.Long.valueOf(p70Var.f464344e), p70Var.f464345f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y1 y1Var = this.f231391f;
        if (y1Var.f231394a.f231170n != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: not in room. do not notify");
            return;
        }
        if (this.f231390e != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "hy: invalid avmember list change. will ignore");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = p70Var.f464345f.iterator();
        while (it.hasNext()) {
            r45.o70 o70Var = (r45.o70) it.next();
            if ((o70Var.f463534e & 2) != 0) {
                arrayList.add(java.lang.Integer.valueOf(o70Var.f463533d));
            }
            int i17 = o70Var.f463534e;
            if ((i17 & 4) != 0 || (i17 & 8) != 0) {
                arrayList2.add(java.lang.Integer.valueOf(o70Var.f463533d));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "avmemberchange, mid:%d, avstatus:%d", java.lang.Integer.valueOf(o70Var.f463533d), java.lang.Integer.valueOf(o70Var.f463534e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = y1Var.f231394a;
        if (!i4Var.R1) {
            i4Var.Y.e(i4Var.f231156f, p70Var.f464345f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = y1Var.f231394a;
        java.util.LinkedList linkedList = p70Var.f464345f;
        i4Var2.P1 = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "update avmembers, cachedMemberList:%s", linkedList);
    }
}
