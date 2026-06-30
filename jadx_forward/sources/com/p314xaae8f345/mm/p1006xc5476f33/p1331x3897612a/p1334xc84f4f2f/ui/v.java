package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class v implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd f177867d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd) {
        this.f177867d = activityC13135x13db66fd;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "action: %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd = this.f177867d;
        activityC13135x13db66fd.A = activityC13135x13db66fd.f177770p.getText().toString();
        activityC13135x13db66fd.X6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13135x13db66fd.A)) {
            activityC13135x13db66fd.a7(true);
        }
        activityC13135x13db66fd.mo48674x36654fab();
        return false;
    }
}
