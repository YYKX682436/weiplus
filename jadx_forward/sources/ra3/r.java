package ra3;

/* loaded from: classes14.dex */
public final class r extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f475061a;

    public r(boolean z17) {
        this.f475061a = z17;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!this.f475061a) {
            return super.dispatchPopulateAccessibilityEvent(host, event);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(event.getText(), "getText(...)");
        if (!(!r2.isEmpty())) {
            return true;
        }
        event.getText().clear();
        return true;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup host, android.view.View child, android.view.accessibility.AccessibilityEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f475061a) {
            return true;
        }
        return super.onRequestSendAccessibilityEvent(host, child, event);
    }
}
