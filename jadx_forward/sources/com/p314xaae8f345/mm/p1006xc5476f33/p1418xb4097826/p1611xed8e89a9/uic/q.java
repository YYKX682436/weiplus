package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class q implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 f205668d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var) {
        this.f205668d = o0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.bb bbVar;
        r45.bb bbVar2;
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var = this.f205668d;
        if (m75939xb282bd08 != 0) {
            java.lang.String string = req.m75939xb282bd08(0) == 1 ? o0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oij) : o0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1t);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            android.app.Activity m80379x76847179 = o0Var.m80379x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79676xdf4900bc);
            e4Var.f293309c = string;
            e4Var.c();
            return;
        }
        ya2.g gVar = ya2.h.f542017a;
        ya2.b2 b17 = gVar.b(o0Var.m58736x6c03c64c());
        if (b17 != null) {
            if (req.m75939xb282bd08(0) == 1) {
                r45.mz0 mz0Var = b17.f69333xc5565091;
                if (mz0Var != null && (bbVar2 = (r45.bb) mz0Var.m75936x14adae67(1)) != null) {
                    bbVar2.set(1, 1);
                }
            } else {
                r45.mz0 mz0Var2 = b17.f69333xc5565091;
                if (mz0Var2 != null && (bbVar = (r45.bb) mz0Var2.m75936x14adae67(1)) != null) {
                    bbVar.set(1, 2);
                }
            }
            gVar.o(b17);
        }
        java.lang.String string2 = req.m75939xb282bd08(0) == 1 ? o0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogs) : o0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        android.app.Activity m80379x768471792 = o0Var.m80379x76847179();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x768471792);
        e4Var2.b(com.p314xaae8f345.mm.R.raw.f79676xdf4900bc);
        e4Var2.f293309c = string2;
        e4Var2.c();
    }
}
