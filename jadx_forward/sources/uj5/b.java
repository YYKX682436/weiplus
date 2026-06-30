package uj5;

/* loaded from: classes3.dex */
public final class b implements android.app.Activity.ScreenCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uj5.e f509980a;

    public b(uj5.e eVar) {
        this.f509980a = eVar;
    }

    @Override // android.app.Activity.ScreenCaptureCallback
    public final void onScreenCaptured() {
        pm0.v.K(null, new uj5.a(this.f509980a));
    }
}
