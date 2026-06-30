package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192406d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f192406d = a7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$setCommentSelect$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f192406d;
        android.content.Context context = a7Var.f187740d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f7 f7Var = a7Var.X;
        if (f7Var == null) {
            f7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
            if (c14994x9b99c079 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (c14994x9b99c079.m59302xe7dcf583()) {
                f7Var.f188242a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e7.f188166e;
            } else {
                f7Var.f188242a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e7.f188165d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "curCommentSelectType from " + a7Var.X + " to " + f7Var);
        a7Var.X = f7Var;
        yw2.a0 a0Var = a7Var.f187749o;
        if (a0Var != null && (rmVar = a0Var.B) != null) {
            rmVar.dismiss();
        }
        yw2.a0 a0Var2 = a7Var.f187749o;
        if (a0Var2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm(context, null);
            boolean z17 = false;
            rmVar2.setContentView(com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e6_, (android.view.ViewGroup) null, false));
            android.view.View findViewById = rmVar2.getContentView().findViewById(com.p314xaae8f345.mm.R.id.vbi);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563363ad2);
            } else {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563362ad1);
            }
            rmVar2.f214500f = true;
            rmVar2.f214508n = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            rmVar2.setOnDismissListener(new yw2.o(a0Var2));
            a0Var2.B = rmVar2;
            android.widget.TextView textView = (android.widget.TextView) rmVar2.getContentView().findViewById(com.p314xaae8f345.mm.R.id.uvi);
            android.widget.TextView textView2 = (android.widget.TextView) rmVar2.getContentView().findViewById(com.p314xaae8f345.mm.R.id.v2p);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f7 f7Var2 = a7Var.X;
            if (f7Var2 != null) {
                if (f7Var2.f188242a == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e7.f188166e) {
                    z17 = true;
                }
            }
            if (z17) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
                textView.setBackground(null);
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563348d44);
            } else {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563348d44);
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
                textView2.setBackground(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e6(a7Var, textView, context, textView2, rmVar2, V6));
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f6(a7Var, textView, context, textView2, rmVar2, V6));
            rmVar2.d(view);
        }
        yw2.a0 a0Var3 = a7Var.f187749o;
        if (a0Var3 != null && (c22699x3dcdb352 = a0Var3.f548144g) != null) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f78555xa0d33bee, com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$setCommentSelect$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
