package ek2;

/* loaded from: classes.dex */
public final class d1 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17, java.lang.String micId, long j18, long j19) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micId, "micId");
        r45.it1 it1Var = new r45.it1();
        it1Var.set(2, java.lang.Long.valueOf(j17));
        it1Var.set(3, micId);
        it1Var.set(4, java.lang.Long.valueOf(j18));
        it1Var.set(7, java.lang.Long.valueOf(j19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveGetMicReplayInfo", "CgiFinderLiveGetMicReplayInfo: objectId=" + j17 + ", micId=" + micId + ", uin=" + j18 + ", replayType=" + j19);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = it1Var;
        r45.jt1 jt1Var = new r45.jt1();
        jt1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) jt1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = jt1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetmicreplayinfo";
        lVar.f152200d = 16051;
        p(lVar.a());
    }
}
