package sr3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f493373a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f493374b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f493375c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f493376d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f493377e;

    public d(java.util.List fragmentsToAdd, java.util.List fragmentsToRemove, java.util.Map fragmentsToUpdate, java.util.Map tabTextsToUpdate, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentsToAdd, "fragmentsToAdd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentsToRemove, "fragmentsToRemove");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentsToUpdate, "fragmentsToUpdate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabTextsToUpdate, "tabTextsToUpdate");
        this.f493373a = fragmentsToAdd;
        this.f493374b = fragmentsToRemove;
        this.f493375c = fragmentsToUpdate;
        this.f493376d = tabTextsToUpdate;
        this.f493377e = z17;
    }

    /* renamed from: equals */
    public boolean m165126xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3.d)) {
            return false;
        }
        sr3.d dVar = (sr3.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493373a, dVar.f493373a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493374b, dVar.f493374b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493375c, dVar.f493375c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493376d, dVar.f493376d) && this.f493377e == dVar.f493377e;
    }

    /* renamed from: hashCode */
    public int m165127x8cdac1b() {
        return (((((((this.f493373a.hashCode() * 31) + this.f493374b.hashCode()) * 31) + this.f493375c.hashCode()) * 31) + this.f493376d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f493377e);
    }

    /* renamed from: toString */
    public java.lang.String m165128x9616526c() {
        return "FragmentUpdateResult(fragmentsToAdd=" + this.f493373a + ", fragmentsToRemove=" + this.f493374b + ", fragmentsToUpdate=" + this.f493375c + ", tabTextsToUpdate=" + this.f493376d + ", shouldNotifyDataSetChanged=" + this.f493377e + ')';
    }
}
