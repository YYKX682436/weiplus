package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public final class m7 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f292104d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f292105e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f292106f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f292107g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f292108h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f292109i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f292110m;

    public m7(android.content.Context context, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f292104d = context;
        this.f292105e = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f292106f = arrayList;
        this.f292110m = true;
        arrayList.addAll(list);
        c();
    }

    public final int[] a() {
        int[] iArr = this.f292108h;
        if (iArr != null) {
            return iArr;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sections");
        throw null;
    }

    public final void c() {
        java.util.List list = this.f292105e;
        this.f292108h = new int[list.size()];
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            a()[i17] = ((u11.a) obj).f505264e;
            i17 = i18;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f292105e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f292105e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.l7 l7Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(this.f292104d, com.p314xaae8f345.mm.R.C30864xbddafb2a.ela, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "inflate(...)");
        }
        if (view.getTag() instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.l7) {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.tools.NewCountryCodeAdapter.ViewHolder");
            l7Var = (com.p314xaae8f345.mm.ui.p2740x696c9db.l7) tag;
        } else {
            l7Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.l7();
            l7Var.f292081a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cfx);
            l7Var.f292082b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565447cg1);
            l7Var.f292083c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cg6);
            view.setTag(l7Var);
        }
        java.lang.Object item = getItem(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(item, "null cannot be cast to non-null type com.tencent.mm.modelinternational.CountryCodeUtil.CountryInfo");
        u11.a aVar = (u11.a) item;
        if ((i17 == 0 || (i17 > 0 && a()[i17] != a()[i17 + (-1)])) && this.f292110m) {
            android.widget.TextView textView = l7Var.f292081a;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = l7Var.f292081a;
            if (textView2 != null) {
                textView2.setText(java.lang.String.valueOf((char) a()[i17]));
            }
        } else {
            android.widget.TextView textView3 = l7Var.f292081a;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        android.widget.TextView textView4 = l7Var.f292082b;
        if (textView4 != null) {
            textView4.setText(aVar.f505262c);
        }
        android.widget.TextView textView5 = l7Var.f292083c;
        if (textView5 != null) {
            textView5.setText("+" + aVar.f505261b);
        }
        android.widget.TextView textView6 = l7Var.f292083c;
        if (textView6 != null) {
            textView6.setVisibility(this.f292109i ? 0 : 4);
        }
        return view;
    }
}
