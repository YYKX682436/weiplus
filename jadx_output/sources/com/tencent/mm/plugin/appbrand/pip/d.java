package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f87439a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f87440b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87441c;

    /* renamed from: d, reason: collision with root package name */
    public pd1.m f87442d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f87443e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f87444f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f87445g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f87446h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f87447i;

    public d(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        java.lang.String str = "MicroMsg.AppBrand.AppBrandPageScopedPipInfo#" + hashCode();
        this.f87439a = str;
        this.f87442d = null;
        this.f87443e = new boolean[0];
        this.f87444f = new java.util.LinkedList();
        this.f87445g = new java.util.LinkedList();
        this.f87446h = new java.util.LinkedList();
        this.f87447i = new java.util.concurrent.ConcurrentHashMap();
        this.f87440b = v5Var;
        this.f87441c = v5Var.l2();
        com.tencent.mars.xlog.Log.i(str, "mIsCurPageForeground: " + this.f87441c);
        v5Var.U(new com.tencent.mm.plugin.appbrand.pip.a(this));
        v5Var.R(new com.tencent.mm.plugin.appbrand.pip.b(this));
    }

    public void a(pd1.n nVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f87439a, "addPipRelatedKey, type: %s, key: %s", nVar, str);
        synchronized (this.f87443e) {
            int ordinal = nVar.ordinal();
            if (ordinal == 0) {
                this.f87444f.remove(str);
                this.f87444f.addFirst(str);
            } else if (ordinal == 1) {
                this.f87445g.remove(str);
                this.f87445g.addFirst(str);
            } else if (ordinal == 2) {
                this.f87446h.remove(str);
                this.f87446h.addFirst(str);
            }
        }
    }

    public java.lang.String b() {
        synchronized (this.f87443e) {
            if (!this.f87445g.isEmpty()) {
                return (java.lang.String) this.f87445g.getFirst();
            }
            if (!this.f87446h.isEmpty()) {
                return (java.lang.String) this.f87446h.getFirst();
            }
            if (this.f87444f.isEmpty()) {
                return null;
            }
            return (java.lang.String) this.f87444f.getFirst();
        }
    }

    public void c(pd1.n nVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f87439a, "removePipRelatedKey, type: %s, key: %s", nVar, str);
        synchronized (this.f87443e) {
            int ordinal = nVar.ordinal();
            if (ordinal == 0) {
                this.f87444f.remove(str);
            } else if (ordinal == 1) {
                this.f87445g.remove(str);
            } else if (ordinal == 2) {
                this.f87446h.remove(str);
            }
        }
    }
}
