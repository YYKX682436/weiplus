package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class tb implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e5 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.animation.Animation f281523a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.animation.Animation f281524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb f281525c;

    public tb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar) {
        this.f281525c = jbVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e5
    public boolean a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = this.f281525c;
        jbVar.f280810v = z17;
        if (this.f281523a == null) {
            this.f281523a = android.view.animation.AnimationUtils.loadAnimation(jbVar.f280113d.f542250l.mo7438x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
            this.f281524b = android.view.animation.AnimationUtils.loadAnimation(jbVar.f280113d.f542250l.mo7438x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.FootComponent", "switchFooterToInput customFooter is %s", jbVar.f280798g);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484 = jbVar.f280798g;
            if (viewOnClickListenerC21613xfaa83484 != null) {
                viewOnClickListenerC21613xfaa83484.startAnimation(this.f281524b);
            }
            jbVar.I0();
            jbVar.f280796e.startAnimation(this.f281523a);
            jbVar.f280796e.postInvalidateDelayed(this.f281523a.getDuration());
        } else {
            jbVar.f280796e.startAnimation(this.f281524b);
            jbVar.H0();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa834842 = jbVar.f280798g;
            if (viewOnClickListenerC21613xfaa834842 != null) {
                viewOnClickListenerC21613xfaa834842.startAnimation(this.f281523a);
                jbVar.f280798g.postInvalidateDelayed(this.f281523a.getDuration());
            }
        }
        sb5.f fVar = (sb5.f) jbVar.f280113d.f542241c.a(sb5.f.class);
        if (fVar != null) {
            java.lang.String x17 = jbVar.f280113d.x();
            int i17 = 2;
            int i18 = z17 ? 1 : 2;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17) && r01.z.n(x17)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) aVar.f280113d.f542241c.a(sb5.z.class));
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo8143x7444f759() > 0 ? kVar.mo75871xfb80e389(kVar.mo8143x7444f759() - 1) : null;
                if (mo75871xfb80e389 == null) {
                    i17 = 1;
                } else if (mo75871xfb80e389.mo78013xfb85f7b0() != 285212721) {
                    if (mo75871xfb80e389.mo78013xfb85f7b0() == 318767153) {
                        i17 = 5;
                    } else {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo75871xfb80e389.R1())) {
                            if (mo75871xfb80e389.P1() == 1) {
                                i17 = 3;
                            } else if (mo75871xfb80e389.P1() == 2) {
                                i17 = 4;
                            }
                        }
                        i17 = 0;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20018, java.lang.Long.valueOf(aVar.f280284p), x17, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17), mo75871xfb80e389 == null ? "" : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo75871xfb80e389.R1()) ? mo75871xfb80e389.R1() : mo75871xfb80e389.A0() == 0 ? mo75871xfb80e389.Q0() : c01.z1.r(), 1);
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(jbVar.f280113d.x())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", jbVar.f280113d.x());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(jbVar.f280113d.k())));
            hashMap.put("enter_sessionid", jbVar.f280113d.f542255q);
            hashMap.put("change_type", java.lang.Integer.valueOf(z17 ? 1 : 0));
            hashMap.put("view_id", "yuanbao_chat_bar_change");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
        return false;
    }
}
