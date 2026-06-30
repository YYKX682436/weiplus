package cg2;

/* loaded from: classes3.dex */
public final class a extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f41068d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.StrokeTextView f41069e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f41070f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f41071g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f41072h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f41068d = itemView;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483517b25);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f41069e = (com.tencent.mm.plugin.finder.view.StrokeTextView) findViewById;
        this.f41070f = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.snm);
        this.f41071g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.snl);
        this.f41072h = itemView.findViewById(com.tencent.mm.R.id.snk);
    }

    public final void g(dk2.zf info) {
        kotlin.jvm.internal.o.g(info, "info");
        jz5.f0 f0Var = null;
        dk2.cg cgVar = info instanceof dk2.cg ? (dk2.cg) info : null;
        if (cgVar == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q().r()).booleanValue();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f41070f;
        android.widget.TextView textView = this.f41071g;
        if (!booleanValue) {
            weImageView.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        android.view.View view = this.f41068d;
        android.content.Context context = view.getContext();
        if (cgVar.o()) {
            weImageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.raw.icons_filled_good));
            weImageView.setIconColor(b3.l.getColor(context, com.tencent.mm.R.color.Red_100));
            weImageView.setVisibility(0);
            android.view.View view2 = this.f41072h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                textView.setText(com.tencent.mm.plugin.finder.assist.w2.o(valueOf.intValue(), false));
                textView.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_8));
                textView.setVisibility(0);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        dk2.cg cgVar2 = (dk2.cg) info;
        if (cgVar2.s() < ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127729h5).getValue()).r()).intValue()) {
            android.view.View view3 = this.f41072h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv), view.getPaddingBottom());
            return;
        }
        weImageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.raw.icons_outlined_star_new));
        weImageView.setIconColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_5));
        weImageView.setVisibility(0);
        textView.setText(com.tencent.mm.plugin.finder.assist.w2.o(cgVar2.s(), false));
        textView.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_5));
        textView.setVisibility(0);
        android.view.View view4 = this.f41072h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/convert/danmaku/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }
}
