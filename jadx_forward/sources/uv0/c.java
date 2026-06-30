package uv0;

/* loaded from: classes5.dex */
public final class c extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f512851d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f512852e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f512853f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f512854g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f512855h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uv0.f f512856i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uv0.f fVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f512856i = fVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.q8t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f512851d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.h5w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f512852e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568360qa0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f512853f = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f512854g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.q4i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f512855h = findViewById5;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        vv0.k data = (vv0.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        vv0.k kVar = vv0.k.f521916f;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data, kVar);
        android.widget.TextView textView = this.f512851d;
        uv0.f fVar = this.f512856i;
        android.widget.ImageView imageView = this.f512852e;
        if (b17) {
            textView.setVisibility(8);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cnl);
            imageView.setAlpha(1.0f);
            android.view.View view = this.f512853f;
            int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f512862i, kVar) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f512854g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f512855h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        vo0.e.f520001b.c(data.f521920c, imageView, fVar.f512861h);
        textView.setVisibility(0);
        textView.setText(data.f521919b);
        android.view.View view4 = this.f512853f;
        int i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f512862i, data) ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (data.f521922e == zu0.i.f557208e) {
            android.view.View view5 = this.f512854g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f512855h;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f512854g;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f512855h;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
