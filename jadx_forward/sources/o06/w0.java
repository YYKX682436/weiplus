package o06;

/* loaded from: classes14.dex */
public final class w0 extends o06.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f423534a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f423535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.util.List underlyingPropertyNamesToTypes) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f423534a = underlyingPropertyNamesToTypes;
        java.util.Map q17 = kz5.c1.q(underlyingPropertyNamesToTypes);
        if (!(q17.size() == underlyingPropertyNamesToTypes.size())) {
            throw new java.lang.IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f423535b = q17;
    }

    @Override // o06.j2
    public boolean a(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return this.f423535b.containsKey(name);
    }

    @Override // o06.j2
    public java.util.List b() {
        return this.f423534a;
    }

    /* renamed from: toString */
    public java.lang.String m150390x9616526c() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f423534a + ')';
    }
}
