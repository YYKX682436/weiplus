package eb2;

/* loaded from: classes2.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.m0 f332324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f332326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f332328h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rn5.a f332329i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f332330m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ db2.v3 f332331n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e f332332o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f332333p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f332334q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(eb2.m0 m0Var, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list, boolean z17, rn5.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, db2.v3 v3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar, boolean z18, db2.u3 u3Var) {
        super(0);
        this.f332324d = m0Var;
        this.f332325e = i17;
        this.f332326f = gVar;
        this.f332327g = list;
        this.f332328h = z17;
        this.f332329i = aVar;
        this.f332330m = gVar2;
        this.f332331n = v3Var;
        this.f332332o = eVar;
        this.f332333p = z18;
        this.f332334q = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        boolean z17;
        eb2.m0 m0Var = this.f332324d;
        int i17 = m0Var.f332355g;
        int i18 = this.f332325e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f332326f;
        r45.qt2 qt2Var = m0Var.f332356h;
        java.util.List list = this.f332327g;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it.next()).getFeedObject().getFeedObject());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        boolean z18 = m0Var.f332363r.f338985l;
        boolean z19 = this.f332328h;
        int i19 = m0Var.f332360o;
        if (this.f332325e == 0) {
            eb2.f0 f0Var = m0Var.f332357i;
            if (f0Var != null && f0Var.f332286l) {
                z17 = true;
                db2.n3 n3Var = new db2.n3(i17, i18, gVar, qt2Var, arrayList, false, z18, z19, i19, z17, null, this.f332329i, this.f332330m);
                db2.v3 v3Var = this.f332331n;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar = this.f332332o;
                int i27 = this.f332325e;
                boolean z27 = this.f332333p;
                db2.u3 u3Var = this.f332334q;
                n3Var.e(new fb2.a(), 0);
                n3Var.e(new fb2.k(), 1);
                n3Var.e(new fb2.f(), 2);
                n3Var.e(new fb2.g(), 3);
                n3Var.e(new fb2.e(), 4);
                im5.c keeper = m0Var.f332358m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keeper, "keeper");
                n3Var.f309627v = keeper;
                n3Var.f309625t = new eb2.h0(m0Var, v3Var, eVar, i27, n3Var);
                n3Var.f309624s = new eb2.j0(i27, n3Var, m0Var, z27, u3Var);
                return n3Var;
            }
        }
        z17 = false;
        db2.n3 n3Var2 = new db2.n3(i17, i18, gVar, qt2Var, arrayList, false, z18, z19, i19, z17, null, this.f332329i, this.f332330m);
        db2.v3 v3Var2 = this.f332331n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar2 = this.f332332o;
        int i272 = this.f332325e;
        boolean z272 = this.f332333p;
        db2.u3 u3Var2 = this.f332334q;
        n3Var2.e(new fb2.a(), 0);
        n3Var2.e(new fb2.k(), 1);
        n3Var2.e(new fb2.f(), 2);
        n3Var2.e(new fb2.g(), 3);
        n3Var2.e(new fb2.e(), 4);
        im5.c keeper2 = m0Var.f332358m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keeper2, "keeper");
        n3Var2.f309627v = keeper2;
        n3Var2.f309625t = new eb2.h0(m0Var, v3Var2, eVar2, i272, n3Var2);
        n3Var2.f309624s = new eb2.j0(i272, n3Var2, m0Var, z272, u3Var2);
        return n3Var2;
    }
}
