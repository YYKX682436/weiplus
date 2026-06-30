package p012xc85e97e9.p013x9d4bf30f;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f90560d;

    public b(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c) {
        this.f90560d = activityC0053x3d3f670c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (java.lang.IllegalStateException e17) {
            if (!android.text.TextUtils.equals(e17.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e17;
            }
        }
    }
}
