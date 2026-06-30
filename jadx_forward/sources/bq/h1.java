package bq;

/* loaded from: classes.dex */
public final class h1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.lang.String userName, java.lang.String eventName, java.lang.String eventDesc, java.lang.String coverUrl, long j17, int i17) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventDesc, "eventDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        r45.kq2 kq2Var = new r45.kq2();
        kq2Var.set(2, userName);
        kq2Var.set(3, eventName);
        kq2Var.set(4, eventDesc);
        kq2Var.set(5, coverUrl);
        kq2Var.set(1, db2.t4.f309704a.a(4050));
        kq2Var.set(6, java.lang.Long.valueOf(j17));
        kq2Var.set(7, java.lang.Integer.valueOf(i17));
        r45.lq2 lq2Var = new r45.lq2();
        lq2Var.set(0, new r45.ie());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = kq2Var;
        lVar.f152198b = lq2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderprecreateevent";
        lVar.f152200d = 4050;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderPreCreateEvent", "post userName:" + userName + " eventName:" + eventName + " eventDesc:" + eventDesc + " scene:" + i17);
    }
}
