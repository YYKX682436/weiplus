package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes11.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f263069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c f263070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263071f;

    public h1(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c c25288xea0efc4c, java.lang.String str) {
        this.f263069d = weakReference;
        this.f263070e = c25288xea0efc4c;
        this.f263071f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25265xa0a01953 c25265xa0a01953;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5 c19209x126ef0a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5) this.f263069d.get();
        if (c19209x126ef0a5 == null || (c25265xa0a01953 = c19209x126ef0a5.f262948f) == null) {
            return;
        }
        java.lang.Long m93458xebddad52 = this.f263070e.m93458xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad52);
        long longValue = m93458xebddad52.longValue();
        java.lang.String str = this.f263071f;
        if (str == null) {
            str = "";
        }
        c25265xa0a01953.m93435x58d5b73c(longValue, str, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.g1.f263049d);
    }
}
