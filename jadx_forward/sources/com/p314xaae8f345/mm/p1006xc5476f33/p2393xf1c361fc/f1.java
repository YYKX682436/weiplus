package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes11.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f263034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c f263035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263037g;

    public f1(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c c25288xea0efc4c, int i17, int i18) {
        this.f263034d = weakReference;
        this.f263035e = c25288xea0efc4c;
        this.f263036f = i17;
        this.f263037g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25265xa0a01953 c25265xa0a01953;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5 c19209x126ef0a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5) this.f263034d.get();
        if (c19209x126ef0a5 == null || (c25265xa0a01953 = c19209x126ef0a5.f262948f) == null) {
            return;
        }
        java.lang.Long m93458xebddad52 = this.f263035e.m93458xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad52);
        c25265xa0a01953.m93434xfd1c900(m93458xebddad52.longValue(), this.f263036f, this.f263037g, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.e1.f263030d);
    }
}
