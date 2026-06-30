package zx5;

/* loaded from: classes13.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f558781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f558782e;

    public k0(android.content.Context context, java.util.HashMap hashMap) {
        this.f558781d = context;
        this.f558782e = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx5.n0.b(this.f558781d, this.f558782e);
    }
}
