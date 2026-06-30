package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class yp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b f201989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f201990e;

    public yp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b c14406x76bd35b, r45.h32 h32Var) {
        this.f201989d = c14406x76bd35b;
        this.f201990e = h32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b c14406x76bd35b = this.f201989d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = c14406x76bd35b.f199202e;
        if (c14334xd566b302 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeItemTxt");
            throw null;
        }
        r45.h32 h32Var = this.f201990e;
        java.lang.String string = h32Var != null ? (c14406x76bd35b.f199204g != c14406x76bd35b.f199203f || h32Var.m75939xb282bd08(5) <= 0) ? h32Var.m75939xb282bd08(20) == 1 ? c14406x76bd35b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nta, zl2.q4.f555466a.v(h32Var.m75939xb282bd08(0) * 1000)) : c14406x76bd35b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nta, zl2.q4.r(zl2.q4.f555466a, h32Var.m75939xb282bd08(0) * 1000, null, false, false, 14, null)) : c14406x76bd35b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8v, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(5))) : null;
        if (string == null) {
            string = zl2.r4.f555483a.w1() ? c14406x76bd35b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572866cs4) : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        c14334xd566b302.d(string, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b3022 = c14406x76bd35b.f199202e;
        if (c14334xd566b3022 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeItemTxt");
            throw null;
        }
        c14334xd566b3022.f197558f = 0;
        c14334xd566b3022.f197559g = true;
        c14334xd566b3022.f197560h = true;
        if (c14334xd566b3022.f197565p > 0) {
            c14334xd566b3022.c();
        } else {
            c14334xd566b3022.b();
        }
    }
}
