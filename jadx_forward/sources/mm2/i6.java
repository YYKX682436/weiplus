package mm2;

/* loaded from: classes10.dex */
public final class i6 extends mm2.j6 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.z22 f410674a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f410675b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f410676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(r45.z22 songInfo, om2.p pVar, boolean z17) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        this.f410674a = songInfo;
        this.f410675b = pVar;
        this.f410676c = z17;
    }

    /* renamed from: equals */
    public boolean m147967xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.i6)) {
            return false;
        }
        mm2.i6 i6Var = (mm2.i6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410674a, i6Var.f410674a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410675b, i6Var.f410675b) && this.f410676c == i6Var.f410676c;
    }

    /* renamed from: hashCode */
    public int m147968x8cdac1b() {
        int hashCode = this.f410674a.hashCode() * 31;
        om2.p pVar = this.f410675b;
        return ((hashCode + (pVar == null ? 0 : pVar.m151671x8cdac1b())) * 31) + java.lang.Boolean.hashCode(this.f410676c);
    }

    /* renamed from: toString */
    public java.lang.String m147969x9616526c() {
        return "Singing(songInfo=" + this.f410674a + ", lyricsResource=" + this.f410675b + ", hasOriginal=" + this.f410676c + ')';
    }
}
