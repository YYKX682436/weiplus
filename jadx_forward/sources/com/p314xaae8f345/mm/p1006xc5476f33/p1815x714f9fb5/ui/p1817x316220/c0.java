package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class c0 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f226292e;

    /* renamed from: p, reason: collision with root package name */
    public double f226300p;

    /* renamed from: q, reason: collision with root package name */
    public double f226301q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f226302r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f226303s;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f226291d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f226293f = 0;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f226294g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f226295h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f226296i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f226297m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f226298n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f226299o = false;

    public c0(android.content.Context context) {
        this.f226292e = context;
    }

    public void a(java.util.List list, byte[] bArr, boolean z17, java.lang.String str) {
        java.lang.String str2 = this.f226296i;
        if (str2 == null || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PoiAdapter", "old key, dismiss it %s %s.", this.f226296i, str);
            return;
        }
        java.util.List list2 = this.f226291d;
        int size = ((java.util.ArrayList) list2).size();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0) it.next();
            d0Var.f226324q = size;
            size++;
            ((java.util.ArrayList) list2).add(d0Var);
        }
        this.f226294g = bArr;
        this.f226295h = z17;
        notifyDataSetChanged();
    }

    public void c() {
        this.f226294g = null;
        this.f226295h = false;
        this.f226296i = "";
        ((java.util.ArrayList) this.f226291d).clear();
        this.f226293f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0) ((java.util.ArrayList) this.f226291d).get(i17);
    }

    public final java.lang.String f(java.lang.CharSequence charSequence, double d17, double d18) {
        java.lang.String str;
        int m34966x69db0a53 = (int) com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34966x69db0a53(this.f226300p, this.f226301q, d17, d18);
        if (m34966x69db0a53 < 100) {
            str = i65.a.r(this.f226292e, com.p314xaae8f345.mm.R.C30867xcad56011.lf6);
        } else if (m34966x69db0a53 >= 1000) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("%.1fkm", java.lang.Double.valueOf(m34966x69db0a53 / 1000.0d));
        } else {
            str = m34966x69db0a53 + "m";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            return str;
        }
        return str + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + ((java.lang.Object) charSequence);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f226291d).size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.b0 b0Var;
        android.view.View view2;
        android.content.Context context = this.f226292e;
        if (view == null) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c_2, viewGroup, false);
            b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.b0();
            b0Var.f226284a = inflate.findViewById(com.p314xaae8f345.mm.R.id.kyl);
            b0Var.f226286c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kyn);
            b0Var.f226287d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kym);
            b0Var.f226285b = inflate.findViewById(com.p314xaae8f345.mm.R.id.kyp);
            inflate.setTag(b0Var);
            view2 = inflate;
        } else {
            b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.b0) view.getTag();
            view2 = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.b0 b0Var2 = b0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0) ((java.util.ArrayList) this.f226291d).get(i17);
        int i18 = d0Var.f226320m;
        if (1 == i18 || 2 == i18) {
            android.widget.TextView textView = b0Var2.f226286c;
            java.lang.String str = d0Var.f226309b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            b0Var2.f226287d.setVisibility(8);
        } else {
            b0Var2.f226287d.setVisibility(0);
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f226308a) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggf) : d0Var.f226308a;
        java.lang.String str2 = d0Var.f226313f;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = d0Var.f226314g;
        if (str3 == null) {
            str3 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226302r) && str2.equals(this.f226302r)) {
            str2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226303s) || str3.equals(this.f226303s)) ? "" : str3;
        } else if (!str2.startsWith(str3)) {
            str2 = str2.concat(str3);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        java.lang.String str4 = d0Var.f226315h;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        java.lang.String str5 = d0Var.f226316i;
        if (str5 == null) {
            str5 = "";
        }
        sb8.append(str5);
        java.lang.String sb9 = sb8.toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb9)) {
            java.lang.String str6 = d0Var.f226309b;
            sb9 = str6 != null ? str6 : "";
        }
        if (!this.f226298n) {
            b0Var2.f226286c.setText(string);
            b0Var2.f226287d.setText(f(sb9, d0Var.f226311d, d0Var.f226310c));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226297m)) {
            b0Var2.f226286c.setText(string);
            b0Var2.f226287d.setText(f(sb9, d0Var.f226311d, d0Var.f226310c));
        } else {
            android.text.Spannable c17 = o13.q.c(context, string, this.f226297m);
            android.text.Spannable c18 = o13.q.c(context, sb9, this.f226297m);
            b0Var2.f226286c.setText(c17);
            b0Var2.f226287d.setText(f(c18, d0Var.f226311d, d0Var.f226310c));
        }
        if (i17 == this.f226293f) {
            android.view.View view3 = b0Var2.f226285b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = b0Var2.f226285b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
