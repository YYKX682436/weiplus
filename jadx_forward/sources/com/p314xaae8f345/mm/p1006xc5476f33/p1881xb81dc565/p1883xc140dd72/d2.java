package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231078f;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, java.lang.String str, java.lang.String str2) {
        this.f231078f = i4Var;
        this.f231076d = str;
        this.f231077e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231078f;
        java.lang.String str = this.f231076d;
        i4Var.f231176p1 = str;
        java.lang.String str2 = this.f231077e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "enter joinSync. %s,%s, %d, %b", str2, str, java.lang.Integer.valueOf(i4Var.f231170n), java.lang.Boolean.valueOf(i4Var.S));
        synchronized (i4Var.X1) {
            if (i4Var.f231170n != 1 && !i4Var.S) {
                i4Var.S = true;
                i4Var.f231164j2 = java.lang.System.currentTimeMillis();
                i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i3(i4Var, str2, str));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "hy: already in room!");
            i4Var.V = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.d4.ILinkErrEnterRepeated;
            i4Var.T();
        }
    }
}
