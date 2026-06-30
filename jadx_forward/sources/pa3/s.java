package pa3;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f434533a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f434534b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f434535c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f434536d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f434537e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f434538f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f434539g = null;

    public final pa3.s a(java.lang.String str) {
        if (str != null) {
            cl0.g gVar = new cl0.g(str);
            java.lang.String str2 = null;
            this.f434533a = gVar.mo15083x48bce8a4("type", null);
            this.f434534b = gVar.mo15083x48bce8a4(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, null);
            this.f434535c = gVar.mo15083x48bce8a4("desc", null);
            this.f434536d = gVar.mo15083x48bce8a4("icon", null);
            this.f434537e = gVar.mo15083x48bce8a4("thumbImg", null);
            this.f434538f = gVar.mo15083x48bce8a4(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, null);
            java.lang.String mo15083x48bce8a4 = gVar.mo15083x48bce8a4("key", null);
            if (mo15083x48bce8a4 != null) {
                if (java.lang.Boolean.valueOf(mo15083x48bce8a4.length() > 0).booleanValue()) {
                    str2 = mo15083x48bce8a4;
                }
            }
            this.f434539g = str2;
        }
        return this;
    }

    /* renamed from: equals */
    public boolean m158020xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa3.s)) {
            return false;
        }
        pa3.s sVar = (pa3.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434533a, sVar.f434533a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434534b, sVar.f434534b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434535c, sVar.f434535c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434536d, sVar.f434536d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434537e, sVar.f434537e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434538f, sVar.f434538f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434539g, sVar.f434539g);
    }

    /* renamed from: hashCode */
    public int m158021x8cdac1b() {
        java.lang.String str = this.f434533a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f434534b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f434535c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f434536d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f434537e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f434538f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f434539g;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m158022x9616526c() {
        return "LiteAppTasksParams(type=" + this.f434533a + ", title=" + this.f434534b + ", desc=" + this.f434535c + ", icon=" + this.f434536d + ", thumbImg=" + this.f434537e + ", extraData=" + this.f434538f + ", key=" + this.f434539g + ')';
    }
}
