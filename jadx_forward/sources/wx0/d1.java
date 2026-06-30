package wx0;

/* loaded from: classes2.dex */
public final class d1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44 f532002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f532003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f532004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f532005g;

    public d1(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44 c10991xb30eef44, int i17, android.view.View view, int i18) {
        this.f532002d = c10991xb30eef44;
        this.f532003e = i17;
        this.f532004f = view;
        this.f532005g = i18;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView$showView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            view.performClick();
            int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44.f151201e;
            this.f532002d.setVisibility(4);
        }
        if (this.f532003e <= motionEvent.getRawX()) {
            float rawX = motionEvent.getRawX();
            android.view.View view2 = this.f532004f;
            if (rawX <= r7 + view2.getWidth()) {
                if (this.f532005g <= motionEvent.getRawY() && motionEvent.getRawY() <= r7 + view2.getHeight()) {
                    z17 = true;
                    yj0.a.i(z17, this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView$showView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z17;
                }
            }
        }
        z17 = false;
        yj0.a.i(z17, this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView$showView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
