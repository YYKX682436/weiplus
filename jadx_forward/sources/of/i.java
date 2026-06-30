package of;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f426365a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f426366b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f426367c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f426368d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f426369e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f426370f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f426371g;

    /* renamed from: toString */
    public java.lang.String m151180x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SmapsEntity(name=");
        sb6.append(this.f426365a);
        sb6.append(", permission=");
        sb6.append(this.f426368d);
        sb6.append(", virtual memory size=");
        of.n nVar = of.s.f426379c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f426369e);
        sb6.append(nVar.a(r2.intValue() * 1024));
        sb6.append(",pss=");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f426370f);
        sb6.append(nVar.a(r2.intValue() * 1024));
        sb6.append(", rss=");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f426371g);
        sb6.append(nVar.a(r2.intValue() * 1024));
        sb6.append(",startAddress=");
        sb6.append(this.f426366b);
        sb6.append(", endAddress=");
        sb6.append(this.f426367c);
        sb6.append(')');
        return sb6.toString();
    }
}
