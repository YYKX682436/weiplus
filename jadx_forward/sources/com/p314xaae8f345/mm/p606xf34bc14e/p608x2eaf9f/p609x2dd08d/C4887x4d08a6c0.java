package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/VisualAreaNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "Ljz5/f0;", "modifyNodeRect", "", "virtualViewId", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "createAccessibilityNodeInfo", "Landroid/view/View;", "host", "Landroid/view/View;", "eLeft", "I", "eTop", "eRight", "eBottom", "Landroid/graphics/Rect;", "tmpRect", "Landroid/graphics/Rect;", "tmpRect2", "<init>", "(Landroid/view/View;IIII)V", "Companion", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.area.VisualAreaNodeProvider */
/* loaded from: classes14.dex */
public final class C4887x4d08a6c0 extends android.view.accessibility.AccessibilityNodeProvider {
    public static final java.lang.String TAG = "MicroMsg.Acc.VisualAreaNodeProvider";
    private final int eBottom;
    private final int eLeft;
    private final int eRight;
    private final int eTop;
    private final android.view.View host;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.Rect tmpRect2;

    /* renamed from: $stable */
    public static final int f21114x3b2de05f = 8;

    public C4887x4d08a6c0(android.view.View host, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.host = host;
        this.eLeft = i17;
        this.eTop = i18;
        this.eRight = i19;
        this.eBottom = i27;
        this.tmpRect = new android.graphics.Rect();
        this.tmpRect2 = new android.graphics.Rect();
    }

    /* renamed from: modifyNodeRect */
    private final void m42564x59d62de0(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getBoundsInScreen(this.tmpRect);
        android.graphics.Rect rect = this.tmpRect;
        rect.left -= this.eLeft;
        rect.top -= this.eTop;
        rect.right += this.eRight;
        rect.bottom += this.eBottom;
        accessibilityNodeInfo.setBoundsInScreen(rect);
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.f21124x4fbc8495.m42574x24d8446a(this.host, accessibilityNodeInfo);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
        if (virtualViewId != -1) {
            return null;
        }
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.host);
        this.host.onInitializeAccessibilityNodeInfo(obtain);
        if (this.host.isClickable() || this.host.isLongClickable()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obtain);
            m42564x59d62de0(obtain);
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int virtualViewId, int action, android.os.Bundle arguments) {
        return this.host.performAccessibilityAction(action, arguments);
    }
}
