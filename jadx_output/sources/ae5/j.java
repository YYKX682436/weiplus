package ae5;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final zd5.a f4411a;

    /* renamed from: b, reason: collision with root package name */
    public zd5.b f4412b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f4413c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f4414d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f4415e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f4416f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f4417g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f4418h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4419i;

    /* renamed from: j, reason: collision with root package name */
    public final p13.y f4420j;

    /* renamed from: k, reason: collision with root package name */
    public final p13.r f4421k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4422l;

    public j(zd5.a aVar, zd5.b bVar, java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str3, java.lang.String str4, long j17, p13.y yVar, p13.r rVar, long j18, int i17, kotlin.jvm.internal.i iVar) {
        zd5.a resultType = (i17 & 1) != 0 ? zd5.a.f471651e : aVar;
        zd5.b msgType = (i17 & 2) != 0 ? zd5.b.f471656e : bVar;
        java.lang.String str5 = (i17 & 4) != 0 ? "" : str;
        java.lang.String str6 = (i17 & 8) != 0 ? "" : str2;
        java.lang.CharSequence charSequence3 = (i17 & 16) != 0 ? "" : charSequence;
        java.lang.CharSequence charSequence4 = (i17 & 32) != 0 ? "" : charSequence2;
        java.lang.String str7 = (i17 & 64) != 0 ? "" : str3;
        java.lang.String str8 = (i17 & 128) == 0 ? str4 : "";
        p13.y yVar2 = (i17 & 512) != 0 ? null : yVar;
        p13.r rVar2 = (i17 & 1024) == 0 ? rVar : null;
        long j19 = (i17 & 2048) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(resultType, "resultType");
        kotlin.jvm.internal.o.g(msgType, "msgType");
        this.f4411a = resultType;
        this.f4412b = msgType;
        this.f4413c = str5;
        this.f4414d = str6;
        this.f4415e = charSequence3;
        this.f4416f = charSequence4;
        this.f4417g = str7;
        this.f4418h = str8;
        this.f4419i = j17;
        this.f4420j = yVar2;
        this.f4421k = rVar2;
        this.f4422l = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof ae5.j)) {
            return super.equals(obj);
        }
        return this.f4419i == ((ae5.j) obj).f4419i;
    }

    public int hashCode() {
        int hashCode = ((this.f4411a.hashCode() * 31) + this.f4412b.hashCode()) * 31;
        java.lang.String str = this.f4413c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f4414d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.CharSequence charSequence = this.f4415e;
        int hashCode4 = (hashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.f4416f;
        int hashCode5 = (hashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        java.lang.String str3 = this.f4417g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f4418h;
        int hashCode7 = (((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Long.hashCode(this.f4419i)) * 31;
        p13.y yVar = this.f4420j;
        int hashCode8 = (hashCode7 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        p13.r rVar = this.f4421k;
        return ((hashCode8 + (rVar != null ? rVar.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f4422l);
    }

    public java.lang.String toString() {
        return "FTSMultiResultAllResultItemBean(resultType=" + this.f4411a + ", msgType=" + this.f4412b + ", userName=" + this.f4413c + ", nickName=" + this.f4414d + ", content=" + ((java.lang.Object) this.f4415e) + ", time=" + ((java.lang.Object) this.f4416f) + ", imagePath=" + this.f4417g + ", talker=" + this.f4418h + ", msgId=" + this.f4419i + ", matchInfo=" + this.f4420j + ", ftsQuery=" + this.f4421k + ", timeStamp=" + this.f4422l + ')';
    }
}
