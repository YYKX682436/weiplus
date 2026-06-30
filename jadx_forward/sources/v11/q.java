package v11;

/* loaded from: classes11.dex */
public final class q extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f513987a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f513988b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f513989c;

    /* renamed from: d, reason: collision with root package name */
    public final v11.s f513990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List headers, java.util.List rows, java.util.List columnAlignments, v11.s sVar) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rows, "rows");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columnAlignments, "columnAlignments");
        this.f513987a = headers;
        this.f513988b = rows;
        this.f513989c = columnAlignments;
        this.f513990d = sVar;
    }

    /* renamed from: equals */
    public boolean m170942xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.q)) {
            return false;
        }
        v11.q qVar = (v11.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513987a, qVar.f513987a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513988b, qVar.f513988b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513989c, qVar.f513989c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513990d, qVar.f513990d);
    }

    /* renamed from: hashCode */
    public int m170943x8cdac1b() {
        int hashCode = ((((this.f513987a.hashCode() * 31) + this.f513988b.hashCode()) * 31) + this.f513989c.hashCode()) * 31;
        v11.s sVar = this.f513990d;
        return hashCode + (sVar == null ? 0 : sVar.m170946x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170944x9616526c() {
        return "TableBlock(headers=" + this.f513987a + ", rows=" + this.f513988b + ", columnAlignments=" + this.f513989c + ", sourceRange=" + this.f513990d + ')';
    }
}
