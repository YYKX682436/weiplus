package sm3;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 f491447d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0) {
        this.f491447d = c16708x2eab1ea0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = this.f491447d;
        c16708x2eab1ea0.f233544d.D0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksEditView", "stopDragging: " + c16708x2eab1ea0.getDraggingIndex());
        sm3.o oVar = c16708x2eab1ea0.f233547g;
        oVar.m8151xc67946d3(0, oVar.mo1894x7e414b06());
    }
}
