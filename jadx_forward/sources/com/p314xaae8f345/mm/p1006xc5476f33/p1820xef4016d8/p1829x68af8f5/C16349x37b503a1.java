package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.LuckyMoneyStoryViewPager */
/* loaded from: classes10.dex */
public class C16349x37b503a1 extends com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b {
    public C16349x37b503a1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 3 ? super.dispatchTouchEvent(android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState())) : super.dispatchTouchEvent(motionEvent);
    }
}
