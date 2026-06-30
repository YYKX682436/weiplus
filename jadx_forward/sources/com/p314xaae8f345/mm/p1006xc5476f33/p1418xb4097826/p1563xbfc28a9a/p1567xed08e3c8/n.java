package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class n implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202790a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var) {
        this.f202790a = c0Var;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.lang.String str;
        r45.j32 j32Var;
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeList, "noticeList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202790a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) c0Var.f202722p1.get(c0Var.U);
        kk.l lVar = c0Var.f202722p1;
        if (l2Var2 != null && (h32Var = l2Var2.f205449e) != null) {
            java.util.Iterator it = noticeList.iterator();
            while (it.hasNext()) {
                r45.h32 h32Var2 = (r45.h32) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h32Var.m75945x2fec8307(4), h32Var2.m75945x2fec8307(4)) && (l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(c0Var.U)) != null) {
                    l2Var.f205449e = h32Var2;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = c0Var.L;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
            throw null;
        }
        java.lang.String str2 = c0Var.U;
        ya2.b2 b17 = ya2.h.f542017a.b(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(c0Var.U);
        if (l2Var3 == null || (j32Var = l2Var3.f205456l) == null || (str = j32Var.m75945x2fec8307(5)) == null) {
            str = c0Var.f202735y1;
        }
        java.lang.String str3 = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        s1Var.a("moreLiveListWidget-onDismiss", str2, false, false, false, b17, str3);
        android.view.View view = c0Var.D;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var2 = c0Var.L;
            if (s1Var2 != null) {
                s1Var2.j(c0Var.U);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
                throw null;
            }
        }
    }
}
