package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.InitCallBackLayout */
/* loaded from: classes5.dex */
public class C21634x7761ad3f extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f279829d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.ne f279830e;

    public C21634x7761ad3f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f279829d) {
            return;
        }
        this.f279829d = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ne neVar = this.f279830e;
        if (neVar != null) {
            ((com.p314xaae8f345.mm.ui.C21440xfcb6d020) neVar).c();
        }
    }

    /* renamed from: setListener */
    public void m79399xc6cf6336(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ne neVar) {
        this.f279830e = neVar;
    }
}
