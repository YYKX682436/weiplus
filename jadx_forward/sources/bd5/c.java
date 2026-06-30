package bd5;

/* loaded from: classes10.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f100960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f100961e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f100962f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f100963g;

    /* renamed from: h, reason: collision with root package name */
    public int f100964h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f100965i;

    public c(java.lang.String talker, java.util.List typeCollection, java.util.Set personMsgIds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeCollection, "typeCollection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(personMsgIds, "personMsgIds");
        this.f100960d = talker;
        this.f100961e = typeCollection;
        this.f100962f = personMsgIds;
        this.f100963g = new java.util.ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9 A[SYNTHETIC] */
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i r24, ym3.c r25) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd5.c.a(v65.i, ym3.c):kotlinx.coroutines.flow.j");
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        this.f100964h = 0;
        this.f100965i = null;
        java.util.List list = this.f100963g;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Set set = this.f100962f;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(this.f100960d, longValue);
            if (k17 != null) {
                arrayList2.add(new jz5.l(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(k17.T1())));
            }
        }
        if (arrayList2.size() > 1) {
            kz5.g0.t(arrayList2, new bd5.b());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f384366d).longValue()));
        }
        arrayList.addAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonDataSource", "PersonDataSource onCreate, personMsgIds.size=" + set.size() + ", sorted=" + ((java.util.ArrayList) list).size());
    }
}
