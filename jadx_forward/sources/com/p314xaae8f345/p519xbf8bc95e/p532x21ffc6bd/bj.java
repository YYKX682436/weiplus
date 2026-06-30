package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class bj {

    /* renamed from: a, reason: collision with root package name */
    private static volatile com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bj f130506a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f130507b = false;

    private bj() {
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bj a() {
        if (f130506a == null) {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bj.class) {
                if (f130506a == null) {
                    f130506a = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bj();
                }
            }
        }
        return f130506a;
    }

    public final synchronized void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        if (this.f130507b) {
            return;
        }
        if (bnVar != null && !bnVar.x().a()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.bj.1
                private static java.lang.Boolean a() {
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx dxVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx.class);
                        if (android.text.TextUtils.isEmpty(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.e())) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.e();
                        }
                        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36698x20918ca7 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.di) dxVar.i()).m36698x20918ca7(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(), java.net.URLEncoder.encode(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.e(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.j(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.k(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.c(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g());
                        if (m36698x20918ca7 != null) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("LaunchStat data with response:".concat(new java.lang.String(m36698x20918ca7.f16977x2eefaa, m36698x20918ca7.f16974x2c0d614c)));
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("err:" + e17.getMessage());
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("cm_model", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c());
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a();
                    new com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4429x5349f5a6("cm_stat", hashMap);
                    return java.lang.Boolean.TRUE;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return a();
                }
            }).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
            this.f130507b = true;
        }
    }
}
