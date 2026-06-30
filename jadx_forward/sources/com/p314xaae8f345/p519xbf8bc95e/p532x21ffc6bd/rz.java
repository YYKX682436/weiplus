package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rz {

    /* renamed from: a, reason: collision with root package name */
    final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rz.a> f132839a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi f132840b;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc f132841a;

        /* renamed from: b, reason: collision with root package name */
        final com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 f132842b;

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc ocVar, com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 c4375x79cf0471) {
            this.f132841a = ocVar;
            this.f132842b = c4375x79cf0471;
        }
    }

    public rz(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi biVar) {
        this.f132840b = biVar;
    }

    private java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rz.a> b() {
        return this.f132839a;
    }

    private void c() {
        a();
    }

    public final void a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list) {
        int i17;
        if (this.f132840b == null || list.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 c4375x79cf0471 : list) {
            java.lang.String str = c4375x79cf0471.f17305x592d42e.f17295xda18336d;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i17 = lastIndexOf + 1) <= str.length()) {
                java.lang.String substring = str.substring(i17);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "type:" + c4375x79cf0471.f17305x592d42e.f17303x368f3a + ", coord:" + c4375x79cf0471.f17305x592d42e.f17290x19238955 + ", " + c4375x79cf0471.f17305x592d42e.f17291x19238b01 + ", minScale:" + c4375x79cf0471.f17305x592d42e.f17298x200b8d1d + ", maxScale:" + c4375x79cf0471.f17305x592d42e.f17296xf20076af);
                com.tencent.mapsdk.internal.rz.a aVar = this.f132839a.get(c4375x79cf0471.f17305x592d42e.f17293xadf44135);
                if (aVar == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e c4374x3cfe40e = c4375x79cf0471.f17305x592d42e;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe oeVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe(c4374x3cfe40e.f17290x19238955, c4374x3cfe40e.f17291x19238b01, substring);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e c4374x3cfe40e2 = c4375x79cf0471.f17305x592d42e;
                    oeVar.m35392xabc2c2b5(c4374x3cfe40e2.f17286xc61cf56e, c4374x3cfe40e2.f17287xc61cf56f);
                    oeVar.m35409x985d244c(c4375x79cf0471.f17305x592d42e.f17298x200b8d1d);
                    oeVar.m35408x2bbef4de(c4375x79cf0471.f17305x592d42e.f17296xf20076af);
                    oeVar.m35393xfe827284(true);
                    oeVar.m35394x9aaad6b5(true);
                    oeVar.m35396x5f34bbe2(2);
                    this.f132839a.put(c4375x79cf0471.f17305x592d42e.f17293xadf44135, new com.tencent.mapsdk.internal.rz.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) this.f132840b.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi) oeVar), c4375x79cf0471));
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe oeVar2 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe) aVar.f132841a.f132100d;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e c4374x3cfe40e3 = c4375x79cf0471.f17305x592d42e;
                    oeVar2.m35410x2c929929(c4374x3cfe40e3.f17290x19238955, c4374x3cfe40e3.f17291x19238b01);
                    oeVar2.m35403xd40146a4(substring);
                    oeVar2.m35393xfe827284(true);
                    oeVar2.m35394x9aaad6b5(true);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e c4374x3cfe40e4 = c4375x79cf0471.f17305x592d42e;
                    oeVar2.m35392xabc2c2b5(c4374x3cfe40e4.f17286xc61cf56e, c4374x3cfe40e4.f17287xc61cf56f);
                    oeVar2.m35409x985d244c(c4375x79cf0471.f17305x592d42e.f17298x200b8d1d);
                    oeVar2.m35408x2bbef4de(c4375x79cf0471.f17305x592d42e.f17296xf20076af);
                    oeVar2.m35396x5f34bbe2(2);
                    aVar.f132841a.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) oeVar2);
                }
            }
        }
    }

    public final void b(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list) {
        if (list.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 c4375x79cf0471 : list) {
            com.tencent.mapsdk.internal.rz.a aVar = this.f132839a.get(c4375x79cf0471.f17305x592d42e.f17293xadf44135);
            if (aVar != null) {
                aVar.f132841a.m36849xc84af884();
                this.f132839a.remove(c4375x79cf0471.f17305x592d42e.f17293xadf44135);
            }
        }
    }

    public final void a() {
        java.util.Iterator<java.lang.String> it = this.f132839a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.rz.a aVar = this.f132839a.get(it.next());
            if (aVar != null) {
                aVar.f132841a.m36849xc84af884();
            }
        }
        this.f132839a.clear();
    }
}
