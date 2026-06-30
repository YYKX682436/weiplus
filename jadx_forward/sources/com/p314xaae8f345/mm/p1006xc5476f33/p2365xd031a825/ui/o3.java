package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class o3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f262083d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f262084e;

    /* renamed from: f, reason: collision with root package name */
    public final int f262085f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f262086g;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m f262088i;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f262090n;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f262087h = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f262089m = true;

    public o3(android.content.Context context, java.util.ArrayList arrayList, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        this.f262086g = null;
        this.f262090n = false;
        this.f262083d = context;
        this.f262084e = arrayList;
        this.f262085f = i17;
        this.f262086g = c19099x8d444f05;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m();
        this.f262088i = mVar;
        mVar.c(context, this.f262084e);
        if (c19099x8d444f05 == null || c19099x8d444f05.T != 1) {
            return;
        }
        this.f262090n = true;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c getItem(int i17) {
        if (this.f262090n) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f262084e.get(i17);
        }
        int count = getCount();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f262086g;
        if (c19099x8d444f05 == null || !c19099x8d444f05.G.equals("CFT")) {
            count--;
        }
        if (i17 < count) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f262084e.get(i17);
        }
        return null;
    }

    public void c(java.util.ArrayList arrayList, boolean z17) {
        if (arrayList == null) {
            this.f262084e = new java.util.ArrayList();
        } else {
            this.f262084e = arrayList;
        }
        this.f262089m = z17;
        if (this.f262084e.size() > 0) {
            this.f262088i.c(this.f262083d, this.f262084e);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f262090n) {
            java.util.ArrayList arrayList = this.f262084e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f262086g;
        int i17 = (c19099x8d444f05 == null || !c19099x8d444f05.G.equals("CFT")) ? 1 : 0;
        java.util.ArrayList arrayList2 = this.f262084e;
        return arrayList2 != null ? i17 + arrayList2.size() : i17;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n3 n3Var;
        vr4.j0 j0Var;
        vr4.a aVar;
        vr4.j0 j0Var2;
        vr4.a aVar2;
        vr4.v0 v0Var;
        if (view == null) {
            view = android.view.View.inflate(this.f262083d, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5x, null);
            n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n3(this);
            n3Var.f262039a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
            n3Var.f262040b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ns9);
            n3Var.f262042d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.ad_);
            n3Var.f262041c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19143xf87104fb) view.findViewById(com.p314xaae8f345.mm.R.id.f565872dy3);
            n3Var.f262043e = view.findViewById(com.p314xaae8f345.mm.R.id.pgs);
            n3Var.f262044f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.aer);
            n3Var.f262045g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.k7j);
            n3Var.f262040b.setText("");
            view.setTag(n3Var);
        } else {
            n3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n3) view.getTag();
        }
        if (i17 == getCount() - 1) {
            android.view.ViewGroup.LayoutParams layoutParams = n3Var.f262043e.getLayoutParams();
            if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = 0;
                layoutParams2.bottomMargin = i65.a.b(this.f262083d, 16);
                n3Var.f262043e.setLayoutParams(layoutParams);
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = n3Var.f262043e.getLayoutParams();
            if (layoutParams3 instanceof android.widget.LinearLayout.LayoutParams) {
                android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.leftMargin = i65.a.b(this.f262083d, 40);
                layoutParams4.bottomMargin = 0;
                n3Var.f262043e.setLayoutParams(layoutParams3);
            }
        }
        n3Var.f262040b.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        n3Var.f262041c.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c item = getItem(i17);
        if (item == null) {
            n3Var.f262040b.setVisibility(8);
            n3Var.f262039a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575122kv1);
            n3Var.f262042d.setVisibility(8);
            n3Var.f262045g.setVisibility(0);
            java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList<>();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f262086g;
            if (c19099x8d444f05 != null && (j0Var2 = c19099x8d444f05.N) != null && (aVar2 = j0Var2.f521300u) != null && (v0Var = aVar2.f521207e) != null) {
                java.util.Iterator it = v0Var.f521341d.iterator();
                while (it.hasNext()) {
                    linkedList.add(((vr4.w0) it.next()).f521342d);
                }
            }
            if (this.f262089m && linkedList.size() > 0) {
                n3Var.f262041c.setVisibility(0);
                n3Var.f262040b.setVisibility(8);
                n3Var.f262041c.m73917xc2385d6(linkedList);
            }
        } else {
            n3Var.f262042d.setVisibility(0);
            n3Var.f262045g.setVisibility(8);
            n3Var.f262040b.setVisibility(0);
            n3Var.f262040b.setText("");
            if (item.A0()) {
                android.widget.TextView textView = n3Var.f262039a;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = this.f262083d;
                java.lang.String str = item.f69233x225aa2b6;
                float textSize = n3Var.f262039a.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
            } else {
                n3Var.f262039a.setText(item.f69233x225aa2b6);
            }
            if (item.v0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95532h;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.P2)) {
                    n3Var.f262039a.setText(c19091x9511676c.P2);
                } else if (c19091x9511676c.O2 >= 0.0d) {
                    n3Var.f262039a.setText(this.f262083d.getString(c01.z1.I() ? com.p314xaae8f345.mm.R.C30867xcad56011.kjr : com.p314xaae8f345.mm.R.C30867xcad56011.kjq, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(c19091x9511676c.O2)));
                } else {
                    n3Var.f262039a.setText(this.f262083d.getText(com.p314xaae8f345.mm.R.C30867xcad56011.kmq));
                }
            } else if (item.D0()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.P2)) {
                    double d17 = item.O2;
                    if (d17 >= 0.0d) {
                        n3Var.f262039a.setText(this.f262083d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kow, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(d17)));
                    } else {
                        n3Var.f262039a.setText(this.f262083d.getText(com.p314xaae8f345.mm.R.C30867xcad56011.kmq));
                    }
                } else {
                    n3Var.f262039a.setText(item.P2);
                }
            }
            n3Var.f262040b.setVisibility(0);
            switch (item.t0(this.f262085f, this.f262086g)) {
                case 1:
                    n3Var.f262040b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575125kv4);
                    break;
                case 2:
                    n3Var.f262040b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kv_);
                    break;
                case 3:
                    n3Var.f262040b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kve);
                    break;
                case 4:
                    n3Var.f262040b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kv6);
                    break;
                case 5:
                    n3Var.f262040b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575123kv2);
                    break;
                case 6:
                    n3Var.f262040b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kv8);
                    break;
                case 7:
                    n3Var.f262040b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kvc);
                    break;
                case 8:
                    n3Var.f262040b.setText(item.f69239x93565523);
                    break;
                default:
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f69261x2261f75d)) {
                        n3Var.f262040b.setText(item.f69261x2261f75d);
                        break;
                    } else {
                        n3Var.f262040b.setVisibility(8);
                        break;
                    }
            }
            java.lang.String charSequence = n3Var.f262040b.getText().toString();
            n3Var.f262039a.setTextColor(this.f262083d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            if (!isEnabled(i17)) {
                n3Var.f262039a.setTextColor(this.f262083d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            }
            java.lang.String str2 = this.f262087h;
            if (str2 == null || !str2.equalsIgnoreCase(item.f69225xed6d60f6)) {
                n3Var.f262044f.setVisibility(8);
            } else {
                n3Var.f262044f.setVisibility(0);
            }
            n3Var.f262042d.setTag(com.p314xaae8f345.mm.R.id.pbo, null);
            n3Var.f262042d.setTag(null);
            n3Var.f262042d.setImageDrawable(null);
            n3Var.f262040b.setOnClickListener(null);
            if (item.v0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar = this.f262088i;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = n3Var.f262042d;
                mVar.getClass();
                if (c19659x677e0913 != null) {
                    c19659x677e0913.setTag(com.p314xaae8f345.mm.R.id.pbo, null);
                    c19659x677e0913.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ch9);
                }
            } else if (item.D0()) {
                this.f262088i.f(item, n3Var.f262042d);
            } else if (item.A0()) {
                n3Var.f262042d.setImageDrawable(m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3, 0.0f));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f261103i3)) {
                    n3Var.f262042d.m75397xc185581c(true);
                    n3Var.f262042d.m75393xf0a6cc4b(dt4.b.f324761a);
                    n3Var.f262042d.b(item.f261103i3, 0, 0, com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3);
                }
            } else {
                this.f262088i.e(this.f262083d, item, n3Var.f262042d);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f69240x24ff0512) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f69241x935a0ea9)) {
                java.lang.String str3 = charSequence + "  ";
                android.text.SpannableString spannableString = new android.text.SpannableString(str3 + item.f69240x24ff0512);
                n3Var.f262040b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m3(this));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_t)), str3.length(), str3.length() + item.f69240x24ff0512.length(), 34);
                n3Var.f262040b.setText(spannableString);
                n3Var.f262040b.setTag(item.f69241x935a0ea9);
            } else if (this.f262089m && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f69239x93565523) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
                java.util.LinkedList<java.lang.String> linkedList2 = new java.util.LinkedList<>();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = this.f262086g;
                if (c19099x8d444f052 != null && (j0Var = c19099x8d444f052.N) != null && (aVar = j0Var.f521300u) != null) {
                    java.util.Iterator it6 = aVar.f521206d.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            vr4.c cVar = (vr4.c) it6.next();
                            if (cVar.f521238d.equals(item.f69225xed6d60f6)) {
                                java.util.Iterator it7 = cVar.f521239e.iterator();
                                while (it7.hasNext()) {
                                    linkedList2.add(((vr4.d) it7.next()).f521240d);
                                }
                            }
                        }
                    }
                }
                if (linkedList2.size() > 0) {
                    n3Var.f262041c.setVisibility(0);
                    n3Var.f262040b.setVisibility(8);
                    n3Var.f262041c.m73917xc2385d6(linkedList2);
                }
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c item = getItem(i17);
        return item == null || item.t0(this.f262085f, this.f262086g) == 0;
    }
}
