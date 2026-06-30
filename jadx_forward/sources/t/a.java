package t;

/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f495789a;

    /* renamed from: b, reason: collision with root package name */
    public final long f495790b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f495791c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f495792d;

    public a(long j17, long j18, java.lang.String msgTalker, java.lang.String srcVideoFullPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcVideoFullPath, "srcVideoFullPath");
        this.f495789a = j17;
        this.f495790b = j18;
        this.f495791c = msgTalker;
        this.f495792d = srcVideoFullPath;
    }

    public final long a() {
        return this.f495790b;
    }

    public final long b() {
        return this.f495789a;
    }

    public final java.lang.String c() {
        return this.f495791c;
    }

    public final java.lang.String d() {
        return this.f495792d;
    }

    /* renamed from: equals */
    public boolean m165546xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        return this.f495789a == aVar.f495789a && this.f495790b == aVar.f495790b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f495791c, aVar.f495791c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f495792d, aVar.f495792d);
    }

    /* renamed from: hashCode */
    public int m165547x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f495789a) * 31) + java.lang.Long.hashCode(this.f495790b)) * 31) + this.f495791c.hashCode()) * 31) + this.f495792d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165548x9616526c() {
        return "ConvertToH265VideoInfo(msgLocalId=" + this.f495789a + ", createTime=" + this.f495790b + ", msgTalker=" + this.f495791c + ", srcVideoFullPath=" + this.f495792d + ')';
    }
}
