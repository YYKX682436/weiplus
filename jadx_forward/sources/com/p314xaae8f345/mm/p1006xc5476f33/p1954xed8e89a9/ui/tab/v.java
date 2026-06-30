package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 f236149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236150e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var, java.lang.String str) {
        this.f236149d = b0Var;
        this.f236150e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.an anVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initMore$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var = this.f236149d;
        r45.wl v2resp = b0Var.f235766b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v2resp, "v2resp");
        r45.j32 j32Var = new r45.j32();
        if (v2resp.f470784y != null) {
            java.util.LinkedList<r45.mk> linkedList = v2resp.f470780u;
            if (linkedList.size() != 0 && (anVar = v2resp.f470778s) != null) {
                java.lang.String b17 = x51.j1.b(anVar.f451659d);
                for (r45.mk mkVar : linkedList) {
                    r45.h32 h32Var = new r45.h32();
                    h32Var.set(0, java.lang.Integer.valueOf(mkVar.f462129d));
                    h32Var.set(3, mkVar.f462131f);
                    h32Var.set(4, mkVar.f462132g);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                    java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    r45.h32 e17 = i1Var.e(b17, m75945x2fec8307);
                    h32Var.set(1, java.lang.Integer.valueOf(e17 != null ? e17.m75939xb282bd08(1) : 1));
                    j32Var.m75941xfb821914(0).add(h32Var);
                }
                j32Var.set(1, java.lang.Integer.valueOf(v2resp.f470784y.f455515f));
                j32Var.set(2, java.lang.Integer.valueOf(v2resp.f470784y.f455513d));
                j32Var.set(3, java.lang.Integer.valueOf(v2resp.f470784y.f455514e));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogic", "click show more, finderusername = " + this.f236150e + ", initCount = " + j32Var.m75941xfb821914(0).size() + ", totalNotice = " + j32Var.m75939xb282bd08(2) + ", totalReserve = " + j32Var.m75939xb282bd08(3));
        java.lang.String UserName = b0Var.f235766b.f470766d.f464598d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
        gr3.e.d(UserName, 1704, b0Var.f235768d, b0Var.f235765a.getIntent(), b0Var.f235781q, 0, 0, null, null, null, 0, 0, 4064, null);
        zy2.ic icVar = b0Var.f235780p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(icVar);
        zy2.ic.a(icVar, j32Var, null, false, null, 0, 0, null, 126, null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initMore$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
