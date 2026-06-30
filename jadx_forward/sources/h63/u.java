package h63;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lh63/u;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "mmOnActivityResult", "", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.GameLive.EnterFinderLiveTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        android.view.Display defaultDisplay;
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.TAG, "handleRequest#EnterFinderTask, request is not EnterFinderRequest");
            return;
        }
        java.lang.String str = this.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRequest appid ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f) abstractC11887x3610e10c;
        sb6.append(c16049x1ab5a75f.getAppid());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int action = c16049x1ab5a75f.getAction();
        h63.v[] vVarArr = h63.v.f360817d;
        if (action == 0) {
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "try to startGame,but isAnchorLiving,finishProcess with error");
                m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(1));
                return;
            } else {
                if (((p60.u) i95.n0.c(p60.u.class)).f433735f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "try to startGame, but in crash state, decide to recover");
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Zi(m50421x3c6fed6a(), new h63.s(this, abstractC11887x3610e10c));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "startGame");
                h63.g1 g1Var = (h63.g1) i95.n0.c(h63.g1.class);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
                g1Var.Ui(m50421x3c6fed6a, c16049x1ab5a75f.getAppid(), c16049x1ab5a75f.getVersionType(), true, c16049x1ab5a75f.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String(), c16049x1ab5a75f.getReportInfo(), c16049x1ab5a75f.getEntranceType(), c16049x1ab5a75f.getEntranceId());
                m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(0));
                return;
            }
        }
        h63.v[] vVarArr2 = h63.v.f360817d;
        java.lang.Integer num = null;
        if (action == 1) {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2 = m50421x3c6fed6a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a2, "getActivityContext(...)");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Intent intent = new android.content.Intent();
            android.view.WindowManager windowManager = m50421x3c6fed6a2.getWindowManager();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                num = java.lang.Integer.valueOf(defaultDisplay.getRotation());
            }
            if (num != null && num.intValue() == 1) {
                intent.putExtra("LANDSCAPE_TYPE", 1);
            } else if (num != null && num.intValue() == 3) {
                intent.putExtra("LANDSCAPE_TYPE", 2);
            } else {
                intent.putExtra("LANDSCAPE_TYPE", 0);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderLiveCountDownUI");
            intent.setClass(m50421x3c6fed6a2, (java.lang.Class) ((jz5.n) jz2.x0.f384312z).mo141623x754a37bb());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m50421x3c6fed6a2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveCountDownUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m50421x3c6fed6a2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(m50421x3c6fed6a2, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveCountDownUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(0));
            return;
        }
        h63.v[] vVarArr3 = h63.v.f360817d;
        if (action == 2) {
            s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a3 = m50421x3c6fed6a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a3, "getActivityContext(...)");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var2).getClass();
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && (c19792x256d2725 = c1Var.f410379n) != null) {
                qe2.a.f(c19792x256d2725, (mm2.n0) efVar.i(mm2.n0.class));
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub.I2((c61.ub) c17, m50421x3c6fed6a3, new so2.h1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384)), null, 0, 0, 28, null);
            }
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(0));
            return;
        }
        h63.v[] vVarArr4 = h63.v.f360817d;
        if (action == 3) {
            m50421x3c6fed6a().m78747x6b661de(this);
            s40.w0 w0Var3 = (s40.w0) i95.n0.c(s40.w0.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a4 = m50421x3c6fed6a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a4, "getActivityContext(...)");
            h63.t tVar = new h63.t(this);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var3).getClass();
            dk2.ef.f314905a.l0(m50421x3c6fed6a4, null, tVar);
            return;
        }
        h63.v[] vVarArr5 = h63.v.f360817d;
        if (action == 4) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ui(m50421x3c6fed6a(), true, c16049x1ab5a75f.getParam() == 1);
            ((p60.u) i95.n0.c(p60.u.class)).Ni();
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(0));
        } else {
            h63.v[] vVarArr6 = h63.v.f360817d;
            if (action == 5) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ui(m50421x3c6fed6a(), false, false);
                m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(0));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v, com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        super.mo9729x757c998b(i17, i18, intent);
        m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(0));
    }
}
