package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class e3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234141d;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38) {
        this.f234141d = activityC16764xd1ab6b38;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234141d;
        activityC16764xd1ab6b38.f234081y1 = false;
        android.app.Dialog dialog = activityC16764xd1ab6b38.f234080y0;
        if (dialog != null && dialog.isShowing()) {
            activityC16764xd1ab6b38.f234080y0.dismiss();
        }
        to3.q.e();
        android.app.Dialog dialog2 = activityC16764xd1ab6b38.f234080y0;
        if (dialog2 != null && dialog2.isShowing()) {
            activityC16764xd1ab6b38.f234080y0.dismiss();
        }
        activityC16764xd1ab6b38.s7();
        return false;
    }
}
