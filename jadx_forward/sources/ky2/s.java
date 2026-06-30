package ky2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f395111a;

    /* renamed from: b, reason: collision with root package name */
    public int f395112b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f395113c;

    public s(boolean z17, int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        i17 = (i18 & 2) != 0 ? 3 : i17;
        str = (i18 & 4) != 0 ? null : str;
        this.f395111a = z17;
        this.f395112b = i17;
        this.f395113c = str;
    }

    /* renamed from: equals */
    public boolean m144616xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky2.s)) {
            return false;
        }
        ky2.s sVar = (ky2.s) obj;
        return this.f395111a == sVar.f395111a && this.f395112b == sVar.f395112b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f395113c, sVar.f395113c);
    }

    /* renamed from: hashCode */
    public int m144617x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f395111a) * 31) + java.lang.Integer.hashCode(this.f395112b)) * 31;
        java.lang.String str = this.f395113c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m144618x9616526c() {
        return "VoteSettingItem(isSingleChoice=" + this.f395111a + ", time=" + this.f395112b + ", question=" + this.f395113c + ')';
    }
}
