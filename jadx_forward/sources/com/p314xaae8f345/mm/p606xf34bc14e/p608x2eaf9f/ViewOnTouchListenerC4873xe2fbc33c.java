package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/tencent/mm/accessibility/core/MMAccTouchListenerWrap;", "Landroid/view/View$OnTouchListener;", ya.b.f77495x8b74a326, "(Landroid/view/View$OnTouchListener;)V", "getOrigin", "()Landroid/view/View$OnTouchListener;", "onTouch", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.MMAccTouchListenerWrap */
/* loaded from: classes14.dex */
public final class ViewOnTouchListenerC4873xe2fbc33c implements android.view.View.OnTouchListener {

    /* renamed from: $stable */
    public static final int f21063x3b2de05f = 8;

    /* renamed from: _hellAccFlag_ */
    private byte f21064x7f11beae;
    private final android.view.View.OnTouchListener origin;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnTouchListenerC4873xe2fbc33c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final android.view.View.OnTouchListener getOrigin() {
        return this.origin;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/accessibility/core/MMAccTouchListenerWrap", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (view != null && event != null) {
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.f21124x4fbc8495.m42576x4bee6374(view, event);
        }
        if (com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.f21124x4fbc8495.m42579x75f1c9e(view, event)) {
            ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42746xf0eb9ea();
            yj0.a.i(true, this, "com/tencent/mm/accessibility/core/MMAccTouchListenerWrap", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        android.view.View.OnTouchListener onTouchListener = this.origin;
        boolean onTouch = onTouchListener != null ? onTouchListener.onTouch(view, event) : false;
        yj0.a.i(onTouch, this, "com/tencent/mm/accessibility/core/MMAccTouchListenerWrap", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }

    public ViewOnTouchListenerC4873xe2fbc33c(android.view.View.OnTouchListener onTouchListener) {
        this.origin = onTouchListener;
    }

    public /* synthetic */ ViewOnTouchListenerC4873xe2fbc33c(android.view.View.OnTouchListener onTouchListener, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : onTouchListener);
    }
}
