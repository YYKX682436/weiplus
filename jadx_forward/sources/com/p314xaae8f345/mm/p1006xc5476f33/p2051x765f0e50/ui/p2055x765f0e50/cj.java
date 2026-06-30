package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class cj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f242449d;

    /* renamed from: e, reason: collision with root package name */
    public int f242450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6 f242451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6 activityC17447xe0fa39b6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f242451f = activityC17447xe0fa39b6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cj(this.f242451f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cj) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6 activityC17447xe0fa39b6;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f242450e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6 activityC17447xe0fa39b62 = this.f242451f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6.f242110o;
            activityC17447xe0fa39b62.f242112e = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC17447xe0fa39b62, activityC17447xe0fa39b62.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 0, null);
            qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
            this.f242449d = activityC17447xe0fa39b62;
            this.f242450e = 1;
            obj = ((ef0.y2) o8Var).Zi(activityC17447xe0fa39b62, this);
            if (obj == aVar) {
                return aVar;
            }
            activityC17447xe0fa39b6 = activityC17447xe0fa39b62;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityC17447xe0fa39b6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6) this.f242449d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        activityC17447xe0fa39b6.f242118n = (bw5.lc0) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC17447xe0fa39b62.f242112e;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = activityC17447xe0fa39b62.f242112e) != null) {
            u3Var.dismiss();
        }
        java.lang.Boolean aj6 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).aj();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aj6, bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMusicUI", "updateMusicRecommend openMusicRecommend: " + b17);
        activityC17447xe0fa39b62.W6("settings_music_recommend", true);
        activityC17447xe0fa39b62.W6("settings_music_recommend_tips", true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = activityC17447xe0fa39b62.f242111d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_music_recommend") : null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.f279318v = false;
            c21541x1c1b08fe.O(b17);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = activityC17447xe0fa39b62.f242111d;
        if (rVar2 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).notifyDataSetChanged();
        }
        if (p3380x6a61f93.p3381xf512d0a5.C30414x21b1610a.m168686x21b267e3()) {
            bw5.lc0 Ui = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ui();
            boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Ui != null ? java.lang.Boolean.valueOf(Ui.f111273g) : null, bool);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMusicUI", "updateMusicQuality open: " + b18);
            activityC17447xe0fa39b62.W6("settings_music_quality", true);
            activityC17447xe0fa39b62.W6("settings_music_quality_desc", true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar3 = activityC17447xe0fa39b62.f242111d;
            java.lang.Object h18 = rVar3 != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar3).h("settings_music_quality") : null;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18 : null;
            if (c21541x1c1b08fe2 != null) {
                c21541x1c1b08fe2.f279318v = false;
                c21541x1c1b08fe2.O(b18);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar4 = activityC17447xe0fa39b62.f242111d;
            if (rVar4 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar4).notifyDataSetChanged();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMusicUI", "abtest not open");
        }
        activityC17447xe0fa39b62.Y6();
        return jz5.f0.f384359a;
    }
}
