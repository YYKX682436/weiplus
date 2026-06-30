package cg2;

/* loaded from: classes3.dex */
public final class a extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f122601d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea f122602e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f122603f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f122604g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f122605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f122601d = itemView;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565050b25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f122602e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea) findViewById;
        this.f122603f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) itemView.findViewById(com.p314xaae8f345.mm.R.id.snm);
        this.f122604g = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.snl);
        this.f122605h = itemView.findViewById(com.p314xaae8f345.mm.R.id.snk);
    }

    public final void g(dk2.zf info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        jz5.f0 f0Var = null;
        dk2.cg cgVar = info instanceof dk2.cg ? (dk2.cg) info : null;
        if (cgVar == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q().r()).booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f122603f;
        android.widget.TextView textView = this.f122604g;
        if (!booleanValue) {
            c22699x3dcdb352.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        android.view.View view = this.f122601d;
        android.content.Context context = view.getContext();
        if (cgVar.o()) {
            c22699x3dcdb352.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.raw.f79758xc84e73d5));
            c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            c22699x3dcdb352.setVisibility(0);
            android.view.View view2 = this.f122605h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((dk2.cg) info).s());
            if (!(valueOf.intValue() >= 1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(valueOf.intValue(), false));
                textView.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                textView.setVisibility(0);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        dk2.cg cgVar2 = (dk2.cg) info;
        if (cgVar2.s() < ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209262h5).mo141623x754a37bb()).r()).intValue()) {
            android.view.View view3 = this.f122605h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), view.getPaddingBottom());
            return;
        }
        c22699x3dcdb352.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b));
        c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        c22699x3dcdb352.setVisibility(0);
        textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(cgVar2.s(), false));
        textView.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        textView.setVisibility(0);
        android.view.View view4 = this.f122605h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }
}
