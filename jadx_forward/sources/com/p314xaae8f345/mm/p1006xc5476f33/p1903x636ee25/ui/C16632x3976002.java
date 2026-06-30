package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* renamed from: com.tencent.mm.plugin.music.ui.MusicItemLayout */
/* loaded from: classes5.dex */
public class C16632x3976002 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f232234d;

    public C16632x3976002(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f232234d = new android.view.GestureDetector(getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.n(this, null));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t) getTag();
        if (!(tVar.f232321j == 2)) {
            if (!(tVar.f232318g.getX() <= motionEvent.getX() && motionEvent.getX() <= tVar.f232318g.getX() + ((float) tVar.f232318g.getMeasuredWidth()) && tVar.f232318g.getY() <= motionEvent.getY() && motionEvent.getY() <= tVar.f232318g.getY() + ((float) tVar.f232318g.getMeasuredHeight()))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f232234d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/MusicItemLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/music/ui/MusicItemLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public C16632x3976002(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f232234d = new android.view.GestureDetector(getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.n(this, null));
    }
}
