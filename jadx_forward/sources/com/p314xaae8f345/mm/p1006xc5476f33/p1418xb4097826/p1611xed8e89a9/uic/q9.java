package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class q9 implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f205682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205683b;

    public q9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar) {
        this.f205682a = s4Var;
        this.f205683b = obVar;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeList, "noticeList");
        int size = noticeList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f205682a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205683b;
        if (size <= 0 || !z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s4Var.f206287h.get(obVar.m58741x6c03c64c());
            if (l2Var2 != null && (h32Var = l2Var2.f205449e) != null) {
                java.util.Iterator it = noticeList.iterator();
                while (it.hasNext()) {
                    r45.h32 h32Var2 = (r45.h32) it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h32Var.m75945x2fec8307(4), h32Var2.m75945x2fec8307(4)) && (l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s4Var.f206287h.get(obVar.m58741x6c03c64c())) != null) {
                        l2Var.f205449e = h32Var2;
                    }
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s4Var.f206287h.get(obVar.m58741x6c03c64c());
            if (l2Var3 != null) {
                l2Var3.f205449e = (r45.h32) kz5.n0.X(noticeList);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s4Var.f206287h.get(obVar.m58741x6c03c64c());
        if (l2Var4 != null) {
            l2Var4.B = c32Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.G7(obVar, "moreLiveListWidget-onDismiss", null, 2, null);
    }
}
