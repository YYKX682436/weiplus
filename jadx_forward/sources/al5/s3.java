package al5;

/* loaded from: classes4.dex */
public final class s3 implements al5.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f87554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ al5.v3 f87556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.x3 f87557d;

    public s3(com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d, android.view.View view, al5.v3 v3Var, al5.x3 x3Var) {
        this.f87554a = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
        this.f87555b = view;
        this.f87556c = v3Var;
        this.f87557d = x3Var;
    }

    @Override // al5.z3
    public void a() {
        al5.x3 x3Var = this.f87557d;
        if (x3Var != null) {
            x3Var.a(1, this.f87554a.m81464xb7cf71c7());
        }
    }

    @Override // al5.z3
    /* renamed from: onDoubleTap */
    public void mo2317xce1d2af3(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = this.f87554a;
        if (!scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getAddTouchView()) {
            al5.u3 u3Var = al5.y3.f87635a;
            android.view.View view = this.f87555b;
            db5.e7 a17 = u3Var.a(view);
            al5.v3 v3Var = this.f87556c;
            android.graphics.Rect a18 = v3Var != null ? v3Var.a() : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TouchLayoutHelper", "initScale >> doubleTap: " + a18);
            if (a17 != null) {
                a17.mo70831x49dc7633(true);
            }
            if (a18 != null) {
                if (a18.bottom - a18.top > 0) {
                    scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81482x1405e56c(r1 - r4);
                    scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81485xbdd8ccab(a18);
                }
            }
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.b(view);
        }
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.e(f17, f18);
    }
}
