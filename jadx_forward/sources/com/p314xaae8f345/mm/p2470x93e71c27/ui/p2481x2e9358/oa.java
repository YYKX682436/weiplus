package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class oa extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f272079d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra f272080e;

    public oa(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar) {
        this.f272080e = raVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.LinkedList linkedList = this.f272079d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size() + this.f272080e.f272162t;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.LinkedList linkedList = this.f272079d;
        return (linkedList == null || i17 != linkedList.size()) ? 0 : 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.LinkedList linkedList = this.f272079d;
        jr.p pVar = (linkedList == null || linkedList.size() <= i17) ? null : (jr.p) linkedList.get(i17);
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = this.f272080e;
        if (mo863xcdaf1228 == 1) {
            if (!raVar.f272160r) {
                raVar.f272160r = true;
                int m8183xf806b362 = k3Var.m8183xf806b362();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1 c6948x597c7cb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1();
                sb6.append(m8183xf806b362);
                c6948x597c7cb1.f142535h = c6948x597c7cb1.b("md5", "emoticon_search_more", true);
                c6948x597c7cb1.f142539l = c6948x597c7cb1.b("IsLocalSearch", "1", true);
                c6948x597c7cb1.f142537j = c6948x597c7cb1.b("Index", sb6.toString(), true);
                c6948x597c7cb1.f142532e = c6948x597c7cb1.b("Word", raVar.f272151i.replace(",", ""), true);
                c6948x597c7cb1.f142534g = m8183xf806b362;
                c6948x597c7cb1.f142531d = 3L;
                c6948x597c7cb1.f142546s = java.lang.System.currentTimeMillis() - raVar.f272159q;
                c6948x597c7cb1.k();
                c6948x597c7cb1.f142534g = 0L;
            }
            if (!raVar.f272167y) {
                raVar.f272167y = true;
                raVar.e("chat_emo_bubble_search", "view_exp", raVar.c());
            }
            k3Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.na(this, k3Var));
        }
        if (pVar != null && (k3Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.qa)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.qa qaVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.qa) k3Var;
            qaVar.f272124e = pVar;
            android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.CENTER_INSIDE;
            com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d c10450x95592a7d = qaVar.f272123d;
            c10450x95592a7d.setScaleType(scaleType);
            s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = pVar.f382849a;
            java.lang.String v17 = ((y12.h) wi6).v(c21053xdbf1e5f4.mo42933xb5885648());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17)) {
                c10450x95592a7d.setContentDescription(raVar.f272143a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzu));
            } else {
                c10450x95592a7d.setContentDescription(v17);
            }
            c10450x95592a7d.m43712xc040f7d2(c21053xdbf1e5f4);
            raVar.f272164v.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = this.f272080e;
        return i17 == 1 ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ma(this, android.view.LayoutInflater.from(raVar.f272143a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569973td, viewGroup, false)) : new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.qa(raVar, android.view.LayoutInflater.from(raVar.f272143a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569975tf, viewGroup, false));
    }
}
