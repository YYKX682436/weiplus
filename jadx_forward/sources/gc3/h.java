package gc3;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 f351961d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904) {
        this.f351961d = c16411x58668904;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904 = this.f351961d;
        if (action == 0) {
            c16411x58668904.getClass();
            if (iq.b.C(c16411x58668904.getContext()) || iq.b.v(c16411x58668904.getContext()) || iq.b.e(c16411x58668904.getContext())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "voip is running, cann't record voice");
                c16411x58668904.b(new gc3.i(c16411x58668904));
            } else {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = c16411x58668904.getContext();
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                    c16411x58668904.f229141h = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.f();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "doStart currentState:%s filePath:%s", java.lang.Integer.valueOf(c16411x58668904.f229144n), c16411x58668904.f229141h);
                    if (c16411x58668904.f229144n == 1) {
                        c16411x58668904.f229144n = 2;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        c16411x58668904.f229142i = java.lang.System.currentTimeMillis();
                        c16411x58668904.f229148r.c(25L, 25L);
                        c16411x58668904.f229149s.c(5000L, 5000L);
                        c16411x58668904.f229140g = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.k0.f340635c, null);
                        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                        to.c cVar = to.c.SILK;
                        ((bv.p0) h1Var).getClass();
                        w21.f1 f1Var = new w21.f1(cVar);
                        c16411x58668904.f229139f = f1Var;
                        f1Var.f523900c = c16411x58668904.f229146p;
                        f1Var.mo166725x8e35cb53(c16411x58668904.f229141h);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp jpVar = c16411x58668904.f229138e;
                        jpVar.f228621m = 6;
                        jpVar.invalidateSelf();
                        c16411x58668904.b(new gc3.j(c16411x58668904, true));
                    }
                } else {
                    android.app.Activity activity = (android.app.Activity) c16411x58668904.getContext();
                    if (activity != null) {
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 80, null, null);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "context = " + activity);
                }
            }
        } else if (action == 1) {
            int i17 = c16411x58668904.f229144n;
            c16411x58668904.getClass();
            if (i17 == 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c16411x58668904.f229148r;
                if (b4Var != null) {
                    b4Var.d();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = c16411x58668904.f229149s;
                if (b4Var2 != null) {
                    b4Var2.d();
                }
                ((w21.f1) c16411x58668904.f229139f).mo166726xad07d6f3();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "abandonFocus: ");
                if (c16411x58668904.f229140g != null) {
                    ((f25.n0) i95.n0.c(f25.n0.class)).yg(c16411x58668904.f229140g);
                    c16411x58668904.f229140g = null;
                }
                c16411x58668904.f229144n = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp jpVar2 = c16411x58668904.f229138e;
                jpVar2.f228621m = 2;
                jpVar2.invalidateSelf();
                long j17 = c16411x58668904.f229142i;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                c16411x58668904.f229143m = java.lang.System.currentTimeMillis() - j17;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
