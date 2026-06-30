package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f104589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f104590f;

    public t4(java.lang.String str, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, yz5.l lVar) {
        this.f104588d = str;
        this.f104589e = finderJumpInfo;
        this.f104590f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$setFollowPatBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedCommentConvert", "onItemClick click comment ref " + this.f104588d + ", jumpInfo=" + hc2.g0.d(this.f104589e));
        kotlin.jvm.internal.o.d(view);
        this.f104590f.invoke(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$setFollowPatBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
