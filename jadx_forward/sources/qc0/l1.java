package qc0;

/* loaded from: classes7.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final qc0.n1 f442928a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442929b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f442930c;

    /* renamed from: d, reason: collision with root package name */
    public long f442931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f442932e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f442933f;

    /* renamed from: g, reason: collision with root package name */
    public final long f442934g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f442935h;

    /* renamed from: i, reason: collision with root package name */
    public int f442936i;

    /* renamed from: j, reason: collision with root package name */
    public long f442937j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f442938k;

    /* renamed from: l, reason: collision with root package name */
    public final qc0.o1 f442939l;

    public l1(qc0.n1 type, java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4, long j18, boolean z17, int i17, long j19, java.lang.String str5, qc0.o1 o1Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j27;
        java.lang.String str6;
        java.lang.String str7 = (i18 & 2) != 0 ? null : str;
        java.lang.String str8 = (i18 & 4) != 0 ? null : str2;
        long j28 = (i18 & 8) != 0 ? -1L : j17;
        java.lang.String str9 = (i18 & 16) != 0 ? "" : str3;
        java.lang.String str10 = (i18 & 32) == 0 ? str4 : "";
        long j29 = (i18 & 64) == 0 ? j18 : -1L;
        boolean z18 = (i18 & 128) != 0 ? true : z17;
        int i19 = (i18 & 256) != 0 ? 0 : i17;
        long j37 = (i18 & 512) != 0 ? 0L : j19;
        if ((i18 & 1024) != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j29);
            j27 = j37;
            sb6.append('_');
            sb6.append(str7 != null ? str7.hashCode() : 0);
            str6 = sb6.toString();
        } else {
            j27 = j37;
            str6 = str5;
        }
        qc0.o1 o1Var2 = (i18 & 2048) != 0 ? null : o1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f442928a = type;
        this.f442929b = str7;
        this.f442930c = str8;
        this.f442931d = j28;
        this.f442932e = str9;
        this.f442933f = str10;
        this.f442934g = j29;
        this.f442935h = z18;
        this.f442936i = i19;
        this.f442937j = j27;
        this.f442938k = str6;
        this.f442939l = o1Var2;
    }

    public final boolean a() {
        return this.f442928a == qc0.n1.f442951e;
    }

    public final boolean b() {
        return this.f442928a == qc0.n1.f442950d;
    }

    /* renamed from: equals */
    public boolean m159778xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.l1)) {
            return false;
        }
        qc0.l1 l1Var = (qc0.l1) obj;
        return this.f442928a == l1Var.f442928a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442929b, l1Var.f442929b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442930c, l1Var.f442930c) && this.f442931d == l1Var.f442931d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442932e, l1Var.f442932e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442933f, l1Var.f442933f) && this.f442934g == l1Var.f442934g && this.f442935h == l1Var.f442935h && this.f442936i == l1Var.f442936i && this.f442937j == l1Var.f442937j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442938k, l1Var.f442938k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442939l, l1Var.f442939l);
    }

    /* renamed from: hashCode */
    public int m159779x8cdac1b() {
        int hashCode = this.f442928a.hashCode() * 31;
        java.lang.String str = this.f442929b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f442930c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f442931d)) * 31;
        java.lang.String str3 = this.f442932e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f442933f;
        int hashCode5 = (((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Long.hashCode(this.f442934g)) * 31) + java.lang.Boolean.hashCode(this.f442935h)) * 31) + java.lang.Integer.hashCode(this.f442936i)) * 31) + java.lang.Long.hashCode(this.f442937j)) * 31;
        java.lang.String str5 = this.f442938k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        qc0.o1 o1Var = this.f442939l;
        return hashCode6 + (o1Var != null ? o1Var.m159794x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m159780x9616526c() {
        return "MediaOptModel(type=" + this.f442928a + ", path=" + this.f442929b + ", thumb=" + this.f442930c + ", durationMs=" + this.f442931d + ", livePhotoVideoPath=" + this.f442932e + ", livePhotoTempVideoPath=" + this.f442933f + ", mediaId=" + this.f442934g + ", compress=" + this.f442935h + ", parseState=" + this.f442936i + ", coverTimeStampMs=" + this.f442937j + ", mediaUniqueKey=" + this.f442938k + ", textCoverInfo=" + this.f442939l + ')';
    }
}
