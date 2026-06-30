package as3;

/* loaded from: classes11.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final as3.m0 f95057a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f95058b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f95059c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f95060d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f95061e;

    public l0(as3.m0 type, android.widget.TextView textView, android.view.ViewGroup layout, android.view.View view, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f95057a = type;
        this.f95058b = textView;
        this.f95059c = layout;
        this.f95060d = view;
        this.f95061e = aVar;
    }

    /* renamed from: equals */
    public boolean m8961xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as3.l0)) {
            return false;
        }
        as3.l0 l0Var = (as3.l0) obj;
        return this.f95057a == l0Var.f95057a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95058b, l0Var.f95058b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95059c, l0Var.f95059c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95060d, l0Var.f95060d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95061e, l0Var.f95061e);
    }

    /* renamed from: hashCode */
    public int m8962x8cdac1b() {
        int hashCode = ((((this.f95057a.hashCode() * 31) + this.f95058b.hashCode()) * 31) + this.f95059c.hashCode()) * 31;
        android.view.View view = this.f95060d;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        yz5.a aVar = this.f95061e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m8963x9616526c() {
        return "TabInfo(type=" + this.f95057a + ", textView=" + this.f95058b + ", layout=" + this.f95059c + ", indicator=" + this.f95060d + ", onSelected=" + this.f95061e + ')';
    }
}
