package o06;

/* loaded from: classes14.dex */
public final class o0 extends o06.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final n16.g f423508a;

    /* renamed from: b, reason: collision with root package name */
    public final i26.j f423509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n16.g underlyingPropertyName, i26.j underlyingType) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(underlyingPropertyName, "underlyingPropertyName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(underlyingType, "underlyingType");
        this.f423508a = underlyingPropertyName;
        this.f423509b = underlyingType;
    }

    @Override // o06.j2
    public boolean a(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423508a, name);
    }

    @Override // o06.j2
    public java.util.List b() {
        return kz5.b0.c(new jz5.l(this.f423508a, this.f423509b));
    }

    /* renamed from: toString */
    public java.lang.String m150373x9616526c() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f423508a + ", underlyingType=" + this.f423509b + ')';
    }
}
