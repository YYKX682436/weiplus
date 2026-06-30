package gi2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 f353797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi2.c f353798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527, gi2.c cVar) {
        super(0);
        this.f353797d = c14233xcca2a527;
        this.f353798e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527 = this.f353797d;
        gi2.d f193233w = c14233xcca2a527.getF193233w();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        gi2.c cVar = this.f353798e;
        if (f193233w != null) {
            java.util.LinkedList linkedList = ((gi2.e) f193233w).f353806g;
            int size = linkedList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.Object obj = linkedList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                xh2.a aVar = (xh2.a) obj;
                arrayList.add(f193233w.a(i17));
                arrayList2.add(aVar.f536054b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f353799a, "addView index:" + i17 + " layoutInfo:" + aVar);
            }
            c14233xcca2a527.removeAllViews();
            if (arrayList.size() <= 0 || arrayList.size() != arrayList2.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f353799a, "viewList size:" + arrayList.size() + ", layoutInfoList size:" + arrayList2.size());
            } else {
                cVar.c(arrayList);
                cVar.b(arrayList, f193233w, c14233xcca2a527);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(cVar.f353799a, "notifyUpdate layoutAdapter = null");
        }
        return f0Var2;
    }
}
