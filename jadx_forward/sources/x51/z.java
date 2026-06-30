package x51;

/* loaded from: classes5.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533648e;

    public z(android.content.Context context, java.lang.String str) {
        this.f533647d = context;
        this.f533648e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.m125854x26a183b(this.f533647d, this.f533648e, 1).show();
    }
}
