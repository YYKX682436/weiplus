package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f231132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f231133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231134f;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, java.lang.Integer num, boolean z17) {
        this.f231134f = i4Var;
        this.f231132d = num;
        this.f231133e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231134f;
        int i17 = i4Var.f231170n;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.Integer num = this.f231132d;
        if (num.intValue() < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: no subscribers, return,  status: %d", java.lang.Integer.valueOf(i4Var.f231170n));
            return;
        }
        int i18 = this.f231133e ? 640 : 480;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.bi6 bi6Var = new r45.bi6();
        bi6Var.f452320d = num.intValue();
        bi6Var.f452321e = i18;
        int A = i4Var.A(num.intValue());
        if (A == 102 || A == 101) {
            linkedList2.add(bi6Var);
        } else {
            linkedList.add(bi6Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeOneByUserMid, videoMembers memberId:%d", num);
        r45.ai6 ai6Var = i4Var.S1;
        ai6Var.f451560d = linkedList;
        if (A == 102 || A == 101) {
            bi6Var.f452321e = 240;
        }
        ai6Var.f451561e = linkedList2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: subscribeOneByUserMid, videoMembers %s", ai6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.d(i4Var.S1);
    }
}
