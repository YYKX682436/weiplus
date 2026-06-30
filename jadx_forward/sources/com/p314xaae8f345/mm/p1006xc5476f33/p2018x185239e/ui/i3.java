package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class i3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j3 f239294a;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j3 j3Var) {
        this.f239294a = j3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j3 j3Var = this.f239294a;
            intent.putExtra(ya.b.f77506xba41a63c, j3Var.f239312b.f238912x0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = j3Var.f239312b;
            intent.putExtra("transfer_id", activityC17133x39d21883.f238888l1);
            intent.putExtra("receiver_name", activityC17133x39d21883.D1);
            intent.putExtra("resend_msg_from_flag", 3);
            intent.putExtra("is_open_im", activityC17133x39d21883.J1 ? 1 : 0);
            activityC17133x39d21883.getClass();
            j45.l.j(activityC17133x39d21883, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
        }
    }
}
