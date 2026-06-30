package du2;

/* loaded from: classes2.dex */
public final class u extends p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f f325036f;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f serviceC15002xfa6c787f) {
        this.f325036f = serviceC15002xfa6c787f;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void b(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        java.util.LinkedList<r45.mb4> m59135x7efe73ec;
        r45.mb4 mb4Var;
        if (str != null) {
            int hashCode = str.hashCode();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f serviceC15002xfa6c787f = this.f325036f;
            switch (hashCode) {
                case -1236803706:
                    if (str.equals("COMMAND_DISCONNECT_SERVICE")) {
                        du2.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f.f210010r;
                        serviceC15002xfa6c787f.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "[disconnectService]");
                        serviceC15002xfa6c787f.f();
                        return;
                    }
                    return;
                case -797253808:
                    if (str.equals("COMMAND_UPDATE_INFO")) {
                        i95.m c17 = i95.n0.c(du2.n.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        fu2.c Ai = du2.n.Ai((du2.n) c17, null, 1, null);
                        if (Ai == null) {
                            return;
                        }
                        du2.r rVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f.f210010r;
                        serviceC15002xfa6c787f.getClass();
                        eu2.j jVar = (eu2.j) Ai;
                        cw2.wa waVar = jVar.f338326d.f338291e;
                        if (waVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "[onMediaInfoUpdate] type: " + jVar.f338323a + " mediaInfo is null, return!");
                            return;
                        }
                        if (jVar.f338325c.f348408b == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "[onMediaInfoUpdate] state: STATE_NONE");
                            return;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = waVar.f305632f;
                        if (c14989xf862ae88 == null || (m59135x7efe73ec = c14989xf862ae88.m59135x7efe73ec()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(m59135x7efe73ec)) == null) {
                            return;
                        }
                        mn2.u0 u0Var = new mn2.u0(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, 4, null);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u0Var.f411658h, jVar.f338324b.f348406b)) {
                            serviceC15002xfa6c787f.h(Ai);
                            ((du2.q) ((jz5.n) serviceC15002xfa6c787f.f210013p).mo141623x754a37bb()).c(serviceC15002xfa6c787f.f210011n, Ai, serviceC15002xfa6c787f.f210014q);
                            return;
                        } else {
                            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(u0Var);
                            a17.f529406d = new du2.t(Ai, serviceC15002xfa6c787f);
                            a17.f();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "[onMediaInfoUpdate] update successfully!");
                            return;
                        }
                    }
                    return;
                case -116344064:
                    if (str.equals("COMMAND_SET_ACTIVE_AND_CANCEL_NOTIFICATION")) {
                        if (bundle != null) {
                            boolean booleanValue = java.lang.Boolean.valueOf(bundle.getBoolean("key_set_session_active")).booleanValue();
                            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = serviceC15002xfa6c787f.f210011n;
                            if (f0Var != null) {
                                f0Var.e(booleanValue);
                            }
                        }
                        if (bundle != null) {
                            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bundle.getBoolean("key_need_cancel_notification"));
                            java.lang.Boolean bool = valueOf.booleanValue() ? valueOf : null;
                            if (bool != null) {
                                bool.booleanValue();
                                du2.r rVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f.f210010r;
                                serviceC15002xfa6c787f.e();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 137171919:
                    if (str.equals("COMMAND_UPDATE_PROGRESS")) {
                        i95.m c18 = i95.n0.c(du2.n.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        fu2.c Ai2 = du2.n.Ai((du2.n) c18, null, 1, null);
                        if (Ai2 == null) {
                            return;
                        }
                        du2.r rVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f.f210010r;
                        serviceC15002xfa6c787f.g(Ai2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "onPause");
        i95.m c17 = i95.n0.c(du2.n.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((du2.n) c17).Bi();
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "onPlay");
        i95.m c17 = i95.n0.c(du2.n.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((du2.n) c17).Di();
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void f(java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "onPlayFromMediaId mediaId: " + str);
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "onStop");
        i95.m c17 = i95.n0.c(du2.n.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((du2.n) c17).Bi();
    }
}
