package zl2;

/* loaded from: classes2.dex */
public final class l3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.SeekBar f555413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555414e;

    public l3(android.widget.SeekBar seekBar, int i17) {
        this.f555413d = seekBar;
        this.f555414e = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$setSeekBarTouchDelegate$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.SeekBar seekBar = this.f555413d;
        seekBar.getHitRect(rect);
        float y17 = motionEvent.getY();
        int i17 = rect.top;
        int i18 = this.f555414e;
        if (y17 < i17 - i18 || motionEvent.getY() > rect.bottom + i18 || motionEvent.getX() < rect.left || motionEvent.getX() > rect.right) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$setSeekBarTouchDelegate$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX() - rect.left, rect.top + (rect.height() / 2.0f), motionEvent.getMetaState());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        boolean onTouchEvent = seekBar.onTouchEvent(obtain);
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$setSeekBarTouchDelegate$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
