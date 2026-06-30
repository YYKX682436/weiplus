package sa1;

/* loaded from: classes7.dex */
public final class i extends sa1.a {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f486825e;

    /* renamed from: f, reason: collision with root package name */
    public final hh.g f486826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ae.a logicImpl) {
        super(logicImpl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logicImpl, "logicImpl");
        this.f486826f = new hh.g();
    }

    @Override // yg.b0
    public void a0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ze.n S = this.f486792d.S();
        if (S != null) {
            S.m(new sa1.f(this, view, i28, i19, i27, i17, i18));
        }
    }

    @Override // yg.b0
    public void q0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ze.n S = this.f486792d.S();
        if (S != null) {
            S.m(new sa1.h(i19, i27, i17, i18, this, view, i28));
        }
    }

    @Override // yg.b0
    public void w0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ze.n S = this.f486792d.S();
        if (S != null) {
            S.m(new sa1.g(this, view));
        }
    }
}
