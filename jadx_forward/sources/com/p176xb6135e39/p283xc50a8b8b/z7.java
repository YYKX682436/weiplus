package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class z7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.z8 f127336d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f127337e;

    public z7(com.p176xb6135e39.p283xc50a8b8b.z8 z8Var, java.util.Iterator it) {
        this.f127336d = z8Var;
        this.f127337e = it;
    }

    /* renamed from: equals */
    public boolean m20978xb2c87fbf(java.lang.Object obj) {
        return this.f127337e.equals(obj);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f127337e.hasNext();
    }

    /* renamed from: hashCode */
    public int m20979x8cdac1b() {
        return this.f127337e.hashCode();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return this.f127337e.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) this.f127336d).c();
        this.f127337e.remove();
    }

    /* renamed from: toString */
    public java.lang.String m20980x9616526c() {
        return this.f127337e.toString();
    }
}
