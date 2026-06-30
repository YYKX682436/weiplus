package ai0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f86601a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f86602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86604d;

    public i(java.lang.String name, android.view.View.OnClickListener action, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 4) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo : i17;
        i18 = (i19 & 8) != 0 ? 33 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f86601a = name;
        this.f86602b = action;
        this.f86603c = i17;
        this.f86604d = i18;
    }

    /* renamed from: equals */
    public boolean m2066xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai0.i)) {
            return false;
        }
        ai0.i iVar = (ai0.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86601a, iVar.f86601a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86602b, iVar.f86602b) && this.f86603c == iVar.f86603c && this.f86604d == iVar.f86604d;
    }

    /* renamed from: hashCode */
    public int m2067x8cdac1b() {
        return (((((this.f86601a.hashCode() * 31) + this.f86602b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f86603c)) * 31) + java.lang.Integer.hashCode(this.f86604d);
    }

    /* renamed from: toString */
    public java.lang.String m2068x9616526c() {
        return "SpanInfo(name=" + this.f86601a + ", action=" + this.f86602b + ", textColorRes=" + this.f86603c + ", flags=" + this.f86604d + ')';
    }
}
