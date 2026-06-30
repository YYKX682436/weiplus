package b04;

/* loaded from: classes5.dex */
public final class i0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f98446d;

    public i0(b04.j0 j0Var) {
        this.f98446d = j0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        b04.j0 j0Var = this.f98446d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) j0Var.f98453i).mo141623x754a37bb();
        if (o4Var != null) {
            o4Var.putBoolean("back_dialog_shown", true);
        }
        j0Var.U6(2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "showBackConfirmDialog: dialog confirmed, mark as shown, dialog dismissed");
    }
}
