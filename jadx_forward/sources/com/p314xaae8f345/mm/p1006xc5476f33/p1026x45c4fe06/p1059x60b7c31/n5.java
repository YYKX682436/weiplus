package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class n5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163906e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f163907f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f163908g;

    /* renamed from: h, reason: collision with root package name */
    public int f163909h;

    public final void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        if (c0Var == this.f163906e.mo50357xcd94f799()) {
            this.f163906e.e(k(), o(), this.f163909h);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.a(c0Var, k(), o(), this.f163909h, 0);
        }
    }

    public void m() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163906e;
        if (lVar == null || !lVar.mo50262x39e05d35()) {
            return;
        }
        n(this.f163906e.mo50357xcd94f799());
    }

    public void n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163906e;
        if (lVar == null) {
            return;
        }
        if (c0Var == null) {
            c0Var = lVar.mo50357xcd94f799();
        }
        if (this.f163906e.c(k(), c0Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k mo50355x4b454cef = this.f163906e.mo50355x4b454cef();
            if (mo50355x4b454cef == null) {
                l(c0Var);
            } else {
                mo50355x4b454cef.b(this, c0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m5(this, c0Var));
            }
        }
    }

    public java.lang.String o() {
        java.lang.String str = this.f163907f;
        if (str != null) {
            return str;
        }
        java.util.Map map = this.f163908g;
        if (map == null) {
            return null;
        }
        nf.f.c(map);
        return new org.json.JSONObject(this.f163908g).toString();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (lVar == null) {
            return this;
        }
        this.f163906e = lVar;
        this.f163909h = 0;
        return this;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        p(lVar);
        this.f163909h = i17;
        return this;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 r(java.lang.String str) {
        this.f163907f = str;
        return this;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 s(java.lang.String str, java.lang.Object obj) {
        if (this.f163908g == null) {
            this.f163908g = new java.util.HashMap();
        }
        this.f163908g.put(str, obj);
        return this;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 t(java.util.Map map) {
        if (map == null) {
            return this;
        }
        nf.f.c(map);
        this.f163908g = map;
        return this;
    }
}
