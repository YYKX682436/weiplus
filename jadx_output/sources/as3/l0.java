package as3;

/* loaded from: classes11.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final as3.m0 f13524a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f13525b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f13526c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f13527d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f13528e;

    public l0(as3.m0 type, android.widget.TextView textView, android.view.ViewGroup layout, android.view.View view, yz5.a aVar) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f13524a = type;
        this.f13525b = textView;
        this.f13526c = layout;
        this.f13527d = view;
        this.f13528e = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as3.l0)) {
            return false;
        }
        as3.l0 l0Var = (as3.l0) obj;
        return this.f13524a == l0Var.f13524a && kotlin.jvm.internal.o.b(this.f13525b, l0Var.f13525b) && kotlin.jvm.internal.o.b(this.f13526c, l0Var.f13526c) && kotlin.jvm.internal.o.b(this.f13527d, l0Var.f13527d) && kotlin.jvm.internal.o.b(this.f13528e, l0Var.f13528e);
    }

    public int hashCode() {
        int hashCode = ((((this.f13524a.hashCode() * 31) + this.f13525b.hashCode()) * 31) + this.f13526c.hashCode()) * 31;
        android.view.View view = this.f13527d;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        yz5.a aVar = this.f13528e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TabInfo(type=" + this.f13524a + ", textView=" + this.f13525b + ", layout=" + this.f13526c + ", indicator=" + this.f13527d + ", onSelected=" + this.f13528e + ')';
    }
}
