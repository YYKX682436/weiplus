package mk5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f408694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f408695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f408696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f408697d;

    /* renamed from: e, reason: collision with root package name */
    public final float f408698e;

    public a(java.lang.CharSequence charSequence, int i17, int i18, int i19, float f17) {
        this.f408694a = charSequence;
        this.f408695b = i17;
        this.f408696c = i18;
        this.f408697d = i19;
        this.f408698e = f17;
    }

    /* renamed from: equals */
    public boolean m147417xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk5.a)) {
            return false;
        }
        mk5.a aVar = (mk5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408694a, aVar.f408694a) && this.f408695b == aVar.f408695b && this.f408696c == aVar.f408696c && this.f408697d == aVar.f408697d && java.lang.Float.compare(this.f408698e, aVar.f408698e) == 0;
    }

    /* renamed from: hashCode */
    public int m147418x8cdac1b() {
        java.lang.CharSequence charSequence = this.f408694a;
        return ((((((((charSequence == null ? 0 : charSequence.hashCode()) * 31) + java.lang.Integer.hashCode(this.f408695b)) * 31) + java.lang.Integer.hashCode(this.f408696c)) * 31) + java.lang.Integer.hashCode(this.f408697d)) * 31) + java.lang.Float.hashCode(this.f408698e);
    }

    /* renamed from: toString */
    public java.lang.String m147419x9616526c() {
        return "VasActionBarData(title=" + ((java.lang.Object) this.f408694a) + ", mapBackBtnIconColor=" + this.f408695b + ", backColor=" + this.f408696c + ", textColor=" + this.f408697d + ", titleTextSize=" + this.f408698e + ')';
    }
}
