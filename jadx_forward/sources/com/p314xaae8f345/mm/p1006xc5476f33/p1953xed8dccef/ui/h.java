package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234824d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f234825e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f234826f;

    /* renamed from: g, reason: collision with root package name */
    public int f234827g = 1;

    public h(android.content.Context context) {
        this.f234824d = context;
    }

    public void a(android.app.Activity activity, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.type" + iVar.f234835f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.content" + iVar.f234836g);
        int i18 = iVar.f234835f;
        if (i18 != 0) {
            if (i18 == 1) {
                java.lang.Object obj = iVar.f234836g;
                if (obj instanceof java.lang.String) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.W(this.f234824d, (java.lang.String) obj, false, 10000);
                    return;
                }
                return;
            }
            if (i18 == 2) {
                java.lang.Object obj2 = iVar.f234836g;
                if (obj2 instanceof java.util.ArrayList) {
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16811x11add592.class);
                    intent.putExtra("keys_img_urls", (java.util.ArrayList) obj2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/product/ui/MallCustomActionAdapter", "onItemClick", "(Landroid/app/Activity;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/product/ui/MallCustomActionAdapter", "onItemClick", "(Landroid/app/Activity;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                return;
            }
            if (i18 != 4) {
                if (i18 == 5) {
                    if (((java.lang.Boolean) ((java.util.ArrayList) this.f234826f).get(i17)).booleanValue()) {
                        ((java.util.ArrayList) this.f234826f).set(i17, java.lang.Boolean.FALSE);
                    } else {
                        ((java.util.ArrayList) this.f234826f).set(i17, java.lang.Boolean.TRUE);
                    }
                    notifyDataSetChanged();
                    return;
                }
                if (i18 != 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallCustomActionAdapter", "not support type");
                    return;
                }
            }
            java.lang.Object obj3 = iVar.f234836g;
            if (obj3 instanceof java.lang.String) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, iVar.f234834e);
                intent2.putExtra("neverGetA8Key", false);
                intent2.putExtra("showShare", false);
                intent2.putExtra("show_bottom", false);
                intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, (java.lang.String) obj3);
                intent2.putExtra("QRDataFlag", false);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activity, intent2);
            }
        }
    }

    public void c(java.util.List list) {
        this.f234825e = list;
        this.f234827g = 0;
        this.f234826f = new java.util.ArrayList();
        if (this.f234825e != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                xq3.a aVar = (xq3.a) it.next();
                this.f234826f.add(java.lang.Boolean.FALSE);
                hashSet.add(java.lang.Integer.valueOf(aVar.f537587f));
            }
            this.f234827g = list.size();
        }
        if (this.f234827g < 1) {
            this.f234827g = 1;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f234825e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xq3.a) this.f234825e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((xq3.a) this.f234825e.get(i17)).f537587f;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i iVar;
        if (view == null) {
            view = android.view.View.inflate(this.f234824d, com.p314xaae8f345.mm.R.C30864xbddafb2a.cad, null);
            iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i();
            iVar.f234830a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
            iVar.f234831b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nsf);
            iVar.f234832c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566871hc3);
            iVar.f234833d = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16808xf9c47a5d) view.findViewById(com.p314xaae8f345.mm.R.id.cw6);
            view.setTag(iVar);
        } else {
            iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i) view.getTag();
        }
        xq3.a aVar = (xq3.a) this.f234825e.get(i17);
        if (aVar != null) {
            iVar.f234830a.setText(aVar.f537585d);
            iVar.f234831b.setText(aVar.f537586e);
            int i18 = aVar.f537587f;
            iVar.f234835f = i18;
            iVar.f234836g = aVar.f537588g;
            iVar.f234834e = aVar.f537585d;
            if (i18 == 0) {
                iVar.f234832c.setVisibility(8);
            } else if (i18 == 5 || i18 == 6) {
                if (((java.lang.Boolean) ((java.util.ArrayList) this.f234826f).get(i17)).booleanValue()) {
                    iVar.f234833d.setVisibility(0);
                } else {
                    iVar.f234833d.setVisibility(8);
                }
                if (!iVar.f234833d.getText().equals(aVar.f537588g)) {
                    iVar.f234833d.m67596x765074af(aVar.f537588g);
                }
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f234827g;
    }
}
