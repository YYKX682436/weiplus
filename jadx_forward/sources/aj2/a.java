package aj2;

/* loaded from: classes8.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final km2.q f86825d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86826e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86827f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f86828g;

    public a(km2.q qVar, boolean z17, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        qVar = (i17 & 1) != 0 ? null : qVar;
        z17 = (i17 & 2) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? true : z18;
        z19 = (i17 & 8) != 0 ? false : z19;
        this.f86825d = qVar;
        this.f86826e = z17;
        this.f86827f = z18;
        this.f86828g = z19;
    }

    /* renamed from: equals */
    public boolean m2127xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj2.a)) {
            return false;
        }
        aj2.a aVar = (aj2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86825d, aVar.f86825d) && this.f86826e == aVar.f86826e && this.f86827f == aVar.f86827f && this.f86828g == aVar.f86828g;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return m2129x8cdac1b();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m2129x8cdac1b() {
        km2.q qVar = this.f86825d;
        return ((((((qVar == null ? 0 : qVar.m143684x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f86826e)) * 31) + java.lang.Boolean.hashCode(this.f86827f)) * 31) + java.lang.Boolean.hashCode(this.f86828g);
    }

    /* renamed from: toString */
    public java.lang.String m2130x9616526c() {
        return "MicChangeData(micUser=" + this.f86825d + ", isSelected=" + this.f86826e + ", isHeaderEnableClick=" + this.f86827f + ", isNeedHideRecoverIcon=" + this.f86828g + ')';
    }
}
