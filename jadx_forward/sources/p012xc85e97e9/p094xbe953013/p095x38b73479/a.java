package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes13.dex */
public final class a extends p012xc85e97e9.p094xbe953013.p095x38b73479.m implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f93206n = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: o, reason: collision with root package name */
    public boolean f93207o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p094xbe953013.p095x38b73479.b f93208p;

    public a(p012xc85e97e9.p094xbe953013.p095x38b73479.b bVar) {
        this.f93208p = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93207o = false;
        this.f93208p.m7829x182c7507();
    }
}
