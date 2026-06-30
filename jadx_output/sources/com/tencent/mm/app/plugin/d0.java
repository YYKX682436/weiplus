package com.tencent.mm.app.plugin;

/* loaded from: classes.dex */
public class d0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f53642a;

    public d0(com.tencent.mm.app.plugin.URISpanHandlerSet.TransferUriSpanHandler transferUriSpanHandler, android.os.Bundle bundle) {
        this.f53642a = bundle;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.os.Bundle bundle = this.f53642a;
            java.lang.String string = bundle.getString(ya.b.TRANSACTION_ID);
            java.lang.String string2 = bundle.getString("transfer_id");
            java.lang.String string3 = bundle.getString("receiver_name");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(ya.b.TRANSACTION_ID, string);
            intent.putExtra("transfer_id", string2);
            intent.putExtra("receiver_name", string3);
            intent.putExtra("resend_msg_from_flag", 3);
            intent.putExtra("is_open_im", bundle.getInt("is_open_im"));
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
        }
    }
}
