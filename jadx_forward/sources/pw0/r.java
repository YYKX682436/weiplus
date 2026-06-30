package pw0;

/* loaded from: classes5.dex */
public final class r extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f440192d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f440193e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f440194f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f440195g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f440196h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pw0.s f440197i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pw0.s sVar, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f440197i = sVar;
        this.f440192d = view;
        this.f440193e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.q7x);
        this.f440194f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.q7y);
        this.f440195g = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        this.f440196h = view.findViewById(com.p314xaae8f345.mm.R.id.q4i);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View view = this.f440192d;
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cml);
        view.setSelected(data.f494957c);
        zu0.i iVar = zu0.i.f557207d;
        android.widget.ImageView imageView = this.f440194f;
        zu0.i iVar2 = data.f494956b;
        if (iVar2 == iVar) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        zu0.i iVar3 = zu0.i.f557208e;
        android.widget.ProgressBar progressBar = this.f440195g;
        if (iVar2 == iVar3) {
            progressBar.setVisibility(0);
            android.view.View view2 = this.f440196h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view3 = this.f440196h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vo0.a aVar = vo0.e.f520001b;
        java.lang.String str = data.f494955a.f129760e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPreviewImageURL(...)");
        android.widget.ImageView ivTextFont = this.f440193e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ivTextFont, "ivTextFont");
        aVar.c(str, ivTextFont, this.f440197i.f440198h);
    }
}
