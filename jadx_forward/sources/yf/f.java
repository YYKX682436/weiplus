package yf;

/* loaded from: classes11.dex */
public final class f implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f542875a;

    /* renamed from: b, reason: collision with root package name */
    public final yf.b f542876b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f542877c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f542878d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f542879e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f542880f;

    public f(float f17, yf.b blendMode, java.lang.String path, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blendMode, "blendMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f542875a = f17;
        this.f542876b = blendMode;
        this.f542877c = path;
        this.f542878d = str;
        this.f542879e = str2;
        this.f542880f = str3;
        if (str2 == null || str2.length() == 0) {
            yf.e[] eVarArr = yf.e.f542869d;
        } else {
            yf.e[] eVarArr2 = yf.e.f542869d;
        }
    }

    @Override // yf.k
    public java.lang.String a() {
        return "EyeShadowInfoV1(path='" + this.f542877c + "', pathMd5='" + this.f542878d + "', shimmerPosPath=" + this.f542879e + ", shimmerPosPathMd5='" + this.f542880f + "')";
    }

    /* renamed from: equals */
    public boolean m176929xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.f)) {
            return false;
        }
        yf.f fVar = (yf.f) obj;
        return java.lang.Float.compare(this.f542875a, fVar.f542875a) == 0 && this.f542876b == fVar.f542876b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542877c, fVar.f542877c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542878d, fVar.f542878d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542879e, fVar.f542879e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542880f, fVar.f542880f);
    }

    /* renamed from: hashCode */
    public int m176930x8cdac1b() {
        int hashCode = ((((java.lang.Float.hashCode(this.f542875a) * 31) + this.f542876b.hashCode()) * 31) + this.f542877c.hashCode()) * 31;
        java.lang.String str = this.f542878d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f542879e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f542880f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m176931x9616526c() {
        return "EyeShadowInfoV2(alpha=" + this.f542875a + ", blendMode=" + this.f542876b + ", path=" + this.f542877c + ", pathMd5=" + this.f542878d + ", shimmerPosPath=" + this.f542879e + ", shimmerPosPathMd5=" + this.f542880f + ')';
    }
}
