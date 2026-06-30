package sr3;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f493378a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f493379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f493380c;

    public e(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f493378a = fragment;
        this.f493379b = str;
        this.f493380c = i17;
    }

    /* renamed from: equals */
    public boolean m165129xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3.e)) {
            return false;
        }
        sr3.e eVar = (sr3.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493378a, eVar.f493378a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493379b, eVar.f493379b) && this.f493380c == eVar.f493380c;
    }

    /* renamed from: hashCode */
    public int m165130x8cdac1b() {
        int m7479x8cdac1b = this.f493378a.m7479x8cdac1b() * 31;
        java.lang.String str = this.f493379b;
        return ((m7479x8cdac1b + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f493380c);
    }

    /* renamed from: toString */
    public java.lang.String m165131x9616526c() {
        return "FragmentWithTabText(fragment=" + this.f493378a + ", tabText=" + this.f493379b + ", tabType=" + this.f493380c + ')';
    }
}
