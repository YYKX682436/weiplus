package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class kx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx f200398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f200400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f200401g;

    public kx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar, int i17, int i18, int i19) {
        this.f200398d = rxVar;
        this.f200399e = i17;
        this.f200400f = i18;
        this.f200401g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f200398d.N;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeRv");
            throw null;
        }
        int i17 = this.f200399e - (this.f200400f - this.f200401g);
        if (i17 < 0) {
            i17 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$onCardSelected$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$onCardSelected$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
