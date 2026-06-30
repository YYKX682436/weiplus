package pw0;

/* loaded from: classes5.dex */
public final class p extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f440188d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f440189e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f440190f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f440191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pw0.q qVar, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f440188d = view;
        this.f440189e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.q7z);
        this.f440190f = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        this.f440191g = view.findViewById(com.p314xaae8f345.mm.R.id.q4i);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View view = this.f440188d;
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cmk);
        view.setSelected(data.f494957c);
        zu0.i iVar = zu0.i.f557208e;
        zu0.i iVar2 = data.f494956b;
        android.widget.ProgressBar progressBar = this.f440190f;
        if (iVar2 == iVar) {
            progressBar.setVisibility(0);
            android.view.View view2 = this.f440191g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view3 = this.f440191g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String str = data.f494955a.f129760e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        boolean n17 = r26.i0.n(str, ".svg", false);
        android.widget.ImageView ivTextStyle = this.f440189e;
        if (!n17) {
            wo0.c i18 = vo0.e.f520001b.i(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ivTextStyle, "ivTextStyle");
            ((wo0.b) i18).c(ivTextStyle);
            return;
        }
        vo0.a aVar = by0.s.f117881a;
        android.net.Uri parse = android.net.Uri.parse(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parse, "parse(...)");
        java.lang.String absolutePath = i3.b.a(parse).getAbsolutePath();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(absolutePath, "getAbsolutePath(...)");
        wo0.c i19 = by0.s.f117881a.i(absolutePath);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ivTextStyle, "ivTextStyle");
        ((wo0.b) i19).c(ivTextStyle);
    }
}
