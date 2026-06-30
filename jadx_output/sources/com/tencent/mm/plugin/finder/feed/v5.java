package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f110873d;

    public v5(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f110873d = a7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.plugin.finder.view.rm rmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$setCommentSelect$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f110873d;
        android.content.Context context = a7Var.f106207d;
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.finder.feed.f7 f7Var = a7Var.X;
        if (f7Var == null) {
            f7Var = new com.tencent.mm.plugin.finder.feed.f7();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (finderItem.isChosenComment()) {
                f7Var.f106709a = com.tencent.mm.plugin.finder.feed.e7.f106633e;
            } else {
                f7Var.f106709a = com.tencent.mm.plugin.finder.feed.e7.f106632d;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "curCommentSelectType from " + a7Var.X + " to " + f7Var);
        a7Var.X = f7Var;
        yw2.a0 a0Var = a7Var.f106216o;
        if (a0Var != null && (rmVar = a0Var.B) != null) {
            rmVar.dismiss();
        }
        yw2.a0 a0Var2 = a7Var.f106216o;
        if (a0Var2 != null) {
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.view.rm rmVar2 = new com.tencent.mm.plugin.finder.view.rm(context, null);
            boolean z17 = false;
            rmVar2.setContentView(com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e6_, (android.view.ViewGroup) null, false));
            android.view.View findViewById = rmVar2.getContentView().findViewById(com.tencent.mm.R.id.vbi);
            if (com.tencent.mm.ui.bk.C()) {
                findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f481830ad2);
            } else {
                findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f481829ad1);
            }
            rmVar2.f132967f = true;
            rmVar2.f132975n = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
            rmVar2.setOnDismissListener(new yw2.o(a0Var2));
            a0Var2.B = rmVar2;
            android.widget.TextView textView = (android.widget.TextView) rmVar2.getContentView().findViewById(com.tencent.mm.R.id.uvi);
            android.widget.TextView textView2 = (android.widget.TextView) rmVar2.getContentView().findViewById(com.tencent.mm.R.id.v2p);
            com.tencent.mm.plugin.finder.feed.f7 f7Var2 = a7Var.X;
            if (f7Var2 != null) {
                if (f7Var2.f106709a == com.tencent.mm.plugin.finder.feed.e7.f106633e) {
                    z17 = true;
                }
            }
            if (z17) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.abw));
                textView.setBackground(null);
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
                textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481815d44);
            } else {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
                textView.setBackgroundResource(com.tencent.mm.R.drawable.f481815d44);
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.abw));
                textView2.setBackground(null);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.e6(a7Var, textView, context, textView2, rmVar2, V6));
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.f6(a7Var, textView, context, textView2, rmVar2, V6));
            rmVar2.d(view);
        }
        yw2.a0 a0Var3 = a7Var.f106216o;
        if (a0Var3 != null && (weImageView = a0Var3.f466611g) != null) {
            weImageView.s(com.tencent.mm.R.raw.arrow_up_regular, com.tencent.mm.R.color.abw);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$setCommentSelect$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
