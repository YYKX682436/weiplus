package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class oe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 f168509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168510e;

    public oe(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var, java.lang.String str) {
        this.f168509d = u0Var;
        this.f168510e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var = this.f168509d;
        if (u0Var != null) {
            u0Var.f167529d.k("share_to_user", this.f168510e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaMenuHelper", "safeSetString, menuInfo is null, key: share_to_user");
        }
    }
}
