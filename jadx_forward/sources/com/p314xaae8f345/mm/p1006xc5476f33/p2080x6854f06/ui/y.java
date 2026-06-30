package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class y extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f243885o;

    /* renamed from: p, reason: collision with root package name */
    public bb5.e f243886p;

    /* renamed from: q, reason: collision with root package name */
    public bb5.g f243887q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b f243888r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b activityC17664x1adcec2b, com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b activityC17664x1adcec2b2) {
        super(activityC17664x1adcec2b2, new c34.r());
        this.f243888r = activityC17664x1adcec2b;
        this.f243885o = 0;
        this.f243886p = null;
        this.f243887q = new bb5.g(15, new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.v(this));
        o();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        c34.r rVar = (c34.r) obj;
        if (rVar == null) {
            rVar = new c34.r();
        }
        if (cursor != null) {
            rVar.mo9015xbf5d97fd(cursor);
        }
        return rVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.x xVar;
        android.view.View view2;
        if (this.f243886p == null) {
            this.f243886p = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.w(this);
        }
        bb5.g gVar = this.f243887q;
        if (gVar != null) {
            gVar.b(i17, this.f243886p);
        }
        if (view == null) {
            xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.x(this);
            view2 = android.view.View.inflate(this.f294141e, com.p314xaae8f345.mm.R.C30864xbddafb2a.cmk, null);
            xVar.f243873a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5l);
            xVar.f243874b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5r);
            xVar.f243876d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5o);
            xVar.f243877e = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5t);
            xVar.f243878f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5m);
            xVar.f243879g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5u);
            xVar.f243880h = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5w);
            xVar.f243881i = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mrx);
            xVar.f243875c = view2.findViewById(com.p314xaae8f345.mm.R.id.m4c);
            xVar.f243882j = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.mqt);
            xVar.f243883k = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mqu);
            view2.setTag(xVar);
        } else {
            xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.x) view.getTag();
            view2 = view;
        }
        c34.r rVar = (c34.r) getItem(i17);
        if (rVar == null) {
            xVar.a();
            return view2;
        }
        xVar.a();
        int i18 = rVar.f66443x2262335f;
        if (4 == i18 || (h34.z.d(i18) && 6 != rVar.f66443x2262335f)) {
            if (4 != rVar.f66443x2262335f) {
                xVar.f243873a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f1.b(xVar.f243873a, rVar.f66442x433be87e, com.p314xaae8f345.mm.R.raw.f78435x7b83bce4, false);
        } else if (11 == rVar.f66443x2262335f) {
            this.f243888r.f243632m.g(rVar.u0(), xVar.f243873a);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(xVar.f243873a, rVar.f66444xdec927b, null);
        }
        xVar.f243873a.setVisibility(0);
        int i19 = rVar.f66443x2262335f;
        if (7 == i19 || 10 == i19 || 12 == i19 || 13 == i19 || (8 == i19 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f66431x21f9b213) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f66444xdec927b))) {
            if (8 == rVar.f66443x2262335f) {
                xVar.f243883k.setText(rVar.f66426x2ef4959a);
            } else {
                xVar.f243883k.setText(rVar.f66431x21f9b213);
            }
            xVar.f243883k.setVisibility(0);
            xVar.f243882j.setVisibility(8);
            return view2;
        }
        xVar.f243883k.setVisibility(8);
        xVar.f243882j.setVisibility(0);
        if (8 == rVar.f66443x2262335f && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f66431x21f9b213)) {
            rVar.f66431x21f9b213 = rVar.f66426x2ef4959a;
            rVar.f66426x2ef4959a = rVar.f66444xdec927b;
        }
        java.lang.String str = rVar.f66431x21f9b213;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = xVar.f243874b;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f294141e;
        float textSize = xVar.f243874b.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        xVar.f243874b.setVisibility(0);
        int paddingBottom = view2.getPaddingBottom();
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), paddingBottom);
        int i27 = rVar.f66443x2262335f;
        if (i27 == 1 || i27 == 2 || i27 == 3) {
            xVar.f243881i.setText(rVar.f66431x21f9b213);
            xVar.f243881i.setVisibility(0);
            return view2;
        }
        android.view.View view3 = xVar.f243875c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        xVar.f243878f.setText(rVar.f66426x2ef4959a);
        xVar.f243878f.setVisibility(0);
        java.lang.String str2 = rVar.f66440xda9bc3b3;
        if (str2 == null || str2.trim().equals("")) {
            xVar.f243879g.setVisibility(8);
        } else {
            xVar.f243879g.setVisibility(0);
            android.widget.TextView textView2 = xVar.f243879g;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = this.f294141e;
            java.lang.String str3 = rVar.f66440xda9bc3b3;
            float textSize2 = xVar.f243874b.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str3, textSize2));
        }
        int i28 = rVar.f66438x4b6e7fa1;
        if (i28 == 1) {
            xVar.f243877e.setVisibility(0);
            xVar.f243877e.setImageDrawable(i65.a.i(this.f294141e, com.p314xaae8f345.mm.R.raw.f79507xeac913cb));
            xVar.f243877e.setContentDescription(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574000gr0));
        } else if (i28 == 2) {
            xVar.f243877e.setVisibility(0);
            xVar.f243877e.setImageDrawable(i65.a.i(this.f294141e, com.p314xaae8f345.mm.R.raw.f79506x511a318a));
            xVar.f243877e.setContentDescription(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cea));
        } else {
            xVar.f243877e.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(rVar.f66444xdec927b, true);
        if (n17 == null || !n17.r2()) {
            xVar.f243876d.setVisibility(8);
        } else {
            xVar.f243876d.setVisibility(0);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(rVar.f66434x13320504)) {
                xVar.f243876d.setText(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574153h62));
            } else {
                xVar.f243876d.setText(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h67));
            }
        }
        if (6 == rVar.f66443x2262335f) {
            xVar.f243878f.setText(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j2c));
            xVar.f243876d.setVisibility(8);
        }
        if (rVar.f66434x13320504 == 0 || c01.n8.b() == null) {
            xVar.f243880h.setVisibility(8);
        } else {
            xVar.f243880h.setVisibility(0);
            xVar.f243880h.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(((xf4.d) c01.n8.b()).b(rVar.f66434x13320504, true), 2.0f));
            xVar.f243877e.setVisibility(8);
        }
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        if (gm0.j1.a()) {
            int i17 = this.f243885o;
            if (i17 == -12) {
                c34.s Ni = c34.h0.Ni();
                int intExtra = this.f243888r.getIntent().getIntExtra("_ibeacon_new_insert_size", 2);
                Ni.getClass();
                s(Ni.m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc limit ? ", "11", "" + intExtra));
            } else if (i17 == 11) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", "11"));
            } else if (i17 == 100) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc ", new java.lang.String[0]));
            } else if (i17 == -6) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", "8", "2"));
            } else if (i17 == -5) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", "4", "2"));
            } else if (i17 == -1) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by reserved2 desc, shakeItemID desc ", "0", "2"));
            } else if (i17 == 0) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", "0"));
            } else if (i17 == 4) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", "4"));
            } else if (i17 == 5) {
                s(c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type in (?, ?, ?, ?, ?) order by shakeItemID desc ", "7", "6", "8", "9", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "12"));
            }
            notifyDataSetChanged();
        }
    }
}
