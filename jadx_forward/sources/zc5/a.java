package zc5;

/* loaded from: classes12.dex */
public final class a extends zc5.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552972a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String localPath) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        this.f552972a = localPath;
    }

    @Override // zc5.f
    public java.lang.String a() {
        return this.f552972a;
    }

    /* renamed from: equals */
    public boolean m178677xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc5.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552972a, ((zc5.a) obj).f552972a);
    }

    /* renamed from: hashCode */
    public int m178678x8cdac1b() {
        return this.f552972a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m178679x9616526c() {
        return "AlreadyExists(localPath=" + this.f552972a + ')';
    }
}
