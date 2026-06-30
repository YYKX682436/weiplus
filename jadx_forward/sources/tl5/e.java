package tl5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final tl5.j f501877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f501878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f501879c;

    public e(tl5.j snapshot, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        this.f501877a = snapshot;
        this.f501878b = i17;
        this.f501879c = i18;
    }

    /* renamed from: equals */
    public boolean m166758xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.e)) {
            return false;
        }
        tl5.e eVar = (tl5.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501877a, eVar.f501877a) && this.f501878b == eVar.f501878b && this.f501879c == eVar.f501879c;
    }

    /* renamed from: hashCode */
    public int m166759x8cdac1b() {
        return (((this.f501877a.m166766x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f501878b)) * 31) + java.lang.Integer.hashCode(this.f501879c);
    }

    /* renamed from: toString */
    public java.lang.String m166760x9616526c() {
        return "ItemWrapper(snapshot=" + this.f501877a + ", spanGroupIndex=" + this.f501878b + ", spanIndex=" + this.f501879c + ')';
    }
}
