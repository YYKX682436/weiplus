package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f196870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f196871e;

    public zf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, int i17) {
        this.f196870d = mgVar;
        this.f196871e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C1 = this.f196870d.C1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f196871e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(C1, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$onTextClick$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        C1.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(C1, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$onTextClick$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
