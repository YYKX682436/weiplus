package la2;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f399036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f399037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f399038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f399039g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399040h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d85.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, yz5.l lVar, int i17, java.lang.String str) {
        super(1);
        this.f399036d = f0Var;
        this.f399037e = f0Var2;
        this.f399038f = lVar;
        this.f399039g = i17;
        this.f399040h = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + this.f399036d + ", onClick clickType:" + intValue);
        this.f399037e.f391649d = intValue;
        yz5.l lVar = this.f399038f;
        if (intValue == 2) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_TIME_INT_SYNC, java.lang.Integer.valueOf(this.f399039g + 1));
        } else if (intValue == 3) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_TIME_INT_SYNC, Integer.MAX_VALUE);
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        } else if (intValue == 4) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            java.lang.String username = this.f399040h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiHelper", "modMaterialPoiSwitchCallback, isEnable:true");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f361623e.o(true, new la2.c(true, username), username);
        }
        return jz5.f0.f384359a;
    }
}
