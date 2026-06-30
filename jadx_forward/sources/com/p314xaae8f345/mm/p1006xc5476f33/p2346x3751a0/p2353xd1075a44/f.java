package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e f258684d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e eVar) {
        this.f258684d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e eVar = this.f258684d;
        if (eVar.f258672q || !eVar.f258679x) {
            return;
        }
        eVar.f258672q = true;
        eVar.f258679x = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = eVar.f258666h;
        c18930xb402610a.setVisibility(0);
        c18930xb402610a.a(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a2 = eVar.f258667i;
        c18930xb402610a2.a(false);
        c18930xb402610a2.animate().alpha(0.0f).setDuration(500L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.j(eVar)).start();
    }
}
