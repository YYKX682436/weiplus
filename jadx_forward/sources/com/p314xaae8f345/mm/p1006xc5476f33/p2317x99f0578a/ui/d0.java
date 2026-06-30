package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class d0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256951d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256951d = v0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 5000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256951d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = v0Var.f257012f;
            eVar.f256926q = 1;
            eVar.f256927r = java.lang.System.currentTimeMillis();
            v0Var.f257012f.f256931v = 0;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = v0Var.H;
            if (b4Var != null) {
                b4Var.d();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = v0Var.f257027w;
            if (cVar != null) {
                cVar.a(false, false);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v0Var.f257029x0)) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = v0Var.f257017n;
                if (c22621x7603e017 != null) {
                    c22621x7603e017.setFocusable(true);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = v0Var.f257017n;
                if (c22621x7603e0172 != null) {
                    c22621x7603e0172.setFocusableInTouchMode(true);
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = v0Var.f257017n;
            if (c22621x7603e0173 != null) {
                c22621x7603e0173.setText(v0Var.f257029x0);
            }
            android.view.View view = v0Var.f257019p;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$14", "handleMessage", "(Landroid/os/Message;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$14", "handleMessage", "(Landroid/os/Message;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return true;
    }
}
