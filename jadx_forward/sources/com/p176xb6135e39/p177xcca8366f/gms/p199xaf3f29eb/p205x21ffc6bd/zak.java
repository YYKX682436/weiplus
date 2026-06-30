package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zak implements android.os.Handler.Callback {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaj zab;
    private final android.os.Handler zah;
    private final java.util.ArrayList zac = new java.util.ArrayList();
    final java.util.ArrayList zaa = new java.util.ArrayList();
    private final java.util.ArrayList zad = new java.util.ArrayList();
    private volatile boolean zae = false;
    private final java.util.concurrent.atomic.AtomicInteger zaf = new java.util.concurrent.atomic.AtomicInteger(0);
    private boolean zag = false;
    private final java.lang.Object zai = new java.lang.Object();

    public zak(android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaj zajVar) {
        this.zab = zajVar;
        this.zah = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 1) {
            android.util.Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i17, new java.lang.Exception());
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) message.obj;
        synchronized (this.zai) {
            if (this.zae && this.zab.mo17962x23b734ff() && this.zac.contains(connectionCallbacks)) {
                connectionCallbacks.mo17884xdba42fea(null);
            }
        }
        return true;
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    public final void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18205x226e9cc(this.zah, "onConnectionFailure must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zad);
            int i17 = this.zaf.get();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener) it.next();
                if (this.zae && this.zaf.get() == i17) {
                    if (this.zad.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.mo17932xce9394ba(c1700xff0c58bb);
                    }
                }
                return;
            }
        }
    }

    public final void zad(android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18205x226e9cc(this.zah, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.zai) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(!this.zag);
            this.zah.removeMessages(1);
            this.zag = true;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(this.zaa.isEmpty());
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zac);
            int i17 = this.zaf.get();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) it.next();
                if (!this.zae || !this.zab.mo17962x23b734ff() || this.zaf.get() != i17) {
                    break;
                } else if (!this.zaa.contains(connectionCallbacks)) {
                    connectionCallbacks.mo17884xdba42fea(bundle);
                }
            }
            this.zaa.clear();
            this.zag = false;
        }
    }

    public final void zae(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18205x226e9cc(this.zah, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            this.zag = true;
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zac);
            int i18 = this.zaf.get();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) it.next();
                if (!this.zae || this.zaf.get() != i18) {
                    break;
                } else if (this.zac.contains(connectionCallbacks)) {
                    connectionCallbacks.mo17885x4511603e(i17);
                }
            }
            this.zaa.clear();
            this.zag = false;
        }
    }

    public final void zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(connectionCallbacks);
        synchronized (this.zai) {
            if (this.zac.contains(connectionCallbacks)) {
                java.lang.String.valueOf(connectionCallbacks);
            } else {
                this.zac.add(connectionCallbacks);
            }
        }
        if (this.zab.mo17962x23b734ff()) {
            android.os.Handler handler = this.zah;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(onConnectionFailedListener);
        synchronized (this.zai) {
            if (this.zad.contains(onConnectionFailedListener)) {
                java.lang.String.valueOf(onConnectionFailedListener);
            } else {
                this.zad.add(onConnectionFailedListener);
            }
        }
    }

    public final void zah(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(connectionCallbacks);
        synchronized (this.zai) {
            if (!this.zac.remove(connectionCallbacks)) {
                java.lang.String.valueOf(connectionCallbacks);
            } else if (this.zag) {
                this.zaa.add(connectionCallbacks);
            }
        }
    }

    public final void zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(onConnectionFailedListener);
        synchronized (this.zai) {
            if (!this.zad.remove(onConnectionFailedListener)) {
                java.lang.String.valueOf(onConnectionFailedListener);
            }
        }
    }

    public final boolean zaj(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(connectionCallbacks);
        synchronized (this.zai) {
            contains = this.zac.contains(connectionCallbacks);
        }
        return contains;
    }

    public final boolean zak(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(onConnectionFailedListener);
        synchronized (this.zai) {
            contains = this.zad.contains(onConnectionFailedListener);
        }
        return contains;
    }
}
