package bd5;

/* loaded from: classes10.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f19427d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f19428e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f19429f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f19430g;

    /* renamed from: h, reason: collision with root package name */
    public int f19431h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f19432i;

    public c(java.lang.String talker, java.util.List typeCollection, java.util.Set personMsgIds) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(typeCollection, "typeCollection");
        kotlin.jvm.internal.o.g(personMsgIds, "personMsgIds");
        this.f19427d = talker;
        this.f19428e = typeCollection;
        this.f19429f = personMsgIds;
        this.f19430g = new java.util.ArrayList();
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
    public kotlinx.coroutines.flow.j a(v65.i r24, ym3.c r25) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd5.c.a(v65.i, ym3.c):kotlinx.coroutines.flow.j");
    }

    @Override // ym3.f
    public void onCreate() {
        this.f19431h = 0;
        this.f19432i = null;
        java.util.List list = this.f19430g;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Set set = this.f19429f;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(this.f19427d, longValue);
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
            arrayList3.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f302833d).longValue()));
        }
        arrayList.addAll(arrayList3);
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonDataSource", "PersonDataSource onCreate, personMsgIds.size=" + set.size() + ", sorted=" + ((java.util.ArrayList) list).size());
    }
}
