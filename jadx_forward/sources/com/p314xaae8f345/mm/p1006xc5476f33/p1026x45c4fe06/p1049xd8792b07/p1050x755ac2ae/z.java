package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f159512a;

    /* renamed from: b, reason: collision with root package name */
    public final int f159513b;

    public z(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f159512a = appId;
        this.f159513b = i17;
    }

    public final boolean a() {
        java.lang.String i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a();
        int i18 = this.f159513b;
        java.lang.String str = this.f159512a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s c17 = a17.c(str, i18);
        if (c17 != null && (i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) a17.f(c17)).i()) != null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.f.b(i17, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.x.f159506a);
            java.lang.Boolean valueOf = c10750x9556b48c != null ? java.lang.Boolean.valueOf(c10750x9556b48c.f149933d) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: equals */
    public boolean m50253xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f159512a, zVar.f159512a) && this.f159513b == zVar.f159513b;
    }

    /* renamed from: hashCode */
    public int m50254x8cdac1b() {
        return (this.f159512a.hashCode() * 31) + java.lang.Integer.hashCode(this.f159513b);
    }

    /* renamed from: toString */
    public java.lang.String m50255x9616526c() {
        return "WeApp(appId=" + this.f159512a + ", versionType=" + this.f159513b + ')';
    }
}
