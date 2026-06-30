package ae5;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final zd5.a f85944a;

    /* renamed from: b, reason: collision with root package name */
    public zd5.b f85945b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f85946c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f85947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f85948e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f85949f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f85950g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f85951h;

    /* renamed from: i, reason: collision with root package name */
    public final long f85952i;

    /* renamed from: j, reason: collision with root package name */
    public final p13.y f85953j;

    /* renamed from: k, reason: collision with root package name */
    public final p13.r f85954k;

    /* renamed from: l, reason: collision with root package name */
    public final long f85955l;

    public j(zd5.a aVar, zd5.b bVar, java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str3, java.lang.String str4, long j17, p13.y yVar, p13.r rVar, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        zd5.a resultType = (i17 & 1) != 0 ? zd5.a.f553184e : aVar;
        zd5.b msgType = (i17 & 2) != 0 ? zd5.b.f553189e : bVar;
        java.lang.String str5 = (i17 & 4) != 0 ? "" : str;
        java.lang.String str6 = (i17 & 8) != 0 ? "" : str2;
        java.lang.CharSequence charSequence3 = (i17 & 16) != 0 ? "" : charSequence;
        java.lang.CharSequence charSequence4 = (i17 & 32) != 0 ? "" : charSequence2;
        java.lang.String str7 = (i17 & 64) != 0 ? "" : str3;
        java.lang.String str8 = (i17 & 128) == 0 ? str4 : "";
        p13.y yVar2 = (i17 & 512) != 0 ? null : yVar;
        p13.r rVar2 = (i17 & 1024) == 0 ? rVar : null;
        long j19 = (i17 & 2048) != 0 ? 0L : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultType, "resultType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgType, "msgType");
        this.f85944a = resultType;
        this.f85945b = msgType;
        this.f85946c = str5;
        this.f85947d = str6;
        this.f85948e = charSequence3;
        this.f85949f = charSequence4;
        this.f85950g = str7;
        this.f85951h = str8;
        this.f85952i = j17;
        this.f85953j = yVar2;
        this.f85954k = rVar2;
        this.f85955l = j19;
    }

    /* renamed from: equals */
    public boolean m1817xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof ae5.j)) {
            return super.equals(obj);
        }
        return this.f85952i == ((ae5.j) obj).f85952i;
    }

    /* renamed from: hashCode */
    public int m1818x8cdac1b() {
        int hashCode = ((this.f85944a.hashCode() * 31) + this.f85945b.hashCode()) * 31;
        java.lang.String str = this.f85946c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f85947d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.CharSequence charSequence = this.f85948e;
        int hashCode4 = (hashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.f85949f;
        int hashCode5 = (hashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        java.lang.String str3 = this.f85950g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f85951h;
        int hashCode7 = (((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Long.hashCode(this.f85952i)) * 31;
        p13.y yVar = this.f85953j;
        int hashCode8 = (hashCode7 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        p13.r rVar = this.f85954k;
        return ((hashCode8 + (rVar != null ? rVar.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f85955l);
    }

    /* renamed from: toString */
    public java.lang.String m1819x9616526c() {
        return "FTSMultiResultAllResultItemBean(resultType=" + this.f85944a + ", msgType=" + this.f85945b + ", userName=" + this.f85946c + ", nickName=" + this.f85947d + ", content=" + ((java.lang.Object) this.f85948e) + ", time=" + ((java.lang.Object) this.f85949f) + ", imagePath=" + this.f85950g + ", talker=" + this.f85951h + ", msgId=" + this.f85952i + ", matchInfo=" + this.f85953j + ", ftsQuery=" + this.f85954k + ", timeStamp=" + this.f85955l + ')';
    }
}
