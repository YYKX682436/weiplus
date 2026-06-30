package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class sn implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f217443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo f217444e;

    public sn(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar) {
        this.f217443d = linkedList;
        this.f217444e = eoVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f217443d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            int m75939xb282bd08 = ((r45.y94) obj).m75939xb282bd08(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar = this.f217444e;
            java.lang.String string = m75939xb282bd08 == 1 ? eoVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lok) : eoVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lol);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            android.app.Activity m80379x76847179 = eoVar.m80379x76847179();
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(r3.m75942xfb822ef2(2) / 100.0d)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            g4Var.o(i17, string, m80379x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dlb, format));
            i17 = i18;
        }
    }
}
