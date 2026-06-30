package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f231261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231263f;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, java.util.ArrayList arrayList, java.lang.String str) {
        this.f231263f = i4Var;
        this.f231261d = arrayList;
        this.f231262e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231263f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i4Var.f231170n);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(i4Var.S);
        java.util.ArrayList arrayList = this.f231261d;
        java.lang.String str = this.f231262e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "enter inviteSync. %s, %s, %d, %b", arrayList, str, valueOf, valueOf2);
        int i17 = i4Var.f231170n;
        if (i17 == 1 || i4Var.S || i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Multitalk.ILinkService", "hy: already in room or callee ack!");
            i4Var.Z = null;
            i4Var.V = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.d4.ILinkErrEnterRepeated;
            i4Var.T();
            return;
        }
        i4Var.f231174p = new java.lang.String("wechat");
        i4Var.f231172o = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c4.ReasonUnknown;
        i4Var.f231175p0 = false;
        i4Var.X = false;
        i4Var.D1 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e4.ILinkMemberRoleCreate;
        i4Var.S = true;
        i4Var.B1 = i4Var.f231189y0;
        i4Var.f231161h2 = java.lang.System.currentTimeMillis();
        i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e2(i4Var, str, arrayList));
    }
}
