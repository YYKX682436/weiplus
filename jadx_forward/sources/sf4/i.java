package sf4;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 f489024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 c18493x6cdc7fd6) {
        super(2);
        this.f489024d = c18493x6cdc7fd6;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View child = (android.view.View) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 c18493x6cdc7fd6 = this.f489024d;
        c18493x6cdc7fd6.getClass();
        int i17 = c18493x6cdc7fd6.f253582d2;
        c18493x6cdc7fd6.f253582d2 = intValue;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c18493x6cdc7fd6.f253581c2;
        sf4.k2 k2Var = (sf4.k2) c18493x6cdc7fd6.w0(child);
        c18493x6cdc7fd6.f253581c2 = k2Var != null ? k2Var.f489054d : null;
        yz5.q qVar = c18493x6cdc7fd6.onRowSelected;
        if (qVar != null) {
            qVar.mo147xb9724478(java.lang.Integer.valueOf(intValue), c18493x6cdc7fd6.f253581c2, k2Var != null ? k2Var.f489056f : null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2240xbddafb2a.C18471x54338b11 c18471x54338b11 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2240xbddafb2a.C18471x54338b11) (c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null);
        if (c18493x6cdc7fd6.mo7946xf939df19() instanceof sf4.k) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c18493x6cdc7fd6.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView.VerticalAdapter");
            sf4.k kVar = (sf4.k) mo7946xf939df19;
            int i18 = c18471x54338b11 != null ? c18471x54338b11.f253410x : 0;
            kVar.f489047f = i17;
            kVar.f489048g = i18;
        }
        return jz5.f0.f384359a;
    }
}
