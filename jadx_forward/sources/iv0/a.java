package iv0;

/* loaded from: classes5.dex */
public final class a extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f376593d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f376594e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f376595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iv0.b bVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.q8t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f376593d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.h5w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f376594e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568360qa0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f376595f = findViewById3;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        mv0.a data = (mv0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        mv0.b bVar = data.f413060a;
        boolean z17 = bVar.f413064b;
        android.widget.ImageView imageView = this.f376594e;
        android.widget.TextView textView = this.f376593d;
        int i18 = data.f413061b;
        if (z17) {
            imageView.setImageDrawable(j65.q.a(imageView.getContext()).getDrawable(i18, null));
            textView.setText(j65.q.a(imageView.getContext()).getText(com.p314xaae8f345.mm.R.C30867xcad56011.mtv));
        } else {
            imageView.setImageDrawable(j65.q.a(imageView.getContext()).getDrawable(i18, null));
            textView.setText(bVar.f413063a.f130016e);
        }
        if (data.f413062c) {
            textView.setTextColor(j65.q.a(textView.getContext()).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ag9, null));
            android.view.View view = this.f376595f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        textView.setTextColor(j65.q.a(textView.getContext()).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac_, null));
        android.view.View view2 = this.f376595f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
