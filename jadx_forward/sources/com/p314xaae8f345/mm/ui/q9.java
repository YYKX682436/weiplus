package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class q9 implements oo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.u9 f291080a;

    public q9(com.p314xaae8f345.mm.ui.u9 u9Var) {
        this.f291080a = u9Var;
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.ui.u9 u9Var = this.f291080a;
        java.lang.String str2 = u9Var.f292607a;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveTalkRoomTipsBarController", "liveTipsBarStorage notify, hostRoomId:%s", u9Var.f292607a);
        u9Var.f292608b = ((oo0.e) ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).wi()).D0(u9Var.f292607a);
        java.util.HashSet hashSet = com.p314xaae8f345.mm.ui.u9.f292606d;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.r9((com.p314xaae8f345.mm.ui.s9) it.next(), str));
            }
        }
    }
}
