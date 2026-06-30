package bm2;

/* loaded from: classes5.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final bm2.g6 f103479a;

    /* renamed from: b, reason: collision with root package name */
    public final hn2.d f103480b;

    public h6(bm2.g6 type, hn2.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f103479a = type;
        this.f103480b = dVar;
    }

    /* renamed from: equals */
    public boolean m10744xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.h6)) {
            return false;
        }
        bm2.h6 h6Var = (bm2.h6) obj;
        return this.f103479a == h6Var.f103479a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103480b, h6Var.f103480b);
    }

    /* renamed from: hashCode */
    public int m10745x8cdac1b() {
        int hashCode = this.f103479a.hashCode() * 31;
        hn2.d dVar = this.f103480b;
        return hashCode + (dVar == null ? 0 : dVar.m133816x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m10746x9616526c() {
        return "RequestSongListItem(type=" + this.f103479a + ", song=" + this.f103480b + ')';
    }
}
