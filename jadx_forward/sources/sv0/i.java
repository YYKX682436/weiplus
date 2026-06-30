package sv0;

/* loaded from: classes5.dex */
public final class i extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f494760d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f494761e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f494762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        vv0.n data = (vv0.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.aai);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f494760d = findViewById;
        android.view.View findViewById2 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566971q80);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f494761e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568983qb4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f494762f = (android.widget.TextView) findViewById3;
        if (data.f521934d) {
            android.view.View view = this.f494760d;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f494760d;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dx0.p pVar = data.f521932b;
        if (pVar != null) {
            android.widget.ImageView imageView = this.f494761e;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivThumbnail");
                throw null;
            }
            imageView.setRotation(pVar.f326001b);
            android.widget.ImageView imageView2 = this.f494761e;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivThumbnail");
                throw null;
            }
            imageView2.setImageBitmap(pVar.f326000a);
        }
        android.widget.TextView textView = this.f494762f;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(data.f521933c));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvOrder");
            throw null;
        }
    }
}
