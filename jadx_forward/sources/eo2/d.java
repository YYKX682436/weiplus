package eo2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f337092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f337093b;

    /* renamed from: c, reason: collision with root package name */
    public final int f337094c;

    /* renamed from: d, reason: collision with root package name */
    public long f337095d;

    /* renamed from: e, reason: collision with root package name */
    public int f337096e;

    public d(boolean z17, int i17, int i18, long j17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i19 = (i27 & 16) != 0 ? 0 : i19;
        this.f337092a = z17;
        this.f337093b = i17;
        this.f337094c = i18;
        this.f337095d = j17;
        this.f337096e = i19;
    }

    /* renamed from: equals */
    public boolean m127956xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo2.d)) {
            return false;
        }
        eo2.d dVar = (eo2.d) obj;
        return this.f337092a == dVar.f337092a && this.f337093b == dVar.f337093b && this.f337094c == dVar.f337094c && this.f337095d == dVar.f337095d && this.f337096e == dVar.f337096e;
    }

    /* renamed from: hashCode */
    public int m127957x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f337092a) * 31) + java.lang.Integer.hashCode(this.f337093b)) * 31) + java.lang.Integer.hashCode(this.f337094c)) * 31) + java.lang.Long.hashCode(this.f337095d)) * 31) + java.lang.Integer.hashCode(this.f337096e);
    }

    /* renamed from: toString */
    public java.lang.String m127958x9616526c() {
        return "StatusInfo(success=" + this.f337092a + ", memberShipStatus=" + this.f337093b + ", visitorMemberStatus=" + this.f337094c + ", expireTime=" + this.f337095d + ", repeatCount=" + this.f337096e + ')';
    }
}
