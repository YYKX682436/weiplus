package t22;

/* loaded from: classes10.dex */
public final class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t22.e f496615d;

    public d(t22.e eVar) {
        this.f496615d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        t22.e eVar = this.f496615d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f496618c, "CheckLensInfo: cancel loading");
        eVar.f496619d.dismiss();
        eVar.f496617b.a(false);
    }
}
