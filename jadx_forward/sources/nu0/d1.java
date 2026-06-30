package nu0;

/* loaded from: classes5.dex */
public final class d1 implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f421443b;

    public d1(nu0.b4 b4Var, java.util.List list) {
        this.f421442a = b4Var;
        this.f421443b = list;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g
    public final void a(java.lang.String[] strArr, java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "[addImages] error:" + str + ' ');
            return;
        }
        nu0.b4 b4Var = this.f421442a;
        b4Var.getClass();
        java.util.List list = this.f421443b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ku0.a((zu0.a) it.next(), false, 2, null));
        }
        ju0.b bVar = b4Var.K;
        java.util.List list2 = bVar.f332454d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
        java.util.Iterator it6 = list2.iterator();
        int i17 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((ku0.a) it6.next()).f393593a.f557194a.m33754xb600079() == qg.a.Unknown) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0) {
            list2.addAll(i17, arrayList);
        }
        if (list2.size() > b4Var.n7()) {
            list2.remove(list2.size() - 1);
        }
        bVar.E(list2);
        b4Var.f421420w.addAll(list);
        b4Var.V6().o7();
    }
}
