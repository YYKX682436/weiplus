package androidx.loader.content;

/* loaded from: classes13.dex */
public final class a extends androidx.loader.content.m implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f11673n = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: o, reason: collision with root package name */
    public boolean f11674o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.loader.content.b f11675p;

    public a(androidx.loader.content.b bVar) {
        this.f11675p = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11674o = false;
        this.f11675p.executePendingTask();
    }
}
