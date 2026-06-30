package wo;

/* loaded from: classes14.dex */
public class c1 implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.AutoFocusCallback f529174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo.d1 f529175e;

    public c1(wo.d1 d1Var, android.hardware.Camera.AutoFocusCallback autoFocusCallback) {
        this.f529175e = d1Var;
        this.f529174d = autoFocusCallback;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        if (this.f529175e.f529187c) {
            return;
        }
        this.f529174d.onAutoFocus(z17, camera);
    }
}
