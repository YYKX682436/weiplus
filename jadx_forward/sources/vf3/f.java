package vf3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public vf3.e f517922a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517923b;

    /* renamed from: c, reason: collision with root package name */
    public final int f517924c;

    /* renamed from: d, reason: collision with root package name */
    public final float f517925d;

    public f(vf3.e state, java.lang.String msg, int i17, float f17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        state = (i18 & 1) != 0 ? vf3.e.f517920q : state;
        msg = (i18 & 2) != 0 ? "" : msg;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        f17 = (i18 & 8) != 0 ? 0.0f : f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f517922a = state;
        this.f517923b = msg;
        this.f517924c = i17;
        this.f517925d = f17;
    }

    /* renamed from: equals */
    public boolean m171846xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3.f)) {
            return false;
        }
        vf3.f fVar = (vf3.f) obj;
        return this.f517922a == fVar.f517922a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517923b, fVar.f517923b) && this.f517924c == fVar.f517924c && java.lang.Float.compare(this.f517925d, fVar.f517925d) == 0;
    }

    /* renamed from: hashCode */
    public int m171847x8cdac1b() {
        return (((((this.f517922a.hashCode() * 31) + this.f517923b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f517924c)) * 31) + java.lang.Float.hashCode(this.f517925d);
    }

    /* renamed from: toString */
    public java.lang.String m171848x9616526c() {
        return "LiveStateInfo(state=" + this.f517922a + ", msg=" + this.f517923b + ", ret=" + this.f517924c + ", progress=" + this.f517925d + ')';
    }
}
