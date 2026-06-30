package ii2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f373150a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f373151b;

    /* renamed from: c, reason: collision with root package name */
    public final ii2.b f373152c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f373153d;

    public a(int i17, android.graphics.Rect dividerRect, ii2.b lineShow, yz5.p pVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        lineShow = (i18 & 4) != 0 ? ii2.b.f373155e : lineShow;
        pVar = (i18 & 8) != 0 ? null : pVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dividerRect, "dividerRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lineShow, "lineShow");
        this.f373150a = i17;
        this.f373151b = dividerRect;
        this.f373152c = lineShow;
        this.f373153d = pVar;
    }

    /* renamed from: equals */
    public boolean m136644xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii2.a)) {
            return false;
        }
        ii2.a aVar = (ii2.a) obj;
        return this.f373150a == aVar.f373150a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373151b, aVar.f373151b) && this.f373152c == aVar.f373152c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373153d, aVar.f373153d);
    }

    /* renamed from: hashCode */
    public int m136645x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f373150a) * 31) + this.f373151b.hashCode()) * 31) + this.f373152c.hashCode()) * 31;
        yz5.p pVar = this.f373153d;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m136646x9616526c() {
        return "Config(color=" + this.f373150a + ", dividerRect=" + this.f373151b + ", lineShow=" + this.f373152c + ", skipBlock=" + this.f373153d + ')';
    }
}
