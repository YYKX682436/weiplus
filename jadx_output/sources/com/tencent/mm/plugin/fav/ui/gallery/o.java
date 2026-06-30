package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class o implements o72.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f101020d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.gallery.a f101021e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f101022f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f101023g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f101024h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f101025i;

    /* renamed from: m, reason: collision with root package name */
    public int f101026m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f101027n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f101028o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.b1 f101029p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f101030q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f101031r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f101032s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f101033t;

    public o(android.app.Activity activity, com.tencent.mm.plugin.fav.ui.gallery.a delegate) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f101020d = activity;
        this.f101021e = delegate;
        this.f101022f = new java.util.ArrayList();
        this.f101023g = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        this.f101024h = new java.util.ArrayList();
        this.f101025i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f101031r = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = this.f101029p;
        if (b1Var == null || e2Var == null) {
            return;
        }
        java.lang.String c17 = c(b1Var);
        if (kotlin.jvm.internal.o.b(c17, e2Var.field_favLocalId + '_' + e2Var.field_dataId)) {
            int i17 = e2Var.field_status;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f101031r;
            java.util.Set set = this.f101023g;
            o72.r2 r2Var = b1Var.f100897a;
            if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Download success, favId: " + r2Var.field_id + ", localId: " + e2Var.field_favLocalId + ", dataId: " + e2Var.field_dataId + ", now try to save to album");
                a();
                set.remove(c17);
                this.f101029p = null;
                n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.c(this, b1Var));
                return;
            }
            if (i17 != 4) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Download failed, favId: " + r2Var.field_id + ", localId: " + e2Var.field_favLocalId + ", dataId: " + e2Var.field_dataId);
            a();
            set.remove(c17);
            this.f101029p = null;
            n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.d(this, b1Var));
        }
    }

    public final void a() {
        java.lang.Runnable runnable = this.f101032s;
        if (runnable != null) {
            this.f101031r.removeCallbacks(runnable);
            this.f101032s = null;
        }
    }

    public final void b() {
        a();
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = this.f101029p;
        if (b1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Cleanup: stop current download, favId: ");
            o72.r2 r2Var = b1Var.f100897a;
            sb6.append(r2Var.field_id);
            sb6.append(", localId: ");
            sb6.append(r2Var.field_localId);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
            this.f101029p = null;
        }
        this.f101023g.clear();
    }

    public final java.lang.String c(com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        o72.r2 r2Var = b1Var.f100897a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r2Var != null ? java.lang.Long.valueOf(r2Var.field_localId) : null);
        sb6.append('_');
        r45.gp0 gp0Var = b1Var.f100898b;
        sb6.append(gp0Var != null ? gp0Var.T : null);
        return sb6.toString();
    }

    public final boolean d(com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        r45.gp0 gp0Var = b1Var.f100898b;
        if (gp0Var == null) {
            return false;
        }
        int i17 = gp0Var.I;
        return i17 == 4 || i17 == 15;
    }

    public final void e(boolean z17, com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        if (z17) {
            this.f101025i.incrementAndGet();
        } else {
            ((java.util.ArrayList) this.f101024h).add(b1Var);
        }
        this.f101031r.post(new com.tencent.mm.plugin.fav.ui.gallery.g(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.tencent.mm.plugin.fav.ui.gallery.b1 r24) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.gallery.o.f(com.tencent.mm.plugin.fav.ui.gallery.b1):void");
    }

    public final void g() {
        boolean z17 = this.f101028o;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f101025i;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f101031r;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Operation cancelled, saved: " + atomicInteger.get() + '/' + this.f101026m);
            this.f101027n = false;
            b();
            h();
            n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.b(this));
            n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.f(this, false));
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f101022f;
        if (!arrayList.isEmpty()) {
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) arrayList.remove(0);
            int size = this.f101026m - arrayList.size();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Progress: " + size + '/' + this.f101026m);
            n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.n(this, size));
            f(b1Var);
            return;
        }
        int i17 = this.f101026m - atomicInteger.get();
        if (i17 > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] Completed with failures, saved: " + atomicInteger.get() + '/' + this.f101026m + ", failed: " + i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[BatchSave] All items saved successfully, count: " + atomicInteger.get());
        }
        this.f101027n = false;
        b();
        h();
        n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.b(this));
        n3Var.post(new com.tencent.mm.plugin.fav.ui.gallery.f(this, true));
    }

    public final void h() {
        if (this.f101033t) {
            try {
                ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
                this.f101033t = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", "[unregisterCdnListener] CDN listener unregistered");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavDataBatchSaveLogic", "[unregisterCdnListener] Failed to unregister listener", e17);
            }
        }
    }
}
