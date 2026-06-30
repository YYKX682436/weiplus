package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class hp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.jp f103601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.o3 f103602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103603f;

    public hp(com.tencent.mm.plugin.finder.convert.jp jpVar, so2.o3 o3Var, in5.s0 s0Var) {
        this.f103601d = jpVar;
        this.f103602e = o3Var;
        this.f103603f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.jp jpVar = this.f103601d;
        yz5.l lVar = jpVar.f103771i;
        so2.o3 o3Var = this.f103602e;
        lVar.invoke(o3Var);
        long j17 = jpVar.f103770h.f103851a == 2 ? 15L : 14L;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        in5.s0 s0Var = this.f103603f;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int i17 = jpVar.f103770h.f103851a;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = o3Var.f410411d.field_contact;
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        java.lang.String l17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract, context, i17, false, str, o3Var.f410411d, false, false, true, false, 356, null);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, context2, j17, 1L, false, jpVar.f103770h.f103851a, 5, l17, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
