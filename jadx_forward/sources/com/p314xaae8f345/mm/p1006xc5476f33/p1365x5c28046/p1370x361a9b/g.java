package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k f179157d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar) {
        this.f179157d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = this.f179157d;
        java.util.Set set = kVar.f179171i;
        if (set == null || ((java.util.HashSet) set).size() <= 0) {
            return;
        }
        java.util.Iterator it = ((java.util.HashSet) kVar.f179171i).iterator();
        while (it.hasNext()) {
            ((pr.a) it.next()).a();
        }
    }
}
