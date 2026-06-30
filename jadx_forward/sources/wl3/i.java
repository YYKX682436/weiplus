package wl3;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d f528600d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d) {
        this.f528600d = c16639xd269873d;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d = this.f528600d;
        ii0.a aVar = c16639xd269873d.f232359g;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
            throw null;
        }
        aVar.f373143c.getHitRect(rect);
        if (motionEvent.getY() < rect.top - 500 || motionEvent.getY() > rect.bottom + 500) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        float height = rect.top + (rect.height() / 2);
        float x17 = motionEvent.getX() - rect.left;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x17 < 0.0f ? 0.0f : x17 > ((float) rect.width()) ? rect.width() : x17, height, motionEvent.getMetaState());
        ii0.a aVar2 = c16639xd269873d.f232359g;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
            throw null;
        }
        boolean onTouchEvent = aVar2.f373143c.onTouchEvent(obtain);
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
