package bb2;

/* loaded from: classes5.dex */
public final class b extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f100337d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f100338e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 f100339f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f100340g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea f100341h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f100342i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f100337d = itemView;
        this.f100338e = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.b1t);
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565050b25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f100339f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699) findViewById;
        this.f100340g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) itemView.findViewById(com.p314xaae8f345.mm.R.id.snm);
        this.f100341h = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea) itemView.findViewById(com.p314xaae8f345.mm.R.id.snl);
        this.f100342i = itemView.findViewById(com.p314xaae8f345.mm.R.id.snk);
    }

    @Override // yp.o
    public void f() {
        this.f100342i.setOnClickListener(null);
    }

    public final void g(bb2.o info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q().r()).booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f100340g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea = this.f100341h;
        if (!booleanValue) {
            c22699x3dcdb352.setVisibility(8);
            c15381xac4783ea.setVisibility(8);
            return;
        }
        android.view.View view = this.f100337d;
        android.content.Context context = view.getContext();
        r45.oo ooVar = info.f100459a;
        if (ooVar.m75939xb282bd08(9) == 1) {
            c22699x3dcdb352.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.raw.f79758xc84e73d5));
            c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            c22699x3dcdb352.setVisibility(0);
            android.view.View view2 = this.f100342i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ooVar.m75939xb282bd08(8));
            jz5.f0 f0Var = null;
            if (!(valueOf.intValue() >= 1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                c15381xac4783ea.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(valueOf.intValue(), false));
                c15381xac4783ea.setTextColor(-1);
                c15381xac4783ea.m62513xe1d3a649(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560778tx));
                c15381xac4783ea.setVisibility(0);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                c15381xac4783ea.setVisibility(8);
                return;
            }
            return;
        }
        if (ooVar.m75939xb282bd08(8) < ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209262h5).mo141623x754a37bb()).r()).intValue() && (ooVar.m75939xb282bd08(8) < 1 || ooVar.m75939xb282bd08(6) != 1)) {
            android.view.View view3 = this.f100342i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), view.getPaddingBottom());
            return;
        }
        android.graphics.drawable.Drawable drawable = c22699x3dcdb352.getDrawable();
        if (drawable != null) {
            drawable.clearColorFilter();
        }
        c22699x3dcdb352.m82040x7541828(0);
        c22699x3dcdb352.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.raw.f80314x35508132));
        c22699x3dcdb352.setVisibility(0);
        c15381xac4783ea.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(ooVar.m75939xb282bd08(8), false));
        c15381xac4783ea.setTextColor(-1);
        c15381xac4783ea.m62513xe1d3a649(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560778tx));
        c15381xac4783ea.setVisibility(0);
        android.view.View view4 = this.f100342i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }
}
