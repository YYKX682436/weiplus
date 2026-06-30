package ia2;

/* loaded from: classes2.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f371481d;

    /* renamed from: e, reason: collision with root package name */
    public int f371482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 f371483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f371483f = activityC13656x51707ca3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ia2.m(this.f371483f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g76;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f371482e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = this.f371483f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.f96 f96Var = activityC13656x51707ca3.f183317x;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 b17 = f96Var != null ? ia2.e0.b(f96Var, false, 1, null) : new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13656x51707ca3.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            this.f371481d = b17;
            this.f371482e = 1;
            g76 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.g7(activityC13656x51707ca3, mo55332x76847179, this);
            if (g76 == aVar) {
                return aVar;
            }
            c16279x64cea23 = b17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea232 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) this.f371481d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g76 = obj;
            c16279x64cea23 = c16279x64cea232;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea233 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) g76;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea234 = c16279x64cea233 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23() : c16279x64cea233;
        long longExtra = activityC13656x51707ca3.getIntent().getLongExtra("kMsgId", -1L);
        java.lang.String stringExtra = activityC13656x51707ca3.getIntent().getStringExtra("map_talker_name");
        z80.p0 p0Var = new z80.p0(c16279x64cea23, c16279x64cea234, longExtra, stringExtra == null ? "" : stringExtra, activityC13656x51707ca3.f183310l1);
        java.lang.ref.WeakReference weakReference = activityC13656x51707ca3.f183314u;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = weakReference != null ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) weakReference.get() : null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (activityC1102x9ee2d9f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderFlutterPOIActivity", "onNavigateButtonTap: failed, parentActivity null");
            return f0Var;
        }
        z80.k0 k0Var = (z80.k0) i95.n0.c(z80.k0.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("page_state", new java.lang.Integer(activityC13656x51707ca3.D ? 2 : 1));
        java.lang.String str3 = activityC13656x51707ca3.D1;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("poi_sessionid", str3);
        r45.f96 f96Var2 = activityC13656x51707ca3.f183317x;
        if (f96Var2 == null || (str = f96Var2.m75945x2fec8307(17)) == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("poi_category_key", str);
        java.lang.Integer num = activityC13656x51707ca3.E1;
        lVarArr[3] = new jz5.l("poi_biz_source", new java.lang.Integer(num != null ? num.intValue() : 0));
        r45.f96 f96Var3 = activityC13656x51707ca3.f183317x;
        if (f96Var3 == null || (str2 = f96Var3.m75945x2fec8307(5)) == null) {
            str2 = "";
        }
        lVarArr[4] = new jz5.l("poiid", str2);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        y80.y0 y0Var = (y80.y0) k0Var;
        y0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y0Var.f541493e, "showJump3rdAppMenu: " + p0Var);
        if (p0Var.f552192e) {
            p0Var.f552188a.f226127p = "";
        }
        int Ai = y0Var.Ai();
        if (Ai == 1 || Ai == 3) {
            za3.d dVar = new za3.d(activityC1102x9ee2d9f);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC1102x9ee2d9f, 1, false);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f2 = activityC1102x9ee2d9f;
            k0Var2.f293405n = new y80.w0(y0Var, activityC1102x9ee2d9f2, dVar, linkedHashMap, p0Var);
            k0Var2.f293414s = new y80.x0(y0Var, activityC1102x9ee2d9f2, linkedHashMap, dVar, p0Var);
            k0Var2.v();
        } else if (!activityC1102x9ee2d9f.isFinishing() && !activityC1102x9ee2d9f.isDestroyed()) {
            new za3.s(activityC1102x9ee2d9f, p0Var, k17).show();
        }
        y0Var.f541495g = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        y0Var.wi(true);
        return f0Var;
    }
}
