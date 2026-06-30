package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a {
    public double A;
    public double B;

    /* renamed from: u, reason: collision with root package name */
    public dn3.i f233857u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f233858v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashMap f233859w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f233860x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f233861y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f233862z;

    public k(android.content.Context context, android.view.View.OnClickListener onClickListener, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, boolean z19) {
        super(context, onClickListener, str, z18);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f233859w = hashMap;
        this.f233860x = true;
        this.f233862z = false;
        this.A = -85.0d;
        this.B = -1000.0d;
        dn3.i iVar = new dn3.i("", new r45.c64());
        iVar.f323540b = "NotCheckIn";
        iVar.f323541c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5r);
        this.f233860x = z17;
        this.f233861y = str2;
        hashMap.put(iVar.f323540b, 2);
        if (!z18 && z17) {
            a(iVar, 0);
            notifyDataSetChanged();
        }
        this.f233862z = z19;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.l lVar;
        android.view.View view2;
        java.lang.String str;
        java.lang.String str2;
        android.content.Context context = this.f233834f;
        if (view == null) {
            lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.l(this);
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c5x, null);
            lVar.f233867d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f567076i16);
            lVar.f233869f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f567075i15);
            lVar.f233868e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f567074i14);
            lVar.f233866c = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.m7k);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.mjd);
            lVar.f233870g = c22699x3dcdb352;
            java.lang.String str3 = this.f233861y;
            if (str3 != null) {
                c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor(str3));
            }
            lVar.f233866c.setOnClickListener(this.f233845t);
            view2.setTag(lVar);
        } else {
            lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.l) view.getTag();
            view2 = view;
        }
        dn3.i item = getItem(i17);
        java.util.HashMap hashMap = this.f233859w;
        int intValue = hashMap.containsKey(item.f323540b) ? ((java.lang.Integer) hashMap.get(item.f323540b)).intValue() : 0;
        lVar.f233870g.setVisibility(8);
        lVar.f233864a = intValue;
        lVar.f233865b = item;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f233858v) && this.f233858v.equals(item.f323540b)) {
            lVar.f233870g.setVisibility(0);
        }
        if (intValue == 0) {
            lVar.f233867d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            lVar.f233868e.setVisibility(0);
        } else if (intValue == 1) {
            lVar.f233867d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            lVar.f233868e.setVisibility(8);
        } else if (intValue == 2) {
            lVar.f233868e.setVisibility(8);
            lVar.f233867d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561048a62));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f233858v)) {
                lVar.f233870g.setVisibility(0);
            }
        }
        lVar.f233871h = item.f323540b;
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a.f(item.f323542d);
        double d17 = item.f323549k;
        double d18 = item.f323548j;
        float f18 = item.f323551m;
        if (f18 > 0.0d || !(this.A == -85.0d || this.B == -1000.0d)) {
            int i18 = (int) f18;
            if (i18 <= 0) {
                i18 = (int) com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34966x69db0a53(this.A, this.B, d17, d18);
            }
            if (i18 < 100) {
                str = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.lff);
            } else if (i18 >= 1000) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("%.1fkm", java.lang.Double.valueOf(i18 / 1000.0d));
            } else {
                str = i18 + "m";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(f17)) {
                str2 = str;
            } else {
                str2 = str + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + ((java.lang.Object) f17);
            }
        } else {
            str2 = f17.toString();
        }
        if (this.f233832d) {
            lVar.f233867d.setText(o13.q.c(context, item.f323541c, this.f233843r));
            lVar.f233868e.setText(o13.q.c(context, str2, this.f233843r));
        } else {
            lVar.f233867d.setText(item.f323541c);
            lVar.f233868e.setText(str2);
        }
        lVar.f233869f.setVisibility(8);
        if (this.f233862z) {
            lVar.f233866c.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aov));
            lVar.f233867d.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            lVar.f233868e.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
            lVar.f233869f.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        }
        return view2;
    }

    public dn3.i l(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.f233857u == null) {
            dn3.i iVar = new dn3.i("", new r45.c64());
            this.f233857u = iVar;
            iVar.f323540b = "City";
            this.f233859w.put("City", 1);
            a(this.f233857u, this.f233860x ? 1 : 0);
        }
        dn3.i iVar2 = this.f233857u;
        iVar2.f323552n = str3;
        iVar2.f323541c = str;
        iVar2.f323546h = str2;
        notifyDataSetChanged();
        return this.f233857u;
    }

    public void m(double d17, double d18) {
        double d19 = this.A;
        boolean z17 = (d19 == d17 && d19 == d18) ? false : true;
        this.A = d17;
        this.B = d18;
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.nearlife.ui.k$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k.this.notifyDataSetChanged();
                }
            });
        }
    }
}
