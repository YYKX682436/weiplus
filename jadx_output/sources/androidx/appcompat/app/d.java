package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.k f9083d;

    public d(androidx.appcompat.app.k kVar) {
        this.f9083d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.os.Message message;
        android.os.Message message2;
        android.os.Message message3;
        androidx.appcompat.app.k kVar = this.f9083d;
        android.os.Message obtain = (view != kVar.f9169k || (message3 = kVar.f9171m) == null) ? (view != kVar.f9173o || (message2 = kVar.f9175q) == null) ? (view != kVar.f9177s || (message = kVar.f9179u) == null) ? null : android.os.Message.obtain(message) : android.os.Message.obtain(message2) : android.os.Message.obtain(message3);
        if (obtain != null) {
            obtain.sendToTarget();
        }
        kVar.L.obtainMessage(1, kVar.f9160b).sendToTarget();
    }
}
