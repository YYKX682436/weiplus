package gc3;

/* loaded from: classes9.dex */
public final class q implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 f351971d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658) {
        this.f351971d = c16412xaf564658;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        z21.e m48277x9cf0d20b;
        gc3.n voiceListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658 = this.f351971d;
        if (action == 0) {
            c16412xaf564658.f229152s = false;
            c16412xaf564658.getCurrentState();
            c16412xaf564658.m66246xee20281a(1);
            if (!iq.b.C(c16412xaf564658.getContext()) && !iq.b.v(c16412xaf564658.getContext()) && !iq.b.e(c16412xaf564658.getContext())) {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = c16412xaf564658.getContext();
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                    if (c16412xaf564658.currentState == 1) {
                        java.lang.String str = c16412xaf564658.com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String;
                        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceInputLayout", "fileExists delete first");
                            com.p314xaae8f345.mm.vfs.w6.h(str);
                        }
                        c16412xaf564658.currentState = 2;
                        gc3.a aVar = c16412xaf564658.voiceDetectListener;
                        if (aVar != null && (voiceListener = ((gc3.o) aVar).f351969a.getVoiceListener()) != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh nhVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh) voiceListener;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectStart");
                            android.view.View view2 = nhVar.f228775a.f227938h;
                            if (view2 != null) {
                                view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ih(nhVar));
                            }
                        }
                        c16412xaf564658.f229136p.c(50L, 50L);
                        c16412xaf564658.k(true);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                            m48277x9cf0d20b = new z21.w();
                        } else {
                            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                            m48277x9cf0d20b = com.p314xaae8f345.mm.p964x2822171a.BinderC11153x6a3b619.m48277x9cf0d20b();
                        }
                        z21.e eVar = m48277x9cf0d20b;
                        c16412xaf564658.f229129f = eVar;
                        if (eVar != null) {
                            eVar.mo48284x316510(c16412xaf564658.disableTrans, false, 1, 13, new gc3.d(c16412xaf564658));
                        }
                        z21.e eVar2 = c16412xaf564658.f229129f;
                        if (eVar2 != null) {
                            eVar2.mo48297x68ac462(str);
                        }
                    }
                } else if (c16412xaf564658.getContext() instanceof android.app.Activity) {
                    tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                    android.content.Context context2 = c16412xaf564658.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                    ((sb0.f) jVar2).Di((android.app.Activity) context2, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 80, null, null);
                }
            }
        } else if (action == 1) {
            c16412xaf564658.getCurrentState();
            boolean z17 = c16412xaf564658.f229152s;
            c16412xaf564658.f229152s = false;
            c16412xaf564658.c();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
