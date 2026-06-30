package ze3;

/* loaded from: classes12.dex */
public final class b implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final rh3.p f553313a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f553314b;

    /* renamed from: c, reason: collision with root package name */
    public long f553315c;

    /* renamed from: d, reason: collision with root package name */
    public long f553316d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f553317e;

    public b(rh3.p onePlayContext, java.lang.String mediaId, java.lang.String localPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        this.f553313a = onePlayContext;
        this.f553314b = localPath;
    }

    @Override // qh3.a
    public boolean a() {
        long j17 = this.f553315c;
        if (j17 > 0) {
            long j18 = this.f553316d;
            if (j18 > 0 && j18 == j17) {
                return true;
            }
        }
        return false;
    }

    @Override // qh3.a
    public long b() {
        return this.f553316d;
    }

    @Override // qh3.a
    public long c() {
        return this.f553315c;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((rh3.q) this.f553313a).f("MemoryCache"), "updateFileFormat:".concat(fileFormat));
    }

    @Override // qh3.a
    public boolean e() {
        return this.f553317e;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((rh3.q) this.f553313a).f("MemoryCache"), "markStateError:" + i17);
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        this.f553315c = j18;
        this.f553316d = j17;
    }

    @Override // qh3.a
    /* renamed from: getFilePath */
    public java.lang.String mo53277x5000ed37() {
        return this.f553314b;
    }

    @Override // qh3.a
    public void h() {
        this.f553317e = true;
    }
}
