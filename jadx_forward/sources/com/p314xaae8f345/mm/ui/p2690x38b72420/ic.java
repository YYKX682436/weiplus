package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class ic extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288345d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f288346e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f288347f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.e8 f288348g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.res.ColorStateList f288349h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.res.ColorStateList f288350i;

    public ic(android.content.Context context, java.util.List list) {
        this.f288345d = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f288346e = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f288347f = hashMap2;
        this.f288348g = null;
        this.f288345d = context;
        hashMap.clear();
        hashMap2.clear();
        this.f288348g = c01.d9.b().q();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            p94.q0 f17 = p94.w0.f();
            if (f17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2 r2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) f17;
                java.util.Iterator it6 = ((java.util.ArrayList) r2Var.L0(longValue)).iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) it6.next();
                    com.p314xaae8f345.mm.p670x38b72420.s sVar = new com.p314xaae8f345.mm.p670x38b72420.s();
                    sVar.X1(str);
                    java.util.Map map = this.f288347f;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f288346e.size());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagName", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
                    java.lang.String str2 = r2Var.D0(longValue).f69154x183bff00;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagName", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
                    map.put(valueOf, str2);
                    this.f288346e.put(java.lang.Integer.valueOf(i17), sVar);
                    i17++;
                }
            }
        }
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(com.p314xaae8f345.mm.R.C30859x5a72f63.f560946yk);
            android.content.res.XmlResourceParser xml2 = context.getResources().getXml(com.p314xaae8f345.mm.R.C30859x5a72f63.f560947yl);
            this.f288349h = android.content.res.ColorStateList.createFromXml(context.getResources(), xml);
            this.f288350i = android.content.res.ColorStateList.createFromXml(context.getResources(), xml2);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsTagContactList", e17, "", new java.lang.Object[0]);
        } catch (org.xmlpull.v1.XmlPullParserException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsTagContactList", e18, "", new java.lang.Object[0]);
        }
    }

    public final java.lang.String a(int i17) {
        java.util.Map map = this.f288347f;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
            return "";
        }
        return (java.lang.String) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.HashMap) this.f288346e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.Map map = this.f288346e;
        com.p314xaae8f345.mm.p670x38b72420.s sVar = (com.p314xaae8f345.mm.p670x38b72420.s) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (sVar.W0() != 0) {
            return sVar;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) this.f288348g).n(sVar.d1(), true);
        if (n17 == null) {
            return sVar;
        }
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), n17);
        return n17;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.jc jcVar;
        android.content.Context context = this.f288345d;
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a29, null);
            jcVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.jc(null);
            jcVar.f288511b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cfx);
            jcVar.f288510a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) view.findViewById(com.p314xaae8f345.mm.R.id.cfu);
            jcVar.f288512c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565447cg1);
            jcVar.f288513d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cfs);
            view.setTag(jcVar);
        } else {
            jcVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.jc) view.getTag();
        }
        int i18 = i17 - 1;
        java.lang.String a17 = ((com.p314xaae8f345.mm.p670x38b72420.s) getItem(i18)) == null ? "" : a(i18);
        com.p314xaae8f345.mm.p670x38b72420.s sVar = (com.p314xaae8f345.mm.p670x38b72420.s) getItem(i17);
        if (i17 == 0) {
            jcVar.f288511b.setVisibility(0);
            jcVar.f288511b.setText(a(i17));
            jcVar.f288511b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (i17 <= 0 || a(i17).equals(a17)) {
            jcVar.f288511b.setVisibility(8);
        } else {
            jcVar.f288511b.setVisibility(0);
            jcVar.f288511b.setText(a(i17));
            jcVar.f288511b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        jcVar.f288512c.setTextColor(!c01.e2.D(sVar.d1()) ? this.f288349h : this.f288350i);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Bi((android.widget.ImageView) jcVar.f288510a.m79176xc2a54588(), sVar.d1(), true);
        jcVar.f288513d.setVisibility(8);
        jcVar.f288510a.setVisibility(0);
        android.widget.TextView textView = jcVar.f288512c;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String g27 = sVar.g2();
        float textSize = jcVar.f288512c.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize));
        jcVar.f288512c.setVisibility(0);
        return view;
    }
}
