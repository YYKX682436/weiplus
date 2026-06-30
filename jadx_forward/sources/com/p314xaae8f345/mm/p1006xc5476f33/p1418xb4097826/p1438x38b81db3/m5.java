package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f185507d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var) {
        this.f185507d = q6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f185507d.f185873e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
        if (c14994x9b99c079 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        r45.uy0 uy0Var = a7Var.f187758v;
        if (uy0Var == null || (str = uy0Var.m75945x2fec8307(2)) == null) {
            str = "";
        }
        zy2.gc gcVar = a7Var.H1;
        android.content.Context context = a7Var.f187740d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570326ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5)).setText(str);
        k0Var.s(inflate, false);
        k0Var.f293405n = new cu2.k(context);
        k0Var.f293414s = new cu2.l(c14994x9b99c079, gcVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
