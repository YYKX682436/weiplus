package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes8.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f233056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233057e;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68, int i17) {
        this.f233056d = c16668xffb9dd68;
        this.f233057e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f233056d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "post smooth scroll");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c16668xffb9dd68.f232509f;
        if (c22849x81a93d25 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(this.f233057e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$scrollMvToPosition$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$scrollMvToPosition$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
