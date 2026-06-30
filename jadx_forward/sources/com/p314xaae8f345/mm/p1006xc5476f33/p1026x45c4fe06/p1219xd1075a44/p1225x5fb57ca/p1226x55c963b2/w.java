package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd f172892d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd c12778x1b9c8edd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.t tVar) {
        this.f172892d = c12778x1b9c8edd;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar = this.f172892d.f172825d;
        if (vVar != null) {
            vVar.f172890d = true;
            vVar.requestLayout();
        }
    }
}
