package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class kj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk f205440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205441e;

    public kj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var) {
        this.f205440d = dkVar;
        this.f205441e = f4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList m75941xfb821914;
        r45.wj6 wj6Var;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar = this.f205440d;
        r45.zc1 zc1Var = (r45.zc1) ((jz5.n) dkVar.f205172p).mo141623x754a37bb();
        r45.vj6 vj6Var = null;
        if (zc1Var != null && (m75941xfb8219142 = zc1Var.m75941xfb821914(0)) != null) {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.vj6) next).m75939xb282bd08(0) == 3) {
                    vj6Var = next;
                    break;
                }
            }
            vj6Var = vj6Var;
        }
        int m75939xb282bd08 = (vj6Var == null || (m75941xfb821914 = vj6Var.m75941xfb821914(1)) == null || (wj6Var = (r45.wj6) kz5.n0.Z(m75941xfb821914)) == null) ? 0 : wj6Var.m75939xb282bd08(1);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = dkVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47.class)).S6(so2.u1.class) * m75939xb282bd08;
        int i17 = 0;
        for (so2.j5 j5Var : dkVar.O6()) {
            i17 += ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getProfileTabScene() == 3) ? 1 : 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUnlimitedFlowUIC", "[onAttachData] videoCount=" + i17 + " maxSize=" + S6 + " rowCount=" + m75939xb282bd08);
        if (i17 < S6) {
            on5.c m82923x19404fcc = dkVar.P6().m82923x19404fcc();
            if (m82923x19404fcc != null) {
                m82923x19404fcc.b(true);
                return;
            }
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = dkVar.P6().m62367x4905e9fa();
        if (m62367x4905e9fa != null) {
            this.f205441e.T6(m62367x4905e9fa, true, 10);
        }
        dkVar.m58700xf0438b47().mo56155xd210094c();
    }
}
