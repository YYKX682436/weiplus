package ce;

/* loaded from: classes7.dex */
public class q implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce.o f40720d;

    public q(ce.o oVar) {
        this.f40720d = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "WAGamePageView onAttachedToWindow, notify mb foreground once");
        ce.o oVar = this.f40720d;
        oVar.f40686g.getMagicBrush().f();
        oVar.f40686g.post(new ce.p(this, this));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
