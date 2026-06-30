package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class md implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa f205516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 f205517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f205518f;

    public md(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819, long j17) {
        this.f205516d = c13920xa5f564aa;
        this.f205517e = c14895xe517e819;
        this.f205518f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = this.f205516d;
        java.util.Iterator<T> it = c13920xa5f564aa.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            j17 = this.f205518f;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            so2.q2 q2Var = j5Var instanceof so2.q2 ? (so2.q2) j5Var : null;
            if ((q2Var == null || (c19792x256d2725 = q2Var.f492082n) == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null || m76794xd0557130.m75942xfb822ef2(0) != j17) ? false : true) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0 && i17 < c13920xa5f564aa.size()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819 = this.f205517e;
        if (z17) {
            java.lang.Object remove = c13920xa5f564aa.remove(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
            so2.j5 j5Var2 = (so2.j5) remove;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c14895xe517e819.P6().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8155x27702c4(i17);
            }
            cm2.a aVar = cm2.a.f124861a;
            so2.q2 q2Var2 = j5Var2 instanceof so2.q2 ? (so2.q2) j5Var2 : null;
            str = aVar.x(q2Var2 != null ? q2Var2.f492082n : null, i17);
        } else {
            str = "fail,live:" + j17 + ",pos:" + i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14895xe517e819.f204981i, "delete replay " + str);
    }
}
