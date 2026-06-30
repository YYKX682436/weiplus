package nx0;

/* loaded from: classes2.dex */
public final class o3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 f422724d;

    public o3(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 c10984x806b8ef5) {
        this.f422724d = c10984x806b8ef5;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.SeekBar m47372xb5882cdd;
        android.widget.SeekBar m47372xb5882cdd2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/SeekBarWithValueView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        view.performClick();
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 c10984x806b8ef5 = this.f422724d;
        m47372xb5882cdd = c10984x806b8ef5.m47372xb5882cdd();
        m47372xb5882cdd.getHitRect(rect);
        float height = rect.top + (rect.height() / 2.0f);
        float x17 = motionEvent.getX() - rect.left;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x17 < 0.0f ? 0.0f : x17 > ((float) rect.width()) ? rect.width() : x17, height, motionEvent.getMetaState());
        m47372xb5882cdd2 = c10984x806b8ef5.m47372xb5882cdd();
        boolean onTouchEvent = m47372xb5882cdd2.onTouchEvent(obtain);
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/SeekBarWithValueView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
