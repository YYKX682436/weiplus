package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes8.dex */
public class n4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q4 f176625d;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q4 q4Var) {
        this.f176625d = q4Var;
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q4 q4Var = this.f176625d;
            android.content.Context context = q4Var.f176671e;
            db5.e1.K(context, true, str2, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572319as2), q4Var.f176671e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m4(this, str2), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CellAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
