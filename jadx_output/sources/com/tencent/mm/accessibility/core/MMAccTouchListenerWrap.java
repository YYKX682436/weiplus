package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/tencent/mm/accessibility/core/MMAccTouchListenerWrap;", "Landroid/view/View$OnTouchListener;", ya.b.ORIGIN, "(Landroid/view/View$OnTouchListener;)V", "getOrigin", "()Landroid/view/View$OnTouchListener;", "onTouch", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MMAccTouchListenerWrap implements android.view.View.OnTouchListener {
    public static final int $stable = 8;
    private byte _hellAccFlag_;
    private final android.view.View.OnTouchListener origin;

    /* JADX WARN: Multi-variable type inference failed */
    public MMAccTouchListenerWrap() {
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
            com.tencent.mm.accessibility.core.provider.AccProviderFactory.INSTANCE.dispatchOnTouchEvent(view, event);
        }
        if (com.tencent.mm.accessibility.core.provider.AccProviderFactory.INSTANCE.onInterceptTouchEvent(view, event)) {
            ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).onInjectionIntercept();
            yj0.a.i(true, this, "com/tencent/mm/accessibility/core/MMAccTouchListenerWrap", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        android.view.View.OnTouchListener onTouchListener = this.origin;
        boolean onTouch = onTouchListener != null ? onTouchListener.onTouch(view, event) : false;
        yj0.a.i(onTouch, this, "com/tencent/mm/accessibility/core/MMAccTouchListenerWrap", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }

    public MMAccTouchListenerWrap(android.view.View.OnTouchListener onTouchListener) {
        this.origin = onTouchListener;
    }

    public /* synthetic */ MMAccTouchListenerWrap(android.view.View.OnTouchListener onTouchListener, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : onTouchListener);
    }
}
