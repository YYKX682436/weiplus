package zv0;

/* loaded from: classes5.dex */
public final class p extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f557745d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10959xf3c044d9 f557746e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f557747f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f557748g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f557749h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f557750i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f557751m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f557752n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zv0.q qVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.q8t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f557745d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.h5w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f557746e = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10959xf3c044d9) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568360qa0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f557747f = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f557748g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.q4i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f557749h = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hrm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f557750i = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.qol);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f557751m = findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567673qv5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f557752n = findViewById8;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        int i18;
        zv0.r data = (zv0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = zv0.r.f557753d.f557754a;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb22 = data.f557754a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c4104x6d422cb22, c4104x6d422cb2);
        android.widget.TextView textView = this.f557745d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10959xf3c044d9 c10959xf3c044d9 = this.f557746e;
        boolean z17 = data.f557756c;
        if (b17) {
            c10959xf3c044d9.setImageDrawable(j65.q.a(c10959xf3c044d9.getContext()).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562484bu, null));
            android.view.View view = this.f557752n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(c4104x6d422cb22.f129759d);
            c10959xf3c044d9.setVisibility(0);
            textView.setVisibility(0);
            android.view.View view2 = this.f557747f;
            i18 = z17 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f557750i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f557751m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f557749h;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f557748g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f557752n;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cy0.c cVar = by0.q.f117880a;
        java.lang.String str = c4104x6d422cb22.f129760e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPreviewImageURL(...)");
        new cy0.g(new ip0.a(str), by0.q.f117880a).c(c10959xf3c044d9);
        textView.setVisibility(0);
        textView.setText(c4104x6d422cb22.f129759d);
        zu0.i iVar = zu0.i.f557210g;
        zu0.i iVar2 = data.f557755b;
        if (iVar2 == iVar) {
            android.view.View view8 = this.f557750i;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f557751m;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view10 = this.f557750i;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view11 = this.f557751m;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view12 = this.f557747f;
        i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        arrayList12.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(view12, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (iVar2 == zu0.i.f557208e) {
            android.view.View view13 = this.f557748g;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view14 = this.f557749h;
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view15 = this.f557748g;
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        arrayList15.add(8);
        java.util.Collections.reverse(arrayList15);
        yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
        yj0.a.f(view15, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view16 = this.f557749h;
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        arrayList16.add(8);
        java.util.Collections.reverse(arrayList16);
        yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
        yj0.a.f(view16, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
