package az2;

/* loaded from: classes3.dex */
public final class q extends az2.s {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f97681b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f97682c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f97683d;

    public q() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f97682c = string;
    }

    @Override // az2.s
    public void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f97681b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // az2.s
    public void b() {
        android.content.Context context;
        java.lang.ref.WeakReference weakReference = this.f97685a;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        java.lang.String str = this.f97682c;
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f97683d;
        this.f97681b = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, str, onCancelListener != null, 0, onCancelListener);
    }
}
