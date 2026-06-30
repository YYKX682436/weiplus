package b26;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final k16.g f17443a;

    /* renamed from: b, reason: collision with root package name */
    public final i16.o f17444b;

    /* renamed from: c, reason: collision with root package name */
    public final k16.a f17445c;

    /* renamed from: d, reason: collision with root package name */
    public final o06.x1 f17446d;

    public i(k16.g nameResolver, i16.o classProto, k16.a metadataVersion, o06.x1 sourceElement) {
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(classProto, "classProto");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.o.g(sourceElement, "sourceElement");
        this.f17443a = nameResolver;
        this.f17444b = classProto;
        this.f17445c = metadataVersion;
        this.f17446d = sourceElement;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b26.i)) {
            return false;
        }
        b26.i iVar = (b26.i) obj;
        return kotlin.jvm.internal.o.b(this.f17443a, iVar.f17443a) && kotlin.jvm.internal.o.b(this.f17444b, iVar.f17444b) && kotlin.jvm.internal.o.b(this.f17445c, iVar.f17445c) && kotlin.jvm.internal.o.b(this.f17446d, iVar.f17446d);
    }

    public int hashCode() {
        return (((((this.f17443a.hashCode() * 31) + this.f17444b.hashCode()) * 31) + this.f17445c.hashCode()) * 31) + this.f17446d.hashCode();
    }

    public java.lang.String toString() {
        return "ClassData(nameResolver=" + this.f17443a + ", classProto=" + this.f17444b + ", metadataVersion=" + this.f17445c + ", sourceElement=" + this.f17446d + ')';
    }
}
