package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f179158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k f179159e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar, int i17) {
        this.f179159e = kVar;
        this.f179158d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = this.f179159e;
        java.util.Set set = kVar.f179171i;
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.Iterator it = kVar.f179171i.iterator();
        while (it.hasNext()) {
            ((pr.a) it.next()).b(this.f179158d);
        }
    }
}
