package vs1;

/* loaded from: classes7.dex */
public abstract class a implements vs1.e {
    public final boolean c(java.lang.String url, ts1.o target, java.lang.String host, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        boolean z18 = true;
        if (i17 == 200) {
            target.z(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175755g, host);
            cx4.s.c(3L, 1L, target.j());
        } else if (i17 != 304) {
            if (i17 == 301 || i17 == 302) {
                java.util.Set<java.lang.String> keySet = target.l().keySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
                if (!keySet.isEmpty()) {
                    for (java.lang.String str : keySet) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        java.lang.String lowerCase = str.toLowerCase();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, ya.b.f77489x9ff58fb5)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    target.z(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175755g, host);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseContentFetcher", "processResponseCode fetch error: invalid headers url: %s", url);
                }
            } else {
                cx4.s.c(5L, 1L, target.j());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseContentFetcher", "processResponseCode fetch error: respCode: " + i17 + ", url: %s", url);
            }
            z18 = false;
        } else {
            target.z(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175755g, host);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseContentFetcher", "update " + url + ": " + target.v());
            cx4.s.c(4L, 1L, target.j());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseContentFetcher", "processResponseCode responseCode: " + i17 + ", ret: " + z18);
        return z18;
    }
}
