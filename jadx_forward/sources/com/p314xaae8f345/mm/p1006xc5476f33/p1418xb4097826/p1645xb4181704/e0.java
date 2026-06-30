package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var) {
        super(1);
        this.f211760d = o0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String string;
        jv2.d commentItem = (jv2.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211760d;
        o0Var.getClass();
        android.content.Context context = o0Var.f211855d;
        if (context != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String md6 = c61.yb.md((c61.yb) c17, commentItem.f383740d.D0(), commentItem.f383740d.y0(), false, 4, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574890jv0, md6), "getString(...)");
            if (commentItem.f383740d.A0() != 0) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574891jv1, md6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            } else {
                java.util.ArrayList arrayList = o0Var.f211859h.f211875a;
                int i17 = 0;
                if (arrayList != null) {
                    long t07 = commentItem.f383740d.t0();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((jv2.d) it.next()).f383740d.A0() == t07) {
                            i17++;
                        }
                    }
                }
                if (i17 > 0) {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574890jv0, md6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                } else {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574891jv1, md6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                }
            }
            db5.e1.u(context, string, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q(o0Var, commentItem, context), null);
        }
        return jz5.f0.f384359a;
    }
}
