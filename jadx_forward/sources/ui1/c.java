package ui1;

/* loaded from: classes7.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a {

    /* renamed from: d, reason: collision with root package name */
    public final ui1.a0 f509570d;

    /* renamed from: e, reason: collision with root package name */
    public final ui1.r f509571e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f509572f;

    public c(ui1.a0 context, ui1.r rVar, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f509570d = context;
        this.f509571e = rVar;
        this.f509572f = key;
    }

    /* renamed from: equals */
    public boolean m168081xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui1.c)) {
            return false;
        }
        ui1.c cVar = (ui1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509570d, cVar.f509570d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509571e, cVar.f509571e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509572f, cVar.f509572f);
    }

    /* renamed from: hashCode */
    public int m168082x8cdac1b() {
        int hashCode = this.f509570d.hashCode() * 31;
        ui1.r rVar = this.f509571e;
        return ((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31) + this.f509572f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m168083x9616526c() {
        return "Task(context=" + this.f509570d + ", callback=" + this.f509571e + ", key=" + this.f509572f + ')';
    }
}
