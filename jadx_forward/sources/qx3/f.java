package qx3;

/* loaded from: classes10.dex */
public final class f extends qx3.g {

    /* renamed from: a, reason: collision with root package name */
    public final long f448886a;

    /* renamed from: b, reason: collision with root package name */
    public final vx3.i f448887b;

    /* renamed from: c, reason: collision with root package name */
    public final int f448888c;

    public f(long j17, vx3.i iVar, int i17) {
        super(null);
        this.f448886a = j17;
        this.f448887b = iVar;
        this.f448888c = i17;
    }

    /* renamed from: equals */
    public boolean m161039xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx3.f)) {
            return false;
        }
        qx3.f fVar = (qx3.f) obj;
        return this.f448886a == fVar.f448886a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448887b, fVar.f448887b) && this.f448888c == fVar.f448888c;
    }

    /* renamed from: hashCode */
    public int m161040x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f448886a) * 31;
        vx3.i iVar = this.f448887b;
        return ((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f448888c);
    }

    /* renamed from: toString */
    public java.lang.String m161041x9616526c() {
        return "onPlay(id=" + this.f448886a + ", desc=" + this.f448887b + ", state=" + this.f448888c + ')';
    }
}
