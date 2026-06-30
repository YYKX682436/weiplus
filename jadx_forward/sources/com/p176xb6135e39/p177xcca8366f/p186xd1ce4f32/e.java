package com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32;

/* loaded from: classes15.dex */
public class e implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public int f125783d;

    /* renamed from: e, reason: collision with root package name */
    public int f125784e;

    public e(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.c cVar) {
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e eVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e) obj;
        int i17 = this.f125784e;
        int i18 = eVar.f125784e;
        return i17 != i18 ? i17 - i18 : this.f125783d - eVar.f125783d;
    }

    /* renamed from: toString */
    public java.lang.String m17258x9616526c() {
        return "Order{order=" + this.f125784e + ", index=" + this.f125783d + '}';
    }
}
