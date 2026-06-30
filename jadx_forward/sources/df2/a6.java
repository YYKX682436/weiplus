package df2;

/* loaded from: classes3.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311208d;

    /* renamed from: e, reason: collision with root package name */
    public int f311209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f311210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f311211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f311212h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f311213i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f311214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f311215n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(android.content.Context context, df2.d6 d6Var, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311210f = context;
        this.f311211g = d6Var;
        this.f311212h = z17;
        this.f311213i = viewOnClickListenerC22631x1cc07cc8;
        this.f311214m = arrayList;
        this.f311215n = c22849x81a93d25;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.a6(this.f311210f, this.f311211g, this.f311212h, this.f311213i, this.f311214m, this.f311215n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.a6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        boolean z17;
        java.lang.Object j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var;
        int i18;
        int i19;
        pz5.a aVar = pz5.a.f440719d;
        int i27 = this.f311209e;
        boolean z18 = this.f311212h;
        df2.d6 d6Var = this.f311211g;
        if (i27 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9 a9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f;
            android.content.Context context = this.f311210f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(a9Var, context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 0L, null, 8, null);
            a17.a();
            this.f311208d = a17;
            this.f311209e = 1;
            d6Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectAnchorSettingController", "toggleGestureEffectSwitch " + z18);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_EFFECT_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            c17.x(u3Var, bool);
            if (z18) {
                int i28 = (int) ((mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class)).f410399q;
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                i17 = i28 | 131072;
            } else {
                int i29 = (int) ((mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class)).f410399q;
                java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                i17 = i29 & (-131073);
            }
            if (((mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class)).a8()) {
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                dk2.xf P6 = d6Var.P6();
                if (P6 != null) {
                    df2.c6 c6Var = new df2.c6(d6Var, z18, c0Var, rVar);
                    z17 = z18;
                    dk2.xf.h(P6, ((mm2.e1) d6Var.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) d6Var.m56788xbba4bfc0(mm2.e1.class)).f410516m, i17, 131072L, 0, c6Var, 16, null);
                } else {
                    z17 = z18;
                }
                j17 = rVar.j();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectAnchorSettingController", "toggleGestureEffectSwitch live is not started");
                ((mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class)).p8(i17);
                z17 = z18;
                j17 = bool;
            }
            if (j17 == aVar) {
                return aVar;
            }
            d9Var = a17;
        } else {
            if (i27 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9) this.f311208d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
            z17 = z18;
        }
        boolean booleanValue = ((java.lang.Boolean) j17).booleanValue();
        d9Var.b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f311213i;
        viewOnClickListenerC22631x1cc07cc8.setEnabled(true);
        if (booleanValue) {
            df2.n5 n5Var = (df2.n5) d6Var.m56789x25fe639c(df2.n5.class);
            if (n5Var != null) {
                n5Var.Z6(z17);
            }
            java.util.ArrayList arrayList = this.f311214m;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((df2.s5) it.next()).f312824e = z17;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f311215n.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                i18 = 0;
                mo7946xf939df19.m8151xc67946d3(0, arrayList.size());
            } else {
                i18 = 0;
            }
            if (z17) {
                df2.w5 w5Var = d6Var.f311478m;
                if (w5Var != null) {
                    w5Var.b();
                }
            } else {
                df2.w5 w5Var2 = d6Var.f311478m;
                if (w5Var2 != null) {
                    w5Var2.c();
                }
            }
        } else {
            i18 = 0;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(!z17);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        df2.n5 n5Var2 = (df2.n5) d6Var.m56789x25fe639c(df2.n5.class);
        if (n5Var2 != null) {
            i19 = 1;
            if (n5Var2.f312367n) {
                i18 = 1;
            }
        } else {
            i19 = 1;
        }
        linkedHashMap.put("switch_type", new java.lang.Integer(i18));
        linkedHashMap.put("switch_stage", new java.lang.Integer(((mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class)).a8() ? 2 : i19));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_anchor_gesture_features_switch", "view_clk", linkedHashMap);
        return jz5.f0.f384359a;
    }
}
