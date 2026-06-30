package vp5;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f520635a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f520636b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f520637c;

    /* renamed from: d, reason: collision with root package name */
    public final long f520638d;

    public e(boolean z17, java.lang.String prefix, java.lang.String rootPath, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootPath, "rootPath");
        this.f520635a = z17;
        this.f520636b = prefix;
        this.f520637c = rootPath;
        this.f520638d = j17;
    }

    /* renamed from: equals */
    public boolean m172455xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.e)) {
            return false;
        }
        vp5.e eVar = (vp5.e) obj;
        return this.f520635a == eVar.f520635a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520636b, eVar.f520636b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520637c, eVar.f520637c) && this.f520638d == eVar.f520638d;
    }

    /* renamed from: hashCode */
    public int m172456x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f520635a) * 31) + this.f520636b.hashCode()) * 31) + this.f520637c.hashCode()) * 31) + java.lang.Long.hashCode(this.f520638d);
    }

    /* renamed from: toString */
    public java.lang.String m172457x9616526c() {
        return "FsData(flattenFs=" + this.f520635a + ", prefix=" + this.f520636b + ", rootPath=" + this.f520637c + ", quotaSize=" + this.f520638d + ")";
    }
}
