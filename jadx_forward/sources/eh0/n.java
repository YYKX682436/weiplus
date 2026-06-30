package eh0;

/* loaded from: classes5.dex */
public final class n implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh0.o f334427a;

    public n(eh0.o oVar) {
        this.f334427a = oVar;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        eh0.i session = (eh0.i) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        java.lang.String str = session.f334415e;
        long j17 = session.f334411a;
        long c17 = c01.id.c();
        eh0.g.f334408a.b(key);
        if ((str == null || str.length() == 0) || j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", "restoreUnfinishedStreams: talker or msgSvrId is empty");
            return;
        }
        java.lang.String str2 = session.f334414d;
        boolean z17 = str2 == null || str2.length() == 0;
        long j18 = session.f334416f;
        if (!z17 && c17 - j18 <= 3600000) {
            this.f334427a.Di(str, j17, str2, session.f334419i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", "restoreUnfinishedStreams: restart stream for talker:%s, msgSvrId:%d, streamTicket:%s", str, java.lang.Long.valueOf(j17), str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.Service", "restoreUnfinishedStreams: stream expired: talker:" + str + ", msgSvrId:" + j17 + ", streamTicket:" + str2 + ", createTime:" + j18 + ", currentTime:" + c17);
    }
}
