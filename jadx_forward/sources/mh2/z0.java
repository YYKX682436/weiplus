package mh2;

/* loaded from: classes10.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f408025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f408026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jh2.c f408027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(mh2.f1 f1Var, java.util.List list, int i17, jh2.c cVar) {
        super(0);
        this.f408025d = f1Var;
        this.f408026e = list;
        this.f408027f = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mh2.f1 f1Var = this.f408025d;
        java.lang.String str = f1Var.f407863e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on bind with grove ");
        java.util.List list = this.f408026e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((jh2.b) it.next()).m140934x9616526c());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) f1Var.f407864f;
        c14230x50345152.getClass();
        oh2.r rVar = c14230x50345152.f193209h;
        rVar.getClass();
        list.size();
        rVar.f426954l = 0;
        rVar.f426944b.clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) rVar.f426949g;
        arrayList2.clear();
        arrayList2.addAll(list);
        f1Var.f407875q = true;
        this.f408027f.j();
        return jz5.f0.f384359a;
    }
}
