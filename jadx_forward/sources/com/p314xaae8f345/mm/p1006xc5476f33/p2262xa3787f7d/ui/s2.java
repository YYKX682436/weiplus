package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes3.dex */
public final class s2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f254663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f254664e;

    public s2(java.util.ArrayList arrayList, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        this.f254663d = arrayList;
        this.f254664e = g0Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2 p2Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2 p2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) holder.f374658i;
        boolean z18 = p2Var2.f254636e;
        boolean z19 = !z18;
        p2Var2.f254636e = z19;
        java.util.ArrayList arrayList = this.f254663d;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f254664e;
        r45.mz2 mz2Var = p2Var2.f254635d;
        if (i17 != 0) {
            if (z19) {
                g0Var.f391654d |= mz2Var.m75942xfb822ef2(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2 p2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) kz5.n0.Z(arrayList);
                if (p2Var3 != null) {
                    p2Var3.f254636e = false;
                }
                adapter.m8147xed6e4d18(0);
            } else {
                g0Var.f391654d &= ~mz2Var.m75942xfb822ef2(0);
                if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) it.next()).f254636e) {
                            z17 = false;
                            break;
                        }
                    }
                }
                z17 = true;
                if (z17 && (p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) kz5.n0.Z(arrayList)) != null) {
                    p2Var.f254636e = false;
                    g0Var.f391654d = p2Var.f254635d.m75942xfb822ef2(0);
                }
            }
            adapter.m8147xed6e4d18(i17);
        } else if (z19) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) obj, p2Var2)) {
                    arrayList2.add(obj);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) it6.next()).f254636e = false;
            }
            adapter.m8146xced61ae5();
            g0Var.f391654d = mz2Var.m75942xfb822ef2(0);
        } else {
            g0Var.f391654d = 0L;
            adapter.m8147xed6e4d18(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemClick: pos=");
        sb6.append(i17);
        sb6.append(", wording=");
        sb6.append(mz2Var.m75945x2fec8307(1));
        sb6.append(", oldSelected=");
        sb6.append(z18);
        sb6.append(", newSelected=");
        sb6.append(p2Var2.f254636e);
        sb6.append(", tmpSelectedContentFlag=");
        long j17 = g0Var.f391654d;
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        sb6.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeContentManageUIC", sb6.toString());
    }
}
