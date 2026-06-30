package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchListView */
/* loaded from: classes9.dex */
public class C21586x3fe9b1f6 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public hb5.z f279458d;

    public C21586x3fe9b1f6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        hb5.z zVar = this.f279458d;
        if (zVar != null) {
            ((com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47) zVar).mo48674x36654fab();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: setOnTouchListener */
    public void m79364xcc7da8b2(hb5.z zVar) {
        this.f279458d = zVar;
    }

    public C21586x3fe9b1f6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
