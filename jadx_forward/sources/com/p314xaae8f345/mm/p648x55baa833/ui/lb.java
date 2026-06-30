package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class lb extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f145842d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f145843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 f145844f;

    public lb(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3, android.content.Context context) {
        this.f145844f = activityC10364x5bffdef3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f145842d = arrayList;
        this.f145843e = context;
        arrayList.clear();
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = activityC10364x5bffdef3.f145464f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str == null ? "" : str);
        activityC10364x5bffdef3.f145463e = z07;
        if (z07 != null) {
            for (java.lang.String str2 : z07.A0()) {
                if (activityC10364x5bffdef3.f145463e.G0(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "[resetData] Room Manager:%s", str2);
                    arrayList.add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 1, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true)));
                }
            }
            if (c01.z1.r().equals(activityC10364x5bffdef3.f145463e.f69107x5be1edb3)) {
                arrayList.add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 2, null));
                if (arrayList.size() > 1) {
                    arrayList.add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 3, null));
                }
            }
        }
        notifyDataSetChanged();
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f145842d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p648x55baa833.ui.ib) ((java.util.ArrayList) this.f145842d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p648x55baa833.ui.mb mbVar;
        android.text.SpannableString spannableString;
        java.lang.String z07;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3 = this.f145844f;
        android.content.Context context = this.f145843e;
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.chc, null);
            activityC10364x5bffdef3.getClass();
            mbVar = new com.p314xaae8f345.mm.p648x55baa833.ui.mb(activityC10364x5bffdef3);
            mbVar.f145907a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m7e);
            mbVar.f145908b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m7b);
        } else {
            mbVar = (com.p314xaae8f345.mm.p648x55baa833.ui.mb) view.getTag();
            if (mbVar == null) {
                activityC10364x5bffdef3.getClass();
                mbVar = new com.p314xaae8f345.mm.p648x55baa833.ui.mb(activityC10364x5bffdef3);
                mbVar.f145907a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m7e);
                mbVar.f145908b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m7b);
            }
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ib ibVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ib) ((java.util.ArrayList) this.f145842d).get(i17);
        if (ibVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SeeRoomManagerUI", "null == item! position:%s, count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view;
        }
        int i18 = ibVar.f145767a;
        if (i18 == 1) {
            mbVar.f145908b.setVisibility(0);
            android.widget.TextView textView = mbVar.f145908b;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ibVar.f145768b;
            java.lang.String d17 = z3Var.d1();
            android.widget.TextView textView2 = mbVar.f145908b;
            int i19 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3.f145461i;
            activityC10364x5bffdef3.getClass();
            if (textView2 != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(d17 == null ? "" : d17, true);
                if (n17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeRoomManagerUI", "ct == null");
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10364x5bffdef3.f145463e;
                        z07 = a3Var != null ? a3Var.z0(d17) : null;
                    } else {
                        z07 = n17.w0();
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
                        z07 = n17.w0();
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
                        z07 = n17.f2();
                    }
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str = z07 != null ? z07 : "";
                    float textSize = textView2.getTextSize();
                    ((ke0.e) xVar).getClass();
                    spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC10364x5bffdef3, str, textSize);
                    textView.setText(spannableString);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(mbVar.f145907a, z3Var.d1(), null);
                }
            }
            spannableString = null;
            textView.setText(spannableString);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(mbVar.f145907a, z3Var.d1(), null);
        } else if (i18 == 2) {
            mbVar.f145908b.setVisibility(4);
            mbVar.f145907a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562486g8);
            mbVar.f145907a.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571370d5));
        } else if (i18 == 3) {
            mbVar.f145908b.setVisibility(4);
            mbVar.f145907a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562487g9);
            mbVar.f145907a.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bo7));
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.kb(this, i17));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f145844f.f145462d.post(new com.p314xaae8f345.mm.p648x55baa833.ui.jb(this));
    }
}
