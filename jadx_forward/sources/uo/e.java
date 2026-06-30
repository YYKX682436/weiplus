package uo;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f511042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f511043e;

    public e(android.content.Context context, yz5.a aVar) {
        this.f511042d = context;
        this.f511043e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f511042d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        yz5.a aVar = this.f511043e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "showFailView");
        ap.a.a(1, "openCameraErrAlert", new java.lang.Throwable(), null, new java.lang.String[0]);
    }
}
