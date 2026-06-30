package so2;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f492100a;

    /* renamed from: b, reason: collision with root package name */
    public final int f492101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f492102c;

    /* renamed from: d, reason: collision with root package name */
    public final int f492103d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f492104e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f492105f;

    public r0(long j17, int i17, int i18, int i19, boolean z17, boolean z18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i27 & 1) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            j17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.N8).mo141623x754a37bb()).r()).intValue();
        }
        i17 = (i27 & 2) != 0 ? -1 : i17;
        i18 = (i27 & 4) != 0 ? -1 : i18;
        i19 = (i27 & 8) != 0 ? -1 : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        z18 = (i27 & 32) != 0 ? false : z18;
        this.f492100a = j17;
        this.f492101b = i17;
        this.f492102c = i18;
        this.f492103d = i19;
        this.f492104e = z17;
        this.f492105f = z18;
    }

    /* renamed from: equals */
    public boolean m164939xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.r0)) {
            return false;
        }
        so2.r0 r0Var = (so2.r0) obj;
        return this.f492100a == r0Var.f492100a && this.f492101b == r0Var.f492101b && this.f492102c == r0Var.f492102c && this.f492103d == r0Var.f492103d && this.f492104e == r0Var.f492104e && this.f492105f == r0Var.f492105f;
    }

    /* renamed from: hashCode */
    public int m164940x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f492100a) * 31) + java.lang.Integer.hashCode(this.f492101b)) * 31) + java.lang.Integer.hashCode(this.f492102c)) * 31) + java.lang.Integer.hashCode(this.f492103d)) * 31) + java.lang.Boolean.hashCode(this.f492104e)) * 31) + java.lang.Boolean.hashCode(this.f492105f);
    }

    /* renamed from: toString */
    public java.lang.String m164941x9616526c() {
        return "Config(fastScrollThreshold=" + this.f492100a + ", fastScrollCount=" + this.f492101b + ", continueFastScrollCount=" + this.f492102c + ", upwardFastScrollCount=" + this.f492103d + ", resetDataAfterCallback=" + this.f492104e + ", fastScrollCheckWhenStateIdle=" + this.f492105f + ')';
    }
}
