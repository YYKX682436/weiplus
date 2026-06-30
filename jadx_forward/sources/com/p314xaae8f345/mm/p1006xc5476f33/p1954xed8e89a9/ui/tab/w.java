package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class w implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 f236209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236210b;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var, java.lang.String str) {
        this.f236209a = b0Var;
        this.f236210b = str;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.lang.String finderUserName;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeList, "noticeList");
        java.util.Iterator it = noticeList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            finderUserName = this.f236210b;
            if (!hasNext) {
                break;
            }
            r45.h32 h32Var = (r45.h32) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(finderUserName);
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
            r45.h32 e17 = i1Var.e(finderUserName, m75945x2fec8307 != null ? m75945x2fec8307 : "");
            if (e17 != null) {
                e17.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var = this.f236209a;
        r45.f32 f32Var = b0Var.f235766b.f470784y;
        int i18 = f32Var != null ? f32Var.f455513d : 0;
        if (i17 >= i18) {
            if (f32Var != null) {
                f32Var.f455514e = i18;
            }
        } else if (f32Var != null) {
            f32Var.f455514e = i17;
        }
        r45.mk mkVar = b0Var.f235778n;
        java.lang.String str = mkVar != null ? mkVar.f462132g : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUserName, "$finderUserName");
        r45.h32 e18 = i1Var2.e(finderUserName, str != null ? str : "");
        b0Var.e(e18 != null && e18.m75939xb282bd08(1) == 0);
    }
}
