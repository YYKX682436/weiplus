package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f168972a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168973b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f168974c;

    /* renamed from: d, reason: collision with root package name */
    public pd1.m f168975d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f168976e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f168977f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f168978g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f168979h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f168980i;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        java.lang.String str = "MicroMsg.AppBrand.AppBrandPageScopedPipInfo#" + hashCode();
        this.f168972a = str;
        this.f168975d = null;
        this.f168976e = new boolean[0];
        this.f168977f = new java.util.LinkedList();
        this.f168978g = new java.util.LinkedList();
        this.f168979h = new java.util.LinkedList();
        this.f168980i = new java.util.concurrent.ConcurrentHashMap();
        this.f168973b = v5Var;
        this.f168974c = v5Var.l2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mIsCurPageForeground: " + this.f168974c);
        v5Var.U(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.a(this));
        v5Var.R(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.b(this));
    }

    public void a(pd1.n nVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168972a, "addPipRelatedKey, type: %s, key: %s", nVar, str);
        synchronized (this.f168976e) {
            int ordinal = nVar.ordinal();
            if (ordinal == 0) {
                this.f168977f.remove(str);
                this.f168977f.addFirst(str);
            } else if (ordinal == 1) {
                this.f168978g.remove(str);
                this.f168978g.addFirst(str);
            } else if (ordinal == 2) {
                this.f168979h.remove(str);
                this.f168979h.addFirst(str);
            }
        }
    }

    public java.lang.String b() {
        synchronized (this.f168976e) {
            if (!this.f168978g.isEmpty()) {
                return (java.lang.String) this.f168978g.getFirst();
            }
            if (!this.f168979h.isEmpty()) {
                return (java.lang.String) this.f168979h.getFirst();
            }
            if (this.f168977f.isEmpty()) {
                return null;
            }
            return (java.lang.String) this.f168977f.getFirst();
        }
    }

    public void c(pd1.n nVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168972a, "removePipRelatedKey, type: %s, key: %s", nVar, str);
        synchronized (this.f168976e) {
            int ordinal = nVar.ordinal();
            if (ordinal == 0) {
                this.f168977f.remove(str);
            } else if (ordinal == 1) {
                this.f168978g.remove(str);
            } else if (ordinal == 2) {
                this.f168979h.remove(str);
            }
        }
    }
}
