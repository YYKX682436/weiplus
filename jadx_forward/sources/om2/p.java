package om2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427900a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.y f427901b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f427902c;

    /* renamed from: d, reason: collision with root package name */
    public final om2.w f427903d;

    /* renamed from: e, reason: collision with root package name */
    public final int f427904e;

    public p(java.lang.String songMid, om2.y qrcRes, boolean z17, om2.w wVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrcRes, "qrcRes");
        this.f427900a = songMid;
        this.f427901b = qrcRes;
        this.f427902c = z17;
        this.f427903d = wVar;
        this.f427904e = i17;
    }

    /* renamed from: equals */
    public boolean m151670xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.p)) {
            return false;
        }
        om2.p pVar = (om2.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427900a, pVar.f427900a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427901b, pVar.f427901b) && this.f427902c == pVar.f427902c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427903d, pVar.f427903d) && this.f427904e == pVar.f427904e;
    }

    /* renamed from: hashCode */
    public int m151671x8cdac1b() {
        int hashCode = ((((this.f427900a.hashCode() * 31) + this.f427901b.m151692x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f427902c)) * 31;
        om2.w wVar = this.f427903d;
        return ((hashCode + (wVar == null ? 0 : wVar.m151689x8cdac1b())) * 31) + java.lang.Integer.hashCode(this.f427904e);
    }

    /* renamed from: toString */
    public java.lang.String m151672x9616526c() {
        return "LiveSongBaseResourceInfo(songMid=" + this.f427900a + ", qrcRes=" + this.f427901b + ", hasNote=" + this.f427902c + ", noteRes=" + this.f427903d + ", songDuration=" + this.f427904e + ')';
    }
}
