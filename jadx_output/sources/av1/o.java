package av1;

/* loaded from: classes3.dex */
public final class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14188d;

    public o(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity) {
        this.f14188d = screenCastActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f14188d.finish();
    }
}
