package tg2;

/* loaded from: classes3.dex */
public final class i implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f500708d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500709e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f500710f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f500711g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f500712h;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        this.f500708d = str;
        this.f500709e = str2;
        this.f500710f = str3;
        this.f500711g = z17;
        this.f500712h = z18;
    }

    /* renamed from: equals */
    public boolean m166504xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg2.i)) {
            return false;
        }
        tg2.i iVar = (tg2.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500708d, iVar.f500708d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500709e, iVar.f500709e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500710f, iVar.f500710f) && this.f500711g == iVar.f500711g && this.f500712h == iVar.f500712h;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return m166505x8cdac1b();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m166505x8cdac1b() {
        java.lang.String str = this.f500708d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f500709e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f500710f;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f500711g)) * 31) + java.lang.Boolean.hashCode(this.f500712h);
    }

    /* renamed from: toString */
    public java.lang.String m166506x9616526c() {
        return "SendGiftTargetConvertData(userName=" + this.f500708d + ", nickName=" + this.f500709e + ", avatarUrl=" + this.f500710f + ", isAnchor=" + this.f500711g + ", isChecked=" + this.f500712h + ')';
    }
}
