package ha3;

/* loaded from: classes15.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f361447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f361450g;

    public p(ha3.v vVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f361447d = vVar;
        this.f361448e = str;
        this.f361449f = str2;
        this.f361450g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361447d.f361484m;
        if (eventSink != null) {
            eventSink.mo138417x5c4d208(this.f361448e, this.f361449f, this.f361450g);
        }
    }
}
