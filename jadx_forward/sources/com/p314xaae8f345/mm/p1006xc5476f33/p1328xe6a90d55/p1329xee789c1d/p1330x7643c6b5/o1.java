package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz.j f177532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f177533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f177535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177536h;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var, dz.j jVar, int i17, java.lang.String str, java.util.Map map) {
        this.f177536h = p0Var;
        this.f177532d = jVar;
        this.f177533e = i17;
        this.f177534f = str;
        this.f177535g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar = this.f177536h.F;
        if (bVar == null) {
            return;
        }
        bVar.a(this.f177532d.f326287d, this.f177533e, this.f177534f, this.f177535g);
    }
}
