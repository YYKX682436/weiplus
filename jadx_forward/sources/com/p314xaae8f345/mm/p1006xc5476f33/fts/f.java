package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.v f218937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.g f218938e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.fts.g gVar, p13.v vVar) {
        this.f218938e = gVar;
        this.f218937d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o13.x xVar = (o13.x) this.f218938e.f218941o.get();
        if (xVar != null) {
            xVar.X2(this.f218937d);
        }
    }
}
