package ae;

/* loaded from: classes7.dex */
public class g implements gh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae.a f3353a;

    public g(ae.a aVar) {
        this.f3353a = aVar;
    }

    @Override // gh.l
    public void a(com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        ae.a aVar = this.f3353a;
        ae.o oVar = new ae.o(aVar, null);
        magicBrushView.getClass();
        magicBrushView.renderingContextListeners.a(oVar);
        magicBrushView.surfaceListener.a(new ae.n(aVar, null));
    }

    @Override // gh.l
    public void b(com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
    }
}
