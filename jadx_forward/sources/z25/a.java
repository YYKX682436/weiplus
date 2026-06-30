package z25;

/* loaded from: classes12.dex */
public class a extends z25.b implements z25.l {

    /* renamed from: q, reason: collision with root package name */
    public final int f551281q;

    /* renamed from: r, reason: collision with root package name */
    public final int f551282r;

    /* renamed from: s, reason: collision with root package name */
    public final z25.k f551283s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f551284t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f551285u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f551286v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f551287w;

    /* renamed from: x, reason: collision with root package name */
    public int f551288x;

    /* renamed from: y, reason: collision with root package name */
    public int f551289y;

    /* renamed from: z, reason: collision with root package name */
    public int f551290z = 0;

    public a(z25.k kVar) {
        this.f551283s = kVar;
        int i17 = 32768;
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ParallelUploadPartSize");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIFileUploader", "getFileSizeLimit nullOrNil");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIFileUploader", "getFileSizeLimit " + d17);
            }
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17, 32768);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CGIFileUploader", th6, "getFileSizeLimit", new java.lang.Object[0]);
        }
        this.f551282r = i17;
        this.f551281q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_cgi_upload_concurrent_max_android, 10);
        this.f551286v = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f551287w = java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    public void a(z25.i iVar, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CGIFileUploader", "upload section failure, index = %s, canRetry:%s, retCode:%s", java.lang.Integer.valueOf(iVar.f551351e.f551341b), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f551286v.remove(iVar);
        if (!z17) {
            c();
            z25.k kVar = this.f551283s;
            if (kVar != null) {
                ((z25.d) kVar).c(this, this.f551285u, i17);
                return;
            }
            return;
        }
        iVar.f551348b++;
        int i18 = iVar.f551351e.f551341b;
        java.util.List list = this.f551287w;
        if (i18 == 0) {
            list.add(0, iVar);
            e();
        } else if (i18 == this.f551288x - 1) {
            list.add(iVar);
            e();
        } else {
            list.add(0, iVar);
            d(this.f551289y);
        }
    }

    public void b() {
        if (this.f551284t) {
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f551291a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CGIFileUploader", "file %s not exist", this.f551291a);
            z25.k kVar = this.f551283s;
            if (kVar != null) {
                ((z25.d) kVar).c(this, this.f551285u, -30001);
                return;
            }
            return;
        }
        long j17 = this.f551292b;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            z25.g gVar = new z25.g();
            gVar.f551340a = this.f551291a;
            gVar.f551341b = i17;
            gVar.f551342c = i18;
            gVar.f551344e = this.f551306p;
            int i19 = this.f551282r;
            int i27 = i18 + i19;
            long j18 = i27;
            if (j18 > j17) {
                gVar.f551343d = (int) (j17 - i18);
            } else {
                gVar.f551343d = i19;
            }
            z25.i iVar = new z25.i();
            iVar.f551355i = this;
            iVar.f551351e = gVar;
            iVar.f551347a = i17;
            iVar.f551348b = 0;
            iVar.f551353g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_parallel_cgi_upload_retry_max_android, 3);
            if (i17 == 0) {
                this.f551302l = com.p314xaae8f345.mm.vfs.w6.p(this.f551291a);
                r45.z45 z45Var = new r45.z45();
                z45Var.f473231d = this.f551293c;
                z45Var.f473232e = this.f551294d;
                z45Var.f473233f = (int) this.f551292b;
                z45Var.f473234g = this.f551302l;
                z45Var.f473235h = i19;
                z45Var.f473236i = this.f551295e;
                z45Var.f473237m = this.f551296f;
                z45Var.f473239o = this.f551297g;
                z45Var.f473240p = this.f551298h;
                z45Var.f473241q = this.f551299i;
                z45Var.f473238n = null;
                z45Var.f473242r = this.f551300j;
                z45Var.f473243s = this.f551301k;
                z45Var.f473246v = this.f551305o;
                z45Var.f473245u = this.f551304n;
                if (this.f551303m) {
                    z45Var.f473244t = "HDVideo:1";
                }
                iVar.f551350d = z45Var;
            }
            java.util.List list = this.f551287w;
            list.add(iVar);
            i17++;
            if (j18 >= j17) {
                this.f551288x = list.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIFileUploader", "will start upload, file = %s, scene = %s, fileType = %s, sectionLen = %s, sectionCount = %s", this.f551291a, java.lang.Integer.valueOf(this.f551293c), java.lang.Integer.valueOf(this.f551294d), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(list.size()));
                this.f551284t = true;
                e();
                return;
            }
            i18 = i27;
        }
    }

    public void c() {
        this.f551284t = false;
        for (z25.i iVar : this.f551286v) {
            iVar.f551352f = false;
            iVar.f551354h = null;
        }
    }

    public final boolean d(int i17) {
        if (!this.f551284t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIFileUploader", "it means error has occurred, return.");
            return false;
        }
        while (true) {
            java.util.List list = this.f551286v;
            if (list.size() >= this.f551281q) {
                break;
            }
            java.util.List list2 = this.f551287w;
            if (list2.size() <= 1) {
                break;
            }
            if (i17 - 1 == this.f551290z) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CGIFileUploader", "The whole piece is uploaded, but the limit value is not updated [%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f551290z + 1));
                c();
                z25.k kVar = this.f551283s;
                if (kVar != null) {
                    ((z25.d) kVar).c(this, this.f551285u, -30004);
                }
                return false;
            }
            z25.i iVar = (z25.i) list2.get(0);
            if (iVar.f551347a > this.f551290z) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIFileUploader", "upload too fast, need to wait for the previous task to complete first");
                return true;
            }
            list2.remove(0);
            list.add(iVar);
            iVar.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIFileUploader", "start section idx = %s", java.lang.Integer.valueOf(iVar.f551351e.f551341b));
        }
        return true;
    }

    public final void e() {
        java.util.List list = this.f551287w;
        if (list.size() >= 1) {
            z25.i iVar = (z25.i) list.get(0);
            list.remove(0);
            this.f551286v.add(iVar);
            iVar.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CGIFileUploader", "no section to upload, file:%s", this.f551291a);
        z25.k kVar = this.f551283s;
        if (kVar != null) {
            ((z25.d) kVar).c(this, this.f551285u, -30003);
        }
    }
}
