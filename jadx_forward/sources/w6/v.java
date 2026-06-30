package w6;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f524769a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f524770b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.e f524771c;

    /* renamed from: d, reason: collision with root package name */
    public final m3.e f524772d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524773e;

    public v(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.util.List list, i7.e eVar, m3.e eVar2) {
        this.f524769a = cls;
        this.f524770b = list;
        this.f524771c = eVar;
        this.f524772d = eVar2;
        this.f524773e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public w6.z0 a(u6.g gVar, int i17, int i18, t6.l lVar, w6.u uVar) {
        w6.z0 z0Var;
        t6.p pVar;
        t6.c cVar;
        boolean z17;
        t6.h hVar;
        m3.e eVar = this.f524772d;
        java.lang.Object a17 = eVar.a();
        q7.n.b(a17);
        java.util.List list = (java.util.List) a17;
        try {
            w6.z0 b17 = b(gVar, i17, i18, lVar, list);
            eVar.b(list);
            w6.n nVar = (w6.n) uVar;
            w6.t tVar = nVar.f524706b;
            tVar.getClass();
            java.lang.Class<?> cls = b17.get().getClass();
            t6.a aVar = t6.a.RESOURCE_DISK_CACHE;
            t6.a aVar2 = nVar.f524705a;
            w6.l lVar2 = tVar.f524743d;
            t6.o oVar = null;
            if (aVar2 != aVar) {
                t6.p e17 = lVar2.e(cls);
                z0Var = e17.a(tVar.f524750n, b17, tVar.f524754r, tVar.f524755s);
                pVar = e17;
            } else {
                z0Var = b17;
                pVar = null;
            }
            if (!b17.equals(z0Var)) {
                b17.mo14474x408b7293();
            }
            if (lVar2.f524668c.f125479b.f125495d.a(z0Var.a()) != null) {
                com.p147xb1cd08cc.p148x5de23a5.m mVar = lVar2.f524668c.f125479b;
                mVar.getClass();
                oVar = mVar.f125495d.a(z0Var.a());
                if (oVar == null) {
                    throw new com.p147xb1cd08cc.p148x5de23a5.k(z0Var.a());
                }
                cVar = oVar.a(tVar.f524757u);
            } else {
                cVar = t6.c.NONE;
            }
            t6.h hVar2 = tVar.D;
            java.util.ArrayList arrayList = (java.util.ArrayList) lVar2.b();
            int size = arrayList.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    z17 = false;
                    break;
                }
                if (((a7.o0) arrayList.get(i19)).f83379a.mo743xb2c87fbf(hVar2)) {
                    z17 = true;
                    break;
                }
                i19++;
            }
            if (tVar.f524756t.d(!z17, aVar2, cVar)) {
                if (oVar == null) {
                    throw new com.p147xb1cd08cc.p148x5de23a5.k(z0Var.get().getClass());
                }
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    hVar = new w6.h(tVar.D, tVar.f524751o);
                } else {
                    if (ordinal != 1) {
                        throw new java.lang.IllegalArgumentException("Unknown strategy: " + cVar);
                    }
                    hVar = new w6.b1(lVar2.f524668c.f125478a, tVar.D, tVar.f524751o, tVar.f524754r, tVar.f524755s, pVar, cls, tVar.f524757u);
                }
                w6.y0 y0Var = (w6.y0) ((r7.e) w6.y0.f524779h).a();
                q7.n.b(y0Var);
                y0Var.f524783g = false;
                y0Var.f524782f = true;
                y0Var.f524781e = z0Var;
                w6.o oVar2 = tVar.f524748i;
                oVar2.f524707a = hVar;
                oVar2.f524708b = oVar;
                oVar2.f524709c = y0Var;
                z0Var = y0Var;
            }
            return this.f524771c.a(z0Var, lVar);
        } catch (java.lang.Throwable th6) {
            eVar.b(list);
            throw th6;
        }
    }

    public final w6.z0 b(u6.g gVar, int i17, int i18, t6.l lVar, java.util.List list) {
        java.util.List list2 = this.f524770b;
        int size = list2.size();
        w6.z0 z0Var = null;
        for (int i19 = 0; i19 < size; i19++) {
            t6.n nVar = (t6.n) list2.get(i19);
            try {
                if (nVar.b(gVar.a(), lVar)) {
                    z0Var = nVar.a(gVar.a(), i17, i18, lVar);
                }
            } catch (java.io.IOException | java.lang.OutOfMemoryError | java.lang.RuntimeException e17) {
                if (android.util.Log.isLoggable("DecodePath", 2)) {
                    java.util.Objects.toString(nVar);
                }
                list.add(e17);
            }
            if (z0Var != null) {
                break;
            }
        }
        if (z0Var != null) {
            return z0Var;
        }
        throw new w6.t0(this.f524773e, new java.util.ArrayList(list));
    }

    /* renamed from: toString */
    public java.lang.String m173251x9616526c() {
        return "DecodePath{ dataClass=" + this.f524769a + ", decoders=" + this.f524770b + ", transcoder=" + this.f524771c + '}';
    }
}
