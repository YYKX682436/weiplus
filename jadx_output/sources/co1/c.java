package co1;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f43752a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f43753b;

    /* renamed from: c, reason: collision with root package name */
    public t21.v2 f43754c;

    /* renamed from: d, reason: collision with root package name */
    public t21.v2 f43755d;

    /* renamed from: e, reason: collision with root package name */
    public co1.b f43756e;

    /* renamed from: f, reason: collision with root package name */
    public r15.b f43757f;

    /* renamed from: g, reason: collision with root package name */
    public ot0.t f43758g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.d f43759h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f43760i;

    /* renamed from: j, reason: collision with root package name */
    public long f43761j;

    public c(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, java.lang.String str, t21.v2 v2Var, t21.v2 v2Var2, co1.b bVar, r15.b bVar2, ot0.t tVar, com.tencent.mm.pluginsdk.model.app.d dVar, boolean z17, long j17, int i17, kotlin.jvm.internal.i iVar) {
        emojiInfo = (i17 & 1) != 0 ? null : emojiInfo;
        str = (i17 & 2) != 0 ? null : str;
        v2Var = (i17 & 4) != 0 ? null : v2Var;
        v2Var2 = (i17 & 8) != 0 ? null : v2Var2;
        bVar = (i17 & 16) != 0 ? null : bVar;
        bVar2 = (i17 & 32) != 0 ? null : bVar2;
        tVar = (i17 & 64) != 0 ? null : tVar;
        dVar = (i17 & 128) != 0 ? null : dVar;
        z17 = (i17 & 256) != 0 ? false : z17;
        j17 = (i17 & 512) != 0 ? -1L : j17;
        this.f43752a = emojiInfo;
        this.f43753b = str;
        this.f43754c = v2Var;
        this.f43755d = v2Var2;
        this.f43756e = bVar;
        this.f43757f = bVar2;
        this.f43758g = tVar;
        this.f43759h = dVar;
        this.f43760i = z17;
        this.f43761j = j17;
    }

    public final com.tencent.mm.pluginsdk.model.app.d a() {
        return this.f43759h;
    }

    public final ot0.t b() {
        return this.f43758g;
    }

    public final com.tencent.mm.storage.emotion.EmojiInfo c() {
        return this.f43752a;
    }

    public final long d() {
        return this.f43761j;
    }

    public final r15.b e() {
        return this.f43757f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.c)) {
            return false;
        }
        co1.c cVar = (co1.c) obj;
        return kotlin.jvm.internal.o.b(this.f43752a, cVar.f43752a) && kotlin.jvm.internal.o.b(this.f43753b, cVar.f43753b) && kotlin.jvm.internal.o.b(this.f43754c, cVar.f43754c) && kotlin.jvm.internal.o.b(this.f43755d, cVar.f43755d) && kotlin.jvm.internal.o.b(this.f43756e, cVar.f43756e) && kotlin.jvm.internal.o.b(this.f43757f, cVar.f43757f) && kotlin.jvm.internal.o.b(this.f43758g, cVar.f43758g) && kotlin.jvm.internal.o.b(this.f43759h, cVar.f43759h) && this.f43760i == cVar.f43760i && this.f43761j == cVar.f43761j;
    }

    public final java.lang.String f() {
        return this.f43753b;
    }

    public final boolean g() {
        return this.f43760i;
    }

    public final t21.v2 h() {
        return this.f43755d;
    }

    public int hashCode() {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f43752a;
        int hashCode = (emojiInfo == null ? 0 : emojiInfo.hashCode()) * 31;
        java.lang.String str = this.f43753b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t21.v2 v2Var = this.f43754c;
        int hashCode3 = (hashCode2 + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        t21.v2 v2Var2 = this.f43755d;
        int hashCode4 = (hashCode3 + (v2Var2 == null ? 0 : v2Var2.hashCode())) * 31;
        co1.b bVar = this.f43756e;
        int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        r15.b bVar2 = this.f43757f;
        int hashCode6 = (hashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ot0.t tVar = this.f43758g;
        int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f43759h;
        return ((((hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f43760i)) * 31) + java.lang.Long.hashCode(this.f43761j);
    }

    public final co1.b i() {
        return this.f43756e;
    }

    public final t21.v2 j() {
        return this.f43754c;
    }

    public final void k(java.lang.String str) {
        this.f43753b = str;
    }

    public final void l(co1.b bVar) {
        this.f43756e = bVar;
    }

    public java.lang.String toString() {
        return "RecoverExtraInfo(emojiInfo=" + this.f43752a + ", msgKey=" + this.f43753b + ", videoInfo=" + this.f43754c + ", originVideoInfo=" + this.f43755d + ", recoverExtraImageInfo=" + this.f43756e + ", extCommonInfo=" + this.f43757f + ", appMessage=" + this.f43758g + ", appAttach=" + this.f43759h + ", needInsertWithMsgId=" + this.f43760i + ", existAppAttachRowId=" + this.f43761j + ')';
    }
}
