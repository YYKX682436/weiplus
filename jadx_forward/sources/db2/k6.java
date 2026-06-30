package db2;

/* loaded from: classes10.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f309576a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309577b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f309578c;

    /* renamed from: d, reason: collision with root package name */
    public final int f309579d;

    /* renamed from: e, reason: collision with root package name */
    public final int f309580e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Long f309581f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f309582g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.nv2 f309583h;

    public k6(boolean z17, java.lang.String username, java.lang.String wxUsername, int i17, int i18, java.lang.Long l17, java.lang.Long l18, r45.nv2 nv2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        this.f309576a = z17;
        this.f309577b = username;
        this.f309578c = wxUsername;
        this.f309579d = i17;
        this.f309580e = i18;
        this.f309581f = l17;
        this.f309582g = l18;
        this.f309583h = nv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922;
        boolean z18 = this.f309576a;
        if (z17) {
            z18 = !z18;
        }
        java.lang.Long l17 = this.f309581f;
        if (l17 != null) {
            long longValue = l17.longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded();
            am.lc lcVar = c5508x3c9dcded.f135839g;
            lcVar.f88770b = longValue;
            lcVar.f88772d = 1;
            lcVar.f88771c = z18;
            c5542xa257d922 = c5508x3c9dcded;
        } else {
            java.lang.Long l18 = this.f309582g;
            if (l18 == null) {
                return;
            }
            long longValue2 = l18.longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d9222 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922();
            java.lang.String str = this.f309578c;
            am.md mdVar = c5542xa257d9222.f135866g;
            mdVar.f88872c = str;
            mdVar.f88870a = longValue2;
            mdVar.f88873d = this.f309579d;
            mdVar.f88871b = z18;
            c5542xa257d922 = c5542xa257d9222;
        }
        c5542xa257d922.e();
    }

    /* renamed from: equals */
    public boolean m123845xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2.k6)) {
            return false;
        }
        db2.k6 k6Var = (db2.k6) obj;
        return this.f309576a == k6Var.f309576a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309577b, k6Var.f309577b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309578c, k6Var.f309578c) && this.f309579d == k6Var.f309579d && this.f309580e == k6Var.f309580e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309581f, k6Var.f309581f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309582g, k6Var.f309582g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309583h, k6Var.f309583h);
    }

    /* renamed from: hashCode */
    public int m123846x8cdac1b() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f309576a) * 31) + this.f309577b.hashCode()) * 31) + this.f309578c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f309579d)) * 31) + java.lang.Integer.hashCode(this.f309580e)) * 31;
        java.lang.Long l17 = this.f309581f;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f309582g;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        r45.nv2 nv2Var = this.f309583h;
        return hashCode3 + (nv2Var != null ? nv2Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m123847x9616526c() {
        return "ThankCGIParams(thanked=" + this.f309576a + ", username=" + this.f309577b + ", wxUsername=" + this.f309578c + ", interactionType=" + this.f309579d + ", thankScene=" + this.f309580e + ", mentionId=" + this.f309581f + ", objectId=" + this.f309582g + ", shareUserInfo=" + this.f309583h + ')';
    }

    public /* synthetic */ k6(boolean z17, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Long l17, java.lang.Long l18, r45.nv2 nv2Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, str, str2, i17, i18, (i19 & 32) != 0 ? null : l17, (i19 & 64) != 0 ? null : l18, (i19 & 128) != 0 ? null : nv2Var);
    }
}
