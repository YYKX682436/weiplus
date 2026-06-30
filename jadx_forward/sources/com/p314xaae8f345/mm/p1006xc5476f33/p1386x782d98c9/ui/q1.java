package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes5.dex */
public class q1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a f181160d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a) {
        this.f181160d = activityC13462x5ea70b8a;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "on next Key down.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a.T6(this.f181160d);
        return true;
    }
}
