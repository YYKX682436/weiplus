package q75;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f442138e;

    public b(java.lang.String str, android.content.Context context) {
        this.f442137d = str;
        this.f442138e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        q75.c.f(this.f442137d, this.f442138e);
    }
}
