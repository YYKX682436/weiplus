package ce;

/* loaded from: classes7.dex */
public class q implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce.o f122253d;

    public q(ce.o oVar) {
        this.f122253d = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "WAGamePageView onAttachedToWindow, notify mb foreground once");
        ce.o oVar = this.f122253d;
        oVar.f122219g.m34856x4a42b983().f();
        oVar.f122219g.post(new ce.p(this, this));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
