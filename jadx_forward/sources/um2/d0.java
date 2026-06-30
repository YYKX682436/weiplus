package um2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f510288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f510289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f510291g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.app.Activity activity, um2.x5 x5Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510289e = activity;
        this.f510290f = x5Var;
        this.f510291g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new um2.d0(this.f510289e, this.f510290f, this.f510291g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510288d;
        int i18 = 1;
        um2.x5 x5Var = this.f510290f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                zl2.f fVar = zl2.f.f555286a;
                android.app.Activity activity = this.f510289e;
                java.lang.String string = x5Var.f101138b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gff);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String a17 = n25.a.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMessageChannelIdUse(...)");
                this.f510288d = 1;
                b17 = fVar.b(activity, 21, string, false, true, a17, 20000L, "finderlivefloatpermission", this);
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b17 = obj;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v0) b17;
            if (v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "ShowWarningAlert positive");
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Mj(true, ml2.z1.f409864e);
                ae2.in inVar = ae2.in.f85221a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85412t0).mo141623x754a37bb()).r()).intValue() > 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
                    fm2.c cVar = x5Var.f101139c;
                    if (!(cVar != null && cVar.m57705xa1e2cd37())) {
                        i18 = 3;
                    }
                    bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", i18);
                    bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
                    fm2.c cVar2 = x5Var.f101139c;
                    if (cVar2 != null) {
                        cVar2.mo46557x60d69242(qo0.b.B, bundle);
                    }
                } else {
                    yz5.a aVar2 = this.f510291g;
                    if (aVar2 != null) {
                        aVar2.mo152xb9724478();
                    }
                }
                fm2.c cVar3 = x5Var.f101139c;
                if (cVar3 != null) {
                    cVar3.m57757xd4d1ef72(false);
                }
            } else if (v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "ShowWarningAlert negative");
                fm2.c cVar4 = x5Var.f101139c;
                if (cVar4 != null) {
                    cVar4.m57757xd4d1ef72(false);
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                fm2.c cVar5 = x5Var.f101139c;
                if (cVar5 != null) {
                    cVar5.mo46557x60d69242(qo0.b.E, bundle2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWindowPermissionUtil", "recordRefuseWindowPermission ");
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_WINDOW_PERMISSION_TOAST_INT_SYNC, 1);
            } else if (v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "ShowWarningAlert cancel");
                fm2.c cVar6 = x5Var.f101139c;
                if (cVar6 != null) {
                    cVar6.m57757xd4d1ef72(false);
                }
                android.os.Bundle bundle3 = new android.os.Bundle();
                fm2.c cVar7 = x5Var.f101139c;
                if (cVar7 != null) {
                    cVar7.mo46557x60d69242(qo0.b.G, bundle3);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWindowPermissionUtil", "recordRefuseWindowPermission ");
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_WINDOW_PERMISSION_TOAST_INT_SYNC, 1);
            } else if (v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "ShowWarningAlert timeout");
                fm2.c cVar8 = x5Var.f101139c;
                if (cVar8 != null) {
                    cVar8.m57757xd4d1ef72(false);
                }
                android.os.Bundle bundle4 = new android.os.Bundle();
                fm2.c cVar9 = x5Var.f101139c;
                if (cVar9 != null) {
                    cVar9.mo46557x60d69242(qo0.b.G, bundle4);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f384359a;
    }
}
