package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes12.dex */
public final class c implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final rh3.p f172404a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f172405b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f172406c;

    /* renamed from: d, reason: collision with root package name */
    public long f172407d;

    /* renamed from: e, reason: collision with root package name */
    public long f172408e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f172409f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f172410g;

    /* renamed from: h, reason: collision with root package name */
    public int f172411h;

    public c(rh3.p onePlayContext, java.lang.String mediaId, java.lang.String localPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        this.f172404a = onePlayContext;
        this.f172405b = mediaId;
        this.f172406c = localPath;
        this.f172410g = "";
    }

    @Override // qh3.a
    public boolean a() {
        long j17 = this.f172407d;
        if (j17 > 0) {
            long j18 = this.f172408e;
            if (j18 > 0 && j18 == j17) {
                return true;
            }
        }
        return false;
    }

    @Override // qh3.a
    public long b() {
        return this.f172408e;
    }

    @Override // qh3.a
    public long c() {
        return this.f172407d;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        this.f172410g = fileFormat;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((rh3.q) this.f172404a).f("MemoryCache"), "updateFileFormat:".concat(fileFormat));
    }

    @Override // qh3.a
    public boolean e() {
        return this.f172409f;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((rh3.q) this.f172404a).f("MemoryCache"), "markStateError:" + i17);
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        this.f172407d = j18;
        this.f172408e = j17;
        this.f172411h = i17;
    }

    @Override // qh3.a
    /* renamed from: getFilePath */
    public java.lang.String mo53277x5000ed37() {
        return this.f172406c;
    }

    @Override // qh3.a
    public void h() {
        this.f172409f = true;
    }
}
