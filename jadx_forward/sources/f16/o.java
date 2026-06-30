package f16;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final f16.n f340293a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f340294b;

    public o(f16.n qualifier, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qualifier, "qualifier");
        this.f340293a = qualifier;
        this.f340294b = z17;
    }

    public static f16.o a(f16.o oVar, f16.n qualifier, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            qualifier = oVar.f340293a;
        }
        if ((i17 & 2) != 0) {
            z17 = oVar.f340294b;
        }
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qualifier, "qualifier");
        return new f16.o(qualifier, z17);
    }

    /* renamed from: equals */
    public boolean m128730xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f16.o)) {
            return false;
        }
        f16.o oVar = (f16.o) obj;
        return this.f340293a == oVar.f340293a && this.f340294b == oVar.f340294b;
    }

    /* renamed from: hashCode */
    public int m128731x8cdac1b() {
        return (this.f340293a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f340294b);
    }

    /* renamed from: toString */
    public java.lang.String m128732x9616526c() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f340293a + ", isForWarningOnly=" + this.f340294b + ')';
    }
}
