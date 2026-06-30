package az0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f96871a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f96872b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f96873c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f96874d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96875e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f96876f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f96877g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f96878h;

    public b0(java.lang.String outputVideoPath, java.lang.String coverImagePath, java.lang.String templateId, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        coverImagePath = (i17 & 2) != 0 ? "" : coverImagePath;
        str = (i17 & 8) != 0 ? null : str;
        str2 = (i17 & 16) != 0 ? null : str2;
        bool = (i17 & 32) != 0 ? java.lang.Boolean.FALSE : bool;
        str3 = (i17 & 64) != 0 ? null : str3;
        str4 = (i17 & 128) != 0 ? null : str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputVideoPath, "outputVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverImagePath, "coverImagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        this.f96871a = outputVideoPath;
        this.f96872b = coverImagePath;
        this.f96873c = templateId;
        this.f96874d = str;
        this.f96875e = str2;
        this.f96876f = bool;
        this.f96877g = str3;
        this.f96878h = str4;
    }

    /* renamed from: equals */
    public boolean m9322xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0.b0)) {
            return false;
        }
        az0.b0 b0Var = (az0.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96871a, b0Var.f96871a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96872b, b0Var.f96872b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96873c, b0Var.f96873c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96874d, b0Var.f96874d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96875e, b0Var.f96875e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96876f, b0Var.f96876f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96877g, b0Var.f96877g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96878h, b0Var.f96878h);
    }

    /* renamed from: hashCode */
    public int m9323x8cdac1b() {
        int hashCode = ((((this.f96871a.hashCode() * 31) + this.f96872b.hashCode()) * 31) + this.f96873c.hashCode()) * 31;
        java.lang.String str = this.f96874d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f96875e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Boolean bool = this.f96876f;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str3 = this.f96877g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f96878h;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m9324x9616526c() {
        return "MaasExportInfoHolder(outputVideoPath=" + this.f96871a + ", coverImagePath=" + this.f96872b + ", templateId=" + this.f96873c + ", musicId=" + this.f96874d + ", listenId=" + this.f96875e + ", musicIsMajorOwned=" + this.f96876f + ", aiTaskId=" + this.f96877g + ", aiModelType=" + this.f96878h + ')';
    }
}
