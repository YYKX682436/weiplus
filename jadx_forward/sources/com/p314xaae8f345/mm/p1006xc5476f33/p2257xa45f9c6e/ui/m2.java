package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public final class m2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 f254181d;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var) {
        this.f254181d = o2Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "received taskBarOnStorageChangeListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254181d;
        o2Var.b(true, 300L);
        int i17 = w0Var.f398507b;
        if (i17 != 5) {
            if (i17 == 2) {
                java.lang.Object obj = w0Var.f398509d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.model.MultiTaskInfo");
                o2Var.h((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) obj, 0, 1, 1);
                return;
            }
            return;
        }
        java.lang.Object obj2 = w0Var.f398509d;
        if (obj2 != null) {
            gh4.n0 n0Var = (gh4.n0) obj2;
            int i18 = n0Var.f353477b;
            if (i18 == 2 || i18 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = n0Var.f353476a;
                if (c16601x7ed0e40c != null) {
                    o2Var.h(c16601x7ed0e40c, 0, 2, i18);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskInfo");
                    throw null;
                }
            }
        }
    }
}
