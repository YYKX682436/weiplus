package pw0;

/* loaded from: classes5.dex */
public final class l extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f440173d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f440174e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f440175f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f440176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pw0.m f440177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pw0.m mVar, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f440177h = mVar;
        this.f440173d = view;
        this.f440174e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.q7z);
        this.f440175f = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        this.f440176g = view.findViewById(com.p314xaae8f345.mm.R.id.q4i);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View view = this.f440173d;
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cmj);
        view.setSelected(data.f494957c);
        data.m165399x9616526c();
        int ordinal = data.f494956b.ordinal();
        android.widget.ProgressBar progressBar = this.f440175f;
        if (ordinal == 1) {
            progressBar.setVisibility(0);
            android.view.View view2 = this.f440176g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (ordinal != 4) {
            progressBar.setVisibility(8);
            android.view.View view3 = this.f440176g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view4 = this.f440176g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vo0.a aVar = vo0.e.f520001b;
        java.lang.String str = data.f494955a.f129760e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPreviewImageURL(...)");
        android.widget.ImageView ivTextStyle = this.f440174e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ivTextStyle, "ivTextStyle");
        aVar.c(str, ivTextStyle, this.f440177h.f440178h);
    }
}
