package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f158540a;

    /* renamed from: b, reason: collision with root package name */
    public int f158541b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f158542c;

    public bd(java.lang.String appId, int i17, java.util.ArrayList files) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(files, "files");
        this.f158540a = appId;
        this.f158541b = i17;
        this.f158542c = files;
    }

    /* renamed from: equals */
    public boolean m49996xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd bdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158540a, bdVar.f158540a) && this.f158541b == bdVar.f158541b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158542c, bdVar.f158542c);
    }

    /* renamed from: hashCode */
    public int m49997x8cdac1b() {
        return (((this.f158540a.hashCode() * 31) + java.lang.Integer.hashCode(this.f158541b)) * 31) + this.f158542c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m49998x9616526c() {
        return "PkgStorageInfo(appId=" + this.f158540a + ", storageUsage=" + this.f158541b + ", files=" + this.f158542c + ')';
    }
}
