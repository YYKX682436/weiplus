package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class mc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18649xdc4d549 f255636d;

    public mc(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18649xdc4d549 c18649xdc4d549) {
        this.f255636d = c18649xdc4d549;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18649xdc4d549 c18649xdc4d549 = this.f255636d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c18649xdc4d549.f255166e;
        if (c22849x81a93d25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
            throw null;
        }
        int computeVerticalScrollRange = c22849x81a93d25.computeVerticalScrollRange();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = c18649xdc4d549.f255166e;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvSelfHistory");
            throw null;
        }
        int computeVerticalScrollExtent = c22849x81a93d252.computeVerticalScrollExtent();
        if (computeVerticalScrollRange <= computeVerticalScrollExtent) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusHistoryUI", "[checkFeedsTail]contentHeight:" + computeVerticalScrollRange + " visibleHeight:" + computeVerticalScrollExtent);
            bk4.d dVar = c18649xdc4d549.f255168g;
            if (dVar != null) {
                dVar.b();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataLoader");
                throw null;
            }
        }
    }
}
