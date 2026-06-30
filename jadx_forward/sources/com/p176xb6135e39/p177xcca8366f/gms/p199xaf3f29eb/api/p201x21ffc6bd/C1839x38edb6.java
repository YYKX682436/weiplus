package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zabq */
/* loaded from: classes13.dex */
public final class C1839x38edb6 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zau {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zaa;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb zac;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 zad;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1800x38ed8a zae;
    private final int zah;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.BinderC1868x38edd8 zai;
    private boolean zaj;
    private final java.util.Queue zab = new java.util.LinkedList();
    private final java.util.Set zaf = new java.util.HashSet();
    private final java.util.Map zag = new java.util.HashMap();
    private final java.util.List zak = new java.util.ArrayList();
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zal = null;
    private int zam = 0;

    public C1839x38edb6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 abstractC1746xcf54ed01) {
        android.os.Handler handler;
        android.content.Context context;
        android.os.Handler handler2;
        this.zaa = c1775x7d99476c;
        handler = c1775x7d99476c.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb zab = abstractC1746xcf54ed01.zab(handler.getLooper(), this);
        this.zac = zab;
        this.zad = abstractC1746xcf54ed01.mo17755x10f860db();
        this.zae = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1800x38ed8a();
        this.zah = abstractC1746xcf54ed01.zaa();
        if (!zab.mo17723xabdb8910()) {
            this.zai = null;
            return;
        }
        context = c1775x7d99476c.zai;
        handler2 = c1775x7d99476c.zar;
        this.zai = abstractC1746xcf54ed01.zac(context, handler2);
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 zaC(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] c1702x28db12d6Arr) {
        if (c1702x28db12d6Arr != null && c1702x28db12d6Arr.length != 0) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] mo17711x968e8170 = this.zac.mo17711x968e8170();
            if (mo17711x968e8170 == null) {
                mo17711x968e8170 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[0];
            }
            x.b bVar = new x.b(mo17711x968e8170.length);
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 c1702x28db12d6 : mo17711x968e8170) {
                bVar.put(c1702x28db12d6.m17612xfb82e301(), java.lang.Long.valueOf(c1702x28db12d6.m17613x52c258a2()));
            }
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 c1702x28db12d62 : c1702x28db12d6Arr) {
                java.lang.Long l17 = (java.lang.Long) bVar.m174751x4aabfc28(c1702x28db12d62.m17612xfb82e301(), null);
                if (l17 == null || l17.longValue() < c1702x28db12d62.m17613x52c258a2()) {
                    return c1702x28db12d62;
                }
            }
        }
        return null;
    }

    private final void zaD(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        java.util.Iterator it = this.zaf.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zal) it.next()).zac(this.zad, c1700xff0c58bb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(c1700xff0c58bb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb.f5810x535c1c1) ? this.zac.mo17712x51be17e6() : null);
        }
        this.zaf.clear();
    }

    public final void zaE(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        zaF(c1763x9432bc12, null, false);
    }

    private final void zaF(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, java.lang.Exception exc, boolean z17) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        if ((c1763x9432bc12 == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai zaiVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai) it.next();
            if (!z17 || zaiVar.zac == 2) {
                if (c1763x9432bc12 != null) {
                    zaiVar.zad(c1763x9432bc12);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    private final void zaG() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zab);
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai zaiVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai) arrayList.get(i17);
            if (!this.zac.mo17718x23b734ff()) {
                return;
            }
            if (zaM(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    public final void zaH() {
        zan();
        zaD(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb.f5810x535c1c1);
        zaL();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd c1857x38edcd = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd) it.next();
            if (zaC(c1857x38edcd.zaa.m17935xf716cc72()) != null) {
                it.remove();
            } else {
                try {
                    c1857x38edcd.zaa.mo17936x42780477(this.zac, new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<>());
                } catch (android.os.DeadObjectException unused) {
                    mo17885x4511603e(3);
                    this.zac.mo17709x1f9d589c("DeadObjectException thrown while calling register listener method.");
                } catch (android.os.RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaG();
        zaJ();
    }

    public final void zaI(int i17) {
        android.os.Handler handler;
        android.os.Handler handler2;
        android.os.Handler handler3;
        android.os.Handler handler4;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zal zalVar;
        zan();
        this.zaj = true;
        this.zae.zae(i17, this.zac.mo17713x5778d61f());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05 = this.zad;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
        handler = c1775x7d99476c.zar;
        handler2 = c1775x7d99476c.zar;
        handler.sendMessageDelayed(android.os.Message.obtain(handler2, 9, c1768x75462a05), 5000L);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a052 = this.zad;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c2 = this.zaa;
        handler3 = c1775x7d99476c2.zar;
        handler4 = c1775x7d99476c2.zar;
        handler3.sendMessageDelayed(android.os.Message.obtain(handler4, 11, c1768x75462a052), u04.d.f505010c);
        zalVar = this.zaa.zak;
        zalVar.zac();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd) it.next()).zac.run();
        }
    }

    private final void zaJ() {
        android.os.Handler handler;
        android.os.Handler handler2;
        android.os.Handler handler3;
        long j17;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05 = this.zad;
        handler = this.zaa.zar;
        handler.removeMessages(12, c1768x75462a05);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a052 = this.zad;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
        handler2 = c1775x7d99476c.zar;
        handler3 = c1775x7d99476c.zar;
        android.os.Message obtainMessage = handler3.obtainMessage(12, c1768x75462a052);
        j17 = this.zaa.zae;
        handler2.sendMessageDelayed(obtainMessage, j17);
    }

    private final void zaK(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai zaiVar) {
        zaiVar.zag(this.zae, zaA());
        try {
            zaiVar.zaf(this);
        } catch (android.os.DeadObjectException unused) {
            mo17885x4511603e(1);
            this.zac.mo17709x1f9d589c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void zaL() {
        android.os.Handler handler;
        android.os.Handler handler2;
        if (this.zaj) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05 = this.zad;
            handler = c1775x7d99476c.zar;
            handler.removeMessages(11, c1768x75462a05);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c2 = this.zaa;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a052 = this.zad;
            handler2 = c1775x7d99476c2.zar;
            handler2.removeMessages(9, c1768x75462a052);
            this.zaj = false;
        }
    }

    private final boolean zaM(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai zaiVar) {
        boolean z17;
        android.os.Handler handler;
        android.os.Handler handler2;
        android.os.Handler handler3;
        android.os.Handler handler4;
        android.os.Handler handler5;
        android.os.Handler handler6;
        android.os.Handler handler7;
        if (!(zaiVar instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac)) {
            zaK(zaiVar);
            return true;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac zacVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac) zaiVar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 zaC = zaC(zacVar.zab(this));
        if (zaC == null) {
            zaK(zaiVar);
            return true;
        }
        this.zac.getClass();
        zaC.m17612xfb82e301();
        zaC.m17613x52c258a2();
        z17 = this.zaa.zas;
        if (!z17 || !zacVar.zaa(this)) {
            zacVar.zae(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1765xcf3df3cc(zaC));
            return true;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8 c1841x38edb8 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8(this.zad, zaC, null);
        int indexOf = this.zak.indexOf(c1841x38edb8);
        if (indexOf >= 0) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8 c1841x38edb82 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8) this.zak.get(indexOf);
            handler5 = this.zaa.zar;
            handler5.removeMessages(15, c1841x38edb82);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
            handler6 = c1775x7d99476c.zar;
            handler7 = c1775x7d99476c.zar;
            handler6.sendMessageDelayed(android.os.Message.obtain(handler7, 15, c1841x38edb82), 5000L);
            return false;
        }
        this.zak.add(c1841x38edb8);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c2 = this.zaa;
        handler = c1775x7d99476c2.zar;
        handler2 = c1775x7d99476c2.zar;
        handler.sendMessageDelayed(android.os.Message.obtain(handler2, 15, c1841x38edb8), 5000L);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c3 = this.zaa;
        handler3 = c1775x7d99476c3.zar;
        handler4 = c1775x7d99476c3.zar;
        handler3.sendMessageDelayed(android.os.Message.obtain(handler4, 16, c1841x38edb8), u04.d.f505010c);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(2, null);
        if (zaN(c1700xff0c58bb)) {
            return false;
        }
        this.zaa.zaE(c1700xff0c58bb, this.zah);
        return false;
    }

    private final boolean zaN(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        java.lang.Object obj;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b c1801x38ed8b;
        java.util.Set set;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b c1801x38ed8b2;
        obj = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zac;
        synchronized (obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
            c1801x38ed8b = c1775x7d99476c.zao;
            if (c1801x38ed8b != null) {
                set = c1775x7d99476c.zap;
                if (set.contains(this.zad)) {
                    c1801x38ed8b2 = this.zaa.zao;
                    c1801x38ed8b2.zah(c1700xff0c58bb, this.zah);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zaO(boolean z17) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        if (!this.zac.mo17718x23b734ff() || !this.zag.isEmpty()) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.mo17709x1f9d589c("Timing out service connection.");
            return true;
        }
        if (!z17) {
            return false;
        }
        zaJ();
        return false;
    }

    public static /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 zag(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        return c1839x38edb6.zad;
    }

    public static /* bridge */ /* synthetic */ void zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        c1839x38edb6.zaE(c1763x9432bc12);
    }

    public static /* bridge */ /* synthetic */ void zal(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8 c1841x38edb8) {
        if (c1839x38edb6.zak.contains(c1841x38edb8) && !c1839x38edb6.zaj) {
            if (c1839x38edb6.zac.mo17718x23b734ff()) {
                c1839x38edb6.zaG();
            } else {
                c1839x38edb6.zao();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zam(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1841x38edb8 c1841x38edb8) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 c1702x28db12d6;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zab;
        if (c1839x38edb6.zak.remove(c1841x38edb8)) {
            handler = c1839x38edb6.zaa.zar;
            handler.removeMessages(15, c1841x38edb8);
            handler2 = c1839x38edb6.zaa.zar;
            handler2.removeMessages(16, c1841x38edb8);
            c1702x28db12d6 = c1841x38edb8.zab;
            java.util.ArrayList arrayList = new java.util.ArrayList(c1839x38edb6.zab.size());
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai zaiVar : c1839x38edb6.zab) {
                if ((zaiVar instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac) && (zab = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac) zaiVar).zab(c1839x38edb6)) != null && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18512xde2d761f(zab, c1702x28db12d6)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai zaiVar2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai) arrayList.get(i17);
                c1839x38edb6.zab.remove(zaiVar2);
                zaiVar2.zae(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1765xcf3df3cc(c1702x28db12d6));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zay(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6, boolean z17) {
        return c1839x38edb6.zaO(false);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnected */
    public final void mo17884xdba42fea(android.os.Bundle bundle) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        handler = c1775x7d99476c.zar;
        if (myLooper == handler.getLooper()) {
            zaH();
        } else {
            handler2 = this.zaa.zar;
            handler2.post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1835x38edb2(this));
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae
    /* renamed from: onConnectionFailed */
    public final void mo17932xce9394ba(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        zar(c1700xff0c58bb, null);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnectionSuspended */
    public final void mo17885x4511603e(int i17) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        handler = c1775x7d99476c.zar;
        if (myLooper == handler.getLooper()) {
            zaI(i17);
        } else {
            handler2 = this.zaa.zar;
            handler2.post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1836x38edb3(this, i17));
        }
    }

    public final boolean zaA() {
        return this.zac.mo17723xabdb8910();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zaB() {
        return zaO(true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zau
    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, boolean z17) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    public final int zac() {
        return this.zam;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zad() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        return this.zal;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb zaf() {
        return this.zac;
    }

    public final java.util.Map zah() {
        return this.zag;
    }

    public final void zan() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        this.zal = null;
    }

    public final void zao() {
        android.os.Handler handler;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zal zalVar;
        android.content.Context context;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        if (this.zac.mo17718x23b734ff() || this.zac.mo17719x532f7b82()) {
            return;
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
            zalVar = c1775x7d99476c.zak;
            context = c1775x7d99476c.zai;
            int zab = zalVar.zab(context, this.zac);
            if (zab != 0) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(zab, null);
                this.zac.getClass();
                c1700xff0c58bb.m17607x9616526c();
                zar(c1700xff0c58bb, null);
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c2 = this.zaa;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb = this.zac;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1843x38edba c1843x38edba = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1843x38edba(c1775x7d99476c2, interfaceC1736x7877dfeb, this.zad);
            if (interfaceC1736x7877dfeb.mo17723xabdb8910()) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.BinderC1868x38edd8) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zai)).zae(c1843x38edba);
            }
            try {
                this.zac.mo17707x38b478ea(c1843x38edba);
            } catch (java.lang.SecurityException e17) {
                zar(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(10), e17);
            }
        } catch (java.lang.IllegalStateException e18) {
            zar(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(10), e18);
        }
    }

    public final void zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai zaiVar) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        if (this.zac.mo17718x23b734ff()) {
            if (zaM(zaiVar)) {
                zaJ();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = this.zal;
        if (c1700xff0c58bb == null || !c1700xff0c58bb.m17603xc9b9eee6()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    public final void zaq() {
        this.zam++;
    }

    public final void zar(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, java.lang.Exception exc) {
        android.os.Handler handler;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zal zalVar;
        boolean z17;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaF;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaF2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaF3;
        android.os.Handler handler2;
        android.os.Handler handler3;
        android.os.Handler handler4;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12;
        android.os.Handler handler5;
        android.os.Handler handler6;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.BinderC1868x38edd8 binderC1868x38edd8 = this.zai;
        if (binderC1868x38edd8 != null) {
            binderC1868x38edd8.zaf();
        }
        zan();
        zalVar = this.zaa.zak;
        zalVar.zac();
        zaD(c1700xff0c58bb);
        if ((this.zac instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p208x7643c6b5.zap) && c1700xff0c58bb.m17600x130a215f() != 24) {
            this.zaa.zaf = true;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
            handler5 = c1775x7d99476c.zar;
            handler6 = c1775x7d99476c.zar;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (c1700xff0c58bb.m17600x130a215f() == 4) {
            c1763x9432bc12 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zab;
            zaE(c1763x9432bc12);
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = c1700xff0c58bb;
            return;
        }
        if (exc != null) {
            handler4 = this.zaa.zar;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler4);
            zaF(null, exc, false);
            return;
        }
        z17 = this.zaa.zas;
        if (!z17) {
            zaF = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zaF(this.zad, c1700xff0c58bb);
            zaE(zaF);
            return;
        }
        zaF2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zaF(this.zad, c1700xff0c58bb);
        zaF(zaF2, null, true);
        if (this.zab.isEmpty() || zaN(c1700xff0c58bb) || this.zaa.zaE(c1700xff0c58bb, this.zah)) {
            return;
        }
        if (c1700xff0c58bb.m17600x130a215f() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaF3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zaF(this.zad, c1700xff0c58bb);
            zaE(zaF3);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c2 = this.zaa;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05 = this.zad;
        handler2 = c1775x7d99476c2.zar;
        handler3 = c1775x7d99476c2.zar;
        handler2.sendMessageDelayed(android.os.Message.obtain(handler3, 9, c1768x75462a05), 5000L);
    }

    public final void zas(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb = this.zac;
        interfaceC1736x7877dfeb.mo17709x1f9d589c("onSignInFailed for " + interfaceC1736x7877dfeb.getClass().getName() + " with " + java.lang.String.valueOf(c1700xff0c58bb));
        zar(c1700xff0c58bb, null);
    }

    public final void zat(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zal zalVar) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        this.zaf.add(zalVar);
    }

    public final void zau() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        if (this.zaj) {
            zao();
        }
    }

    public final void zav() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        zaE(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zaa);
        this.zae.zaf();
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey listenerKey : (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey[]) this.zag.keySet().toArray(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey[0])) {
            zap(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zah(listenerKey, new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc()));
        }
        zaD(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(4));
        if (this.zac.mo17718x23b734ff()) {
            this.zac.mo17720x87088ea7(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1838x38edb5(this));
        }
    }

    public final void zaw() {
        android.os.Handler handler;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc;
        android.content.Context context;
        handler = this.zaa.zar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18204x226e9cc(handler);
        if (this.zaj) {
            zaL();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
            c1705x2db7dcfc = c1775x7d99476c.zaj;
            context = c1775x7d99476c.zai;
            zaE(c1705x2db7dcfc.mo17630x402556f4(context) == 18 ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(21, "Connection timed out waiting for Google Play services update to complete.") : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.mo17709x1f9d589c("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.zac.mo17718x23b734ff();
    }
}
