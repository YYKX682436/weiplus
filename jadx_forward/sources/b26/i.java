package b26;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final k16.g f98976a;

    /* renamed from: b, reason: collision with root package name */
    public final i16.o f98977b;

    /* renamed from: c, reason: collision with root package name */
    public final k16.a f98978c;

    /* renamed from: d, reason: collision with root package name */
    public final o06.x1 f98979d;

    public i(k16.g nameResolver, i16.o classProto, k16.a metadataVersion, o06.x1 sourceElement) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classProto, "classProto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadataVersion, "metadataVersion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceElement, "sourceElement");
        this.f98976a = nameResolver;
        this.f98977b = classProto;
        this.f98978c = metadataVersion;
        this.f98979d = sourceElement;
    }

    /* renamed from: equals */
    public boolean m9681xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b26.i)) {
            return false;
        }
        b26.i iVar = (b26.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98976a, iVar.f98976a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98977b, iVar.f98977b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98978c, iVar.f98978c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98979d, iVar.f98979d);
    }

    /* renamed from: hashCode */
    public int m9682x8cdac1b() {
        return (((((this.f98976a.hashCode() * 31) + this.f98977b.hashCode()) * 31) + this.f98978c.m141773x8cdac1b()) * 31) + this.f98979d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9683x9616526c() {
        return "ClassData(nameResolver=" + this.f98976a + ", classProto=" + this.f98977b + ", metadataVersion=" + this.f98978c + ", sourceElement=" + this.f98979d + ')';
    }
}
