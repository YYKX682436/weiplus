package zc5;

/* loaded from: classes12.dex */
public final class d extends zc5.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552975a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String localPath) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        this.f552975a = localPath;
    }

    @Override // zc5.f
    public java.lang.String a() {
        return this.f552975a;
    }

    /* renamed from: equals */
    public boolean m178687xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc5.d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552975a, ((zc5.d) obj).f552975a);
    }

    /* renamed from: hashCode */
    public int m178688x8cdac1b() {
        return this.f552975a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m178689x9616526c() {
        return "Success(localPath=" + this.f552975a + ')';
    }
}
