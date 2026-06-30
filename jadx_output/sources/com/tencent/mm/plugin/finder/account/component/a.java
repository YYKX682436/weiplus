package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.c f101700d;

    public a(com.tencent.mm.plugin.finder.account.component.c cVar) {
        this.f101700d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ui4 ui4Var;
        java.lang.String string;
        r45.ui4 ui4Var2;
        r45.ui4 ui4Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$initAccCompleteTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.account.component.c cVar = this.f101700d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = cVar.f101702d;
        if (y1Var == null) {
            kotlin.jvm.internal.o.o("bottomSheet");
            throw null;
        }
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(cVar.getContext()), false, 2, null);
        android.widget.ImageView imageView = (android.widget.ImageView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.e7n);
        if (!com.tencent.mm.sdk.platformtools.t8.K0((j37 == null || (ui4Var3 = (r45.ui4) j37.u0().getCustom(27)) == null) ? null : ui4Var3.getString(2))) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n((j37 == null || (ui4Var2 = (r45.ui4) j37.u0().getCustom(27)) == null) ? null : ui4Var2.getString(2), null, 2, null);
            kotlin.jvm.internal.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f329961o));
        }
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.e7p)).getPaint());
        java.lang.String str = j37 != null ? j37.field_nickname : null;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.e7v);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = textView.getContext();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        if (j37 != null && (ui4Var = (r45.ui4) j37.u0().getCustom(27)) != null && (string = ui4Var.getString(0)) != null) {
            str2 = string;
        }
        ((android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.e7r)).setText(cVar.getContext().getResources().getString(com.tencent.mm.R.string.chc, str2));
        ((android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f484420e81)).setText(cVar.getContext().getResources().getString(com.tencent.mm.R.string.f_6, str2));
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = cVar.f101702d;
        if (y1Var2 == null) {
            kotlin.jvm.internal.o.o("bottomSheet");
            throw null;
        }
        y1Var2.s();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC$initAccCompleteTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
