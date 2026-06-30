package gf5;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f352927a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f352928b;

    public g(java.util.Set extraIdentifierStartChars, java.util.Set extraIdentifierPartChars, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i18 = i17 & 1;
        kz5.r0 r0Var = kz5.r0.f395535d;
        extraIdentifierStartChars = i18 != 0 ? r0Var : extraIdentifierStartChars;
        extraIdentifierPartChars = (i17 & 2) != 0 ? r0Var : extraIdentifierPartChars;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraIdentifierStartChars, "extraIdentifierStartChars");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraIdentifierPartChars, "extraIdentifierPartChars");
        this.f352927a = extraIdentifierStartChars;
        this.f352928b = extraIdentifierPartChars;
    }

    /* renamed from: equals */
    public boolean m131469xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.g)) {
            return false;
        }
        gf5.g gVar = (gf5.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352927a, gVar.f352927a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352928b, gVar.f352928b);
    }

    /* renamed from: hashCode */
    public int m131470x8cdac1b() {
        return (this.f352927a.hashCode() * 31) + this.f352928b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131471x9616526c() {
        return "IdentifierConfig(extraIdentifierStartChars=" + this.f352927a + ", extraIdentifierPartChars=" + this.f352928b + ')';
    }
}
