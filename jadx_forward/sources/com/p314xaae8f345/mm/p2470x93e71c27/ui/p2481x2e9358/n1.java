package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class n1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272028d;

    public n1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272028d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        a31.m mVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272028d;
        if (c19666xfd6e2f33.f271488a3 != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.i0.class));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar = y8Var.f281838z;
                if (gpVar != null) {
                    gpVar.f280658h = true;
                }
                float x17 = motionEvent.getX();
                float y17 = motionEvent.getY();
                a31.m mVar2 = y8Var.f281825m;
                if (mVar2 != null) {
                    mVar2.g(x17, y17);
                }
                y8Var.P0(54);
            } else if ((action == 1 || action == 3) && (mVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.i0.class))).f281825m) != null && mVar.f82523x && (c22621x7603e017 = mVar.f82501b) != null) {
                java.lang.Runnable runnable = mVar.P;
                c22621x7603e017.removeCallbacks(runnable);
                c22621x7603e017.post(runnable);
            }
        }
        if (c19666xfd6e2f33.f271549l2 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            c19666xfd6e2f33.f271549l2 = false;
            c19666xfd6e2f33.f271555m2 = true;
            c19666xfd6e2f33.z1();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
            if (y4Var != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83 c6657x5b628c83 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83();
                c6657x5b628c83.f140035h = 3;
                c6657x5b628c83.f140031d = 1L;
                c6657x5b628c83.q(y4Var.c());
                c6657x5b628c83.p(u35.a.f505961b);
                c6657x5b628c83.f140041n = java.lang.System.currentTimeMillis();
                java.lang.String n17 = c6657x5b628c83.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CEMenuReporter", "report%s %s", 16112, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
                c6657x5b628c83.k();
            }
        }
        c19666xfd6e2f33.m75516xbe62a411(true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
        if (k5Var != null) {
            k5Var.i(view, motionEvent);
        }
        c19666xfd6e2f33.postDelayed(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n4(c19666xfd6e2f33, false), 10);
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
