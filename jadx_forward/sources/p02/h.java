package p02;

/* loaded from: classes8.dex */
public class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f431929d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.C13237x4b7b34f3 f431930e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f431931f = new java.util.ArrayList();

    public h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.C13237x4b7b34f3 c13237x4b7b34f3) {
        this.f431929d = context;
        this.f431930e = c13237x4b7b34f3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f431931f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((p02.l) this.f431931f.get(i17)).f431936a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        p02.g gVar = (p02.g) k3Var;
        p02.l lVar = (p02.l) this.f431931f.get(i17);
        gVar.getClass();
        int i18 = lVar.f431936a;
        if (i18 == 1) {
            android.view.View view = gVar.f431912e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = gVar.f431913f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = gVar.f431916i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i18 == 2) {
            android.view.View view4 = gVar.f431912e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = gVar.f431913f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = gVar.f431916i;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gVar.f431914g.setText(lVar.f431937b);
            gVar.f431915h.setTag(lVar);
            return;
        }
        if (i18 != 3) {
            return;
        }
        android.view.View view7 = gVar.f431912e;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = gVar.f431913f;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view9 = gVar.f431916i;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n11.a.b().g(lVar.f431941f, gVar.f431917m);
        gVar.f431919o.setText(android.text.Html.fromHtml(lVar.f431940e));
        android.widget.LinearLayout linearLayout = gVar.f431920p;
        linearLayout.removeAllViews();
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(lVar.f431942g);
        p02.h hVar = gVar.f431928x;
        if (!L0) {
            for (int i19 = 0; i19 < ((java.util.LinkedList) lVar.f431942g).size() && i19 <= 2; i19++) {
                android.view.View inflate = android.view.LayoutInflater.from(hVar.f431929d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxm, (android.view.ViewGroup) null);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nwz)).setText((java.lang.CharSequence) ((java.util.LinkedList) lVar.f431942g).get(i19));
                linearLayout.addView(inflate);
            }
        }
        long j17 = lVar.f431943h;
        gVar.f431921q.setText(j17 >= 1073741824 ? java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((((float) j17) / 1024.0f) / 1024.0f) / 1024.0f)) : j17 >= 1048576 ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((((float) j17) / 1024.0f) / 1024.0f)) : java.lang.String.format("%.2fMB", java.lang.Float.valueOf((((float) j17) / 1024.0f) / 1024.0f)));
        gVar.f431918n.setTag(lVar);
        int i27 = lVar.f431938c;
        if (i27 == 1) {
            gVar.i(com.p314xaae8f345.mm.R.C30867xcad56011.bqh);
        } else if (i27 == 2) {
            gVar.i(com.p314xaae8f345.mm.R.C30867xcad56011.gax);
        } else if (i27 == 3) {
            gVar.i(com.p314xaae8f345.mm.R.C30867xcad56011.k3g);
        } else if (i27 == 4) {
            gVar.i(com.p314xaae8f345.mm.R.C30867xcad56011.g1c);
        }
        gVar.f431922r.setText(hVar.f431929d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571905t5) + lVar.f431946k);
        gVar.f431923s.setText(hVar.f431929d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572042x3) + lVar.f431947l);
        gVar.f431924t.setText(android.text.Html.fromHtml(lVar.f431940e + " " + lVar.f431948m));
        gVar.f431925u.setOnClickListener(new p02.d(gVar, lVar));
        gVar.f431926v.setOnClickListener(new p02.e(gVar, lVar));
        gVar.f431927w.setOnClickListener(new p02.f(gVar, lVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new p02.g(this, android.view.LayoutInflater.from(this.f431929d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ciw, viewGroup, false));
    }
}
