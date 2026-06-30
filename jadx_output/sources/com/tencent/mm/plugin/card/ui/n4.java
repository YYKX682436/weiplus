package com.tencent.mm.plugin.card.ui;

/* loaded from: classes8.dex */
public class n4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.q4 f95092d;

    public n4(com.tencent.mm.plugin.card.ui.q4 q4Var) {
        this.f95092d = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CellAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = (java.lang.String) view.getTag();
        if (!android.text.TextUtils.isEmpty(str)) {
            if (str.contains(";")) {
                str = str.substring(0, str.indexOf(";"));
            }
            java.lang.String str2 = str;
            com.tencent.mm.plugin.card.ui.q4 q4Var = this.f95092d;
            android.content.Context context = q4Var.f95138e;
            db5.e1.K(context, true, str2, "", context.getString(com.tencent.mm.R.string.f490786as2), q4Var.f95138e.getString(com.tencent.mm.R.string.baz), new com.tencent.mm.plugin.card.ui.m4(this, str2), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CellAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
