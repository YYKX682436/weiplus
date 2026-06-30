package my1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f f414208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f414209b;

    /* renamed from: c, reason: collision with root package name */
    public final int f414210c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f414211d;

    public d(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f414208a = fVar;
        this.f414209b = i17;
        this.f414210c = i18;
        this.f414211d = errMsg;
    }

    /* renamed from: equals */
    public boolean m148582xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my1.d)) {
            return false;
        }
        my1.d dVar = (my1.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f414208a, dVar.f414208a) && this.f414209b == dVar.f414209b && this.f414210c == dVar.f414210c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f414211d, dVar.f414211d);
    }

    /* renamed from: hashCode */
    public int m148583x8cdac1b() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f414208a;
        return ((((((fVar == null ? 0 : fVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f414209b)) * 31) + java.lang.Integer.hashCode(this.f414210c)) * 31) + this.f414211d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148584x9616526c() {
        return "CgiBack(resp=" + this.f414208a + ", errType=" + this.f414209b + ", errCode=" + this.f414210c + ", errMsg=" + this.f414211d + ')';
    }
}
