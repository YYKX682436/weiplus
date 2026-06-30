package qw3;

/* loaded from: classes9.dex */
public class m0 extends android.view.View.AccessibilityDelegate {
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, qw3.i iVar) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569;
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() != 32768 || (activityC17101x8420a569 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569) view.getContext()) == null || (viewOnFocusChangeListenerC22907xe18534c2 = activityC17101x8420a569.f238011e) == null || viewOnFocusChangeListenerC22907xe18534c2.m83183xfb85ada3() != null) {
            return;
        }
        activityC17101x8420a569.f238011e.e();
        activityC17101x8420a569.mo48674x36654fab();
    }
}
