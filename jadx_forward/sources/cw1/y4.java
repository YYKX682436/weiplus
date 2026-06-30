package cw1;

/* loaded from: classes12.dex */
public class y4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac f305051d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f305052e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f305053f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f305054g;

    /* renamed from: h, reason: collision with root package name */
    public int f305055h;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac) {
        this.f305051d = activityC13118x73d350ac;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cw1.a getItem(int i17) {
        if (i17 < 0 || i17 >= this.f305053f.size()) {
            return null;
        }
        return (cw1.a) this.f305053f.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f305053f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(final int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        final cw1.z4 z4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = this.f305051d;
        if (view == null) {
            view = activityC13118x73d350ac.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.awt, viewGroup, false);
            z4Var = new cw1.z4();
            z4Var.f305068a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            z4Var.f305069b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
            z4Var.f305070c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cut);
            z4Var.f305071d = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.mie);
            z4Var.f305072e = view.findViewById(com.p314xaae8f345.mm.R.id.bxc);
            z4Var.f305073f = view.findViewById(com.p314xaae8f345.mm.R.id.ofy);
            view.setTag(z4Var);
        } else {
            z4Var = (cw1.z4) view.getTag();
        }
        z4Var.f305072e.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.y4$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i18 = i17;
                cw1.y4 y4Var = cw1.y4.this;
                y4Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                cw1.z4 z4Var2 = z4Var;
                arrayList.add(z4Var2);
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", y4Var, array);
                android.widget.AdapterView.OnItemClickListener onItemClickListener = y4Var.f305054g;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(null, z4Var2.f305072e, i18, -1L);
                }
                yj0.a.h(y4Var, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        cw1.a item = getItem(i17);
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CleanChattingAdapter", "get item is null. [%d]", java.lang.Integer.valueOf(i17));
            item = new cw1.a("", 5);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(z4Var.f305068a, item.f304243a, null);
        z4Var.f305070c.setText(fp.n0.a(item.f304244b[this.f305055h]));
        java.lang.String str = item.f304243a;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            android.widget.TextView textView = z4Var.f305069b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String f17 = c01.a2.f(str, str);
            float textSize = z4Var.f305069b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13118x73d350ac, f17, textSize));
        } else {
            android.widget.TextView textView2 = z4Var.f305069b;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            float textSize2 = z4Var.f305069b.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13118x73d350ac, e17, textSize2));
        }
        z4Var.f305071d.setChecked(this.f305052e.contains(java.lang.Integer.valueOf(i17)));
        android.view.View view2 = z4Var.f305073f;
        int i18 = i17 == 0 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}
