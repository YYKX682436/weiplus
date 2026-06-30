package iw0;

/* loaded from: classes5.dex */
public final class b extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f376714d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f376715e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f376716f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f376717g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f376718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iw0.c f376719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(iw0.c cVar, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f376719i = cVar;
        this.f376714d = view;
        this.f376715e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.q7v);
        this.f376716f = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        this.f376717g = view.findViewById(com.p314xaae8f345.mm.R.id.q4i);
        this.f376718h = view.findViewById(com.p314xaae8f345.mm.R.id.f568361qa1);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        kw0.a data = (kw0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        vo0.a aVar = vo0.e.f520001b;
        java.lang.String str = data.f394321a.f129760e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPreviewImageURL(...)");
        android.widget.ImageView ivStickerFancyText = this.f376715e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ivStickerFancyText, "ivStickerFancyText");
        iw0.c cVar = this.f376719i;
        aVar.c(str, ivStickerFancyText, cVar.f376721i);
        zu0.i iVar = zu0.i.f557208e;
        zu0.i iVar2 = data.f394322b;
        android.widget.ProgressBar progressBar = this.f376716f;
        if (iVar2 == iVar) {
            progressBar.setVisibility(0);
            android.view.View view = this.f376717g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view2 = this.f376717g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (cVar.f376720h && data.f394323c) {
            android.view.View view3 = this.f376718h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f376718h;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
