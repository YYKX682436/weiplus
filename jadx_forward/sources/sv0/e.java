package sv0;

/* loaded from: classes5.dex */
public final class e extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final sv0.g f494749d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f494750e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f494751f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f494752g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f494753h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f494754i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sv0.f fVar, android.view.View itemView, sv0.g getCoverThumbnailCallback) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getCoverThumbnailCallback, "getCoverThumbnailCallback");
        this.f494749d = getCoverThumbnailCallback;
        this.f494750e = jz5.h.b(new sv0.a(itemView));
        this.f494751f = jz5.h.b(new sv0.c(itemView));
        this.f494752g = jz5.h.b(new sv0.b(itemView));
        this.f494753h = jz5.h.b(new sv0.d(itemView));
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sv0.h data = (sv0.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = data.f494756a;
        this.f494754i = segmentID;
        rv0.a6 a6Var = (rv0.a6) this.f494749d;
        a6Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 v76 = a6Var.f481459a.v7();
        dx0.p m17 = v76 != null ? v76.m(segmentID) : null;
        if ((m17 != null ? m17.f326000a : null) != null) {
            j().setRotation(m17.f326001b);
            j().setImageBitmap(m17.f326000a);
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f494751f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.String format = java.lang.String.format("%.1fS", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) data.f494757b) / 1000.0f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText(format);
        jz5.g gVar = this.f494753h;
        jz5.g gVar2 = this.f494752g;
        if (data.f494759d) {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            android.view.View view2 = (android.view.View) mo141623x754a37bb3;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        android.view.View view3 = (android.view.View) mo141623x754a37bb4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        android.view.View view4 = (android.view.View) mo141623x754a37bb5;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.widget.ImageView j() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f494750e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }
}
