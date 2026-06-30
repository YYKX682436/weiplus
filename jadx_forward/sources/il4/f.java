package il4;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f373662a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f373663b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f373664c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f373665d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f373666e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f373667f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373668g;

    public f(boolean z17, boolean z18, boolean z19, java.util.Map extInfo, java.util.Map activeSessionExtInfo, java.util.Map activeSessionExtInfo2, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        z19 = (i17 & 4) != 0 ? false : z19;
        extInfo = (i17 & 8) != 0 ? new java.util.LinkedHashMap() : extInfo;
        activeSessionExtInfo = (i17 & 16) != 0 ? new java.util.LinkedHashMap() : activeSessionExtInfo;
        activeSessionExtInfo2 = (i17 & 32) != 0 ? new java.util.LinkedHashMap() : activeSessionExtInfo2;
        str = (i17 & 64) != 0 ? null : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activeSessionExtInfo, "activeSessionExtInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activeSessionExtInfo2, "activeSessionExtInfo2");
        this.f373662a = z17;
        this.f373663b = z18;
        this.f373664c = z19;
        this.f373665d = extInfo;
        this.f373666e = activeSessionExtInfo;
        this.f373667f = activeSessionExtInfo2;
        this.f373668g = str;
    }

    /* renamed from: equals */
    public boolean m136734xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il4.f)) {
            return false;
        }
        il4.f fVar = (il4.f) obj;
        return this.f373662a == fVar.f373662a && this.f373663b == fVar.f373663b && this.f373664c == fVar.f373664c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373665d, fVar.f373665d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373666e, fVar.f373666e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373667f, fVar.f373667f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373668g, fVar.f373668g);
    }

    /* renamed from: hashCode */
    public int m136735x8cdac1b() {
        int hashCode = ((((((((((java.lang.Boolean.hashCode(this.f373662a) * 31) + java.lang.Boolean.hashCode(this.f373663b)) * 31) + java.lang.Boolean.hashCode(this.f373664c)) * 31) + this.f373665d.hashCode()) * 31) + this.f373666e.hashCode()) * 31) + this.f373667f.hashCode()) * 31;
        java.lang.String str = this.f373668g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m136736x9616526c() {
        return "TingItemSessionExt(consumed=" + this.f373662a + ", enter=" + this.f373663b + ", isHalfScreen=" + this.f373664c + ", extInfo=" + this.f373665d + ", activeSessionExtInfo=" + this.f373666e + ", activeSessionExtInfo2=" + this.f373667f + ", listenId=" + this.f373668g + ')';
    }
}
