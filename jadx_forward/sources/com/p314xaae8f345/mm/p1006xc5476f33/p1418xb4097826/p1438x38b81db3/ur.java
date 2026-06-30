package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ur extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr f186265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f186266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f186268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186269e;

    public ur(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr wrVar, android.widget.LinearLayout linearLayout, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f186265a = wrVar;
        this.f186266b = linearLayout;
        this.f186267c = h0Var;
        this.f186268d = f0Var;
        this.f186269e = h0Var2;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object tag = this.f186266b.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr wrVar = this.f186265a;
        wrVar.getClass();
        int intValue = (tag == null || !(tag instanceof java.lang.Integer)) ? -1 : ((java.lang.Number) tag).intValue();
        if (z17) {
            java.util.List list = (java.util.List) this.f186267c.f391656d;
            int i17 = 0;
            java.lang.String str = "";
            if (!(list == null || list.isEmpty())) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i18 = i17 + 1;
                    str = str + pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11());
                    if (i17 < list.size() - 1) {
                        str = str + ';';
                    }
                    i17 = i18;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a, wrVar.f186431e, 1, c01.id.c(), intValue, this.f186268d.f391649d, (java.lang.String) this.f186269e.f391656d, null, str, 64, null);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5532x6b57699a c5532x6b57699a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5532x6b57699a();
        am.dd ddVar = c5532x6b57699a.f135857g;
        ddVar.f87976a = intValue - 1;
        ddVar.f87977b = z17 ? 1 : 0;
        c5532x6b57699a.e();
    }
}
