package kt4;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt4.n f393575d;

    public m(kt4.n nVar) {
        this.f393575d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "dismiss alert");
        this.f393575d.f393576c = null;
    }
}
