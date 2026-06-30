package xx0;

/* loaded from: classes5.dex */
public final class a implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.c f539383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10999x6193c3b0 f539384e;

    public a(xx0.c cVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10999x6193c3b0 c10999x6193c3b0) {
        this.f539383d = cVar;
        this.f539384e = c10999x6193c3b0;
    }

    @Override // oa.c
    public void h0(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
    }

    @Override // oa.c
    public void l4(oa.i tab) {
        xx0.d0 d0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        xx0.f0 f0Var = this.f539383d.f539397g;
        if (f0Var != null) {
            int i17 = tab.f425315e;
            try {
                xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) f0Var.f539432h).get(java.lang.Long.valueOf(((vt3.r) f0Var.f539429e.get(i17)).f521572a));
                if (e0Var == null || (d0Var = e0Var.f539421a) == null) {
                    return;
                }
                d0Var.b();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateTabPagerAdapter", "unselectTabAt: tab is invalid at: " + i17 + ", exception: " + e17);
            }
        }
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        xx0.d0 d0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        xx0.c cVar = this.f539383d;
        xx0.f0 f0Var = cVar.f539397g;
        if (f0Var != null) {
            int i17 = tab.f425315e;
            try {
                xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) f0Var.f539432h).get(java.lang.Long.valueOf(((vt3.r) f0Var.f539429e.get(i17)).f521572a));
                if (e0Var != null && (d0Var = e0Var.f539421a) != null) {
                    d0Var.a();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateTabPagerAdapter", "selectTabAt: tab is invalid at: " + i17 + ", exception: " + e17);
            }
        }
        if (((vt3.r) kz5.n0.a0(cVar.f539399i, tab.f425315e)) != null) {
            this.f539384e.m8317x940d026a(tab.f425315e, false);
        }
    }
}
