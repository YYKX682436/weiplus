package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes11.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f263021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c f263022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263025h;

    public d1(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c c25288xea0efc4c, java.lang.String str, int i17, int i18) {
        this.f263021d = weakReference;
        this.f263022e = c25288xea0efc4c;
        this.f263023f = str;
        this.f263024g = i17;
        this.f263025h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25265xa0a01953 c25265xa0a01953;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5 c19209x126ef0a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5) this.f263021d.get();
        if (c19209x126ef0a5 == null || (c25265xa0a01953 = c19209x126ef0a5.f262948f) == null) {
            return;
        }
        java.lang.Long m93458xebddad52 = this.f263022e.m93458xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad52);
        long longValue = m93458xebddad52.longValue();
        java.lang.String str = this.f263023f;
        if (str == null) {
            str = "";
        }
        c25265xa0a01953.m93433xc422afe5(longValue, str, this.f263024g, this.f263025h, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.c1.f263005d);
    }
}
