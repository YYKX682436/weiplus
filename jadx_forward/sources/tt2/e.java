package tt2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f503405a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f503406b;

    public e(so2.j5 shopItem, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shopItem, "shopItem");
        this.f503405a = shopItem;
        this.f503406b = z17;
    }

    /* renamed from: equals */
    public boolean m167035xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt2.e)) {
            return false;
        }
        tt2.e eVar = (tt2.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f503405a, eVar.f503405a) && this.f503406b == eVar.f503406b;
    }

    /* renamed from: hashCode */
    public int m167036x8cdac1b() {
        return (this.f503405a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f503406b);
    }

    /* renamed from: toString */
    public java.lang.String m167037x9616526c() {
        return "EditData(shopItem=" + this.f503405a + ", select=" + this.f503406b + ')';
    }
}
