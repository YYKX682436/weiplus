package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f222875d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f222876e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b f222877f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b c16004xccb3de6b) {
        this.f222877f = c16004xccb3de6b;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.LinkedList) this.f222876e).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a0) ((java.util.LinkedList) this.f222876e).get(i17);
        yVar.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.x(yVar, a0Var, i17));
        android.widget.TextView textView = yVar.f222869h;
        textView.setVisibility(8);
        yVar.f222870i.setVisibility(8);
        z53.i iVar = a0Var.f222766e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z zVar = yVar.f222871m;
        if (iVar != null) {
            ng5.a.a(yVar.f222867f, iVar.f67670x114ef53e);
            yVar.f222868g.setText(a0Var.f222766e.G);
            if (a0Var.f222766e.f67671xa35b5abb > 0) {
                textView.setVisibility(0);
                int i18 = a0Var.f222766e.f67671xa35b5abb;
                if (i18 > 99) {
                    textView.setText("");
                    textView.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
                } else {
                    textView.setText(java.lang.String.valueOf(i18));
                    textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(zVar.f222877f.f222656f2, i18));
                }
            }
            java.util.Map map = yVar.f222865d;
            java.lang.String str = a0Var.f222766e.f67669xbed8694c;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (!hashMap.containsKey(str)) {
                java.lang.String str2 = a0Var.f222766e.f67669xbed8694c;
                hashMap.put(str2 != null ? str2 : "", java.lang.Boolean.TRUE);
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(a0Var.f222766e.f67668x5568d387);
                z53.i iVar2 = a0Var.f222766e;
                y53.m mVar = iVar2.F;
                if (mVar != null && Di != null) {
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
                    int i19 = i17 + 1;
                    int i27 = zVar.f222875d;
                    java.lang.String str3 = iVar2.f67669xbed8694c;
                    long j17 = Di.f67426x9f600742;
                    java.lang.String str4 = iVar2.f67668x5568d387;
                    long j18 = mVar.f67426x9f600742;
                    java.lang.String str5 = iVar2.f67670x114ef53e;
                    long t07 = iVar2.t0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b c16004xccb3de6b = zVar.f222877f;
                    long j19 = c16004xccb3de6b.f222657g2;
                    if (j19 <= 0) {
                        j19 = c16004xccb3de6b.f222658h2;
                    }
                    dVar.f(i19, 1L, i27, str3, j17, str4, j18, str5, t07, (int) j19, null, java.lang.Integer.valueOf(a0Var.f222766e.f67671xa35b5abb));
                }
            }
        }
        if (yVar.f222866e) {
            yVar.f222866e = false;
            int i28 = zVar.f222875d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b c16004xccb3de6b2 = zVar.f222877f;
            long j27 = c16004xccb3de6b2.f222657g2;
            if (j27 <= 0) {
                j27 = c16004xccb3de6b2.f222658h2;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
            c6633xea2e527d.f139873d = 2L;
            c6633xea2e527d.f139874e = 202L;
            c6633xea2e527d.f139875f = 0L;
            c6633xea2e527d.f139876g = 1L;
            c6633xea2e527d.f139877h = (int) j27;
            c6633xea2e527d.f139884o = i28;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("list_state", i28 == 0 ? 2 : 1);
            c6633xea2e527d.p(java.net.URLEncoder.encode(jSONObject.toString()));
            c6633xea2e527d.k();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y(this, android.view.LayoutInflater.from(this.f222877f.f222656f2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgc, (android.view.ViewGroup) null));
    }
}
