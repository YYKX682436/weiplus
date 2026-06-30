package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* renamed from: com.tencent.mm.plugin.music.ui.MusicViewPager */
/* loaded from: classes5.dex */
public class C16634x96cbb99 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d {

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f232256d;

    public C16634x96cbb99(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f232256d = new android.view.GestureDetector(getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p0(this, null));
        m80859x5e9a12bc(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.o0(this, getContext()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d, com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        android.view.GestureDetector gestureDetector = this.f232256d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/MusicViewPager", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/music/ui/MusicViewPager", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
