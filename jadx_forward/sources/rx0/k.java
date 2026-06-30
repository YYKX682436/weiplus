package rx0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final rx0.j f482466i = new rx0.j(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f482467a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f482468b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 f482469c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.q23 f482470d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482471e;

    /* renamed from: f, reason: collision with root package name */
    public final yx0.u f482472f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f482473g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f482474h;

    public k(int i17, boolean z17, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5, r45.q23 q23Var, java.lang.String str, yx0.u uVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, java.lang.String str2) {
        this.f482467a = i17;
        this.f482468b = z17;
        this.f482469c = c3981x30b9dbd5;
        this.f482470d = q23Var;
        this.f482471e = str;
        this.f482472f = uVar;
        this.f482473g = c4128x879fba0a;
        this.f482474h = str2;
    }

    /* renamed from: equals */
    public boolean m163385xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.k)) {
            return false;
        }
        rx0.k kVar = (rx0.k) obj;
        return this.f482467a == kVar.f482467a && this.f482468b == kVar.f482468b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482469c, kVar.f482469c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482470d, kVar.f482470d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482471e, kVar.f482471e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482472f, kVar.f482472f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482473g, kVar.f482473g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482474h, kVar.f482474h);
    }

    /* renamed from: hashCode */
    public int m163386x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f482467a) * 31) + java.lang.Boolean.hashCode(this.f482468b)) * 31;
        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5 = this.f482469c;
        int hashCode2 = (hashCode + (c3981x30b9dbd5 == null ? 0 : c3981x30b9dbd5.hashCode())) * 31;
        r45.q23 q23Var = this.f482470d;
        int hashCode3 = (hashCode2 + (q23Var == null ? 0 : q23Var.hashCode())) * 31;
        java.lang.String str = this.f482471e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        yx0.u uVar = this.f482472f;
        int hashCode5 = (hashCode4 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f482473g;
        int hashCode6 = (hashCode5 + (c4128x879fba0a == null ? 0 : c4128x879fba0a.hashCode())) * 31;
        java.lang.String str2 = this.f482474h;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m163387x9616526c() {
        return "TemplateResult(result=" + this.f482467a + ", isVideo=" + this.f482468b + ", finishInfo=" + this.f482469c + ", templateInfo=" + this.f482470d + ", selectedMjMusicId=" + this.f482471e + ", musicState=" + this.f482472f + ", coverStartTime=" + this.f482473g + ", conditionNotMetReason=" + this.f482474h + ')';
    }
}
