package so2;

/* loaded from: classes2.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f492088a;

    /* renamed from: b, reason: collision with root package name */
    public int f492089b;

    /* renamed from: c, reason: collision with root package name */
    public long f492090c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f492091d;

    /* renamed from: e, reason: collision with root package name */
    public long f492092e;

    /* renamed from: f, reason: collision with root package name */
    public int f492093f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f492094g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f492095h;

    public q6(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, long j17, java.lang.String str, long j18, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.lang.String str2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i19 & 1) != 0 ? null : gVar;
        int i27 = (i19 & 2) != 0 ? -1 : i17;
        long j19 = (i19 & 4) != 0 ? 0L : j17;
        java.lang.String str3 = (i19 & 8) != 0 ? null : str;
        long j27 = (i19 & 16) == 0 ? j18 : 0L;
        int i28 = (i19 & 32) == 0 ? i18 : -1;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i19 & 64) != 0 ? null : gVar2;
        java.lang.String str4 = (i19 & 128) == 0 ? str2 : null;
        this.f492088a = gVar3;
        this.f492089b = i27;
        this.f492090c = j19;
        this.f492091d = str3;
        this.f492092e = j27;
        this.f492093f = i28;
        this.f492094g = gVar4;
        this.f492095h = str4;
    }

    /* renamed from: equals */
    public boolean m164936xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.q6)) {
            return false;
        }
        so2.q6 q6Var = (so2.q6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492088a, q6Var.f492088a) && this.f492089b == q6Var.f492089b && this.f492090c == q6Var.f492090c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492091d, q6Var.f492091d) && this.f492092e == q6Var.f492092e && this.f492093f == q6Var.f492093f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492094g, q6Var.f492094g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492095h, q6Var.f492095h);
    }

    /* renamed from: hashCode */
    public int m164937x8cdac1b() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f492088a;
        int hashCode = (((((gVar == null ? 0 : gVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f492089b)) * 31) + java.lang.Long.hashCode(this.f492090c)) * 31;
        java.lang.String str = this.f492091d;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f492092e)) * 31) + java.lang.Integer.hashCode(this.f492093f)) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f492094g;
        int hashCode3 = (hashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        java.lang.String str2 = this.f492095h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164938x9616526c() {
        return "TopicCollectionReqArgs(lastBuffer=" + this.f492088a + ", topicType=" + this.f492089b + ", fromObjectId=" + this.f492090c + ", dupFlag=" + this.f492091d + ", topicId=" + this.f492092e + ", rollDir=" + this.f492093f + ", topicBuffer=" + this.f492094g + ", encryptedTopicId=" + this.f492095h + ')';
    }
}
