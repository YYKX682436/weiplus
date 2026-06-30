package px1;

/* loaded from: classes12.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final px1.b f440393a;

    /* renamed from: b, reason: collision with root package name */
    public static final px1.s f440394b;

    /* renamed from: c, reason: collision with root package name */
    public static final px1.c f440395c;

    /* renamed from: d, reason: collision with root package name */
    public static final px1.j f440396d;

    /* renamed from: e, reason: collision with root package name */
    public static final px1.i f440397e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.ArrayList f440398f;

    static {
        px1.b bVar = new px1.b();
        f440393a = bVar;
        px1.s sVar = new px1.s();
        f440394b = sVar;
        px1.c cVar = new px1.c();
        f440395c = cVar;
        px1.j jVar = new px1.j();
        f440396d = jVar;
        f440397e = new px1.i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f440398f = arrayList;
        arrayList.add(bVar);
        arrayList.add(cVar);
        arrayList.add(jVar);
        arrayList.add(sVar);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, px1.m mVar, px1.u... uVarArr) {
        for (px1.u uVar : uVarArr) {
            if (mVar == uVar) {
                return;
            }
        }
        mVar.f(c13158x154ec45a, null, null);
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, px1.u... uVarArr) {
        a(c13158x154ec45a, f440397e, uVarArr);
        a(c13158x154ec45a, f440395c, uVarArr);
        a(c13158x154ec45a, f440396d, uVarArr);
        a(c13158x154ec45a, f440394b, uVarArr);
    }
}
