package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* renamed from: com.tencent.mm.ui.chatting.view.FoldableChatTextItemView */
/* loaded from: classes4.dex */
public class C21896x72ec4338 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public n3.q f284375d;

    public C21896x72ec4338(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: setTagObject */
    private void m79863xbc1ce537(android.view.MotionEvent motionEvent) {
        setTag(com.p314xaae8f345.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        m79863xbc1ce537(motionEvent);
        n3.q qVar = this.f284375d;
        if (qVar != null) {
            qVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setFoldTextListener */
    public void m79864xe0e15424(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d0 d0Var) {
    }

    /* renamed from: setMaxHeight */
    public void m79865x25bfb969(int i17) {
    }

    /* renamed from: setOnGestureListener */
    public void m79866x672610fc(android.view.GestureDetector.OnGestureListener onGestureListener) {
        this.f284375d = new n3.q(getContext(), onGestureListener);
    }

    public C21896x72ec4338(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
