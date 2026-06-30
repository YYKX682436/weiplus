package sa1;

/* loaded from: classes7.dex */
public final class e extends sa1.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ae.a logicImpl) {
        super(logicImpl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logicImpl, "logicImpl");
    }

    @Override // yg.b0
    public void a0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalParentScreenCanvasViewDelegate", "hy: inserting magicbrush view in global parent screen canvas view delegate " + view.getVirtualElementId());
        ze.n S = this.f486792d.S();
        if (S != null) {
            S.m(new sa1.b(view, i19, i27, this, i17, i18, i28));
        }
    }

    @Override // yg.b0
    public void q0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ze.n S = this.f486792d.S();
        if (S != null) {
            S.m(new sa1.d(i17, i18, i19, i27, i28, this, view));
        }
    }

    @Override // yg.b0
    public void w0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalParentScreenCanvasViewDelegate", "hy: removing magicbrush view in global parent screen canvas view delegate " + view.getVirtualElementId());
        ze.n S = this.f486792d.S();
        if (S != null) {
            S.m(new sa1.c(this, view));
        }
    }
}
