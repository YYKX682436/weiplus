package db5;

/* loaded from: classes4.dex */
public final class a5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21507x556904c6 f309811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f309812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f309813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f309814g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21507x556904c6 c21507x556904c6, android.view.MotionEvent motionEvent, android.view.View view, android.graphics.PointF pointF) {
        super(0);
        this.f309811d = c21507x556904c6;
        this.f309812e = motionEvent;
        this.f309813f = view;
        this.f309814g = pointF;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21507x556904c6 c21507x556904c6 = this.f309811d;
        if (!c21507x556904c6.f279038o) {
            c21507x556904c6.f279038o = true;
            android.view.MotionEvent motionEvent = this.f309812e;
            int action = motionEvent.getAction();
            motionEvent.setAction(3);
            super/*android.view.View*/.dispatchTouchEvent(motionEvent);
            android.view.View view = this.f309813f;
            if (view != null) {
                c21507x556904c6.b(view, motionEvent, this.f309814g);
            }
            motionEvent.setAction(action);
        }
        return jz5.f0.f384359a;
    }
}
