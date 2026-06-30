package mz4;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414858e;

    public p(mz4.s sVar, android.content.Context context, java.lang.String str) {
        this.f414857d = context;
        this.f414858e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.m125854x26a183b(this.f414857d, this.f414858e, 0).show();
    }
}
