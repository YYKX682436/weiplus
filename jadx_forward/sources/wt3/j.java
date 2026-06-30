package wt3;

/* loaded from: classes10.dex */
public final class j implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final im5.b f530960d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f530961e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f530962f;

    /* renamed from: g, reason: collision with root package name */
    public final dn.m f530963g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f530964h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f530965i;

    public j(im5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f530960d = bVar;
        this.f530961e = info;
        this.f530962f = "MicroMsg.AudioDownloadTask";
        this.f530965i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        java.lang.String str = info.f237248i + "_temp";
        java.lang.String str2 = info.f237248i;
        dw3.c0 c0Var = dw3.c0.f325715a;
        c0Var.g(str, true);
        if (str2 != null) {
            c0Var.g(str2, true);
        }
        java.lang.String str3 = "downaudio_" + info.f237244e;
        this.f530964h = str3;
        dn.m mVar = new dn.m();
        this.f530963g = mVar;
        mVar.f323318d = "task_AudioDownloadTask";
        mVar.A = 60;
        mVar.B = 60;
        mVar.f69601xaca5bdda = str3;
        mVar.f323344z = info.f237245f;
        mVar.f69592xf1ebe47b = 40001;
        mVar.f69595x6d25b0d9 = str;
        mVar.f69575xf11df5f5 = info.f237257u;
        mVar.f323320f = new wt3.i(this, str2, str);
    }

    public final void a(boolean z17, java.lang.String str) {
        java.util.List callbacks = this.f530965i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbacks, "callbacks");
        synchronized (callbacks) {
            java.util.Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                ((yz5.p) it.next()).mo149xb9724478(java.lang.Boolean.valueOf(z17), str);
            }
        }
        this.f530965i.clear();
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        wt3.c1 c1Var = wt3.c1.f530920b;
        wt3.c1.f530920b.f(this.f530961e);
    }
}
