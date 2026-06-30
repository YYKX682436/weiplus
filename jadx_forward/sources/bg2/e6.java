package bg2;

/* loaded from: classes.dex */
public final class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101595e;

    public e6(java.lang.String str, android.content.Context context) {
        this.f101594d = str;
        this.f101595e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f101594d;
        if (str != null) {
            pm0.v.X(new bg2.d6(this.f101595e, str));
        }
    }
}
