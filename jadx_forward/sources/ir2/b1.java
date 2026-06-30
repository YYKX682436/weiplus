package ir2;

/* loaded from: classes2.dex */
public final class b1 implements ir2.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f375645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ir2.c1 f375646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f375647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c f375648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f375649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f375650f;

    public b1(java.util.ArrayList arrayList, ir2.c1 c1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c cVar, android.content.Intent intent, yz5.a aVar) {
        this.f375645a = arrayList;
        this.f375646b = c1Var;
        this.f375647c = i17;
        this.f375648d = cVar;
        this.f375649e = intent;
        this.f375650f = aVar;
    }

    @Override // ir2.u
    public void a(java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f375645a.addAll(dataList);
        java.util.ArrayList arrayList = this.f375645a;
        ir2.c1 c1Var = this.f375646b;
        c1Var.f375654b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList, c1Var.f375654b.f190023a, this.f375647c, this.f375648d, null, 16, null), this.f375649e);
        yz5.a aVar = this.f375650f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
