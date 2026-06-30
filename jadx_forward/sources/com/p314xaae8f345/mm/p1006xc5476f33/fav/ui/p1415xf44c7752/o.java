package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class o implements o72.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f182553d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a f182554e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f182555f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f182556g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f182557h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f182558i;

    /* renamed from: m, reason: collision with root package name */
    public int f182559m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f182560n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f182561o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 f182562p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f182563q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f182564r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f182565s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f182566t;

    public o(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f182553d = activity;
        this.f182554e = delegate;
        this.f182555f = new java.util.ArrayList();
        this.f182556g = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        this.f182557h = new java.util.ArrayList();
        this.f182558i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f182564r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = this.f182562p;
        if (b1Var == null || e2Var == null) {
            return;
        }
        java.lang.String c17 = c(b1Var);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, e2Var.f67088x958756b0 + '_' + e2Var.f67085xf604e54a)) {
            int i17 = e2Var.f67093x10a0fed7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f182564r;
            java.util.Set set = this.f182556g;
            o72.r2 r2Var = b1Var.f182430a;
            if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Download success, favId: " + r2Var.f67643xc8a07680 + ", localId: " + e2Var.f67088x958756b0 + ", dataId: " + e2Var.f67085xf604e54a + ", now try to save to album");
                a();
                set.remove(c17);
                this.f182562p = null;
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.c(this, b1Var));
                return;
            }
            if (i17 != 4) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Download failed, favId: " + r2Var.f67643xc8a07680 + ", localId: " + e2Var.f67088x958756b0 + ", dataId: " + e2Var.f67085xf604e54a);
            a();
            set.remove(c17);
            this.f182562p = null;
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d(this, b1Var));
        }
    }

    public final void a() {
        java.lang.Runnable runnable = this.f182565s;
        if (runnable != null) {
            this.f182564r.mo50300x3fa464aa(runnable);
            this.f182565s = null;
        }
    }

    public final void b() {
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = this.f182562p;
        if (b1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Cleanup: stop current download, favId: ");
            o72.r2 r2Var = b1Var.f182430a;
            sb6.append(r2Var.f67643xc8a07680);
            sb6.append(", localId: ");
            sb6.append(r2Var.f67645x88be67a1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
            this.f182562p = null;
        }
        this.f182556g.clear();
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var) {
        o72.r2 r2Var = b1Var.f182430a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r2Var != null ? java.lang.Long.valueOf(r2Var.f67645x88be67a1) : null);
        sb6.append('_');
        r45.gp0 gp0Var = b1Var.f182431b;
        sb6.append(gp0Var != null ? gp0Var.T : null);
        return sb6.toString();
    }

    public final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var) {
        r45.gp0 gp0Var = b1Var.f182431b;
        if (gp0Var == null) {
            return false;
        }
        int i17 = gp0Var.I;
        return i17 == 4 || i17 == 15;
    }

    public final void e(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var) {
        if (z17) {
            this.f182558i.incrementAndGet();
        } else {
            ((java.util.ArrayList) this.f182557h).add(b1Var);
        }
        this.f182564r.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 r24) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o.f(com.tencent.mm.plugin.fav.ui.gallery.b1):void");
    }

    public final void g() {
        boolean z17 = this.f182561o;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f182558i;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f182564r;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Operation cancelled, saved: " + atomicInteger.get() + '/' + this.f182559m);
            this.f182560n = false;
            b();
            h();
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b(this));
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f(this, false));
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f182555f;
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) arrayList.remove(0);
            int size = this.f182559m - arrayList.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Progress: " + size + '/' + this.f182559m);
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.n(this, size));
            f(b1Var);
            return;
        }
        int i17 = this.f182559m - atomicInteger.get();
        if (i17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Completed with failures, saved: " + atomicInteger.get() + '/' + this.f182559m + ", failed: " + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] All items saved successfully, count: " + atomicInteger.get());
        }
        this.f182560n = false;
        b();
        h();
        n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b(this));
        n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f(this, true));
    }

    public final void h() {
        if (this.f182566t) {
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
                this.f182566t = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataBatchSaveLogic", "[unregisterCdnListener] CDN listener unregistered");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavDataBatchSaveLogic", "[unregisterCdnListener] Failed to unregister listener", e17);
            }
        }
    }
}
