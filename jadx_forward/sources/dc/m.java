package dc;

/* loaded from: classes16.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final ec.a f310187a;

    /* renamed from: c, reason: collision with root package name */
    public dc.h f310189c;

    /* renamed from: e, reason: collision with root package name */
    public int[] f310191e;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f310188b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final fc.l f310190d = new fc.l();

    /* renamed from: f, reason: collision with root package name */
    public long f310192f = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;

    static {
        new java.util.ArrayList();
    }

    public m(ec.a aVar) {
        this.f310187a = aVar;
        j(0, "default");
    }

    public final void a(dc.k kVar) {
        java.util.ArrayList arrayList = this.f310189c.f310153d;
        arrayList.size();
        kVar.getClass();
        arrayList.add(kVar);
        kVar.f310166f = this.f310189c;
    }

    public final dc.e b(long j17) {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f310188b;
            if (i17 >= arrayList.size()) {
                return null;
            }
            dc.e eVar = (dc.e) ((dc.h) arrayList.get(i17)).f310155f.n(j17);
            if (eVar != null) {
                return eVar;
            }
            i17++;
        }
    }

    public final dc.e c(java.lang.String str) {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f310188b;
            if (i17 >= arrayList.size()) {
                return null;
            }
            cc.a aVar = (cc.a) ((dc.h) arrayList.get(i17)).f310156g;
            java.util.Collection collection = (java.util.Collection) aVar.f121930g.get(str);
            if (collection == null) {
                collection = new java.util.ArrayList(((cc.v) aVar).f121936i);
            }
            java.util.List list = (java.util.List) aVar.c(str, collection);
            dc.e eVar = list.size() == 1 ? (dc.e) list.iterator().next() : null;
            if (eVar != null) {
                return eVar;
            }
            i17++;
        }
    }

    public final dc.j d(long j17) {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f310188b;
            if (i17 >= arrayList.size()) {
                return b(j17);
            }
            dc.j jVar = (dc.j) ((dc.h) arrayList.get(i17)).f310157h.n(j17);
            if (jVar != null) {
                return jVar;
            }
            i17++;
        }
    }

    public final dc.o e(int i17) {
        return (dc.o) this.f310189c.f310152c.get(i17);
    }

    public final dc.o f(int i17, int i18) {
        dc.o oVar = (dc.o) this.f310189c.f310152c.get(i17);
        if (oVar == null) {
            return oVar;
        }
        dc.o oVar2 = new dc.o();
        dc.o oVar3 = oVar.f310197a;
        if (oVar3 != null) {
            oVar2.f310197a = oVar3;
        } else {
            oVar2.f310197a = oVar;
        }
        return oVar2;
    }

    public final dc.p g(int i17) {
        return (dc.p) this.f310189c.f310154e.get(i17);
    }

    public void h() {
        dc.e c17 = c("java.lang.Class");
        int i17 = c17 != null ? c17.f310144p : 0;
        java.util.Iterator it = this.f310188b.iterator();
        while (it.hasNext()) {
            dc.h hVar = (dc.h) it.next();
            cc.r rVar = (cc.r) hVar.f310156g;
            java.util.Collection collection = rVar.f121934e;
            if (collection == null) {
                collection = new cc.t(rVar);
                rVar.f121934e = collection;
            }
            java.util.Iterator it6 = ((cc.t) collection).iterator();
            while (true) {
                cc.f fVar = (cc.f) it6;
                if (!fVar.hasNext()) {
                    break;
                }
                dc.e eVar = (dc.e) fVar.next();
                dc.e o17 = eVar.o();
                if (o17 != null) {
                    ((java.util.HashSet) o17.f310146r).add(eVar);
                }
                int i18 = i17;
                for (dc.f fVar2 : eVar.f310143o) {
                    i18 += this.f310191e[fVar2.f310147a.f310205d];
                }
                eVar.f310167g = i18;
            }
            fc.q qVar = hVar.f310157h;
            java.util.ArrayList arrayList = new java.util.ArrayList(qVar.f342433d);
            java.lang.Object[] objArr = qVar.f342456i;
            int length = objArr.length;
            while (true) {
                int i19 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (fc.q.r(objArr, i19)) {
                    java.lang.Object obj = objArr[i19];
                    if (obj == fc.s.f342460o) {
                        obj = null;
                    }
                    arrayList.add((dc.j) obj);
                }
                length = i19;
            }
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                dc.j jVar = (dc.j) it7.next();
                dc.e i27 = jVar.i();
                if (i27 != null) {
                    if (jVar instanceof dc.c) {
                        jVar.f310167g = i27.f310144p;
                    }
                    fc.n nVar = i27.f310145q;
                    int i28 = hVar.f310150a;
                    dc.d dVar = (dc.d) nVar.get(i28);
                    if (dVar == null) {
                        dVar = new dc.d();
                        nVar.r(i28, dVar);
                    }
                    ((java.util.ArrayList) dVar.f310138a).add(jVar);
                    jVar.j();
                }
            }
        }
    }

    public void i() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = this.f310188b;
            if (i17 >= arrayList2.size()) {
                break;
            }
            cc.a aVar = (cc.a) ((dc.h) arrayList2.get(i17)).f310156g;
            java.util.Collection collection = (java.util.Collection) aVar.f121930g.get("java.lang.ref.Reference");
            if (collection == null) {
                collection = new java.util.ArrayList(((cc.v) aVar).f121936i);
            }
            arrayList.addAll((java.util.List) aVar.c("java.lang.ref.Reference", collection));
            i17++;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dc.e eVar = (dc.e) it.next();
            eVar.getClass();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Stack stack = new java.util.Stack();
            stack.push(eVar);
            while (!stack.isEmpty()) {
                dc.e eVar2 = (dc.e) stack.pop();
                arrayList4.add(eVar2);
                java.util.Iterator it6 = ((java.util.HashSet) eVar2.f310146r).iterator();
                while (it6.hasNext()) {
                    stack.push((dc.e) it6.next());
                }
            }
            arrayList3.addAll(arrayList4);
        }
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            dc.e eVar3 = (dc.e) it7.next();
            eVar3.getClass();
            this.f310190d.add(eVar3);
        }
    }

    public dc.h j(int i17, java.lang.String str) {
        java.util.ArrayList arrayList;
        dc.h hVar;
        int i18 = 0;
        while (true) {
            arrayList = this.f310188b;
            if (i18 >= arrayList.size()) {
                hVar = null;
                break;
            }
            if (((dc.h) arrayList.get(i18)).f310150a == i17) {
                hVar = (dc.h) arrayList.get(i18);
                break;
            }
            i18++;
        }
        if (hVar == null) {
            hVar = new dc.h(i17, str);
            hVar.f310158i = this;
            arrayList.add(hVar);
        }
        this.f310189c = hVar;
        return hVar;
    }

    public final void k(int i17) {
        int i18 = -1;
        for (int i19 = 0; i19 < dc.q.m123906xcee59d22().length; i19++) {
            i18 = java.lang.Math.max(dc.q.m123906xcee59d22()[i19].f310205d, i18);
        }
        int[] iArr = new int[i18 + 1];
        this.f310191e = iArr;
        java.util.Arrays.fill(iArr, -1);
        for (int i27 = 0; i27 < dc.q.m123906xcee59d22().length; i27++) {
            this.f310191e[dc.q.m123906xcee59d22()[i27].f310205d] = dc.q.m123906xcee59d22()[i27].f310206e;
        }
        int[] iArr2 = this.f310191e;
        dc.q qVar = dc.q.OBJECT;
        iArr2[2] = i17;
        this.f310192f = (-1) >>> ((8 - i17) << 3);
    }
}
