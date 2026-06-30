package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes12.dex */
public final class c implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final rh3.p f90871a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f90872b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f90873c;

    /* renamed from: d, reason: collision with root package name */
    public long f90874d;

    /* renamed from: e, reason: collision with root package name */
    public long f90875e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90876f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f90877g;

    /* renamed from: h, reason: collision with root package name */
    public int f90878h;

    public c(rh3.p onePlayContext, java.lang.String mediaId, java.lang.String localPath) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(localPath, "localPath");
        this.f90871a = onePlayContext;
        this.f90872b = mediaId;
        this.f90873c = localPath;
        this.f90877g = "";
    }

    @Override // qh3.a
    public boolean a() {
        long j17 = this.f90874d;
        if (j17 > 0) {
            long j18 = this.f90875e;
            if (j18 > 0 && j18 == j17) {
                return true;
            }
        }
        return false;
    }

    @Override // qh3.a
    public long b() {
        return this.f90875e;
    }

    @Override // qh3.a
    public long c() {
        return this.f90874d;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        this.f90877g = fileFormat;
        com.tencent.mars.xlog.Log.i(((rh3.q) this.f90871a).f("MemoryCache"), "updateFileFormat:".concat(fileFormat));
    }

    @Override // qh3.a
    public boolean e() {
        return this.f90876f;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.tencent.mars.xlog.Log.i(((rh3.q) this.f90871a).f("MemoryCache"), "markStateError:" + i17);
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        this.f90874d = j18;
        this.f90875e = j17;
        this.f90878h = i17;
    }

    @Override // qh3.a
    public java.lang.String getFilePath() {
        return this.f90873c;
    }

    @Override // qh3.a
    public void h() {
        this.f90876f = true;
    }
}
