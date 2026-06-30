package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class xn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214891e;

    public xn(java.lang.String str, android.view.View view) {
        this.f214890d = str;
        this.f214891e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mn2.n nVar = new mn2.n(this.f214890d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.V);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = nVar.f411593e;
        if (str == null) {
            str = "";
        } else if (!r26.i0.n(str, "/0", false)) {
            jz5.g gVar = nVar.f411595g;
            java.lang.String str2 = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "<get-smallSizeUrl>(...)");
            boolean n17 = r26.i0.n(str, str2, false);
            jz5.g gVar2 = nVar.f411596h;
            if (n17) {
                int length = str.length() - ((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()).length();
                int length2 = str.length();
                java.lang.String str3 = (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "<get-originSizeUrl>(...)");
                str = r26.n0.b0(str, length, length2, str3).toString();
            } else {
                jz5.g gVar3 = nVar.f411594f;
                java.lang.String str4 = (java.lang.String) ((jz5.n) gVar3).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "<get-mediumSizeUrl>(...)");
                if (r26.i0.n(str, str4, false)) {
                    int length3 = str.length() - ((java.lang.String) ((jz5.n) gVar3).mo141623x754a37bb()).length();
                    int length4 = str.length();
                    java.lang.String str5 = (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "<get-originSizeUrl>(...)");
                    str = r26.n0.b0(str, length3, length4, str5).toString();
                }
            }
        }
        intent.putStringArrayListExtra("key_url_list", new java.util.ArrayList<>(kz5.b0.c(str)));
        intent.putExtra("key_preview_avatar", true);
        android.view.View view2 = this.f214891e;
        android.content.Context context = view2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        xy2.c.c(context, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context2 = view2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        i0Var.Bj(context2, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
