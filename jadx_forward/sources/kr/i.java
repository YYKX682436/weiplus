package kr;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f392831d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f392832e;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/TouchToClick", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f392832e = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new kr.h(this, v17), true);
            this.f392831d = b4Var;
            b4Var.c(android.view.ViewConfiguration.getKeyRepeatTimeout(), android.view.ViewConfiguration.getKeyRepeatDelay());
        } else if (actionMasked == 1 || actionMasked == 3) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f392831d;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            this.f392831d = null;
            if (!this.f392832e && event.getActionMasked() == 1) {
                v17.performClick();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/emoji/panel/TouchToClick", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
