package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class j8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f185269e;

    public j8(android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f185268d = context;
        this.f185269e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f185268d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(context);
        if (a17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder fav FINDER_NEW_INTERACTION_EASTER_EGG ");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f185269e;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d;
        sb6.append(interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFavConvert", sb6.toString());
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d;
        if (interfaceC4987x84e327cb2 != null) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.om7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ox2.g0 g0Var = ox2.h0.f431194g;
            java.lang.String string2 = a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.okh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            ox2.h0 h0Var2 = new ox2.h0(a17, interfaceC4987x84e327cb2, string, ox2.g0.a(g0Var, a17, string2, (char) 0, 0, 0, 0, 0, 0, 252, null), null, null, 48, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 c15409xe873dc34 = h0Var2.f431199e;
            if (c15409xe873dc34 != null) {
                c15409xe873dc34.m62773xab002c4b(true);
            }
            h0Var2.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
