package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public class c extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f260150d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f260151e;

    /* renamed from: f, reason: collision with root package name */
    public int f260152f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m f260153g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f260154h;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyh);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyh);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyh);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyh);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyh);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyh);
    }

    public c(android.content.Context context, java.util.ArrayList arrayList) {
        this.f260150d = context;
        this.f260151e = arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m();
        this.f260153g = mVar;
        mVar.c(context, this.f260151e);
        d();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c getItem(int i17) {
        if (i17 < 0 || i17 >= this.f260152f) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f260151e.get(i17);
    }

    public void c(java.util.ArrayList arrayList) {
        this.f260151e = arrayList;
        if (arrayList != null) {
            this.f260152f = arrayList.size();
        } else {
            this.f260152f = 0;
        }
        if (this.f260152f > 0) {
            this.f260153g.c(this.f260150d, this.f260151e);
        }
        d();
    }

    public final void d() {
        gm0.j1.i();
        this.f260154h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC, "")).split(","));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f260152f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c item = getItem(i17);
        if (item == null) {
            return 4;
        }
        if (item.f69220xb7753620 == 9) {
            return item.f69263xe0badd12 == 0 ? 2 : 3;
        }
        if (item.F0() && "CITIC_CREDIT".equals(item.f69223x58802fcb)) {
            return 5;
        }
        if (item.A0()) {
            return 6;
        }
        return (!item.y0() || c01.z1.I()) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b bVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b bVar3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c item = getItem(i17);
        if (item == null) {
            return view;
        }
        int itemViewType = getItemViewType(i17);
        java.util.List list = this.f260154h;
        if (list != null && !((java.util.ArrayList) list).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) this.f260154h).iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).equals(item.f69225xed6d60f6)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        android.content.Context context = this.f260150d;
        switch (itemViewType) {
            case 0:
                return gt4.q.a(this.f260150d, view, item, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5f, this.f260153g, z17, itemViewType);
            case 1:
                return gt4.q.a(this.f260150d, view, item, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5k, this.f260153g, z17, itemViewType);
            case 2:
                if (view == null || view.getTag() == null) {
                    view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5n, null);
                    bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b(this);
                    bVar.f260144e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ad_);
                    bVar.f260140a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.adf);
                    bVar.f260146g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.k9r);
                    view.setTag(bVar);
                } else {
                    bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b) view.getTag();
                }
                bVar.f260140a.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmw, item.f69217xaef0808c));
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.d.a(item)) {
                    bVar.f260146g.setVisibility(0);
                } else {
                    bVar.f260146g.setVisibility(8);
                }
                return view;
            case 3:
                if (view == null || view.getTag() == null) {
                    view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5p, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b bVar4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b(this);
                    bVar4.f260144e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ad_);
                    bVar4.f260140a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.adf);
                    bVar4.f260145f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.aed);
                    view.setTag(bVar4);
                    bVar2 = bVar4;
                } else {
                    bVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b) view.getTag();
                }
                int i18 = item.f69263xe0badd12;
                if (i18 == 1) {
                    bVar2.f260145f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chm);
                    bVar2.f260145f.setVisibility(0);
                } else if (i18 != 3) {
                    bVar2.f260145f.setVisibility(8);
                } else {
                    bVar2.f260145f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chd);
                    bVar2.f260145f.setVisibility(0);
                }
                bVar2.f260140a.setText(item.f69217xaef0808c);
                this.f260153g.e(context, item, bVar2.f260144e);
                return view;
            case 4:
                return android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5g, null);
            case 5:
                return gt4.q.a(this.f260150d, view, item, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5o, this.f260153g, z17, itemViewType);
            case 6:
                if (view == null || view.getTag() == null) {
                    view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5i, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b bVar5 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b(this);
                    bVar5.f260144e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ad_);
                    bVar5.f260140a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.adf);
                    bVar5.f260141b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.aex);
                    bVar5.f260145f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.aed);
                    bVar5.f260147h = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) view.findViewById(com.p314xaae8f345.mm.R.id.pam);
                    bVar5.f260143d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.aen);
                    bVar5.f260148i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pan);
                    bVar5.f260142c = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.pap);
                    view.setTag(bVar5);
                    bVar3 = bVar5;
                } else {
                    bVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b) view.getTag();
                }
                bVar3.f260144e.setImageDrawable(m95.a.e(context.getResources(), com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3, 0.0f));
                if ((bVar3.f260144e instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f261103i3)) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) bVar3.f260144e).m75397xc185581c(true);
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) bVar3.f260144e).m75393xf0a6cc4b(dt4.b.f324761a);
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) bVar3.f260144e).b(item.f261103i3, 0, 0, com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3);
                }
                java.lang.String I = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.I(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(item.f261099e3), 10);
                android.widget.TextView textView = bVar3.f260140a;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = bVar3.f260140a.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, I, textSize));
                bVar3.f260141b.setText(item.f261102h3);
                if (item.f261100f3 == 0) {
                    java.lang.String bigDecimal = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + item.f261098d3, "100", 2, java.math.RoundingMode.HALF_UP).toString();
                    bVar3.f260147h.m83144x1de10994(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
                    bVar3.f260147h.setText(bigDecimal);
                    bVar3.f260147h.setTextSize(1, 30.0f);
                    bVar3.f260147h.setVisibility(0);
                    bVar3.f260148i.setVisibility(0);
                } else {
                    bVar3.f260147h.setVisibility(4);
                    bVar3.f260148i.setVisibility(4);
                }
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    bVar3.f260142c.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chi);
                    bVar3.f260143d.setImageResource(com.p314xaae8f345.mm.R.raw.f79487x34a774cd);
                }
                view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.a(this, bVar3, view), 50L);
                return view;
            default:
                return view;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }
}
