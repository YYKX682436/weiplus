package bg2;

/* loaded from: classes.dex */
public final class y7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102210e;

    public y7(java.lang.String str, android.content.Context context) {
        this.f102209d = str;
        this.f102210e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f102209d;
        if (str != null) {
            pm0.v.X(new bg2.x7(this.f102210e, str));
        }
    }
}
