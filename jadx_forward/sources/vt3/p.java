package vt3;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final vt3.m f521552a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f521553b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f521554c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f521555d;

    /* renamed from: e, reason: collision with root package name */
    public final long f521556e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f521557f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.ol0 f521558g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f521559h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f521560i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f521561j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f521562k;

    /* renamed from: l, reason: collision with root package name */
    public final int f521563l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f521564m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f521565n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.to0 f521566o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.xy6 f521567p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.b70 f521568q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.mi0 f521569r;

    public p(vt3.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, r45.ol0 ol0Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, java.lang.String authorName, java.lang.String authorImageURL, int i17, boolean z18, java.lang.String str5, r45.to0 to0Var, r45.xy6 xy6Var, r45.b70 b70Var, r45.mi0 mi0Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        vt3.m rvType = (i18 & 1) != 0 ? vt3.m.f521545f : mVar;
        java.lang.String templateId = (i18 & 2) != 0 ? "" : str;
        java.lang.String displayName = (i18 & 4) != 0 ? "" : str2;
        java.lang.String templateDescUrl = (i18 & 8) != 0 ? "" : str3;
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        java.lang.String previewImageUrl = (i18 & 32) != 0 ? "" : str4;
        r45.ol0 ol0Var2 = (i18 & 64) != 0 ? null : ol0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i18 & 128) != 0 ? null : gVar;
        java.lang.String guideWording = (i18 & 8192) == 0 ? str5 : "";
        r45.to0 to0Var2 = (i18 & 16384) != 0 ? null : to0Var;
        r45.xy6 xy6Var2 = (i18 & 32768) != 0 ? null : xy6Var;
        r45.b70 b70Var2 = (i18 & 65536) != 0 ? null : b70Var;
        r45.mi0 mi0Var2 = (i18 & 131072) != 0 ? null : mi0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rvType, "rvType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateDescUrl, "templateDescUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewImageUrl, "previewImageUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorName, "authorName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorImageURL, "authorImageURL");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guideWording, "guideWording");
        this.f521552a = rvType;
        this.f521553b = templateId;
        this.f521554c = displayName;
        this.f521555d = templateDescUrl;
        this.f521556e = j18;
        this.f521557f = previewImageUrl;
        this.f521558g = ol0Var2;
        this.f521559h = gVar2;
        this.f521560i = z17;
        this.f521561j = authorName;
        this.f521562k = authorImageURL;
        this.f521563l = i17;
        this.f521564m = z18;
        this.f521565n = guideWording;
        this.f521566o = to0Var2;
        this.f521567p = xy6Var2;
        this.f521568q = b70Var2;
        this.f521569r = mi0Var2;
    }

    /* renamed from: equals */
    public boolean m172620xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt3.p)) {
            return false;
        }
        vt3.p pVar = (vt3.p) obj;
        return this.f521552a == pVar.f521552a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521553b, pVar.f521553b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521554c, pVar.f521554c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521555d, pVar.f521555d) && this.f521556e == pVar.f521556e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521557f, pVar.f521557f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521558g, pVar.f521558g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521559h, pVar.f521559h) && this.f521560i == pVar.f521560i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521561j, pVar.f521561j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521562k, pVar.f521562k) && this.f521563l == pVar.f521563l && this.f521564m == pVar.f521564m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521565n, pVar.f521565n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521566o, pVar.f521566o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521567p, pVar.f521567p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521568q, pVar.f521568q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521569r, pVar.f521569r);
    }

    /* renamed from: hashCode */
    public int m172621x8cdac1b() {
        int hashCode = ((((((((((this.f521552a.hashCode() * 31) + this.f521553b.hashCode()) * 31) + this.f521554c.hashCode()) * 31) + this.f521555d.hashCode()) * 31) + java.lang.Long.hashCode(this.f521556e)) * 31) + this.f521557f.hashCode()) * 31;
        r45.ol0 ol0Var = this.f521558g;
        int hashCode2 = (hashCode + (ol0Var == null ? 0 : ol0Var.hashCode())) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f521559h;
        int hashCode3 = (((((((((((((hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f521560i)) * 31) + this.f521561j.hashCode()) * 31) + this.f521562k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f521563l)) * 31) + java.lang.Boolean.hashCode(this.f521564m)) * 31) + this.f521565n.hashCode()) * 31;
        r45.to0 to0Var = this.f521566o;
        int hashCode4 = (hashCode3 + (to0Var == null ? 0 : to0Var.hashCode())) * 31;
        r45.xy6 xy6Var = this.f521567p;
        int hashCode5 = (hashCode4 + (xy6Var == null ? 0 : xy6Var.hashCode())) * 31;
        r45.b70 b70Var = this.f521568q;
        int hashCode6 = (hashCode5 + (b70Var == null ? 0 : b70Var.hashCode())) * 31;
        r45.mi0 mi0Var = this.f521569r;
        return hashCode6 + (mi0Var != null ? mi0Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m172622x9616526c() {
        return "ImproveRecordMaasTemplateItem(rvType=" + this.f521552a + ", templateId=" + this.f521553b + ", displayName=" + this.f521554c + ", templateDescUrl=" + this.f521555d + ", templateDescVersion=" + this.f521556e + ", previewImageUrl=" + this.f521557f + ", eventInfo=" + this.f521558g + ", sessionBuffer=" + this.f521559h + ", isFavorite=" + this.f521560i + ", authorName=" + this.f521561j + ", authorImageURL=" + this.f521562k + ", cameraPosition=" + this.f521563l + ", isAIGC=" + this.f521564m + ", guideWording=" + this.f521565n + ", faceRecognitionInfo=" + this.f521566o + ", tplVersionInfo=" + this.f521567p + ", commonTplInfo=" + this.f521568q + ", effectEditInfo=" + this.f521569r + ')';
    }
}
