package bg2;

/* loaded from: classes.dex */
public final class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20062e;

    public e6(java.lang.String str, android.content.Context context) {
        this.f20061d = str;
        this.f20062e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f20061d;
        if (str != null) {
            pm0.v.X(new bg2.d6(this.f20062e, str));
        }
    }
}
