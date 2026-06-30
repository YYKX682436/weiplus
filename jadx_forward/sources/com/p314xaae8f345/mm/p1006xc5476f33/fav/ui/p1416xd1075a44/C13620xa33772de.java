package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView */
/* loaded from: classes11.dex */
public class C13620xa33772de extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f183081m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageButton f183082d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 f183083e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f183084f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f183085g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f183086h;

    /* renamed from: i, reason: collision with root package name */
    public w82.e0 f183087i;

    public C13620xa33772de(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183084f = new java.util.LinkedList();
        this.f183085g = new java.util.LinkedList();
        this.f183086h = new java.util.LinkedList();
    }

    public static java.lang.String a(android.content.Context context, int i17) {
        if (context == null) {
            return "";
        }
        if (i17 == 3) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdh);
        }
        if (i17 == 5) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdf);
        }
        if (i17 == 6) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cd_);
        }
        if (i17 == 7) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cda);
        }
        if (i17 == 8) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572744cd1);
        }
        if (i17 == 17) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cde);
        }
        if (i17 == 18) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdc);
        }
        switch (i17) {
            case 20:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572745cd2);
            case 21:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cd9);
            case 22:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdd);
            default:
                return "";
        }
    }

    public final void b() {
        if (this.f183084f.isEmpty() && this.f183085g.isEmpty()) {
            this.f183083e.m79125xd60a4a33(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        } else {
            this.f183083e.m79125xd60a4a33("");
        }
    }

    public final void c(java.lang.String str) {
        java.util.List list = this.f183086h;
        ((java.util.LinkedList) list).clear();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        for (java.lang.String str2 : str.split(" ")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                ((java.util.LinkedList) list).add(str2);
            }
        }
    }

    public void d(int i17, boolean z17) {
        java.util.List list = this.f183084f;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).add(java.lang.Integer.valueOf(i17));
        if (this.f183083e == null) {
            return;
        }
        b();
        this.f183083e.m55401x7650bebc(a(getContext(), i17));
        if (this.f183087i == null) {
            return;
        }
        c(this.f183083e.m79118xdb574fcd());
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) this.f183087i).a(list, this.f183086h, this.f183085g, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11126, 1);
    }

    /* renamed from: getSearchKeys */
    public java.util.List<java.lang.String> m55394xc3e3abb2() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = this.f183083e;
        if (c13623x735f56a5 != null) {
            c(c13623x735f56a5.m79118xdb574fcd());
        }
        return this.f183086h;
    }

    /* renamed from: getSearchTags */
    public java.util.List<java.lang.String> m55395xc3e7b1d7() {
        return this.f183085g;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f183082d = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.mdl);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5) findViewById(com.p314xaae8f345.mm.R.id.dwl);
        this.f183083e = c13623x735f56a5;
        if (c13623x735f56a5 != null) {
            c13623x735f56a5.m79126x666e2e0a(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            this.f183083e.m79142x43f367ee(0);
            this.f183083e.m79137xc209ad53(0);
            this.f183083e.m79140x4a0e4618(0);
            this.f183083e.m79141x9bf884bd(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
            this.f183083e.m79138x7e5ecb64(0);
            this.f183083e.m79139xb10bdb09(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            this.f183083e.m79125xd60a4a33(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
            this.f183083e.k(true);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a52 = this.f183083e;
            c13623x735f56a52.f279116o = false;
            c13623x735f56a52.f279117p = true;
            c13623x735f56a52.m55400x6c4032e7((w82.l0) new w82.c0(this));
        }
        android.widget.ImageButton imageButton = this.f183082d;
        if (imageButton != null) {
            imageButton.setOnClickListener(new w82.d0(this));
        }
    }

    /* renamed from: setOnSearchChangedListener */
    public void m55396x1f63255f(w82.e0 e0Var) {
        this.f183087i = e0Var;
    }
}
