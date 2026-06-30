package ha3;

/* loaded from: classes15.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f361332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f361335g;

    public b0(ha3.d0 d0Var, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f361332d = d0Var;
        this.f361333e = str;
        this.f361334f = str2;
        this.f361335g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361332d.f361354k;
        if (eventSink != null) {
            eventSink.mo138417x5c4d208(this.f361333e, this.f361334f, this.f361335g);
        }
    }
}
