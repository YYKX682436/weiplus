package dk2;

/* loaded from: classes3.dex */
public final class ld extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f315266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(boolean z17, android.content.Context context) {
        super(0);
        this.f315266d = z17;
        this.f315267e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mm2.c1 c1Var;
        kn0.p pVar;
        kn0.p pVar2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("controlLiveMiniWindowVisibility, visible:");
        boolean z17 = this.f315266d;
        sb6.append(z17);
        sb6.append(", isLiveStarted:");
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.Boolean bool = null;
        sb6.append(c1Var2 != null ? java.lang.Boolean.valueOf(c1Var2.a8()) : null);
        sb6.append(", isLiveFinish:");
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        sb6.append(c1Var3 != null ? java.lang.Boolean.valueOf(c1Var3.U7()) : null);
        sb6.append(", isNormalMode:");
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null && (pVar2 = w0Var.D) != null) {
            bool = java.lang.Boolean.valueOf(pVar2.i());
        }
        sb6.append(bool);
        sb6.append(", isRequestPermission:");
        mm2.c1 c1Var4 = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z18 = false;
        sb6.append(pm0.v.z(c1Var4 != null ? c1Var4.f410340g2 : 0, 2048));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", sb6.toString());
        if (z17) {
            mm2.c1 c1Var5 = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var5 != null && c1Var5.a8()) {
                mm2.c1 c1Var6 = (mm2.c1) efVar.i(mm2.c1.class);
                if ((c1Var6 == null || c1Var6.U7()) ? false : true) {
                    tn0.w0 w0Var2 = dk2.ef.f314911d;
                    if ((w0Var2 == null || (pVar = w0Var2.D) == null || !pVar.i()) ? false : true) {
                        mm2.c1 c1Var7 = (mm2.c1) efVar.i(mm2.c1.class);
                        if (!pm0.v.z(c1Var7 != null ? c1Var7.f410340g2 : 0, 2048)) {
                            mm2.c1 c1Var8 = (mm2.c1) efVar.i(mm2.c1.class);
                            if ((c1Var8 != null && c1Var8.Y4) && (c1Var = (mm2.c1) efVar.i(mm2.c1.class)) != null) {
                                c1Var.U4 = 0;
                            }
                            android.content.Context context = this.f315267e;
                            if (context == null) {
                                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
                                android.os.Bundle bundle = new android.os.Bundle();
                                mm2.c1 c1Var9 = (mm2.c1) efVar.i(mm2.c1.class);
                                if (c1Var9 != null && c1Var9.P1) {
                                    z18 = true;
                                }
                                bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", z18);
                                bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
                                bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
                                efVar.m0(bundle, context);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveService", "showVideoTalking, permission denied");
                                gk2.e eVar = dk2.ef.I;
                                if (eVar != null) {
                                    efVar.p0(eVar, efVar.e() != null, qo0.b.D, null, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                                }
                                tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
                                java.lang.String a17 = n25.a.a();
                                ((sb0.f) iVar).getClass();
                                com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.R6(context, 21, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gff), new dk2.ze(context), !(context instanceof android.app.Activity), false, a17);
                            }
                        }
                    }
                }
            }
        } else {
            tn0.w0 w0Var3 = dk2.ef.f314911d;
            if (w0Var3 != null) {
                w0Var3.p0();
            }
        }
        return jz5.f0.f384359a;
    }
}
