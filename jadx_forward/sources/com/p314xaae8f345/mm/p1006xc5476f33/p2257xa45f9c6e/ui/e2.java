package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public final class e2 implements s40.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 f254137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f254138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f254139c;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        this.f254137a = o2Var;
        this.f254138b = hashMap;
        this.f254139c = hashMap2;
    }

    public void a(java.util.Map map, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var;
        byte[] bArr;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.nw1 m76794xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254137a;
        if (i17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "new interval:" + i17);
            o2Var.f254205r = i17;
        }
        boolean z17 = false;
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((java.lang.Number) entry.getValue()).intValue() == 2) {
                r45.b22 b22Var = (r45.b22) this.f254138b.get(entry.getKey());
                if (b22Var != null && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7)) != null && (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) != null) {
                    m76794xd0557130.set(2, 2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) this.f254139c.get(entry.getKey());
                if (c16601x7ed0e40c != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "live end: " + c16601x7ed0e40c.v0().m75945x2fec8307(0));
                    if (b22Var == null || (bArr = b22Var.mo14344x5f01b1f6()) == null) {
                        bArr = c16601x7ed0e40c.f66790x225a93cf;
                    }
                    c16601x7ed0e40c.f66790x225a93cf = bArr;
                    ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(c16601x7ed0e40c.f66791xc8a07680, true, 2);
                    z17 = true;
                }
            }
        }
        if (!z17 || (a2Var = o2Var.f254188a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var;
        c18557xc00aa3f3.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p1(c18557xc00aa3f3));
    }
}
