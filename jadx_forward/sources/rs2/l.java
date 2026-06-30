package rs2;

/* loaded from: classes2.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 {

    /* renamed from: v, reason: collision with root package name */
    public boolean f480864v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f480864v = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new rs2.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b7v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void l7(int i17) {
        if (this.f480864v) {
            this.f480864v = false;
        } else {
            if (i17 < 0 || i17 >= f7().size()) {
                return;
            }
            boolean z17 = ((zx2.i) f7().get(i17)) instanceof rs2.h;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff;
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f215192h;
        if (c1190x18d3c3fe instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe).m62442xecae6946(true);
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.f215192h;
        if (c1190x18d3c3fe2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe2).m62442xecae6946(true);
        }
        this.f215191g = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nup);
        this.f215192h = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f569103p16);
        mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.cod).setOnClickListener(new rs2.k(this));
        if (m158359x1e885992().getIntExtra("key_purchase_member_count", 0) > 0) {
            java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new rs2.h(string), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14479xf898b182(), false, 4, null);
        }
        if (m158359x1e885992().getIntExtra("key_purchase_paid_collection_count", 0) > 0) {
            java.lang.String string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eyc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new rs2.h(string2), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C13939x5aca9cb7(), false, 4, null);
        }
        boolean z17 = m158359x1e885992().getIntExtra("key_purchase_live_count", 0) > 0;
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT");
        if (byteArrayExtra != null) {
            c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            try {
                c19786x6a1e2862.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        } else {
            c19786x6a1e2862 = null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = c19786x6a1e2862;
        boolean z18 = m158359x1e885992().getIntExtra("key_purchase_pay_mic_course_count", 0) > 0 && c19786x6a1e28622 != null;
        if (z17 && z18) {
            java.lang.String string3 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mre);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new rs2.h(string3), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14028xe782cb36(), false, 4, null);
        } else {
            if (z17) {
                java.lang.String string4 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mre);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new rs2.h(string4), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14026xfba8c305(), false, 4, null);
            }
            if (z18) {
                java.lang.String string5 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mre);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new rs2.h(string5), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14027xdecc30a6(c19786x6a1e28622), false, 4, null);
            }
        }
        if (f7().size() > 1 || (c2718xca2902ff = this.f215191g) == null) {
            return;
        }
        c2718xca2902ff.m20368xc75d81ec(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f480864v = true;
    }
}
