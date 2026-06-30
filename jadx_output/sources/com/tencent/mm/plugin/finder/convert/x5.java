package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f104925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104927f;

    public x5(so2.z0 z0Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.q6 q6Var) {
        this.f104925d = z0Var;
        this.f104926e = s0Var;
        this.f104927f = q6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.z0 z0Var = this.f104925d;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = z0Var.E.getFeedObject();
        in5.s0 s0Var = this.f104926e;
        boolean f17 = hc2.g0.f(feedObject, s0Var, null);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = z0Var.E;
        android.content.Context context = s0Var.f293121e;
        if (!f17) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f104927f.o(context, finderItem, false);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).Gk(context, finderItem.getId(), (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 1, (r18 & 32) != 0 ? false : false);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
