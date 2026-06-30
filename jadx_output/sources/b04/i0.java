package b04;

/* loaded from: classes5.dex */
public final class i0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f16913d;

    public i0(b04.j0 j0Var) {
        this.f16913d = j0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        b04.j0 j0Var = this.f16913d;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) j0Var.f16920i).getValue();
        if (o4Var != null) {
            o4Var.putBoolean("back_dialog_shown", true);
        }
        j0Var.U6(2);
        com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "showBackConfirmDialog: dialog confirmed, mark as shown, dialog dismissed");
    }
}
