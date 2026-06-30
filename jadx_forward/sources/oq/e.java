package oq;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final oq.b f428835a = new oq.b();

    public final void a(f21.g eggList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggList, "eggList");
        oq.b bVar = this.f428835a;
        bVar.f274750b.clear();
        java.util.LinkedList eggList2 = eggList.f340431d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eggList2, "eggList");
        int i17 = 0;
        for (java.lang.Object obj : eggList2) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f21.e eVar = (f21.e) obj;
            java.util.LinkedList<f21.f> keyWords = eVar.f340404d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyWords, "keyWords");
            for (f21.f fVar : keyWords) {
                java.lang.String str = fVar.f340424d;
                if (!(str == null || str.length() == 0)) {
                    oq.a aVar = new oq.a(eVar, i17, fVar);
                    bVar.getClass();
                    bVar.b(aVar, 0, new com.p314xaae8f345.mm.p2614xca6eae71.a(bVar));
                }
            }
            i17 = i18;
        }
    }
}
