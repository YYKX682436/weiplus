package bb2;

/* loaded from: classes5.dex */
public final class b extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f18804d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f18805e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView f18806f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f18807g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.StrokeTextView f18808h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f18809i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f18804d = itemView;
        this.f18805e = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.b1t);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483517b25);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f18806f = (com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView) findViewById;
        this.f18807g = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.snm);
        this.f18808h = (com.tencent.mm.plugin.finder.view.StrokeTextView) itemView.findViewById(com.tencent.mm.R.id.snl);
        this.f18809i = itemView.findViewById(com.tencent.mm.R.id.snk);
    }

    @Override // yp.o
    public void f() {
        this.f18809i.setOnClickListener(null);
    }

    public final void g(bb2.o info) {
        kotlin.jvm.internal.o.g(info, "info");
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q().r()).booleanValue();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f18807g;
        com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView = this.f18808h;
        if (!booleanValue) {
            weImageView.setVisibility(8);
            strokeTextView.setVisibility(8);
            return;
        }
        android.view.View view = this.f18804d;
        android.content.Context context = view.getContext();
        r45.oo ooVar = info.f18926a;
        if (ooVar.getInteger(9) == 1) {
            weImageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.raw.icons_filled_good));
            weImageView.setIconColor(b3.l.getColor(context, com.tencent.mm.R.color.Red_100));
            weImageView.setVisibility(0);
            android.view.View view2 = this.f18809i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ooVar.getInteger(8));
            jz5.f0 f0Var = null;
            if (!(valueOf.intValue() >= 1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                strokeTextView.setText(com.tencent.mm.plugin.finder.assist.w2.o(valueOf.intValue(), false));
                strokeTextView.setTextColor(-1);
                strokeTextView.setStrokeColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479245tx));
                strokeTextView.setVisibility(0);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                strokeTextView.setVisibility(8);
                return;
            }
            return;
        }
        if (ooVar.getInteger(8) < ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127729h5).getValue()).r()).intValue() && (ooVar.getInteger(8) < 1 || ooVar.getInteger(6) != 1)) {
            android.view.View view3 = this.f18809i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv), view.getPaddingBottom());
            return;
        }
        android.graphics.drawable.Drawable drawable = weImageView.getDrawable();
        if (drawable != null) {
            drawable.clearColorFilter();
        }
        weImageView.setIconColor(0);
        weImageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.raw.icons_outlined_star_new_0_5));
        weImageView.setVisibility(0);
        strokeTextView.setText(com.tencent.mm.plugin.finder.assist.w2.o(ooVar.getInteger(8), false));
        strokeTextView.setTextColor(-1);
        strokeTextView.setStrokeColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479245tx));
        strokeTextView.setVisibility(0);
        android.view.View view4 = this.f18809i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/bullet/BulletViewHolder", "refreshLikeState", "(Lcom/tencent/mm/plugin/finder/bullet/FinderBulletInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }
}
