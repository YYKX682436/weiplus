package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f166423a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166424b;

    public p5(long j17, java.lang.String versionDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionDesc, "versionDesc");
        this.f166423a = j17;
        this.f166424b = versionDesc;
    }

    /* renamed from: equals */
    public boolean m51774xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p5 p5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p5) obj;
        return this.f166423a == p5Var.f166423a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166424b, p5Var.f166424b);
    }

    /* renamed from: hashCode */
    public int m51775x8cdac1b() {
        return (java.lang.Long.hashCode(this.f166423a) * 31) + this.f166424b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51776x9616526c() {
        return "ForcedPluginInfo(devUin=" + this.f166423a + ", versionDesc=" + this.f166424b + ')';
    }
}
