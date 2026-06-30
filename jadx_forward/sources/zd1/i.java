package zd1;

/* loaded from: classes7.dex */
public final class i extends zd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f553066a;

    /* renamed from: b, reason: collision with root package name */
    public final int f553067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f553068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.nio.ByteBuffer buffer, int i17, int i18) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.f553066a = buffer;
        this.f553067b = i17;
        this.f553068c = i18;
    }

    /* renamed from: equals */
    public boolean m178717xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.i)) {
            return false;
        }
        zd1.i iVar = (zd1.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f553066a, iVar.f553066a) && this.f553067b == iVar.f553067b && this.f553068c == iVar.f553068c;
    }

    /* renamed from: hashCode */
    public int m178718x8cdac1b() {
        return (((this.f553066a.hashCode() * 31) + java.lang.Integer.hashCode(this.f553067b)) * 31) + java.lang.Integer.hashCode(this.f553068c);
    }

    /* renamed from: toString */
    public java.lang.String m178719x9616526c() {
        return "ShapedBuffer(buffer=" + this.f553066a + ", width=" + this.f553067b + ", height=" + this.f553068c + ')';
    }
}
