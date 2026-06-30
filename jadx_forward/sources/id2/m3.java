package id2;

/* loaded from: classes.dex */
public final class m3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f372201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f372202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km2.b f372203h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f372204i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f372205m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f372206n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372207o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(id2.u3 u3Var, android.content.Context context, long j17, long j18, km2.b bVar, boolean z17, boolean z18, boolean z19, yz5.l lVar) {
        super(2);
        this.f372199d = u3Var;
        this.f372200e = context;
        this.f372201f = j17;
        this.f372202g = j18;
        this.f372203h = bVar;
        this.f372204i = z17;
        this.f372205m = z18;
        this.f372206n = z19;
        this.f372207o = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar;
        int i17;
        java.lang.Boolean bool;
        int i18;
        boolean z17;
        android.content.Context context;
        id2.u3 u3Var;
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        yz5.l lVar2 = this.f372207o;
        android.content.Context context2 = this.f372200e;
        id2.u3 u3Var2 = this.f372199d;
        if (num != null && num.intValue() == 0) {
            android.content.Context context3 = this.f372200e;
            long j17 = this.f372201f;
            long j18 = this.f372202g;
            boolean z18 = this.f372204i;
            boolean z19 = this.f372205m;
            boolean z27 = this.f372206n;
            u3Var2.getClass();
            r45.sl1 sl1Var = this.f372203h.f390604u;
            if (sl1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePersonalCente", "shouldShowAutoGenWidget:autoGenReplayOption is null, return false");
                lVar = lVar2;
                z17 = false;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LIVE_MMKV");
                if (M != null) {
                    lVar = lVar2;
                    i17 = 0;
                    bool = java.lang.Boolean.valueOf(M.getBoolean("HAS_SHOW_AUTO_GEN_REPLAY_ID", false));
                } else {
                    lVar = lVar2;
                    i17 = 0;
                    bool = null;
                }
                int m75939xb282bd08 = sl1Var.m75939xb282bd08(i17);
                boolean z28 = true;
                if (m75939xb282bd08 == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
                    i18 = 0;
                } else {
                    i18 = 0;
                    z28 = false;
                }
                sl1Var.m75939xb282bd08(i18);
                z17 = z28;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "showSetAutoReplayGenWidget() called with: needDanmu=" + z18 + ", onlyMember=" + z19 + ", genHighlight=" + z27);
                context = context2;
                u3Var = u3Var2;
                u3Var.f372357i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l8(context3, new id2.t3(u3Var2, context3, j17, j18, z18, z19, z27));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "showSetAutoReplayGenWidget");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l8 l8Var = u3Var.f372357i;
                if (l8Var != null) {
                    l8Var.w();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "shouldShowAutoGenWidget returned false, skipping widget display");
                context = context2;
                u3Var = u3Var2;
            }
            java.lang.String string = u3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nun);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = u3Var2.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e6x);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var2.f293309c = string2;
                e4Var2.c();
            } else {
                int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var3.f293309c = str;
                e4Var3.c();
            }
            lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
