package com.p176xb6135e39.p271xde6bf207.p275xe5548316;

/* renamed from: com.google.firebase.components.Dependency */
/* loaded from: classes13.dex */
public final class C2739x7540af6b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f126178a;

    public C2739x7540af6b(java.lang.Class cls, int i17, int i18) {
        if (cls == null) {
            throw new java.lang.NullPointerException("Null dependency interface.");
        }
        this.f126178a = cls;
    }

    /* renamed from: required */
    public static com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b m20457xe8912b9f(java.lang.Class<?> cls) {
        return new com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b(cls, 1, 0);
    }

    /* renamed from: equals */
    public final boolean m20458xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b) {
            return this.f126178a == ((com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b) obj).f126178a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m20459x8cdac1b() {
        return ((((this.f126178a.hashCode() ^ 1000003) * 1000003) ^ 1) * 1000003) ^ 0;
    }

    /* renamed from: toString */
    public final java.lang.String m20460x9616526c() {
        return "Dependency{interface=" + this.f126178a + ", required=true, direct=true}";
    }
}
