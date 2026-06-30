package gg4;

/* loaded from: classes8.dex */
public class t implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18540xb745c65c f353311d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18540xb745c65c activityC18540xb745c65c) {
        this.f353311d = activityC18540xb745c65c;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18540xb745c65c activityC18540xb745c65c = this.f353311d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC18540xb745c65c.f253958d.getText().toString().trim())) {
            return false;
        }
        activityC18540xb745c65c.T6();
        return false;
    }
}
