package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class e2 extends by5.u0 implements rx5.b {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.b2 f301793f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.c2 f301794g;

    /* renamed from: h, reason: collision with root package name */
    public final rx5.c f301795h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f301796i = new java.lang.Object();

    /* renamed from: j, reason: collision with root package name */
    public boolean f301797j = false;

    public e2(boolean z17, com.p314xaae8f345.p3210x3857dc.b2 b2Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f301793f = b2Var;
        com.p314xaae8f345.p3210x3857dc.c2 c2Var = new com.p314xaae8f345.p3210x3857dc.c2();
        this.f301794g = c2Var;
        c2Var.f301756a = 0;
        c2Var.f301757b = 0;
        c2Var.f301758c = 2;
        c2Var.f301759d = str;
        c2Var.f301760e = str2;
        c2Var.f301765j = z17;
        c2Var.f301766k = i17;
        rx5.c cVar = new rx5.c();
        this.f301795h = cVar;
        cVar.f482884a = this;
    }

    @Override // rx5.b
    public void a(java.lang.String str, java.lang.String str2, boolean z17) {
        synchronized (this.f301796i) {
            this.f301794g.f301763h = z17;
            this.f301797j = false;
            this.f301796i.notify();
        }
    }

    @Override // rx5.b
    public void b(java.lang.String str, int i17, boolean z17) {
        synchronized (this.f301796i) {
            com.p314xaae8f345.p3210x3857dc.c2 c2Var = this.f301794g;
            c2Var.f301756a = 1;
            c2Var.f301757b = i17;
            c2Var.f301763h = z17;
            this.f301797j = false;
            this.f301796i.notify();
        }
    }

    @Override // rx5.b
    public void c(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p3210x3857dc.c2 c2Var = this.f301794g;
        if (c2Var.f301764i != j18) {
            c2Var.f301764i = j18;
        }
        j(java.lang.Integer.valueOf((int) j17), java.lang.Integer.valueOf((int) j18));
    }

    @Override // by5.u0
    public java.lang.Object d(java.lang.Object[] objArr) {
        int i17;
        com.p314xaae8f345.p3210x3857dc.b2 b2Var = this.f301793f;
        if (b2Var != null) {
            b2Var.a(this.f301794g.f301758c);
        }
        this.f301794g.f301761f = java.lang.System.currentTimeMillis();
        this.f301794g.f301762g = by5.y.a(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c);
        rx5.c cVar = this.f301795h;
        if (cVar != null) {
            if (rx5.c.f482883b != null) {
                com.p314xaae8f345.p3210x3857dc.c2 c2Var = this.f301794g;
                java.lang.String str = c2Var.f301759d;
                java.lang.String str2 = c2Var.f301760e;
                int i18 = c2Var.f301766k;
                cVar.getClass();
                rx5.a aVar = rx5.c.f482883b;
                if (aVar != null) {
                    pv1.c cVar2 = (pv1.c) aVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.FileDownloaderXWEBProxy", "addDownloadTask, url:%s, filepath:%s, bizType:%s", str, str2, java.lang.Integer.valueOf(i18));
                    dn.m mVar = new dn.m();
                    mVar.f323318d = "task_FileDownloaderXWEBProxy";
                    mVar.f69601xaca5bdda = str;
                    mVar.f69595x6d25b0d9 = str2;
                    mVar.f323344z = str;
                    mVar.f69592xf1ebe47b = 30004;
                    mVar.f323320f = cVar2.f440104b;
                    mVar.A = 60;
                    mVar.B = 600;
                    mVar.C = false;
                    pv1.b bVar = new pv1.b(cVar2, null);
                    bVar.f440100a = cVar;
                    bVar.f440101b = str2;
                    ((java.util.concurrent.ConcurrentHashMap) cVar2.f440103a).put(str, bVar);
                    i17 = hv1.d.f().b(mVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.FileDownloaderXWEBProxy", "addDownloadTask, result:" + i17);
                } else {
                    i17 = -1;
                }
                if (i17 != 0) {
                    com.p314xaae8f345.p3210x3857dc.c2 c2Var2 = this.f301794g;
                    c2Var2.f301756a = 1;
                    c2Var2.f301757b = -1;
                    return -1;
                }
                synchronized (this.f301796i) {
                    try {
                        this.f301797j = true;
                        this.f301796i.wait(600000L);
                    } catch (java.lang.InterruptedException e17) {
                        by5.c4.d("WXFileDownloaderTask", "download error", e17);
                        this.f301797j = false;
                        com.p314xaae8f345.p3210x3857dc.c2 c2Var3 = this.f301794g;
                        c2Var3.f301756a = 2;
                        c2Var3.f301757b = -101;
                    }
                    if (this.f301797j) {
                        com.p314xaae8f345.p3210x3857dc.c2 c2Var4 = this.f301794g;
                        c2Var4.f301756a = 1;
                        c2Var4.f301757b = -100;
                    }
                    com.p314xaae8f345.p3210x3857dc.c2 c2Var5 = this.f301794g;
                    if (c2Var5.f301756a == 0 && c2Var5.f301757b == 0) {
                        return 0;
                    }
                    by5.c4.c("WXFileDownloaderTask", "download errorType:" + this.f301794g.f301756a + ", errorcode:" + this.f301794g.f301757b + ", waitTimeout:" + this.f301797j);
                    return -1;
                }
            }
        }
        com.p314xaae8f345.p3210x3857dc.c2 c2Var6 = this.f301794g;
        c2Var6.f301756a = 2;
        c2Var6.f301757b = -1;
        return -1;
    }

    @Override // by5.u0
    public void f(java.lang.Object obj) {
        if (this.f301794g.f301765j) {
            com.p314xaae8f345.p3210x3857dc.f2.f301814a = null;
            by5.c4.f("WXFileDownloaderTask", "runtime onCancelled");
        } else {
            by5.c4.f("WXFileDownloaderTask", "plugin onCancelled");
        }
        com.p314xaae8f345.p3210x3857dc.b2 b2Var = this.f301793f;
        if (b2Var != null) {
            b2Var.e();
        }
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        com.p314xaae8f345.p3210x3857dc.f2.c(this.f301794g, this.f301793f, "WXFileDownloaderTask", (java.lang.Integer) obj);
    }

    @Override // by5.u0
    public void h() {
        com.p314xaae8f345.p3210x3857dc.f2.a("WXFileDownloaderTask", this.f301794g, this);
    }

    @Override // by5.u0
    public void i(java.lang.Object[] objArr) {
        com.p314xaae8f345.p3210x3857dc.f2.b(this.f301793f, (java.lang.Integer[]) objArr);
    }
}
