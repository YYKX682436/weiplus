package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes11.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f263265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c f263266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263268g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263269h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f263270i;

    public z0(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c c25288xea0efc4c, java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f263265d = weakReference;
        this.f263266e = c25288xea0efc4c;
        this.f263267f = str;
        this.f263268g = str2;
        this.f263269h = i17;
        this.f263270i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25265xa0a01953 c25265xa0a01953;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5 c19209x126ef0a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5) this.f263265d.get();
        if (c19209x126ef0a5 == null || (c25265xa0a01953 = c19209x126ef0a5.f262948f) == null) {
            return;
        }
        java.lang.Long m93458xebddad52 = this.f263266e.m93458xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad52);
        long longValue = m93458xebddad52.longValue();
        java.lang.String str = this.f263267f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f263268g;
        if (str2 == null) {
            str2 = "";
        }
        c25265xa0a01953.m93431xaf8aa769(longValue, str, str2, this.f263269h, this.f263270i, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.y0.f263261d);
    }
}
