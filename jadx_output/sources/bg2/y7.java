package bg2;

/* loaded from: classes.dex */
public final class y7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20677e;

    public y7(java.lang.String str, android.content.Context context) {
        this.f20676d = str;
        this.f20677e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f20676d;
        if (str != null) {
            pm0.v.X(new bg2.x7(this.f20677e, str));
        }
    }
}
