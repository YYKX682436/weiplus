package ts0;

/* loaded from: classes10.dex */
public final class e implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.l f503085d;

    public e(ts0.l lVar) {
        this.f503085d = lVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        java.lang.String str;
        ts0.l lVar = this.f503085d;
        java.lang.String str2 = lVar.f503091w;
        lVar.f503056e.f511990k = true;
        if (lVar.K) {
            return;
        }
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parameters, "getParameters(...)");
            if (parameters.getFocusMode() == null || (str = lVar.f503056e.f511991l) == null) {
                return;
            }
            parameters.setFocusMode(str);
            camera.setParameters(parameters);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(lVar.f503091w, "auto focus return while camera is release");
        }
    }
}
