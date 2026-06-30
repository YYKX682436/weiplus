package w6;

/* loaded from: classes13.dex */
public class g implements w6.k, u6.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f524638d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.l f524639e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.j f524640f;

    /* renamed from: g, reason: collision with root package name */
    public int f524641g = -1;

    /* renamed from: h, reason: collision with root package name */
    public t6.h f524642h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f524643i;

    /* renamed from: m, reason: collision with root package name */
    public int f524644m;

    /* renamed from: n, reason: collision with root package name */
    public volatile a7.o0 f524645n;

    /* renamed from: o, reason: collision with root package name */
    public java.io.File f524646o;

    public g(java.util.List list, w6.l lVar, w6.j jVar) {
        this.f524638d = list;
        this.f524639e = lVar;
        this.f524640f = jVar;
    }

    @Override // w6.k
    public boolean a() {
        while (true) {
            java.util.List list = this.f524643i;
            if (list != null) {
                if (this.f524644m < list.size()) {
                    this.f524645n = null;
                    boolean z17 = false;
                    while (!z17) {
                        if (!(this.f524644m < this.f524643i.size())) {
                            break;
                        }
                        java.util.List list2 = this.f524643i;
                        int i17 = this.f524644m;
                        this.f524644m = i17 + 1;
                        a7.p0 p0Var = (a7.p0) list2.get(i17);
                        java.io.File file = this.f524646o;
                        w6.l lVar = this.f524639e;
                        this.f524645n = p0Var.b(file, lVar.f524670e, lVar.f524671f, lVar.f524674i);
                        if (this.f524645n != null) {
                            if (this.f524639e.c(this.f524645n.f83381c.a()) != null) {
                                this.f524645n.f83381c.e(this.f524639e.f524680o, this);
                                z17 = true;
                            }
                        }
                    }
                    return z17;
                }
            }
            int i18 = this.f524641g + 1;
            this.f524641g = i18;
            if (i18 >= this.f524638d.size()) {
                return false;
            }
            t6.h hVar = (t6.h) this.f524638d.get(this.f524641g);
            w6.l lVar2 = this.f524639e;
            java.io.File a17 = ((w6.e0) lVar2.f524673h).a().a(new w6.h(hVar, lVar2.f524679n));
            this.f524646o = a17;
            if (a17 != null) {
                this.f524642h = hVar;
                this.f524643i = this.f524639e.f524668c.f125479b.e(a17);
                this.f524644m = 0;
            }
        }
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        this.f524640f.b(this.f524642h, obj, this.f524645n.f83381c, t6.a.DATA_DISK_CACHE, this.f524642h);
    }

    @Override // w6.k
    /* renamed from: cancel */
    public void mo173234xae7a2e7a() {
        a7.o0 o0Var = this.f524645n;
        if (o0Var != null) {
            o0Var.f83381c.mo751xae7a2e7a();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        this.f524640f.j(this.f524642h, exc, this.f524645n.f83381c, t6.a.DATA_DISK_CACHE);
    }
}
