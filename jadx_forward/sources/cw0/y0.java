package cw0;

/* loaded from: classes5.dex */
public final class y0 extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f304233d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f304234e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f304235f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f304236g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f304237h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f304238i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f304239m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ cw0.b1 f304240n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(cw0.b1 b1Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f304240n = b1Var;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.q8t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f304233d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.h5w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f304234e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568360qa0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f304235f = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f304236g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.q4i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f304237h = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.qhj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f304238i = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.qol);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f304239m = findViewById7;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        dw0.c data = (dw0.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = data.f325619a;
        java.lang.String str = c4104x6d422cb2.f129757b;
        zu0.i iVar = data.f325621c;
        java.util.Objects.toString(iVar);
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb22 = dw0.c.f325616e;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar = c4104x6d422cb2.f129756a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getMaterialScene(...)");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c4104x6d422cb2, fv0.e.c(gVar) == fv0.d.f348496o ? dw0.c.f325616e : dw0.c.f325617f);
        java.lang.String str2 = c4104x6d422cb2.f129759d;
        android.widget.TextView textView = this.f304233d;
        android.widget.ImageView imageView = this.f304234e;
        boolean z17 = data.f325622d;
        if (b17) {
            imageView.setImageDrawable(j65.q.a(this.f3639x46306858.getContext()).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cwo, null));
            textView.setBackground(j65.q.a(this.f3639x46306858.getContext()).getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.acy, null));
            textView.setText(str2);
            imageView.setVisibility(0);
            textView.setVisibility(0);
            imageView.setPadding(0, 0, 0, 0);
            android.view.View view = this.f304235f;
            int i18 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setSelected(z17);
            android.view.View view2 = this.f304238i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f304239m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f304237h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f304236g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindOriginTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        vo0.a aVar = vo0.e.f520001b;
        java.lang.String str3 = c4104x6d422cb2.f129760e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getPreviewImageURL(...)");
        aVar.c(str3, imageView, this.f304240n.f304148h);
        textView.setVisibility(0);
        textView.setText(str2);
        textView.setBackground(j65.q.a(this.f3639x46306858.getContext()).getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.acy, null));
        imageView.setPadding(0, 0, 0, 0);
        if (iVar == zu0.i.f557210g) {
            android.view.View view6 = this.f304238i;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f304239m;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view8 = this.f304238i;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f304239m;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view10 = this.f304235f;
        int i19 = z17 ? 0 : 8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(view10, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setSelected(z17);
        if (iVar == zu0.i.f557208e) {
            android.view.View view11 = this.f304236g;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view12 = this.f304237h;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view13 = this.f304236g;
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        arrayList13.add(8);
        java.util.Collections.reverse(arrayList13);
        yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
        yj0.a.f(view13, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view14 = this.f304237h;
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        arrayList14.add(8);
        java.util.Collections.reverse(arrayList14);
        yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
        yj0.a.f(view14, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/TimbreAdapter$TimbreHolder", "bindMaterialTimbre", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/models/TimbreMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
