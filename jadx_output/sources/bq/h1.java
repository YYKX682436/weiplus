package bq;

/* loaded from: classes.dex */
public final class h1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.lang.String userName, java.lang.String eventName, java.lang.String eventDesc, java.lang.String coverUrl, long j17, int i17) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(eventDesc, "eventDesc");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        r45.kq2 kq2Var = new r45.kq2();
        kq2Var.set(2, userName);
        kq2Var.set(3, eventName);
        kq2Var.set(4, eventDesc);
        kq2Var.set(5, coverUrl);
        kq2Var.set(1, db2.t4.f228171a.a(4050));
        kq2Var.set(6, java.lang.Long.valueOf(j17));
        kq2Var.set(7, java.lang.Integer.valueOf(i17));
        r45.lq2 lq2Var = new r45.lq2();
        lq2Var.set(0, new r45.ie());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = kq2Var;
        lVar.f70665b = lq2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderprecreateevent";
        lVar.f70667d = 4050;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderPreCreateEvent", "post userName:" + userName + " eventName:" + eventName + " eventDesc:" + eventDesc + " scene:" + i17);
    }
}
