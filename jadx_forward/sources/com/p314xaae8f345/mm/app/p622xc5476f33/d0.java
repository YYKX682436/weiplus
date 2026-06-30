package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes.dex */
public class d0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f135175a;

    public d0(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.TransferUriSpanHandler transferUriSpanHandler, android.os.Bundle bundle) {
        this.f135175a = bundle;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.os.Bundle bundle = this.f135175a;
            java.lang.String string = bundle.getString(ya.b.f77506xba41a63c);
            java.lang.String string2 = bundle.getString("transfer_id");
            java.lang.String string3 = bundle.getString("receiver_name");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(ya.b.f77506xba41a63c, string);
            intent.putExtra("transfer_id", string2);
            intent.putExtra("receiver_name", string3);
            intent.putExtra("resend_msg_from_flag", 3);
            intent.putExtra("is_open_im", bundle.getInt("is_open_im"));
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
        }
    }
}
