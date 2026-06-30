package rc;

/* loaded from: classes16.dex */
public class a extends org.p3343x72743996.net.AbstractC29554xec05c04f.Listener {
    public a(rc.c cVar, java.util.concurrent.Executor executor) {
        super(executor);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Listener
    /* renamed from: onRequestFinished */
    public void mo153633x1d116842(org.p3343x72743996.net.AbstractC29554xec05c04f abstractC29554xec05c04f) {
        java.lang.String mo153631xb5887639 = abstractC29554xec05c04f.mo153631xb5887639();
        org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics mo153629x76c5fc8d = abstractC29554xec05c04f.mo153629x76c5fc8d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url: ");
        sb6.append(mo153631xb5887639);
        sb6.append(", finish reason: ");
        sb6.append(abstractC29554xec05c04f.mo153628x51116e4c());
        sb6.append(" ");
        if (mo153629x76c5fc8d.mo153636x15ff31e8() != null && mo153629x76c5fc8d.mo153637x93c25e2f() != null) {
            sb6.append("dns cost: ");
            sb6.append(mo153629x76c5fc8d.mo153636x15ff31e8().getTime() - mo153629x76c5fc8d.mo153637x93c25e2f().getTime());
            sb6.append("ms ");
        }
        if (mo153629x76c5fc8d.mo153649xa6813b2c() != null && mo153629x76c5fc8d.mo153648x2fdb2a25() != null) {
            sb6.append("ssl cost: ");
            sb6.append(mo153629x76c5fc8d.mo153648x2fdb2a25().getTime() - mo153629x76c5fc8d.mo153649xa6813b2c().getTime());
            sb6.append("ms ");
        }
        if (mo153629x76c5fc8d.mo153639xd0f3f6b2() != null && mo153629x76c5fc8d.mo153638x30b30f2b() != null) {
            sb6.append("push cost: ");
            sb6.append(mo153629x76c5fc8d.mo153638x30b30f2b().getTime() - mo153629x76c5fc8d.mo153639xd0f3f6b2().getTime());
            sb6.append("ms ");
        }
        if (mo153629x76c5fc8d.mo153642xadf7b589() != null && mo153629x76c5fc8d.mo153641xf07697c2() != null) {
            sb6.append("request cost: ");
            sb6.append(mo153629x76c5fc8d.mo153641xf07697c2().getTime() - mo153629x76c5fc8d.mo153642xadf7b589().getTime());
            sb6.append("ms ");
        }
        if (mo153629x76c5fc8d.mo153635xd25ef00e() != null && mo153629x76c5fc8d.mo153634xc004af87() != null) {
            sb6.append("connect cost: ");
            sb6.append(mo153629x76c5fc8d.mo153634xc004af87().getTime() - mo153629x76c5fc8d.mo153634xc004af87().getTime());
            sb6.append("ms ");
        }
        if (mo153629x76c5fc8d.mo153645x8118339e() != null && mo153629x76c5fc8d.mo153644x30599717() != null) {
            sb6.append("sending cost: ");
            sb6.append(mo153629x76c5fc8d.mo153645x8118339e().getTime() - mo153629x76c5fc8d.mo153644x30599717().getTime());
            sb6.append("ms ");
        }
        if (mo153629x76c5fc8d.mo153650xaf166881() != null) {
            sb6.append("total cost: ");
            sb6.append(mo153629x76c5fc8d.mo153650xaf166881());
            sb6.append("ms ");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetGlobalEngine", sb6.toString());
    }
}
