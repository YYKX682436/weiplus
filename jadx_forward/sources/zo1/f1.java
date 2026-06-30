package zo1;

/* loaded from: classes3.dex */
public final class f1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f556136d;

    public f1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f556136d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "[getDeviceListAsync] user cancel current action");
        java.util.concurrent.Future future = (java.util.concurrent.Future) this.f556136d.f391656d;
        if (future != null) {
            future.cancel(true);
        }
    }
}
