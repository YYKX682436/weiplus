package v12;

@j95.b
/* loaded from: classes5.dex */
public final class i extends i95.w implements aq0.g, v12.e {

    /* renamed from: d, reason: collision with root package name */
    public v12.f f514040d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f514041e;

    /* renamed from: f, reason: collision with root package name */
    public aq0.i f514042f = aq0.i.f94558d;

    /* renamed from: g, reason: collision with root package name */
    public aq0.f f514043g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f514044h;

    /* renamed from: i, reason: collision with root package name */
    public int f514045i;

    public void Ai(aq0.h info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "triggerFirework " + info);
        v12.f fVar = this.f514040d;
        if (fVar != null) {
            fVar.C0(new x12.b(info));
        }
    }

    public final void wi() {
        android.view.View view;
        android.widget.FrameLayout frameLayout = this.f514044h;
        if (frameLayout == null || (view = this.f514041e) == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getParent(), frameLayout)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "attach view " + view + " to holder " + frameLayout);
        android.view.ViewParent parent = view.getParent();
        android.widget.FrameLayout frameLayout2 = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
        if (frameLayout2 != null) {
            frameLayout2.removeView(view);
        }
        frameLayout.addView(view);
    }
}
