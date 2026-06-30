package hd3;

/* loaded from: classes.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f362093e;

    public j(java.lang.String str, long j17) {
        this.f362092d = str;
        this.f362093e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e("heap snapshot path: " + this.f362092d);
        db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Heap snapshot saved! Path copied to clipboard, size=" + this.f362093e, 1).show();
    }
}
