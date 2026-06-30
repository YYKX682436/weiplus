package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class y4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192676d;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f192676d = a7Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        if (ret.m75939xb282bd08(1) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f192676d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
            if (c14994x9b99c079 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (c14994x9b99c079.m59251x5db1b11() == req.m75942xfb822ef2(0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = a7Var.f187745i;
                if (c14994x9b99c0792 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                    throw null;
                }
                c14994x9b99c0792.m59359xd63ced6(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = a7Var.L;
                if (c15268x6a41bd8a != null) {
                    long m75942xfb822ef2 = req.m75942xfb822ef2(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = c15268x6a41bd8a.feedObj;
                    if ((c14994x9b99c0793 == null || (feedObject = c14994x9b99c0793.getFeedObject()) == null || m75942xfb822ef2 != feedObject.m76784x5db1b11()) ? false : true) {
                        c15268x6a41bd8a.closeComment = false;
                        c15268x6a41bd8a.showFooter = true;
                    }
                }
                yw2.a0 a0Var = a7Var.f187749o;
                if (a0Var != null) {
                    a0Var.v();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.u0(this.f192676d, false, 0, 0, 7, null);
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                android.content.Context context = a7Var.f187740d;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhc);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
                e4Var.c();
            }
        }
    }
}
