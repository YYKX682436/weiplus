package vu4;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.d f521843a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f521844b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f521845c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f521846d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f521847e;

    /* renamed from: f, reason: collision with root package name */
    public final vu4.e f521848f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f521849g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f521850h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f521851i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f521852j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f521853k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f521854l;

    /* renamed from: m, reason: collision with root package name */
    public final vu4.g f521855m;

    public f(vu4.d actionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String pageId, vu4.e boxinfo, java.lang.String docInfo, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, vu4.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str9 = (i17 & 2) != 0 ? "" : str;
        java.lang.String str10 = (i17 & 4) != 0 ? "" : str2;
        java.lang.String str11 = (i17 & 8) != 0 ? "" : str3;
        java.lang.String str12 = (i17 & 128) != 0 ? "" : str4;
        java.lang.String str13 = (i17 & 256) != 0 ? "" : str5;
        java.lang.String str14 = (i17 & 512) != 0 ? "" : str6;
        java.lang.String str15 = (i17 & 1024) != 0 ? "" : str7;
        java.lang.String str16 = (i17 & 2048) == 0 ? str8 : "";
        vu4.g msgPageType = (i17 & 4096) != 0 ? vu4.g.f521856e : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageId, "pageId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxinfo, "boxinfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgPageType, "msgPageType");
        this.f521843a = actionType;
        this.f521844b = str9;
        this.f521845c = str10;
        this.f521846d = str11;
        this.f521847e = pageId;
        this.f521848f = boxinfo;
        this.f521849g = docInfo;
        this.f521850h = str12;
        this.f521851i = str13;
        this.f521852j = str14;
        this.f521853k = str15;
        this.f521854l = str16;
        this.f521855m = msgPageType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:(3:66|67|(1:69)(26:70|(1:61)(1:65)|62|9|(1:11)|12|(1:(1:15)(2:54|55))(1:56)|16|(1:18)(1:53)|(3:20|(1:22)(1:25)|(1:24))|26|(1:28)|29|30|31|32|34|35|36|(1:38)|39|(1:41)|42|(1:44)|45|46))|59|(0)(0)|62|9|(0)|12|(0)(0)|16|(0)(0)|(0)|26|(0)|29|30|31|32|34|35|36|(0)|39|(0)|42|(0)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0052, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0050, code lost:
    
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0030 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:67:0x0024, B:61:0x0030, B:62:0x003b, B:65:0x0036), top: B:66:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0036 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:67:0x0024, B:61:0x0030, B:62:0x003b, B:65:0x0036), top: B:66:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vu4.f.a():java.util.List");
    }

    /* renamed from: equals */
    public boolean m172661xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.f)) {
            return false;
        }
        vu4.f fVar = (vu4.f) obj;
        return this.f521843a == fVar.f521843a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521844b, fVar.f521844b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521845c, fVar.f521845c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521846d, fVar.f521846d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521847e, fVar.f521847e) && this.f521848f == fVar.f521848f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521849g, fVar.f521849g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521850h, fVar.f521850h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521851i, fVar.f521851i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521852j, fVar.f521852j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521853k, fVar.f521853k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521854l, fVar.f521854l) && this.f521855m == fVar.f521855m;
    }

    /* renamed from: hashCode */
    public int m172662x8cdac1b() {
        int hashCode = this.f521843a.hashCode() * 31;
        java.lang.String str = this.f521844b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f521845c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f521846d;
        int hashCode4 = (((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f521847e.hashCode()) * 31) + this.f521848f.hashCode()) * 31) + this.f521849g.hashCode()) * 31;
        java.lang.String str4 = this.f521850h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f521851i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f521852j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f521853k;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f521854l;
        return ((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.f521855m.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172663x9616526c() {
        return "Report28760Item(actionType=" + this.f521843a + ", scene=" + this.f521844b + ", sceneNote=" + this.f521845c + ", sessionId=" + this.f521846d + ", pageId=" + this.f521847e + ", boxinfo=" + this.f521848f + ", docInfo=" + this.f521849g + ", itemInfo=" + this.f521850h + ", boxExtInfo=" + this.f521851i + ", extInfo=" + this.f521852j + ", clickId=" + this.f521853k + ", msgSessionId=" + this.f521854l + ", msgPageType=" + this.f521855m + ')';
    }
}
