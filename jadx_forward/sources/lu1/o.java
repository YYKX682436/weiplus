package lu1;

/* loaded from: classes8.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402887d;

    public o(android.content.Context context) {
        this.f402887d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9 c5631x90d66b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9();
        c5631x90d66b9.f135958g.f87687a = this.f402887d;
        c5631x90d66b9.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDialogHelper", "enter to cardhome");
    }
}
