package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public class h implements android.widget.Filter.FilterListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k f172867d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k kVar) {
        this.f172867d = kVar;
    }

    @Override // android.widget.Filter.FilterListener
    public void onFilterComplete(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k kVar = this.f172867d;
        if (i17 <= 0) {
            kVar.f172871b.a();
        } else if (kVar.f172871b.b()) {
            kVar.f172871b.c();
        }
    }
}
