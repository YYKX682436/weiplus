package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MainTabUI$$b */
/* loaded from: classes8.dex */
public final /* synthetic */ class C21412x6fc73352 implements gy1.b {
    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.ui.C21410x67d80e90.f278453p;
        if (u46.l.c(str, "page_in") && ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).fj()) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            if (!((ef0.k2) ((qk.n8) i95.n0.c(qk.n8.class))).Di()) {
                java.lang.String[] strArr = {"Listen.Entrance", "Listen.MentionEntrance"};
                for (int i17 = 0; i17 < 2; i17++) {
                    java.lang.String str2 = strArr[i17];
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str2);
                    if (L0 != null) {
                        r45.f03 I0 = L0.I0(str2);
                        qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
                        r45.vs2 ctrInfo = L0.f65874xb5f7102a;
                        ((ef0.z3) d9Var).getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
                        hashMap2.put("tyt_red_".concat(str2), em4.c.a(ctrInfo, I0, "tyt_discover_enter"));
                    }
                }
            }
            ((ef0.k2) ((qk.n8) i95.n0.c(qk.n8.class))).Ai(hashMap2);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("tyt_discover_enter", "view_exp", hashMap2, 31087);
        }
    }
}
