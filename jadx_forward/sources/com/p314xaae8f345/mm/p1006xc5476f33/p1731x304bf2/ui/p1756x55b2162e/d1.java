package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class d1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222787d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 f222788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f222789f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f222790g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f222791h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f222792i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f222793m = false;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb f222794n;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb, android.content.Context context) {
        this.f222794n = c16009xd65d32cb;
        this.f222787d = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var, org.json.JSONObject jSONObject) {
        d1Var.getClass();
        if (jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("Key");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) d1Var.f222788e.f222684d.get(optString);
        if (tabItem == null) {
            return;
        }
        tabItem.f222689d = jSONObject.optString("Key", tabItem.f222689d);
        tabItem.f222690e = jSONObject.optString("Title", tabItem.f222690e);
        tabItem.f222691f = jSONObject.optString("TitleColor");
        tabItem.f222692g = jSONObject.optString("SelectedTitleColor");
        tabItem.f222693h = jSONObject.optString("DarkModeTitleColor");
        tabItem.f222694i = jSONObject.optString("DarkModeSelectedTitleColor");
        tabItem.f222695m = jSONObject.optString("IconUrl", tabItem.f222695m);
        tabItem.f222696n = jSONObject.optString("SelectedIconUrl", tabItem.f222696n);
        tabItem.f222697o = jSONObject.optString("DarkModeIconUrl", tabItem.f222697o);
        tabItem.f222698p = jSONObject.optString("DarkModeSelectedIconUrl", tabItem.f222698p);
        tabItem.f222699q = jSONObject.optInt("Type", tabItem.f222699q);
        tabItem.f222700r = jSONObject.optString("JumpUrl", tabItem.f222700r);
        tabItem.f222701s = jSONObject.optJSONObject("JumpWeapp") != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItemWeapp(jSONObject.optJSONObject("JumpWeapp")) : tabItem.f222701s;
        tabItem.f222702t = jSONObject.optJSONObject("Report") != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItemReport(jSONObject.optJSONObject("Report")) : tabItem.f222702t;
        tabItem.f222707y = jSONObject.optJSONObject("JumpLiteapp") != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItemLiteApp(jSONObject.optJSONObject("JumpLiteapp")) : tabItem.f222707y;
        tabItem.G = jSONObject.optBoolean("downloadIconDisabled", tabItem.G);
        tabItem.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1) ((java.util.HashMap) d1Var.f222791h).get(optString);
        if (c1Var != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.b1(d1Var, c1Var, tabItem, optString));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.f221788a = d1Var.f222788e;
    }

    public final void c(java.lang.String str, android.widget.ImageView imageView) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || imageView == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.f222718p + kk.k.g(str.getBytes());
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423615f = str2;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public final void d(android.widget.TextView textView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb = this.f222794n;
        if (i17 >= 100) {
            textView.setText("");
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
            textView.setTextSize(0, i65.a.f(c16009xd65d32cb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3));
            textView.setVisibility(0);
            return;
        }
        textView.setText(java.lang.String.valueOf(i17));
        textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(c16009xd65d32cb.getContext(), i17));
        textView.setTextSize(0, i65.a.f(c16009xd65d32cb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(c16009xd65d32cb.getContext()));
        textView.setVisibility(0);
    }

    public final int f(java.lang.String str, boolean z17) {
        int z18 = r53.f.z(str);
        if (z18 != 0) {
            return z18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb = this.f222794n;
        return z17 ? c16009xd65d32cb.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su) : c16009xd65d32cb.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560699rq);
    }

    public void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222788e;
        if (c16008xdb77bd65 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1) ((java.util.HashMap) this.f222791h).get(c16008xdb77bd65.b());
            if (c1Var != null) {
                android.widget.ImageView imageView = c1Var.f222782c;
                android.widget.TextView textView = c1Var.f222783d;
                if (z17) {
                    textView.setVisibility(4);
                    imageView.setVisibility(0);
                } else {
                    textView.setVisibility(4);
                    imageView.setVisibility(8);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222788e;
        if (c16008xdb77bd65 == null) {
            return 0;
        }
        return ((java.util.ArrayList) c16008xdb77bd65.a()).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) ((java.util.ArrayList) this.f222788e.a()).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f222787d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bf6, viewGroup, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1(this, inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb = this.f222794n;
        boolean D = i65.a.D(c16009xd65d32cb.getContext());
        android.widget.TextView textView = c1Var.f222780a;
        android.widget.TextView textView2 = c1Var.f222783d;
        if (D) {
            textView.setTextSize(0, i65.a.f(c16009xd65d32cb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561341ft) * i65.a.m(c16009xd65d32cb.getContext()));
            textView2.setTextSize(0, i65.a.f(c16009xd65d32cb.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561341ft) * i65.a.m(c16009xd65d32cb.getContext()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) ((java.util.ArrayList) this.f222788e.a()).get(i17);
        if (tabItem != null) {
            textView.setText(tabItem.f222690e);
            java.lang.String str = this.f222789f;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            k(c1Var, tabItem, str.equalsIgnoreCase(tabItem.f222689d), this.f222790g);
            boolean z18 = tabItem.C;
            android.widget.ImageView imageView = c1Var.f222782c;
            if (z18) {
                int i18 = tabItem.D;
                if (i18 > 0) {
                    d(textView2, i18);
                    imageView.setVisibility(4);
                } else {
                    textView2.setVisibility(4);
                    imageView.setVisibility(0);
                }
            } else {
                textView2.setVisibility(4);
                imageView.setVisibility(8);
            }
            ((java.util.HashMap) this.f222791h).put(tabItem.f222689d, c1Var);
        }
        inflate.setTag(tabItem);
        return inflate;
    }

    public void h(int i17, boolean z17) {
        this.f222792i = i17;
        this.f222793m = z17;
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a1(this, z17));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222788e;
        if (c16008xdb77bd65 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1) ((java.util.HashMap) this.f222791h).get(c16008xdb77bd65.b());
            if (c1Var != null) {
                if (i17 > 0 || z17) {
                    c1Var.f222783d.setVisibility(4);
                    c1Var.f222782c.setVisibility(0);
                } else {
                    c1Var.f222783d.setVisibility(4);
                    c1Var.f222782c.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(java.lang.String str, int i17, boolean z17) {
        if (this.f222788e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1) ((java.util.HashMap) this.f222791h).get(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) this.f222788e.f222684d.get(str);
            if (tabItem != null) {
                tabItem.C = true;
                tabItem.D = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.f221788a = this.f222788e;
            }
            if (c1Var != null) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z0(this, z17, i17, c1Var));
            }
        }
    }

    public final void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem, boolean z17, java.lang.String str) {
        c1Var.f222782c.setVisibility(8);
        java.lang.String str2 = tabItem.f222689d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equalsIgnoreCase(str) || tabItem.C) {
            int i17 = tabItem.D;
            android.widget.ImageView imageView = c1Var.f222782c;
            android.widget.TextView textView = c1Var.f222783d;
            if (i17 > 0) {
                d(textView, i17);
                imageView.setVisibility(4);
            } else {
                textView.setVisibility(4);
                imageView.setVisibility(0);
            }
        }
        java.lang.String str3 = tabItem.f222690e;
        android.widget.TextView textView2 = c1Var.f222780a;
        textView2.setText(str3);
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        android.widget.ImageView imageView2 = c1Var.f222781b;
        if (C) {
            int f17 = f(tabItem.f222693h, z17);
            int f18 = f(tabItem.f222694i, z17);
            java.lang.String str4 = tabItem.f222697o;
            java.lang.String str5 = tabItem.f222698p;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                str5 = str4;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                str4 = tabItem.f222695m;
                str5 = tabItem.f222696n;
            }
            if (z17) {
                c(str5, imageView2);
                textView2.setTextColor(f18);
            } else {
                c(str4, imageView2);
                textView2.setTextColor(f17);
            }
        } else {
            int f19 = f(tabItem.f222691f, z17);
            int f27 = f(tabItem.f222692g, z17);
            java.lang.String str6 = tabItem.f222695m;
            java.lang.String str7 = tabItem.f222696n;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                str7 = str6;
            }
            if (z17) {
                this.f222789f = tabItem.f222689d;
                c(str7, imageView2);
                textView2.setTextColor(f27);
            } else {
                c(str6, imageView2);
                textView2.setTextColor(f19);
            }
        }
        c1Var.f222784e.setTag(tabItem);
    }
}
