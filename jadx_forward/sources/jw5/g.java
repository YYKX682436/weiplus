package jw5;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f383887d;

    public g(java.lang.String str) {
        this.f383887d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = jw5.i.f383889d;
        java.lang.String str = this.f383887d;
        synchronized (obj) {
            jz5.o oVar = (jz5.o) jw5.i.f383891f.remove(str);
            if (oVar != null) {
                java.lang.String msg = "pushChannel: waitingChannel timeout remove " + str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
                if (iw5.o.f376808a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
                }
                ((yz5.l) oVar.f384376f).mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
    }
}
