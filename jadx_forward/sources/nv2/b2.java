package nv2;

/* loaded from: classes10.dex */
public final class b2 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f421990d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f421991e;

    /* renamed from: f, reason: collision with root package name */
    public final int f421992f;

    /* renamed from: g, reason: collision with root package name */
    public final int f421993g;

    /* renamed from: h, reason: collision with root package name */
    public final int f421994h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qt2 f421995i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.nv2 f421996j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Long f421997k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Long f421998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.lang.String username, java.lang.String wxUsername, int i17, int i18, int i19, r45.qt2 qt2Var, r45.nv2 nv2Var) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        this.f421990d = username;
        this.f421991e = wxUsername;
        this.f421992f = i17;
        this.f421993g = i18;
        this.f421994h = i19;
        this.f421995i = qt2Var;
        this.f421996j = nv2Var;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.a(callback);
        new db2.t3(new db2.k6(this.f421992f == 1, this.f421990d, this.f421991e, this.f421993g, this.f421994h, this.f421997k, this.f421998l, this.f421996j), this.f421995i).l().K(new nv2.a2(callback, this));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f421990d + '_' + this.f421991e + '_' + this.f421997k + '_' + this.f421998l + '_' + this.f421994h + '_' + this.f421992f + '_' + this.f421993g;
    }

    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 d(boolean z17) {
        boolean z18 = this.f421992f == 1;
        if (!z17) {
            z18 = !z18;
        }
        java.lang.Long l17 = this.f421997k;
        if (l17 != null) {
            long longValue = l17.longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded();
            am.lc lcVar = c5508x3c9dcded.f135839g;
            lcVar.f88770b = longValue;
            lcVar.f88772d = 1;
            lcVar.f88771c = z18;
            return c5508x3c9dcded;
        }
        java.lang.Long l18 = this.f421998l;
        if (l18 == null) {
            return null;
        }
        long longValue2 = l18.longValue();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922();
        java.lang.String str = this.f421991e;
        am.md mdVar = c5542xa257d922.f135866g;
        mdVar.f88872c = str;
        mdVar.f88870a = longValue2;
        mdVar.f88873d = this.f421993g;
        mdVar.f88871b = z18;
        return c5542xa257d922;
    }

    /* renamed from: toString */
    public java.lang.String m150129x9616526c() {
        return "action_" + this.f421990d + '_' + this.f421991e + '_' + this.f421992f + '_' + this.f422108c + '_' + this.f421997k + '_' + this.f421998l + '_' + this.f421994h + '_' + this.f421993g;
    }

    public /* synthetic */ b2(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, r45.qt2 qt2Var, r45.nv2 nv2Var, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, i17, i18, i19, (i27 & 32) != 0 ? null : qt2Var, (i27 & 64) != 0 ? null : nv2Var);
    }
}
