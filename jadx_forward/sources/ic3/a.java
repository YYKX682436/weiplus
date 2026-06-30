package ic3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f371919a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f371920b;

    public a(int i17, android.view.View.OnClickListener clickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        this.f371919a = i17;
        this.f371920b = clickListener;
    }

    /* renamed from: equals */
    public boolean m135082xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic3.a)) {
            return false;
        }
        ic3.a aVar = (ic3.a) obj;
        return this.f371919a == aVar.f371919a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371920b, aVar.f371920b);
    }

    /* renamed from: hashCode */
    public int m135083x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f371919a) * 31) + this.f371920b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m135084x9616526c() {
        return "ButtonData(id=" + this.f371919a + ", clickListener=" + this.f371920b + ')';
    }
}
