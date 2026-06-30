package vx5;

/* loaded from: classes7.dex */
public class g0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f522882a;

    public g0(vx5.i0 i0Var, android.webkit.ValueCallback valueCallback) {
        this.f522882a = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        android.webkit.ValueCallback valueCallback = this.f522882a;
        if (obj == null) {
            valueCallback.onReceiveValue(null);
        } else {
            valueCallback.onReceiveValue(new com.p314xaae8f345.p3210x3857dc.l2(obj));
        }
    }
}
