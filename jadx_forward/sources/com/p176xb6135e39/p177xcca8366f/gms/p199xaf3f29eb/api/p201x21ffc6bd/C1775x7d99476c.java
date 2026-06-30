package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.GoogleApiManager */
/* loaded from: classes13.dex */
public class C1775x7d99476c implements android.os.Handler.Callback {
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(4, "Sign-out occurred while this API call was in progress.");
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zab = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(4, "The user must be signed in to make this API call.");
    private static final java.lang.Object zac = new java.lang.Object();
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zad;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1931x5c2832e3 zag;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1933x3e6b4f1 zah;
    private final android.content.Context zai;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc zaj;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zal zak;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.os.Handler zar;
    private volatile boolean zas;
    private long zae = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
    private boolean zaf = false;
    private final java.util.concurrent.atomic.AtomicInteger zal = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.util.concurrent.atomic.AtomicInteger zam = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.Map zan = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b zao = null;
    private final java.util.Set zap = new x.d(0);
    private final java.util.Set zaq = new x.d(0);

    private C1775x7d99476c(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc) {
        this.zas = true;
        this.zai = context;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau zauVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau(looper, this);
        this.zar = zauVar;
        this.zaj = c1705x2db7dcfc;
        this.zak = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zal(c1705x2db7dcfc);
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18556xb9a0b9f9(context)) {
            this.zas = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    /* renamed from: reportSignOut */
    public static void m17890x4787e47d() {
        synchronized (zac) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = zad;
            if (c1775x7d99476c != null) {
                c1775x7d99476c.zam.incrementAndGet();
                android.os.Handler handler = c1775x7d99476c.zar;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaF(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(c1700xff0c58bb, "API: " + c1768x75462a05.zaa() + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(c1700xff0c58bb));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 zaG(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01) {
        java.util.Map map = this.zan;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 mo17755x10f860db = abstractC1746xcf54ed01.mo17755x10f860db();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) map.get(mo17755x10f860db);
        if (c1839x38edb6 == null) {
            c1839x38edb6 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6(this, abstractC1746xcf54ed01);
            this.zan.put(mo17755x10f860db, c1839x38edb6);
        }
        if (c1839x38edb6.zaA()) {
            this.zaq.add(mo17755x10f860db);
        }
        c1839x38edb6.zao();
        return c1839x38edb6;
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1933x3e6b4f1 zaH() {
        if (this.zah == null) {
            this.zah = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1932x285c9186.m18235x142a16c1(this.zai);
        }
        return this.zah;
    }

    private final void zaI() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1931x5c2832e3 c1931x5c2832e3 = this.zag;
        if (c1931x5c2832e3 != null) {
            if (c1931x5c2832e3.zaa() > 0 || zaD()) {
                zaH().log(c1931x5c2832e3);
            }
            this.zag = null;
        }
    }

    private final void zaJ(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1852x38edc8 zaa2;
        if (i17 == 0 || (zaa2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1852x38edc8.zaa(this, i17, abstractC1746xcf54ed01.mo17755x10f860db())) == null) {
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 m19602xfb859dfb = c2440x4f4de6dc.m19602xfb859dfb();
        final android.os.Handler handler = this.zar;
        handler.getClass();
        m19602xfb859dfb.mo19583xef59738d(new java.util.concurrent.Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        }, zaa2);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zaj() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c;
        synchronized (zac) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(zad, "Must guarantee manager is non-null before using getInstance");
            c1775x7d99476c = zad;
        }
        return c1775x7d99476c;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zak(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c;
        synchronized (zac) {
            if (zad == null) {
                zad = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c(context.getApplicationContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0.m18166xe236406b().getLooper(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b());
            }
            c1775x7d99476c = zad;
        }
        return c1775x7d99476c;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a052;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a053;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a054;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6 = null;
        switch (message.what) {
            case 1:
                this.zae = true == ((java.lang.Boolean) message.obj).booleanValue() ? com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d : 300000L;
                this.zar.removeMessages(12);
                for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a055 : this.zan.keySet()) {
                    android.os.Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1768x75462a055), this.zae);
                }
                return true;
            case 2:
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zal zalVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zal) message.obj;
                java.util.Iterator it = zalVar.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a056 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05) it.next();
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb62 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.get(c1768x75462a056);
                        if (c1839x38edb62 == null) {
                            zalVar.zac(c1768x75462a056, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(13), null);
                        } else if (c1839x38edb62.zaz()) {
                            zalVar.zac(c1768x75462a056, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb.f5810x535c1c1, c1839x38edb62.zaf().mo17712x51be17e6());
                        } else {
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zad2 = c1839x38edb62.zad();
                            if (zad2 != null) {
                                zalVar.zac(c1768x75462a056, zad2, null);
                            } else {
                                c1839x38edb62.zat(zalVar);
                                c1839x38edb62.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb63 : this.zan.values()) {
                    c1839x38edb63.zan();
                    c1839x38edb63.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1856x38edcc c1856x38edcc = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1856x38edcc) message.obj;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb64 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.get(c1856x38edcc.zac.mo17755x10f860db());
                if (c1839x38edb64 == null) {
                    c1839x38edb64 = zaG(c1856x38edcc.zac);
                }
                if (!c1839x38edb64.zaA() || this.zam.get() == c1856x38edcc.zab) {
                    c1839x38edb64.zap(c1856x38edcc.zaa);
                } else {
                    c1856x38edcc.zaa.zad(zaa);
                    c1839x38edb64.zav();
                }
                return true;
            case 5:
                int i17 = message.arg1;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) message.obj;
                java.util.Iterator it6 = this.zan.values().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb65 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) it6.next();
                        if (c1839x38edb65.zab() == i17) {
                            c1839x38edb6 = c1839x38edb65;
                        }
                    }
                }
                if (c1839x38edb6 == null) {
                    android.util.Log.wtf("GoogleApiManager", "Could not find API instance " + i17 + " while trying to fail enqueued calls.", new java.lang.Exception());
                } else if (c1700xff0c58bb.m17600x130a215f() == 13) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6.zai(c1839x38edb6, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(17, "Error resolution was canceled by the user, original error message: " + this.zaj.mo17629x94a1bf03(c1700xff0c58bb.m17600x130a215f()) + ": " + c1700xff0c58bb.m17601xa8aa7f55()));
                } else {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6.zai(c1839x38edb6, zaF(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6.zag(c1839x38edb6), c1700xff0c58bb));
                }
                return true;
            case 6:
                if (this.zai.getApplicationContext() instanceof android.app.Application) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.m17868x33ebcb90((android.app.Application) this.zai.getApplicationContext());
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.m17867x9cf0d20b().m17869x162a7075(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1834x38edb1(this));
                    if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.m17867x9cf0d20b().m17871x9375979c(true)) {
                        this.zae = 300000L;
                    }
                }
                return true;
            case 7:
                zaG((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.get(message.obj)).zau();
                }
                return true;
            case 10:
                java.util.Iterator it7 = this.zaq.iterator();
                while (it7.hasNext()) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb66 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.remove((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05) it7.next());
                    if (c1839x38edb66 != null) {
                        c1839x38edb66.zav();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.get(message.obj)).zaB();
                }
                return true;
            case 14:
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1802x38ed8c c1802x38ed8c = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1802x38ed8c) message.obj;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 zaa2 = c1802x38ed8c.zaa();
                if (this.zan.containsKey(zaa2)) {
                    c1802x38ed8c.zab().m19604x209a1f1f(java.lang.Boolean.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6.zay((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.get(zaa2), false)));
                } else {
                    c1802x38ed8c.zab().m19604x209a1f1f(java.lang.Boolean.FALSE);
                }
                return true;
            case 15:
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8 c1841x38edb8 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8) message.obj;
                java.util.Map map = this.zan;
                c1768x75462a05 = c1841x38edb8.zaa;
                if (map.containsKey(c1768x75462a05)) {
                    java.util.Map map2 = this.zan;
                    c1768x75462a052 = c1841x38edb8.zaa;
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6.zal((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) map2.get(c1768x75462a052), c1841x38edb8);
                }
                return true;
            case 16:
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8 c1841x38edb82 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8) message.obj;
                java.util.Map map3 = this.zan;
                c1768x75462a053 = c1841x38edb82.zaa;
                if (map3.containsKey(c1768x75462a053)) {
                    java.util.Map map4 = this.zan;
                    c1768x75462a054 = c1841x38edb82.zaa;
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6.zam((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) map4.get(c1768x75462a054), c1841x38edb82);
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1853x38edc9 c1853x38edc9 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1853x38edc9) message.obj;
                if (c1853x38edc9.zac == 0) {
                    zaH().log(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1931x5c2832e3(c1853x38edc9.zab, java.util.Arrays.asList(c1853x38edc9.zaa)));
                } else {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1931x5c2832e3 c1931x5c2832e3 = this.zag;
                    if (c1931x5c2832e3 != null) {
                        java.util.List zab2 = c1931x5c2832e3.zab();
                        if (c1931x5c2832e3.zaa() != c1853x38edc9.zab || (zab2 != null && zab2.size() >= c1853x38edc9.zad)) {
                            this.zar.removeMessages(17);
                            zaI();
                        } else {
                            this.zag.zac(c1853x38edc9.zaa);
                        }
                    }
                    if (this.zag == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(c1853x38edc9.zaa);
                        this.zag = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1931x5c2832e3(c1853x38edc9.zab, arrayList);
                        android.os.Handler handler2 = this.zar;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c1853x38edc9.zac);
                    }
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                return false;
        }
    }

    public final void zaA(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b c1801x38ed8b) {
        synchronized (zac) {
            if (this.zao != c1801x38ed8b) {
                this.zao = c1801x38ed8b;
                this.zap.clear();
            }
            this.zap.addAll(c1801x38ed8b.zaa());
        }
    }

    public final void zaB(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b c1801x38ed8b) {
        synchronized (zac) {
            if (this.zao == c1801x38ed8b) {
                this.zao = null;
                this.zap.clear();
            }
        }
    }

    public final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f m18226x1456a638 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74.m18225x9cf0d20b().m18226x1456a638();
        if (m18226x1456a638 != null && !m18226x1456a638.m18230xfbf28b2f()) {
            return false;
        }
        int zaa2 = this.zak.zaa(this.zai, 203400000);
        return zaa2 == -1 || zaa2 == 0;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zaE(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        return this.zaj.zah(this.zai, c1700xff0c58bb, i17);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05) {
        return (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) this.zan.get(c1768x75462a05);
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zam(java.lang.Iterable iterable) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zal zalVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zal(iterable);
        this.zar.sendMessage(this.zar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zan(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1802x38ed8c c1802x38ed8c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1802x38ed8c(abstractC1746xcf54ed01.mo17755x10f860db());
        this.zar.sendMessage(this.zar.obtainMessage(14, c1802x38ed8c));
        return c1802x38ed8c.zab().m19602xfb859dfb();
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zao(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858 abstractC1787x70ddf858, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1796xcf699631 abstractC1796xcf699631, java.lang.Runnable runnable) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
        zaJ(c2440x4f4de6dc, abstractC1787x70ddf858.zaa(), abstractC1746xcf54ed01);
        this.zar.sendMessage(this.zar.obtainMessage(8, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1856x38edcc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaf(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd(abstractC1787x70ddf858, abstractC1796xcf699631, runnable), c2440x4f4de6dc), this.zam.get(), abstractC1746xcf54ed01)));
        return c2440x4f4de6dc.m19602xfb859dfb();
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey listenerKey, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
        zaJ(c2440x4f4de6dc, i17, abstractC1746xcf54ed01);
        this.zar.sendMessage(this.zar.obtainMessage(13, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1856x38edcc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zah(listenerKey, c2440x4f4de6dc), this.zam.get(), abstractC1746xcf54ed01)));
        return c2440x4f4de6dc.m19602xfb859dfb();
    }

    public final void zau(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        this.zar.sendMessage(this.zar.obtainMessage(4, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1856x38edcc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zae(i17, apiMethodImpl), this.zam.get(), abstractC1746xcf54ed01)));
    }

    public final void zav(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633 abstractC1794xa4358633, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe interfaceC1792x8e82d8fe) {
        zaJ(c2440x4f4de6dc, abstractC1794xa4358633.zaa(), abstractC1746xcf54ed01);
        this.zar.sendMessage(this.zar.obtainMessage(4, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1856x38edcc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zag(i17, abstractC1794xa4358633, c2440x4f4de6dc, interfaceC1792x8e82d8fe), this.zam.get(), abstractC1746xcf54ed01)));
    }

    public final void zaw(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1920xe7fb8471 c1920xe7fb8471, int i17, long j17, int i18) {
        this.zar.sendMessage(this.zar.obtainMessage(18, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1853x38edc9(c1920xe7fb8471, i17, j17, i18)));
    }

    public final void zax(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        if (zaE(c1700xff0c58bb, i17)) {
            return;
        }
        android.os.Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(5, i17, 0, c1700xff0c58bb));
    }

    public final void zay() {
        android.os.Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01) {
        android.os.Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, abstractC1746xcf54ed01));
    }
}
