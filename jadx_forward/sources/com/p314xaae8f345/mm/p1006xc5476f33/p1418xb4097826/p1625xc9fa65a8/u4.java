package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f207413a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f207414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f207415c;

    /* renamed from: d, reason: collision with root package name */
    public final int f207416d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f207417e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f207418f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.w5 f207419g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ListView f207420h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r4 f207421i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f207422j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f207423k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f207424l;

    /* renamed from: m, reason: collision with root package name */
    public bq.t1 f207425m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q4 f207426n;

    public u4(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 editText, int i17, int i18, boolean z17, boolean z18, yz5.l onSuggestionClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuggestionClickListener, "onSuggestionClickListener");
        this.f207413a = activity;
        this.f207414b = editText;
        this.f207415c = i17;
        this.f207416d = i18;
        this.f207417e = z17;
        this.f207418f = z18;
        this.f207419g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.w5(activity, z17, z18);
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.f568710ns4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f207420h = listView;
        this.f207423k = "";
        this.f207424l = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n4 n4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n4(this);
        java.util.ArrayList arrayList = editText.F;
        if (!arrayList.contains(n4Var)) {
            arrayList.add(n4Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r4 r4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r4(this);
        this.f207421i = r4Var;
        listView.setAdapter((android.widget.ListAdapter) r4Var);
        listView.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.o4(this, onSuggestionClickListener));
        listView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p4(this));
        if (z17 || z18) {
            listView.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560693rk));
        }
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "dismissSuggestion");
        android.widget.ListView listView = this.f207420h;
        listView.animate().cancel();
        listView.animate().alpha(0.0f).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t4(this)).start();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q4 q4Var = this.f207426n;
        if (q4Var != null) {
            q4Var.a(8);
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "ignore searchSuggestionContent");
        this.f207424l = "";
        this.f207422j = null;
        bq.t1 t1Var = this.f207425m;
        if (t1Var != null) {
            t1Var.j();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r4 r4Var = this.f207421i;
        r4Var.f207372d = null;
        r4Var.notifyDataSetChanged();
        a();
    }

    public final void c(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("searchsessionid", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206741d);
        jSONObject.put("searchscene", i17);
        jSONObject.put("keyword", this.f207423k);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List<android.text.SpannableString> list = this.f207421i.f207372d;
        if (list != null) {
            int i19 = 0;
            for (android.text.SpannableString spannableString : list) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(i19);
                sb7.append('#');
                sb7.append((java.lang.Object) spannableString);
                sb7.append('/');
                sb6.append(sb7.toString());
                i19++;
            }
            if (sb6.length() > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
        }
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        jSONObject.put("expose_suggestword", sb8);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f207413a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, i18, "suggestword_panel", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }
}
