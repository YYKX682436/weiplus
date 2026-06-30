package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes5.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f157479a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f157480b;

    public r6(java.lang.Object obj, int[] versionArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionArray, "versionArray");
        this.f157479a = obj;
        this.f157480b = versionArray;
    }

    /* renamed from: equals */
    public boolean m49525xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r6.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.SEMVER.matchHighestVersion.SortUnit<T of com.tencent.mm.plugin.appbrand.appcache.SEMVER.matchHighestVersion>");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157479a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r6) obj).f157479a);
    }

    /* renamed from: hashCode */
    public int m49526x8cdac1b() {
        java.lang.Object obj = this.f157479a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m49527x9616526c() {
        return "SortUnit(item=" + this.f157479a + ", versionArray=" + java.util.Arrays.toString(this.f157480b) + ')';
    }
}
