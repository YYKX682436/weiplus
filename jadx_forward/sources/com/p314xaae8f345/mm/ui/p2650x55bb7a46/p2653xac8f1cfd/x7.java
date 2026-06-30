package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class x7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y7 f281754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281755e;

    public x7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y7 y7Var, java.lang.String str) {
        this.f281754d = y7Var;
        this.f281755e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y7 y7Var = this.f281754d;
        y7Var.f281818e.size();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) y7Var.f281818e).entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) entry.getValue();
            java.lang.String V1 = f9Var.V1();
            if (V1 == null) {
                V1 = "";
            }
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).mj("group_status_icon", "view_unexp", new xe0.n0(V1, Q0, this.f281755e, java.lang.String.valueOf(longValue)));
        }
    }
}
