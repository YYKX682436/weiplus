package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.k f90616d;

    public d(p012xc85e97e9.p016x746ad0e3.app.k kVar) {
        this.f90616d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.os.Message message;
        android.os.Message message2;
        android.os.Message message3;
        p012xc85e97e9.p016x746ad0e3.app.k kVar = this.f90616d;
        android.os.Message obtain = (view != kVar.f90702k || (message3 = kVar.f90704m) == null) ? (view != kVar.f90706o || (message2 = kVar.f90708q) == null) ? (view != kVar.f90710s || (message = kVar.f90712u) == null) ? null : android.os.Message.obtain(message) : android.os.Message.obtain(message2) : android.os.Message.obtain(message3);
        if (obtain != null) {
            obtain.sendToTarget();
        }
        kVar.L.obtainMessage(1, kVar.f90693b).sendToTarget();
    }
}
