package xi;

/* loaded from: classes12.dex */
public final class f implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f536186a;

    public f(xi.k kVar, long j17) {
        this.f536186a = j17;
    }

    @Override // java.io.FileFilter
    public final boolean accept(java.io.File it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return this.f536186a - it.lastModified() > xi.k.f536190a;
    }
}
