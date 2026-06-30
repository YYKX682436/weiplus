package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f391685a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.n f391686b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f391687c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f391688d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f391689e;

    public d0(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.n nVar, yz5.l lVar, java.lang.Object obj2, java.lang.Throwable th6) {
        this.f391685a = obj;
        this.f391686b = nVar;
        this.f391687c = lVar;
        this.f391688d = obj2;
        this.f391689e = th6;
    }

    public static p3325xe03a0797.p3326xc267989b.d0 a(p3325xe03a0797.p3326xc267989b.d0 d0Var, java.lang.Object obj, p3325xe03a0797.p3326xc267989b.n nVar, yz5.l lVar, java.lang.Object obj2, java.lang.Throwable th6, int i17, java.lang.Object obj3) {
        if ((i17 & 1) != 0) {
            obj = d0Var.f391685a;
        }
        if ((i17 & 2) != 0) {
            nVar = d0Var.f391686b;
        }
        p3325xe03a0797.p3326xc267989b.n nVar2 = nVar;
        if ((i17 & 4) != 0) {
            lVar = d0Var.f391687c;
        }
        yz5.l lVar2 = lVar;
        if ((i17 & 8) != 0) {
            obj2 = d0Var.f391688d;
        }
        java.lang.Object obj4 = obj2;
        if ((i17 & 16) != 0) {
            th6 = d0Var.f391689e;
        }
        d0Var.getClass();
        return new p3325xe03a0797.p3326xc267989b.d0(obj, nVar2, lVar2, obj4, th6);
    }

    /* renamed from: equals */
    public boolean m143979xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3325xe03a0797.p3326xc267989b.d0)) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.d0 d0Var = (p3325xe03a0797.p3326xc267989b.d0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391685a, d0Var.f391685a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391686b, d0Var.f391686b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391687c, d0Var.f391687c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391688d, d0Var.f391688d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391689e, d0Var.f391689e);
    }

    /* renamed from: hashCode */
    public int m143980x8cdac1b() {
        java.lang.Object obj = this.f391685a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        p3325xe03a0797.p3326xc267989b.n nVar = this.f391686b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        yz5.l lVar = this.f391687c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        java.lang.Object obj2 = this.f391688d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th6 = this.f391689e;
        return hashCode4 + (th6 != null ? th6.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m143981x9616526c() {
        return "CompletedContinuation(result=" + this.f391685a + ", cancelHandler=" + this.f391686b + ", onCancellation=" + this.f391687c + ", idempotentResume=" + this.f391688d + ", cancelCause=" + this.f391689e + ')';
    }

    public /* synthetic */ d0(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.n nVar, yz5.l lVar, java.lang.Object obj2, java.lang.Throwable th6, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(obj, (i17 & 2) != 0 ? null : nVar, (i17 & 4) != 0 ? null : lVar, (i17 & 8) != 0 ? null : obj2, (i17 & 16) != 0 ? null : th6);
    }
}
