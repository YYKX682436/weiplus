package rw2;

/* loaded from: classes10.dex */
public final class k extends kp4.a {

    /* renamed from: n, reason: collision with root package name */
    public final dk4.a f482147n;

    public k(dk4.a mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        this.f482147n = mediaInfo;
        this.f392607d = 0L;
        long j17 = mediaInfo.f316003g;
        this.f392608e = j17;
        this.f392609f = ((float) (j17 - 0)) / 1000.0f;
    }

    @Override // kp4.a
    public long a() {
        dk4.a aVar = this.f482147n;
        return aVar.f316010n + aVar.f316011o;
    }

    @Override // kp4.a
    public float b() {
        return 1.0f;
    }

    @Override // kp4.a
    public long c() {
        return this.f482147n.f316010n;
    }

    @Override // kp4.a
    public long d() {
        return this.f482147n.f316003g;
    }

    @Override // kp4.a
    public boolean e() {
        java.lang.String path = this.f482147n.f316016t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
        return path.length() == 0;
    }
}
