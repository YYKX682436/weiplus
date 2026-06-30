package om2;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final om2.c f427908a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.a f427909b;

    /* renamed from: c, reason: collision with root package name */
    public final om2.q f427910c;

    public r(om2.c error, zy.a aVar, om2.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        this.f427908a = error;
        this.f427909b = aVar;
        this.f427910c = qVar;
    }

    /* renamed from: equals */
    public boolean m151676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.r)) {
            return false;
        }
        om2.r rVar = (om2.r) obj;
        return this.f427908a == rVar.f427908a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427909b, rVar.f427909b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427910c, rVar.f427910c);
    }

    /* renamed from: hashCode */
    public int m151677x8cdac1b() {
        int hashCode = this.f427908a.hashCode() * 31;
        zy.a aVar = this.f427909b;
        int m179884x8cdac1b = (hashCode + (aVar == null ? 0 : aVar.m179884x8cdac1b())) * 31;
        om2.q qVar = this.f427910c;
        return m179884x8cdac1b + (qVar != null ? qVar.m151674x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m151678x9616526c() {
        return "LiveSongMusicResourceResult(error=" + this.f427908a + ", resultParams=" + this.f427909b + ", musicResourceInfo=" + this.f427910c + ')';
    }
}
