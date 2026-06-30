package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f234701a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f234702b = new java.util.LinkedList();

    public z0(java.lang.String str) {
        this.f234701a = str;
    }

    public int a() {
        return ((java.util.LinkedList) this.f234702b).size();
    }

    public boolean b() {
        java.util.List list = this.f234702b;
        if (((java.util.LinkedList) list).size() > 0) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a1) ((java.util.LinkedList) list).get(0)).f234539c;
        }
        return false;
    }

    /* renamed from: equals */
    public boolean m67592xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a1) {
            return this.f234701a.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a1) obj).f234537a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m67593x8cdac1b() {
        return this.f234701a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m67594x9616526c() {
        return this.f234701a + "=" + a();
    }
}
