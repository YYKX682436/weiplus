package pr4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f439569a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f439570b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f439571c;

    public m(android.app.Activity context, byte[] buff, yz5.l completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        this.f439569a = context;
        this.f439570b = buff;
        this.f439571c = completion;
    }

    /* renamed from: equals */
    public boolean m158914xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr4.m)) {
            return false;
        }
        pr4.m mVar = (pr4.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439569a, mVar.f439569a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439570b, mVar.f439570b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439571c, mVar.f439571c);
    }

    /* renamed from: hashCode */
    public int m158915x8cdac1b() {
        return (((this.f439569a.hashCode() * 31) + java.util.Arrays.hashCode(this.f439570b)) * 31) + this.f439571c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158916x9616526c() {
        return "WeCoinSubscribeParameter(context=" + this.f439569a + ", buff=" + java.util.Arrays.toString(this.f439570b) + ", completion=" + this.f439571c + ')';
    }
}
