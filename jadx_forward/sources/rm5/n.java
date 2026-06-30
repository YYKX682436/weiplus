package rm5;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f479062a;

    /* renamed from: b, reason: collision with root package name */
    public uq5.y f479063b;

    /* renamed from: c, reason: collision with root package name */
    public long f479064c;

    public n(java.lang.String path, uq5.y yVar, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        path = (i17 & 1) != 0 ? "" : path;
        yVar = (i17 & 2) != 0 ? null : yVar;
        j17 = (i17 & 4) != 0 ? 1000L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f479062a = path;
        this.f479063b = yVar;
        this.f479064c = j17;
    }

    public final boolean a() {
        return this.f479062a.length() > 0;
    }
}
