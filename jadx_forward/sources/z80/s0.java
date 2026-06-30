package z80;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f552202a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f552203b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f552204c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f552205d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f552206e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f552207f;

    public s0(java.util.Set firstLineMenuItemSet, java.util.Set secondLineMenuItemSet, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 locationInfo, boolean z17, yz5.l lVar, yz5.l lVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstLineMenuItemSet, "firstLineMenuItemSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secondLineMenuItemSet, "secondLineMenuItemSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locationInfo, "locationInfo");
        this.f552202a = firstLineMenuItemSet;
        this.f552203b = secondLineMenuItemSet;
        this.f552204c = locationInfo;
        this.f552205d = z17;
        this.f552206e = lVar;
        this.f552207f = lVar2;
    }

    /* renamed from: equals */
    public boolean m178550xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.s0)) {
            return false;
        }
        z80.s0 s0Var = (z80.s0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552202a, s0Var.f552202a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552203b, s0Var.f552203b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552204c, s0Var.f552204c) && this.f552205d == s0Var.f552205d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552206e, s0Var.f552206e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552207f, s0Var.f552207f);
    }

    /* renamed from: hashCode */
    public int m178551x8cdac1b() {
        int hashCode = ((((((this.f552202a.hashCode() * 31) + this.f552203b.hashCode()) * 31) + this.f552204c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f552205d)) * 31;
        yz5.l lVar = this.f552206e;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.l lVar2 = this.f552207f;
        return hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m178552x9616526c() {
        return "POIMoreActionSheetMenuConfig(firstLineMenuItemSet=" + this.f552202a + ", secondLineMenuItemSet=" + this.f552203b + ", locationInfo=" + this.f552204c + ", showRecentForward=" + this.f552205d + ", onMenuItemClickCallback=" + this.f552206e + ", onRecentForwardItemClickCallback=" + this.f552207f + ')';
    }
}
