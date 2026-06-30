package i33;

/* loaded from: classes4.dex */
public final class x1 extends i33.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f369821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369821d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d(activity);
    }

    public static final void T6(i33.x1 x1Var, android.view.View view) {
        x1Var.getClass();
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
                if (childAt instanceof y51.c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewMediaScaleUIC", "scaleTouchView >> " + i17 + " is MMLivePhotoPlayerBasicView");
                    y51.b bVar = (y51.b) ((y51.c) childAt);
                    android.view.View m176505xa2cba55e = bVar.m176505xa2cba55e();
                    android.view.View m176505xa2cba55e2 = bVar.m176505xa2cba55e();
                    if (m176505xa2cba55e2 != null && m176505xa2cba55e != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        m176505xa2cba55e2.getGlobalVisibleRect(rect);
                        int i18 = rect.bottom - rect.top;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = x1Var.f369821d;
                        if (i18 > 0) {
                            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81482x1405e56c(i18);
                            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81485xbdd8ccab(rect);
                        }
                        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.b(m176505xa2cba55e);
                    }
                }
            }
        }
    }
}
