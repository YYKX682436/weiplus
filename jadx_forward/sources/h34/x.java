package h34;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c34.r f360103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360104e;

    public x(c34.r rVar, android.content.Context context) {
        this.f360103d = rVar;
        this.f360104e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        h34.z.c(this.f360103d, this.f360104e, false);
    }
}
