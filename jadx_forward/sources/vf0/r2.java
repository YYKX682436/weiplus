package vf0;

/* loaded from: classes12.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final c01.f7 f517790a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.uf6 f517791b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f517792c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.xz6 f517793d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f517794e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vh4 f517795f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f517796g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f517797h;

    /* renamed from: i, reason: collision with root package name */
    public r15.d f517798i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f517799j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f517800k;

    public r2(c01.f7 f7Var, r45.uf6 uf6Var, java.lang.String str, r45.xz6 xz6Var, java.lang.String str2, r45.vh4 vh4Var, boolean z17, vf0.p2 p2Var, java.lang.String str3, r15.d dVar, boolean z18, boolean z19) {
        this.f517790a = f7Var;
        this.f517791b = uf6Var;
        this.f517792c = str;
        this.f517793d = xz6Var;
        this.f517794e = str2;
        this.f517795f = vh4Var;
        this.f517796g = z17;
        this.f517797h = str3;
        this.f517798i = dVar;
        this.f517799j = z18;
        this.f517800k = z19;
    }

    /* renamed from: equals */
    public boolean m171799xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.r2)) {
            return false;
        }
        vf0.r2 r2Var = (vf0.r2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517790a, r2Var.f517790a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517791b, r2Var.f517791b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517792c, r2Var.f517792c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517793d, r2Var.f517793d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517794e, r2Var.f517794e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517795f, r2Var.f517795f) && this.f517796g == r2Var.f517796g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517797h, r2Var.f517797h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517798i, r2Var.f517798i) && this.f517799j == r2Var.f517799j && this.f517800k == r2Var.f517800k;
    }

    /* renamed from: hashCode */
    public int m171800x8cdac1b() {
        c01.f7 f7Var = this.f517790a;
        int hashCode = (f7Var == null ? 0 : f7Var.hashCode()) * 31;
        r45.uf6 uf6Var = this.f517791b;
        int hashCode2 = (hashCode + (uf6Var == null ? 0 : uf6Var.hashCode())) * 31;
        java.lang.String str = this.f517792c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        r45.xz6 xz6Var = this.f517793d;
        int hashCode4 = (hashCode3 + (xz6Var == null ? 0 : xz6Var.hashCode())) * 31;
        java.lang.String str2 = this.f517794e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r45.vh4 vh4Var = this.f517795f;
        int hashCode6 = (((((hashCode5 + (vh4Var == null ? 0 : vh4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f517796g)) * 31) + 0) * 31;
        java.lang.String str3 = this.f517797h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r15.d dVar = this.f517798i;
        return ((((hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f517799j)) * 31) + java.lang.Boolean.hashCode(this.f517800k);
    }

    /* renamed from: toString */
    public java.lang.String m171801x9616526c() {
        return "VideoSendCrossData(favDataItem=" + this.f517790a + ", streamVideo=" + this.f517791b + ", stateExtStr=" + this.f517792c + ", videoWxaInfo=" + this.f517793d + ", weAppSourceUserName=" + this.f517794e + ", mmSightExtInfo=" + this.f517795f + ", importFromTempCopyPath=" + this.f517796g + ", appInfo=null, batchRevokeId=" + this.f517797h + ", groupInfo=" + this.f517798i + ", onlySendCompressVideo=" + this.f517799j + ", forceSkipCompress=" + this.f517800k + ')';
    }

    public /* synthetic */ r2(c01.f7 f7Var, r45.uf6 uf6Var, java.lang.String str, r45.xz6 xz6Var, java.lang.String str2, r45.vh4 vh4Var, boolean z17, vf0.p2 p2Var, java.lang.String str3, r15.d dVar, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : f7Var, (i17 & 2) != 0 ? null : uf6Var, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : xz6Var, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? null : vh4Var, (i17 & 64) != 0 ? false : z17, (i17 & 128) != 0 ? null : p2Var, (i17 & 256) != 0 ? null : str3, (i17 & 512) == 0 ? dVar : null, (i17 & 1024) != 0 ? false : z18, (i17 & 2048) == 0 ? z19 : false);
    }
}
