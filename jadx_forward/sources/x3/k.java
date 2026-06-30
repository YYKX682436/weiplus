package x3;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final x3.o f533105a;

    /* renamed from: b, reason: collision with root package name */
    public final x3.p f533106b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f533107c = true;

    public k(x3.o oVar, x3.p pVar) {
        this.f533105a = oVar;
        this.f533106b = pVar;
    }

    /* renamed from: toString */
    public java.lang.String m174930x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f533105a);
        sb6.append(" ");
        sb6.append(!this.f533107c ? "+>" : "->");
        sb6.append(" ");
        sb6.append(this.f533106b);
        return sb6.toString();
    }
}
