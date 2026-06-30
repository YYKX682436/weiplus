package eg2;

/* loaded from: classes3.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.n f334179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(eg2.n nVar) {
        super(1);
        this.f334179d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6;
        java.lang.String localPath = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        eg2.n nVar = this.f334179d;
        nVar.getClass();
        nVar.f334126n = localPath;
        nVar.f334128p = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f62 = nVar.f334123h;
        if (c14215x6ef072f62 != null) {
            c14215x6ef072f62.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f63 = nVar.f334123h;
        if (c14215x6ef072f63 != null) {
            c14215x6ef072f63.m56826x773c2518(nVar.f334129q);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "showHDOption: localPath=" + localPath + ", showHdRedDot=" + nVar.f334129q);
        te2.m3.f499757a.a(te2.j3.f499666f, nVar.f334130r == 2 ? te2.l3.f499734e : te2.l3.f499733d, 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = nVar.f334124i;
        if (!(slVar != null && slVar.isShowing()) && (c14215x6ef072f6 = nVar.f334123h) != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COVER_ENHANCE_GUIDE_CNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85320j8).mo141623x754a37bb()).r()).intValue();
            if (r17 >= intValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "showEnhanceBubble: skip, guideCnt=" + r17 + " >= guideLimit=" + intValue);
            } else {
                te2.k3 k3Var = te2.k3.f499695e;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 3);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f408858e;
                zy2.zb.j5(zbVar, 75L, jSONObject.toString(), null, 4, null);
                int i17 = r17 + 1;
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "showEnhanceBubble: guideCnt=" + i17 + '/' + intValue);
                android.content.Context context = nVar.f334078e.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ami);
                int i18 = context.getResources().getDisplayMetrics().widthPixels;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl(context);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.orw);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                slVar2.c(string);
                slVar2.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200377d;
                slVar2.f201344o = true;
                slVar2.f201345p = dimensionPixelSize3;
                android.widget.TextView textView = slVar2.f201331b;
                textView.setMaxWidth((i18 - dimensionPixelSize3) - dimensionPixelSize4);
                slVar2.f201333d = c14215x6ef072f6;
                slVar2.setOutsideTouchable(true);
                slVar2.setFocusable(true);
                textView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                slVar2.f201338i = new eg2.k(nVar);
                slVar2.f201337h = new eg2.l(nVar);
                slVar2.b();
                slVar2.d(nVar.f334125m);
                nVar.f334124i = slVar2;
            }
        }
        return jz5.f0.f384359a;
    }
}
