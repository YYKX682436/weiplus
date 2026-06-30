package om2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427893a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.xn1 f427894b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427895c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f427896d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f427897e;

    /* renamed from: f, reason: collision with root package name */
    public final int f427898f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f427899g;

    public o(java.lang.String userId, r45.xn1 xn1Var, java.lang.String uniQueId, java.lang.String songId, java.lang.String songName, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniQueId, "uniQueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songId, "songId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
        this.f427893a = userId;
        this.f427894b = xn1Var;
        this.f427895c = uniQueId;
        this.f427896d = songId;
        this.f427897e = songName;
        this.f427898f = i17;
        this.f427899g = z17;
    }

    /* renamed from: equals */
    public boolean m151667xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.o)) {
            return false;
        }
        om2.o oVar = (om2.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427893a, oVar.f427893a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427894b, oVar.f427894b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427895c, oVar.f427895c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427896d, oVar.f427896d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427897e, oVar.f427897e) && this.f427898f == oVar.f427898f && this.f427899g == oVar.f427899g;
    }

    /* renamed from: hashCode */
    public int m151668x8cdac1b() {
        int hashCode = this.f427893a.hashCode() * 31;
        r45.xn1 xn1Var = this.f427894b;
        return ((((((((((hashCode + (xn1Var == null ? 0 : xn1Var.hashCode())) * 31) + this.f427895c.hashCode()) * 31) + this.f427896d.hashCode()) * 31) + this.f427897e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f427898f)) * 31) + java.lang.Boolean.hashCode(this.f427899g);
    }

    /* renamed from: toString */
    public java.lang.String m151669x9616526c() {
        return "LiveSimpleSongInfo(userId=" + this.f427893a + ", singerContact=" + this.f427894b + ", uniQueId=" + this.f427895c + ", songId=" + this.f427896d + ", songName=" + this.f427897e + ", scoreSdkFlag=" + this.f427898f + ", onlySingSegment=" + this.f427899g + ')';
    }

    public /* synthetic */ o(java.lang.String str, r45.xn1 xn1Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, xn1Var, str2, str3, str4, i17, (i18 & 64) != 0 ? false : z17);
    }
}
