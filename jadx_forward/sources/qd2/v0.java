package qd2;

/* loaded from: classes10.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f443379e;

    public v0(qd2.g1 g1Var, android.widget.Button button) {
        this.f443378d = g1Var;
        this.f443379e = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button this_apply = this.f443379e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this_apply, "$this_apply");
        qd2.g1 g1Var = this.f443378d;
        android.widget.CheckBox checkBox = g1Var.f443286g;
        if ((checkBox == null || checkBox.isChecked()) ? false : true) {
            android.content.Context context = g1Var.f443280a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0);
            z2Var.m(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571540i9));
            z2Var.o(0);
            z2Var.v(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            qd2.x0 x0Var = new qd2.x0(z2Var);
            qd2.y0 y0Var = new qd2.y0(g1Var, z2Var);
            z2Var.D = x0Var;
            z2Var.E = y0Var;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ed9, (android.view.ViewGroup) null, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.tsc);
            if (textView != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView);
            }
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.tsa);
            if (findViewById != null) {
                findViewById.setOnClickListener(new qd2.z0(g1Var));
            }
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tsb);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new qd2.a1(g1Var));
            }
            z2Var.j(inflate);
            z2Var.C();
        } else {
            y9.i iVar = g1Var.f443287h;
            if (iVar != null) {
                iVar.dismiss();
            }
            yz5.a aVar = g1Var.f443297r;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            g1Var.c(this_apply, "view_clk");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
