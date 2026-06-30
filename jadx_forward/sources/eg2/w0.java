package eg2;

/* loaded from: classes3.dex */
public final class w0 extends eg2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334176a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String localPath) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        this.f334176a = localPath;
    }

    /* renamed from: equals */
    public boolean m127691xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg2.w0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334176a, ((eg2.w0) obj).f334176a);
    }

    /* renamed from: hashCode */
    public int m127692x8cdac1b() {
        return this.f334176a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127693x9616526c() {
        return "Success(localPath=" + this.f334176a + ')';
    }
}
