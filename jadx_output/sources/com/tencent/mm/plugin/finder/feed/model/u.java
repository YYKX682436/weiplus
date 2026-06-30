package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j51 f108380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f108381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f108383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f108384h;

    public u(r45.j51 j51Var, android.content.Context context, java.lang.String str, long j17, java.util.List list) {
        this.f108380d = j51Var;
        this.f108381e = context;
        this.f108382f = str;
        this.f108383g = j17;
        this.f108384h = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.sm2 sm2Var;
        r45.pm2 pm2Var = (r45.pm2) this.f108380d.getCustom(7);
        int integer = (pm2Var == null || (sm2Var = (r45.sm2) pm2Var.getCustom(1)) == null) ? 0 : sm2Var.getInteger(1);
        android.content.Context context = this.f108381e;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.qp qpVar = (com.tencent.mm.plugin.finder.viewmodel.component.qp) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.qp.class);
        if (qpVar != null) {
            java.lang.String source = this.f108382f;
            kotlin.jvm.internal.o.g(source, "source");
            java.util.List commentList = this.f108384h;
            kotlin.jvm.internal.o.g(commentList, "commentList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(qpVar.hashCode());
            sb6.append(')');
            sb6.append(source);
            sb6.append(" set multi image desc comment,feedId=");
            long j17 = this.f108383g;
            sb6.append(pm0.v.u(j17));
            sb6.append(",commentList=");
            java.util.List r17 = kz5.d0.r(commentList);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(r17, 10));
            java.util.Iterator it = ((java.util.ArrayList) r17).iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next()).getCommentId()));
            }
            sb6.append(arrayList);
            sb6.append(",commentCount=");
            sb6.append(integer);
            com.tencent.mars.xlog.Log.i("Finder.FinderMultiImageDescCommentUIC", sb6.toString());
            ((com.tencent.mm.sdk.platformtools.c0) ((jz5.n) qpVar.f135726f).getValue()).d(java.lang.Long.valueOf(j17), kz5.n0.V0(commentList));
            ((com.tencent.mm.sdk.platformtools.c0) ((jz5.n) qpVar.f135727g).getValue()).d(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(integer));
        }
    }
}
