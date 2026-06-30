package so4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public uq5.p f492299a;

    /* renamed from: b, reason: collision with root package name */
    public int f492300b;

    public a(uq5.p pVar, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        pVar = (i18 & 1) != 0 ? null : pVar;
        i17 = (i18 & 2) != 0 ? 12 : i17;
        this.f492299a = pVar;
        this.f492300b = i17;
    }

    public final long a() {
        uq5.p pVar = this.f492299a;
        if (pVar != null) {
            return pVar.f511800a;
        }
        return 0L;
    }

    /* renamed from: equals */
    public boolean m164991xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so4.a)) {
            return false;
        }
        so4.a aVar = (so4.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492299a, aVar.f492299a) && this.f492300b == aVar.f492300b;
    }

    /* renamed from: hashCode */
    public int m164992x8cdac1b() {
        uq5.p pVar = this.f492299a;
        return ((pVar == null ? 0 : pVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f492300b);
    }

    /* renamed from: toString */
    public java.lang.String m164993x9616526c() {
        return "VideoEnhancementEffectInfo(effect=" + this.f492299a + ", currentScene=" + this.f492300b + ')';
    }
}
