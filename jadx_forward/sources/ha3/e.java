package ha3;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f361362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f361365g;

    public e(ha3.g gVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f361362d = gVar;
        this.f361363e = str;
        this.f361364f = str2;
        this.f361365g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361362d.f361394l;
        if (eventSink != null) {
            eventSink.mo138417x5c4d208(this.f361363e, this.f361364f, this.f361365g);
        }
    }
}
