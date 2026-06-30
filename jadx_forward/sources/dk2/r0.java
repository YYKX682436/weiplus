package dk2;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f315524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f315525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f315526c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f315527d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.b f315528e;

    public r0(boolean z17, int i17, int i18, java.lang.String errMsg, km2.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f315524a = z17;
        this.f315525b = i17;
        this.f315526c = i18;
        this.f315527d = errMsg;
        this.f315528e = bVar;
    }

    /* renamed from: equals */
    public boolean m124645xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.r0)) {
            return false;
        }
        dk2.r0 r0Var = (dk2.r0) obj;
        return this.f315524a == r0Var.f315524a && this.f315525b == r0Var.f315525b && this.f315526c == r0Var.f315526c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315527d, r0Var.f315527d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315528e, r0Var.f315528e);
    }

    /* renamed from: hashCode */
    public int m124646x8cdac1b() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f315524a) * 31) + java.lang.Integer.hashCode(this.f315525b)) * 31) + java.lang.Integer.hashCode(this.f315526c)) * 31) + this.f315527d.hashCode()) * 31;
        km2.b bVar = this.f315528e;
        return hashCode + (bVar == null ? 0 : bVar.m143645x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m124647x9616526c() {
        return "CloseLiveResult(success=" + this.f315524a + ", errCode=" + this.f315525b + ", errType=" + this.f315526c + ", errMsg=" + this.f315527d + ", anchorFinishInfo=" + this.f315528e + ')';
    }
}
