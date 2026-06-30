package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.AccessibilityEventsDelegate */
/* loaded from: classes15.dex */
class C28705xcb1b0e8c {

    /* renamed from: accessibilityBridge */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 f71744x36f49e77;

    /* renamed from: onAccessibilityHoverEvent */
    public boolean m138577x32e691cd(android.view.MotionEvent motionEvent, boolean z17) {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657 = this.f71744x36f49e77;
        if (c28974x81a86657 == null) {
            return false;
        }
        return c28974x81a86657.m139484x32e691cd(motionEvent, z17);
    }

    /* renamed from: requestSendAccessibilityEvent */
    public boolean m138578xacf4d503(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657 = this.f71744x36f49e77;
        if (c28974x81a86657 == null) {
            return false;
        }
        return c28974x81a86657.m139475x7605e9d3(view, view2, accessibilityEvent);
    }

    /* renamed from: setAccessibilityBridge */
    public void m138579xdd693ab5(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657) {
        this.f71744x36f49e77 = c28974x81a86657;
    }
}
