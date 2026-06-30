package v11;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f514020a;

    public x(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57) {
        this.f514020a = i37;
    }

    /* renamed from: equals */
    public boolean m170961xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.x)) {
            return false;
        }
        v11.x xVar = (v11.x) obj;
        xVar.getClass();
        return this.f514020a == xVar.f514020a;
    }

    /* renamed from: hashCode */
    public int m170962x8cdac1b() {
        return (((((((((((((((((((((((java.lang.Integer.hashCode(-4958209) * 31) + java.lang.Integer.hashCode(-14254183)) * 31) + java.lang.Integer.hashCode(-16748351)) * 31) + java.lang.Integer.hashCode(-3653568)) * 31) + java.lang.Integer.hashCode(-16153000)) * 31) + java.lang.Integer.hashCode(-16744448)) * 31) + java.lang.Integer.hashCode(this.f514020a)) * 31) + java.lang.Integer.hashCode(-8823258)) * 31) + java.lang.Integer.hashCode(-8388608)) * 31) + java.lang.Integer.hashCode(-40634)) * 31) + java.lang.Integer.hashCode(-8823258)) * 31) + java.lang.Integer.hashCode(-14442241)) * 31) + java.lang.Integer.hashCode(-16748351);
    }

    /* renamed from: toString */
    public java.lang.String m170963x9616526c() {
        return "NativeMarkdownCodeHighlightColors(keyword=-4958209, type=-14254183, literal=-16748351, string=-3653568, number=-16153000, comment=-16744448, operator=" + this.f514020a + ", annotation=-8823258, tag=-8388608, property=-40634, function=-8823258, variable=-14442241, constant=-16748351)";
    }
}
