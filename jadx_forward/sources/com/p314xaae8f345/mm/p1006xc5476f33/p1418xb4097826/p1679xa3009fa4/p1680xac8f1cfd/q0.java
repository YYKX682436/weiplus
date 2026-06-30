package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q0 f217175d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q0();

    public q0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.CopyOnWriteArrayList c17;
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        c66.q qVar = c66.q.f121026a;
        synchronized (qVar) {
            if (!qVar.c().isEmpty()) {
                c17 = qVar.c();
            } else {
                try {
                    java.util.Collection m107093xde3eb429 = ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c66.q.f121038m).mo141623x754a37bb()).m107093xde3eb429();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107093xde3eb429, "getAllObjects(...)");
                    java.util.Iterator it = m107093xde3eb429.iterator();
                    while (it.hasNext()) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                        c66.q.f121026a.c().add(null);
                    }
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.WCFinderWCDB", "getFinderAccountUpdateHistoryRecordList fail");
                }
                c17 = qVar.c();
            }
        }
        return c17;
    }
}
