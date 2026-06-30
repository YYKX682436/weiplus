package cj3;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f123410a;

    /* renamed from: b, reason: collision with root package name */
    public final nj3.a f123411b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123412c;

    /* renamed from: d, reason: collision with root package name */
    public final int f123413d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f123414e;

    /* renamed from: f, reason: collision with root package name */
    public final int f123415f;

    public c(java.lang.String username, nj3.a dataBuffer, int i17, int i18, boolean z17, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuffer, "dataBuffer");
        this.f123410a = username;
        this.f123411b = dataBuffer;
        this.f123412c = i17;
        this.f123413d = i18;
        this.f123414e = z17;
        this.f123415f = i19;
    }

    /* renamed from: equals */
    public boolean m14948xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj3.c)) {
            return false;
        }
        cj3.c cVar = (cj3.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123410a, cVar.f123410a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123411b, cVar.f123411b) && this.f123412c == cVar.f123412c && this.f123413d == cVar.f123413d && this.f123414e == cVar.f123414e && this.f123415f == cVar.f123415f;
    }

    /* renamed from: hashCode */
    public int m14949x8cdac1b() {
        return (((((((((this.f123410a.hashCode() * 31) + this.f123411b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f123412c)) * 31) + java.lang.Integer.hashCode(this.f123413d)) * 31) + java.lang.Boolean.hashCode(this.f123414e)) * 31) + java.lang.Integer.hashCode(this.f123415f);
    }

    /* renamed from: toString */
    public java.lang.String m14950x9616526c() {
        return "DecodeResult(username=" + this.f123410a + ", dataBuffer=" + this.f123411b + ", w=" + this.f123412c + ", h=" + this.f123413d + ", screenFrame=" + this.f123414e + ", screenOri=" + this.f123415f + ')';
    }

    public /* synthetic */ c(java.lang.String str, nj3.a aVar, int i17, int i18, boolean z17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, aVar, i17, i18, z17, (i27 & 32) != 0 ? -1 : i19);
    }
}
