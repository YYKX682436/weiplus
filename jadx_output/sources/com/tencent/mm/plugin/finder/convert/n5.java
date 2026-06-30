package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104078e;

    public n5(com.tencent.mm.plugin.finder.convert.q6 q6Var, in5.s0 s0Var) {
        this.f104077d = q6Var;
        this.f104078e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.uy0 uy0Var = this.f104077d.f104340e.f106225v;
        if (uy0Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) uy0Var.getCustom(3)) != null) {
            xc2.y2 y2Var = xc2.y2.f453343a;
            android.content.Context context = this.f104078e.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.y2.i(y2Var, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
