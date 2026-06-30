package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class yc implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f192298a;

    public yc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f192298a = kdVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) == null) {
            return;
        }
        r45.re2 re2Var = new r45.re2();
        re2Var.mo11468x92b714fd(byteArrayExtra);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select room result: ");
        java.util.LinkedList m75941xfb821914 = re2Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContact_list(...)");
        sb6.append(kz5.n0.g0(m75941xfb821914, "|", null, null, 0, null, null, 62, null));
        sb6.append(" resultCode: ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisibilityModeConfigPanel", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f192298a;
        java.util.LinkedList m75941xfb8219142 = kdVar.L1.m75941xfb821914(2);
        if (m75941xfb8219142 != null) {
            m75941xfb8219142.clear();
        }
        r45.re2 re2Var2 = kdVar.L1;
        java.util.LinkedList m75941xfb8219143 = re2Var2.m75941xfb821914(2);
        if (m75941xfb8219143 != null) {
            m75941xfb8219143.addAll(re2Var.m75941xfb821914(2));
        }
        java.util.LinkedList m75941xfb8219144 = re2Var2.m75941xfb821914(1);
        if (m75941xfb8219144 != null) {
            m75941xfb8219144.clear();
        }
        java.util.LinkedList m75941xfb8219145 = re2Var2.m75941xfb821914(1);
        if (m75941xfb8219145 != null) {
            m75941xfb8219145.addAll(re2Var.m75941xfb821914(1));
        }
        java.util.LinkedList m75941xfb8219146 = re2Var2.m75941xfb821914(0);
        if (m75941xfb8219146 != null) {
            m75941xfb8219146.clear();
        }
        java.util.LinkedList m75941xfb8219147 = re2Var2.m75941xfb821914(0);
        if (m75941xfb8219147 != null) {
            m75941xfb8219147.addAll(re2Var.m75941xfb821914(0));
        }
        kdVar.g0();
    }
}
