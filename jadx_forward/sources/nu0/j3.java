package nu0;

/* loaded from: classes5.dex */
public final class j3 implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f421523b;

    public j3(nu0.b4 b4Var, int i17) {
        this.f421522a = b4Var;
        this.f421523b = i17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h
    public final void a(java.lang.String str) {
        qg.a aVar;
        boolean z17 = str == null || str.length() == 0;
        int i17 = this.f421523b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageComp.MainComposingUIC", "[removeScene] position:" + i17 + " err:" + str);
            return;
        }
        nu0.b4 b4Var = this.f421522a;
        ju0.b bVar = b4Var.K;
        java.util.List list = bVar.f332454d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getItems(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = qg.a.Unknown;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            if (((ku0.a) next).f393593a.f557194a.m33754xb600079() != aVar) {
                arrayList.add(next);
            }
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        if (i17 >= 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            if (i17 < arrayList2.size()) {
                arrayList2.remove(i17);
                if (arrayList2.size() < b4Var.n7()) {
                    arrayList2.add(new ku0.a(new zu0.a(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(aVar, "", qg.c.Unknown), 0, 0), false, 2, null));
                }
                bVar.f383213g = b4Var.U6().a7();
                bVar.E(V0);
                java.util.ArrayList arrayList3 = b4Var.f421420w;
                if (i17 < arrayList3.size()) {
                    arrayList3.remove(i17);
                }
                b4Var.V6().o7();
            }
        }
    }
}
