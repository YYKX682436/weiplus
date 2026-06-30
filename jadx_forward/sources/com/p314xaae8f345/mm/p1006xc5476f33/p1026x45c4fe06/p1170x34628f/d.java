package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f168040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e f168041e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e eVar, int i17) {
        this.f168041e = eVar;
        this.f168040d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e eVar = this.f168041e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l F = eVar.f168083d.F();
        int i17 = this.f168040d;
        if (F != null && ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) eVar.f168083d.F()).mo51310xc2a54588() != null) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) eVar.f168083d.F()).mo51310xc2a54588().setBackgroundColor(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd bdVar = eVar.f168083d.f167912q;
        if (bdVar != null) {
            bdVar.setBackgroundColor(i17);
        }
    }
}
