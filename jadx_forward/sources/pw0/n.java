package pw0;

/* loaded from: classes5.dex */
public final class n extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f440179d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10959xf3c044d9 f440180e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f440181f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f440182g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f440183h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f440184i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f440185m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f440186n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f440187o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pw0.o oVar, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f440179d = view;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10959xf3c044d9 c10959xf3c044d9 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10959xf3c044d9) view.findViewById(com.p314xaae8f345.mm.R.id.rsa);
        this.f440180e = c10959xf3c044d9;
        this.f440181f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.s9u);
        this.f440182g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.q7y);
        this.f440183h = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        this.f440184i = view.findViewById(com.p314xaae8f345.mm.R.id.q4i);
        this.f440185m = view.findViewById(com.p314xaae8f345.mm.R.id.s5_);
        this.f440186n = new android.graphics.drawable.ColorDrawable(j65.q.a(c10959xf3c044d9.getContext()).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560935ad3, null));
        java.lang.String string = j65.q.a(c10959xf3c044d9.getContext()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.mub);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f440187o = string;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View view = this.f440185m;
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cml);
        view.setSelected(data.f494957c);
        android.graphics.drawable.ColorDrawable colorDrawable = this.f440186n;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10959xf3c044d9 c10959xf3c044d9 = this.f440180e;
        c10959xf3c044d9.setBackground(colorDrawable);
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = data.f494955a;
        java.lang.String str = c4104x6d422cb2.f129757b;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "EMPTY_ANIM_PRESET_ID");
        android.widget.ProgressBar progressBar = this.f440183h;
        android.widget.ImageView imageView = this.f440182g;
        android.widget.TextView textView = this.f440181f;
        if (b17) {
            textView.setText("");
            c10959xf3c044d9.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            imageView.setVisibility(8);
            progressBar.setVisibility(8);
            android.view.View view2 = this.f440184i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c10959xf3c044d9.y();
            c10959xf3c044d9.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwq);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "BUILTIN_ANIM_PRESET_ID")) {
            textView.setText(this.f440187o);
            imageView.setVisibility(8);
            progressBar.setVisibility(8);
            android.view.View view3 = this.f440184i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindBuiltin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindBuiltin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c10959xf3c044d9.y();
            c10959xf3c044d9.setImageDrawable(null);
            return;
        }
        zu0.i iVar = zu0.i.f557207d;
        zu0.i iVar2 = data.f494956b;
        if (iVar2 == iVar) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (iVar2 == zu0.i.f557208e) {
            progressBar.setVisibility(0);
            android.view.View view4 = this.f440184i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view5 = this.f440184i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setText("");
        c10959xf3c044d9.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        cy0.c cVar = by0.q.f117880a;
        java.lang.String str2 = c4104x6d422cb2.f129760e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getPreviewImageURL(...)");
        new cy0.g(new ip0.a(str2), by0.q.f117880a).c(c10959xf3c044d9);
    }
}
