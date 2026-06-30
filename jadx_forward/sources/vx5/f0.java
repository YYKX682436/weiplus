package vx5;

/* loaded from: classes8.dex */
public class f0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f522880a;

    public f0(vx5.i0 i0Var, android.webkit.ValueCallback valueCallback) {
        this.f522880a = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        by5.i0 i0Var;
        by5.i0 i0Var2;
        boolean z17;
        java.util.Objects.toString(obj);
        com.p314xaae8f345.p3210x3857dc.n2 n2Var = new com.p314xaae8f345.p3210x3857dc.n2();
        android.webkit.ValueCallback valueCallback = this.f522880a;
        if (obj == null) {
            n2Var.f301881a = -1;
            valueCallback.onReceiveValue(n2Var);
            return;
        }
        try {
            try {
                i0Var = new by5.i0(obj, "getCaptureStatus", new java.lang.Class[0]);
                i0Var2 = new by5.i0(obj, "getBitmap", new java.lang.Class[0]);
                z17 = true;
            } catch (java.lang.Exception e17) {
                n2Var.f301882b = null;
                n2Var.f301881a = -1;
                e17.getMessage();
            }
            if (!(i0Var2.f118020e == null)) {
                if (i0Var.f118020e != null) {
                    z17 = false;
                }
                if (!z17) {
                    int intValue = ((java.lang.Integer) i0Var.b(new java.lang.Object[0])).intValue();
                    n2Var.f301881a = intValue;
                    if (intValue == 0) {
                        n2Var.f301882b = (android.graphics.Bitmap) i0Var2.b(new java.lang.Object[0]);
                    }
                    n2Var.m120280x9616526c();
                    valueCallback.onReceiveValue(n2Var);
                }
            }
            n2Var.f301882b = null;
            n2Var.f301881a = -1;
            valueCallback.onReceiveValue(n2Var);
        } catch (java.lang.Throwable th6) {
            valueCallback.onReceiveValue(n2Var);
            throw th6;
        }
    }
}
