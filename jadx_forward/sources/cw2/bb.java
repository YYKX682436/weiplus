package cw2;

/* loaded from: classes2.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public final long f305139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f305140b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f305141c;

    public bb(long j17, int i17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f305139a = j17;
        this.f305140b = i17;
        this.f305141c = source;
    }

    /* renamed from: equals */
    public boolean m122854xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.bb)) {
            return false;
        }
        cw2.bb bbVar = (cw2.bb) obj;
        return this.f305139a == bbVar.f305139a && this.f305140b == bbVar.f305140b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305141c, bbVar.f305141c);
    }

    /* renamed from: hashCode */
    public int m122855x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f305139a) * 31) + java.lang.Integer.hashCode(this.f305140b)) * 31) + this.f305141c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m122856x9616526c() {
        return "SeekParams(seekTimeMs=" + this.f305139a + ", seekMode=" + this.f305140b + ", source=" + this.f305141c + ')';
    }

    public /* synthetic */ bb(long j17, int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, (i18 & 2) != 0 ? 1 : i17, (i18 & 4) != 0 ? "Default" : str);
    }
}
