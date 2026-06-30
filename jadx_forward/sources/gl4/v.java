package gl4;

/* loaded from: classes11.dex */
public final class v implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f354417d;

    public v(android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f354417d = onCancelListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "showTipsDialog cancel");
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f354417d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
