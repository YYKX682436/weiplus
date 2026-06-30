package gp3;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp3.e f355898d;

    public c(gp3.e eVar) {
        this.f355898d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        gp3.e eVar = this.f355898d;
        intent.putExtra(ya.b.f77506xba41a63c, eVar.f355900e.f234334x);
        intent.putExtra("receiver_name", eVar.f355900e.T);
        intent.putExtra("resend_msg_from_flag", 1);
        j45.l.j(eVar.f355899d, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
    }
}
