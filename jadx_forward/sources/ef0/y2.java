package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class y2 extends i95.w implements qk.o8 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lc0 f333893d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f333894e = jz5.h.b(ef0.r2.f333847d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f333895f = jz5.h.b(ef0.w2.f333883d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f333896g = jz5.h.b(ef0.m2.f333806d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f333897h = jz5.h.b(new ef0.n2(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f333898i = jz5.h.b(new ef0.o2(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f333899m = jz5.h.b(new ef0.q2(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f333900n = jz5.h.b(ef0.x2.f333890d);

    public boolean Ai() {
        if (bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "enableAddToListenMenu isWeChatUser and not enable");
            return false;
        }
        if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Di()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "enableAddToListenMenu isInAudioPanelBlackList and not enable");
            return false;
        }
        if (!((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "enableAddToListenMenu isTeenMode and not enable");
        return false;
    }

    public boolean Bi() {
        return ((java.lang.Boolean) ((jz5.n) this.f333896g).mo141623x754a37bb()).booleanValue();
    }

    public boolean Di() {
        if (bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "enableTimelineTingEntry isWeChatUser and not enable");
            return false;
        }
        if (((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "enableTimelineTingEntry isTeenMode and not enable");
            return false;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20759xa7de5025()) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "enableShowMusicSettingEntry newStyleOk:true, configOk:" + z17);
        return z17;
    }

    public boolean Ni() {
        return ((java.lang.Boolean) ((jz5.n) this.f333898i).mo141623x754a37bb()).booleanValue();
    }

    public boolean Ri() {
        if (!Vi()) {
            return false;
        }
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
        boolean z17 = (c01.z1.h() & 2097152) != 2097152;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "canShowReddot_Ting return " + z17);
        return z17;
    }

    public final bw5.lc0 Ui() {
        if (this.f333893d == null) {
            byte[] b17 = gm4.a.f355090a.b("key_listen_user_config");
            if (b17 != null) {
                bw5.lc0 lc0Var = new bw5.lc0();
                lc0Var.mo11468x92b714fd(b17);
                this.f333893d = lc0Var;
            } else {
                this.f333893d = new bw5.lc0();
            }
        }
        return this.f333893d;
    }

    public final boolean Vi() {
        return ((java.lang.Boolean) ((jz5.n) this.f333897h).mo141623x754a37bb()).booleanValue();
    }

    public java.lang.Object Zi(im5.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "getListenUserConfig");
        pq5.g l17 = new vk4.d().l();
        l17.f(bVar);
        l17.q(new ef0.p2(this, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public java.lang.Boolean aj() {
        bw5.lc0 Ui = Ui();
        if (Ui != null) {
            return java.lang.Boolean.valueOf(Ui.f111270d);
        }
        return null;
    }

    public final boolean bj() {
        return ((java.lang.Boolean) ((jz5.n) this.f333899m).mo141623x754a37bb()).booleanValue();
    }

    public void cj(java.lang.Boolean bool, boolean z17) {
        if (bool == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "saveMusicRecommendStateLocal fail state null");
            return;
        }
        bw5.lc0 Ui = Ui();
        java.lang.Boolean valueOf = Ui != null ? java.lang.Boolean.valueOf(Ui.f111270d) : null;
        bw5.lc0 Ui2 = Ui();
        if (Ui2 != null) {
            Ui2.f111270d = bool.booleanValue();
            Ui2.f111282s[1] = true;
        }
        wi();
        if (!z17 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool)) {
            return;
        }
        nj(valueOf, bool.booleanValue());
    }

    public boolean fj() {
        if (!Vi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry not enable, not show");
            return false;
        }
        if (((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isTeenMode and not show");
            return false;
        }
        if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Di()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isInAudioPanelBlackList and not show");
            return false;
        }
        if (!((c01.z1.h() & 32768) == 32768)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry tingEntryClose and not show");
        return false;
    }

    public boolean hj() {
        if (!Vi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry not enable, not show");
            return false;
        }
        if (((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isTeenMode and not show");
            return false;
        }
        if (!((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Di()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingEntryConfigService", "showTingDiscoverEntry isInAudioPanelBlackList and not show");
        return false;
    }

    public boolean ij(int i17) {
        boolean z17;
        if (!Ni()) {
            return false;
        }
        if (!il4.l.l(i17) && !il4.l.g(i17)) {
            return false;
        }
        if (!(i17 == 101)) {
            if (!(i17 == 103)) {
                z17 = false;
                return (z17 || il4.l.i(i17)) ? false : true;
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
    }

    public boolean mj() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_ting_audio_square_remove", null);
        return aj6 == null || java.lang.Integer.parseInt(aj6) != 0;
    }

    public final void nj(java.lang.Boolean bool, boolean z17) {
        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
        if (ip1.e.f375117a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "tryNotifyMusicRecommendStateChanged old: " + bool + ", newState: " + z17);
            ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
            ip1.r.f375141a.b();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6170x4f46fb32 c6170x4f46fb32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6170x4f46fb32();
            c6170x4f46fb32.f136430g.getClass();
            c6170x4f46fb32.e();
        }
    }

    public final void wi() {
        bw5.lc0 Ui = Ui();
        if (Ui != null) {
            gm4.a.f355090a.h("key_listen_user_config", Ui.mo14344x5f01b1f6());
        }
        bw5.lc0 Ui2 = Ui();
        if (Ui2 != null) {
            try {
                bw5.lc0 lc0Var = new bw5.lc0();
                lc0Var.mo11468x92b714fd(Ui2.mo14344x5f01b1f6());
                int i17 = jm4.z5.f381988d;
                jm4.x5 x5Var = (jm4.x5) p3380x6a61f93.p3381xf512d0a5.C30507x21b9adc4.m169449x21b0d463();
                if (x5Var != null) {
                    byte[] mo14344x5f01b1f6 = lc0Var.mo14344x5f01b1f6();
                    long m105978x2737f10 = ((jm4.z5) x5Var).m105978x2737f10();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
                    p3380x6a61f93.p3381xf512d0a5.C30507x21b9adc4.m169451x21b2e650(m105978x2737f10, mo14344x5f01b1f6, false);
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingEntryConfigService", "syncToUserConfigAff error");
            }
        }
    }
}
