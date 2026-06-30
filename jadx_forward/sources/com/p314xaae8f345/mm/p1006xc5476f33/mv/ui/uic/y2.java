package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes8.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f233081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233082e;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68, int i17) {
        this.f233081d = c16668xffb9dd68;
        this.f233082e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f233081d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "post stopScroll");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c16668xffb9dd68.f232509f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.f1();
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = c16668xffb9dd68.f232509f;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x2(c16668xffb9dd68, this.f233082e));
        }
    }
}
