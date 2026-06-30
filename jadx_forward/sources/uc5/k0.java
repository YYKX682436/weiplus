package uc5;

/* loaded from: classes10.dex */
public final class k0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f508050d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f508051e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f508052f;

    /* renamed from: g, reason: collision with root package name */
    public final long f508053g;

    /* renamed from: h, reason: collision with root package name */
    public final long f508054h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f508055i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String talker, java.lang.String sectionKey, java.lang.String displayText, long j17, long j18) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sectionKey, "sectionKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayText, "displayText");
        this.f508050d = talker;
        this.f508051e = sectionKey;
        this.f508052f = displayText;
        this.f508053g = j17;
        this.f508054h = j18;
    }

    @Override // uc5.l0, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        int j17;
        uc5.l0 other = (uc5.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        boolean z17 = other instanceof uc5.k0;
        java.lang.String str = this.f508051e;
        long j18 = this.f508053g;
        if (z17) {
            uc5.k0 k0Var = (uc5.k0) other;
            int j19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(k0Var.f508053g, j18);
            if (j19 != 0) {
                return j19;
            }
            int j27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(k0Var.f508054h, this.f508054h);
            if (j27 != 0) {
                return j27;
            }
            j17 = k0Var.f508051e.compareTo(str);
        } else if (other instanceof uc5.h0) {
            j17 = n((uc5.h0) other);
        } else if (other instanceof uc5.i0) {
            j17 = 1;
        } else {
            if (!(other instanceof uc5.j0)) {
                throw new jz5.j();
            }
            uc5.j0 j0Var = (uc5.j0) other;
            j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, j0Var.f508044d) ? -1 : p3321xbce91901.jvm.p3324x21ffc6bd.o.j(j18, j0Var.f508046f);
        }
        return j17;
    }

    @Override // xm3.a
    /* renamed from: equals */
    public boolean mo148314xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.k0)) {
            return false;
        }
        uc5.k0 k0Var = (uc5.k0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508050d, k0Var.f508050d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508051e, k0Var.f508051e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508052f, k0Var.f508052f) && this.f508053g == k0Var.f508053g && this.f508054h == k0Var.f508054h;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.a
    /* renamed from: hashCode */
    public int mo148315x8cdac1b() {
        return (((((((this.f508050d.hashCode() * 31) + this.f508051e.hashCode()) * 31) + this.f508052f.hashCode()) * 31) + java.lang.Long.hashCode(this.f508053g)) * 31) + java.lang.Long.hashCode(this.f508054h);
    }

    public final int n(uc5.h0 content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        uc5.d dVar = content.f508027d;
        int j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(dVar.p().T1(), this.f508053g);
        if (j17 != 0) {
            return j17;
        }
        int j18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(dVar.p().m124847x74d37ac6(), this.f508054h);
        if (j18 != 0) {
            return j18;
        }
        return -1;
    }

    /* renamed from: toString */
    public java.lang.String m167843x9616526c() {
        return "Timeline(talker=" + this.f508050d + ", sectionKey=" + this.f508051e + ", displayText=" + this.f508052f + ", anchorCreateTime=" + this.f508053g + ", anchorMsgId=" + this.f508054h + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f508055i;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = "timeline#" + this.f508050d + '#' + this.f508051e + '#' + this.f508054h;
        this.f508055i = str2;
        return str2;
    }
}
