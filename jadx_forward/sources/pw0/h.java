package pw0;

/* loaded from: classes5.dex */
public final class h extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f440167d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440168e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f440169f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f440170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f440167d = jz5.h.b(new pw0.d(this));
        this.f440168e = jz5.h.b(new pw0.e(this));
        this.f440169f = jz5.h.b(new pw0.f(this));
        this.f440170g = jz5.h.b(new pw0.g(this));
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        vv0.n data = (vv0.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f440169f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText(java.lang.String.valueOf(data.f521933c));
        dx0.p pVar = data.f521932b;
        if (pVar != null) {
            jz5.g gVar = this.f440168e;
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.widget.ImageView) mo141623x754a37bb2).setRotation(pVar.f326001b);
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            ((android.widget.ImageView) mo141623x754a37bb3).setImageBitmap(pVar.f326000a);
        }
        jz5.g gVar2 = this.f440167d;
        jz5.g gVar3 = this.f440170g;
        if (data.f521934d) {
            java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
            android.view.View view2 = (android.view.View) mo141623x754a37bb5;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar3).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        android.view.View view3 = (android.view.View) mo141623x754a37bb6;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb7 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
        android.view.View view4 = (android.view.View) mo141623x754a37bb7;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
