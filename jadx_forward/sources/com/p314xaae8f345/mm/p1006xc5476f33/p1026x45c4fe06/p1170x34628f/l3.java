package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168383g;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, java.lang.String str, java.lang.String str2) {
        this.f168383g = i3Var;
        this.f168380d = w2Var;
        this.f168381e = str;
        this.f168382f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int indexOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.f168383g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168380d;
        synchronized (i3Var.f168242o) {
            indexOf = i3Var.f168243p.indexOf(w2Var);
        }
        if (indexOf < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageContainer", "navigateBack with appId(%s) Page(%s), but already off stack, maybe frequent clicks were performed", i3Var.m52168x74292566(), w2Var.mo14683xad58292c());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.f(this.f168383g, indexOf + 1, this.f168381e, null, null, this.f168382f);
        }
    }
}
