package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f189875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f189877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f189878g;

    public t(android.content.Context context, java.lang.String str, long j17, java.util.LinkedList linkedList) {
        this.f189875d = context;
        this.f189876e = str;
        this.f189877f = j17;
        this.f189878g = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f189875d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9.class);
        if (e9Var != null) {
            java.lang.String source = this.f189876e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            java.util.LinkedList commentList = this.f189878g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentList, "commentList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(e9Var.hashCode());
            sb6.append(')');
            sb6.append(source);
            sb6.append(" set emoji desc comment, feedId=");
            long j17 = this.f189877f;
            sb6.append(pm0.v.u(j17));
            sb6.append(",commentList=");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(commentList, 10));
            java.util.Iterator it = commentList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next()).m76058xa6514d24()));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", sb6.toString());
            e9Var.d7().d(java.lang.Long.valueOf(j17), commentList);
        }
    }
}
