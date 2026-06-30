package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class ea implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd f213522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f213523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f213524c;

    public ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd, boolean z17, r45.h32 h32Var) {
        this.f213522a = c15287xabbcfcd;
        this.f213523b = z17;
        this.f213524c = h32Var;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.q65 q65Var = (r45.q65) this.f213524c.m75936x14adae67(10);
        boolean z18 = false;
        if (q65Var != null && q65Var.m75933x41a8a7f2(0)) {
            z18 = true;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd.f212616q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd = this.f213522a;
        if (this.f213523b) {
            db5.t7.m(c15287xabbcfcd.getContext(), c15287xabbcfcd.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0o));
            return;
        }
        java.lang.String string = z18 ? c15287xabbcfcd.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0k) : c15287xabbcfcd.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.m(c15287xabbcfcd.getContext(), string);
    }
}
