package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f161825a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f161826b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f161827c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161828d;

    /* renamed from: e, reason: collision with root package name */
    public final long f161829e;

    public c0(boolean z17, java.lang.String path, java.lang.String fileId, java.lang.String aesKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        this.f161825a = z17;
        this.f161826b = path;
        this.f161827c = fileId;
        this.f161828d = aesKey;
        this.f161829e = j17;
    }

    /* renamed from: equals */
    public boolean m50805xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0) obj;
        return this.f161825a == c0Var.f161825a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161826b, c0Var.f161826b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161827c, c0Var.f161827c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161828d, c0Var.f161828d) && this.f161829e == c0Var.f161829e;
    }

    /* renamed from: hashCode */
    public int m50806x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f161825a) * 31) + this.f161826b.hashCode()) * 31) + this.f161827c.hashCode()) * 31) + this.f161828d.hashCode()) * 31) + java.lang.Long.hashCode(this.f161829e);
    }

    /* renamed from: toString */
    public java.lang.String m50807x9616526c() {
        return "UploadPageContentResult(isSuccess=" + this.f161825a + ", path=" + this.f161826b + ", fileId=" + this.f161827c + ", aesKey=" + this.f161828d + ", timestamp=" + this.f161829e + ')';
    }

    public /* synthetic */ c0(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) == 0 ? str3 : "", (i17 & 16) != 0 ? 0L : j17);
    }
}
