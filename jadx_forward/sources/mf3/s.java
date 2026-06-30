package mf3;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f407650a;

    /* renamed from: b, reason: collision with root package name */
    public final int f407651b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f407652c;

    public s(mf3.k data, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f407650a = data;
        this.f407651b = i17;
        this.f407652c = z17;
    }

    /* renamed from: equals */
    public boolean m147257xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf3.s)) {
            return false;
        }
        mf3.s sVar = (mf3.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407650a, sVar.f407650a) && this.f407651b == sVar.f407651b && this.f407652c == sVar.f407652c;
    }

    /* renamed from: hashCode */
    public int m147258x8cdac1b() {
        return (((this.f407650a.hashCode() * 31) + java.lang.Integer.hashCode(this.f407651b)) * 31) + java.lang.Boolean.hashCode(this.f407652c);
    }

    /* renamed from: toString */
    public java.lang.String m147259x9616526c() {
        return "MediaBindContext(data=" + this.f407650a + ", position=" + this.f407651b + ", anchored=" + this.f407652c + ')';
    }
}
