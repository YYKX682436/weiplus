package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f108342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f108344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f108345g;

    public t(android.content.Context context, java.lang.String str, long j17, java.util.LinkedList linkedList) {
        this.f108342d = context;
        this.f108343e = str;
        this.f108344f = j17;
        this.f108345g = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f108342d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var = (com.tencent.mm.plugin.finder.viewmodel.component.e9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.e9.class);
        if (e9Var != null) {
            java.lang.String source = this.f108343e;
            kotlin.jvm.internal.o.g(source, "source");
            java.util.LinkedList commentList = this.f108345g;
            kotlin.jvm.internal.o.g(commentList, "commentList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(e9Var.hashCode());
            sb6.append(')');
            sb6.append(source);
            sb6.append(" set emoji desc comment, feedId=");
            long j17 = this.f108344f;
            sb6.append(pm0.v.u(j17));
            sb6.append(",commentList=");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(commentList, 10));
            java.util.Iterator it = commentList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next()).getCommentId()));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.DescCommentContentUIC", sb6.toString());
            e9Var.d7().d(java.lang.Long.valueOf(j17), commentList);
        }
    }
}
