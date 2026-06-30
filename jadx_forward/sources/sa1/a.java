package sa1;

/* loaded from: classes7.dex */
public abstract class a implements yg.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final ae.a f486792d;

    public a(ae.a logicImpl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logicImpl, "logicImpl");
        this.f486792d = logicImpl;
    }

    @Override // yg.b0
    public void M(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, float[] left, float[] top, float[] width, float[] height) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(left, "left");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(top, "top");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(width, "width");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(height, "height");
    }

    @Override // yg.b0
    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 Z() {
        ae.a aVar = this.f486792d;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F();
        android.content.Context f229340d = yVar != null ? yVar.getF229340d() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f229340d);
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = new com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2(f229340d, gh.y.TextureView);
        c4216x654bedf2.setContentDescription("ScreenCanvasMagicBrushView");
        c4216x654bedf2.m34867x7867078f(aVar.w());
        c4216x654bedf2.m34870x5162241f(true);
        return c4216x654bedf2;
    }
}
