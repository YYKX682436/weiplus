package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b f231222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f231223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231224f;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b bVar, boolean z17) {
        this.f231224f = i4Var;
        this.f231222d = bVar;
        this.f231223e = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231224f;
        int i17 = i4Var.f231170n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b bVar = this.f231222d;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "hy: not in room!");
            if (bVar != null) {
                bVar.a(-10086, com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a, "not in room", "");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s sVar = i4Var.f231158g;
        boolean z17 = this.f231223e;
        if (sVar.f231293b != null) {
            sVar.f231293b.n(z17);
            objArr = true;
        } else {
            objArr = false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = z17 ? "mute" : "unMute";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: setMuteRecord call switchAV %s", objArr2);
        boolean z18 = !z17;
        i4Var.T1 = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120013xfec52689(z18 ? 1 : 0, i4Var.f231175p0 ? 1 : 0, i4Var.f231186x0);
        if (bVar != null) {
            if (objArr == true) {
                bVar.a(0, 0, "ok", "");
            } else {
                bVar.a(-10086, -15, "set mute failed", "");
            }
        }
    }
}
