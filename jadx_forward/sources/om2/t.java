package om2;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final om2.d f427914a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f427915b;

    public t(om2.d error, om2.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        this.f427914a = error;
        this.f427915b = pVar;
    }

    /* renamed from: equals */
    public boolean m151682xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.t)) {
            return false;
        }
        om2.t tVar = (om2.t) obj;
        return this.f427914a == tVar.f427914a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427915b, tVar.f427915b);
    }

    /* renamed from: hashCode */
    public int m151683x8cdac1b() {
        int hashCode = this.f427914a.hashCode() * 31;
        om2.p pVar = this.f427915b;
        return hashCode + (pVar == null ? 0 : pVar.m151671x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m151684x9616526c() {
        return "LiveSongResourceResult(error=" + this.f427914a + ", resourceInfo=" + this.f427915b + ')';
    }
}
