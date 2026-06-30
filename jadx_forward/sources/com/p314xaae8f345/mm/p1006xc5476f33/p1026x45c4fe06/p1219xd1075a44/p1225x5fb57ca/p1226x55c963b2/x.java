package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public class x extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd f172893a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd c12778x1b9c8edd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.t tVar) {
        this.f172893a = c12778x1b9c8edd;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd c12778x1b9c8edd = this.f172893a;
        if (c12778x1b9c8edd.b()) {
            c12778x1b9c8edd.c();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f172893a.a();
    }
}
