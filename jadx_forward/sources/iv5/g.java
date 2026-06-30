package iv5;

/* loaded from: classes16.dex */
public class g extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.y f376684d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.n0 f376685e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.u f376686f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f376687g;

    public g(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376684d = null;
        this.f376685e = null;
        this.f376686f = null;
        this.f376687g = null;
        if (yVar2 != null) {
            this.f376684d = yVar2;
            av5.n0 n0Var = yVar2.f95995a.f95963g;
            this.f376685e = n0Var;
            this.f376686f = yVar2.d(n0Var);
            this.f376687g = new java.util.ArrayList(512);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        int i17;
        int i18;
        int i19;
        int i27;
        av5.i iVar = (av5.i) comparable;
        fVar.getClass();
        int g17 = fVar.g(iVar.f95918e);
        int g18 = fVar.g(iVar.f95920g);
        kv5.i iVar2 = (kv5.i) fVar;
        fv5.b bVar = iVar2.f394300h;
        int i28 = iVar.f95921h;
        int d17 = bVar.d(i28);
        if (d17 < 0) {
            if (i28 >= 0 && iVar2.f394316x.a(i28)) {
                i28 = -1;
            }
            i17 = i28;
        } else {
            i17 = bVar.f348555e[d17];
        }
        int f17 = fVar.f(iVar.f95922i);
        fv5.b bVar2 = iVar2.f394304l;
        int i29 = iVar.f95923m;
        int d18 = bVar2.d(i29);
        if (d18 < 0) {
            if (i29 >= 0 && iVar2.B.a(i29)) {
                i29 = -1;
            }
            i18 = i29;
        } else {
            i18 = bVar2.f348555e[d18];
        }
        fv5.b bVar3 = iVar2.f394306n;
        int i37 = iVar.f95924n;
        int d19 = bVar3.d(i37);
        if (d19 < 0) {
            if (i37 >= 0 && iVar2.D.a(i37)) {
                i37 = -1;
            }
            i19 = i37;
        } else {
            i19 = bVar3.f348555e[d19];
        }
        fv5.b bVar4 = iVar2.f394305m;
        int i38 = iVar.f95925o;
        int d27 = bVar4.d(i38);
        if (d27 < 0) {
            i27 = (i38 < 0 || !iVar2.C.a(i38)) ? i38 : -1;
        } else {
            i27 = bVar4.f348555e[d27];
        }
        return new av5.i(iVar.f95950d, g17, iVar.f95919f, g18, i17, f17, i18, i19, i27);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95963g;
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.h();
    }

    @Override // iv5.j
    public void f() {
        int i17;
        short[] sArr;
        java.util.List<av5.i> list = this.f376687g;
        java.util.HashMap hashMap = new java.util.HashMap(list.size() + 8);
        java.util.HashMap hashMap2 = new java.util.HashMap(list.size() + 8);
        fv5.b bVar = new fv5.b(list.size() + 8);
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            av5.i iVar = (av5.i) it.next();
            hashMap.put(java.lang.Integer.valueOf(iVar.f95918e), iVar);
            int i18 = iVar.f95918e;
            hashMap2.put(java.lang.Integer.valueOf(i18), new java.util.ArrayList(8));
            bVar.f(i18, 0);
        }
        for (av5.i iVar2 : list) {
            boolean containsKey = hashMap.containsKey(java.lang.Integer.valueOf(iVar2.f95920g));
            int i19 = iVar2.f95918e;
            if (containsKey) {
                ((java.util.List) hashMap2.get(java.lang.Integer.valueOf(iVar2.f95920g))).add(java.lang.Integer.valueOf(i19));
                bVar.f(i19, bVar.c(i19) + 1);
            }
            av5.y yVar = this.f376684d;
            yVar.getClass();
            int i27 = iVar2.f95921h;
            if (i27 == 0) {
                sArr = av5.y.f95994e;
            } else {
                int i28 = yVar.f95997c.getInt(i27);
                if (i28 <= 0) {
                    throw new java.lang.AssertionError("Unexpected interfaces list size: " + i28);
                }
                int i29 = i27 + 4;
                short[] sArr2 = new short[i28];
                for (int i37 = 0; i37 < i28; i37++) {
                    sArr2[i37] = yVar.f95997c.getShort(i29);
                    i29 += 2;
                }
                sArr = sArr2;
            }
            for (short s17 : sArr) {
                if (hashMap.containsKey(java.lang.Integer.valueOf(s17))) {
                    ((java.util.List) hashMap2.get(java.lang.Integer.valueOf(s17))).add(java.lang.Integer.valueOf(i19));
                    bVar.f(i19, bVar.c(i19) + 1);
                }
            }
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(64);
        for (i17 = 0; i17 < bVar.f348556f; i17++) {
            int i38 = bVar.f348554d[i17];
            if (bVar.f348555e[i17] == 0) {
                arrayDeque.offer(java.lang.Integer.valueOf(i38));
            }
        }
        java.util.ArrayList<av5.i> arrayList = new java.util.ArrayList();
        while (!arrayDeque.isEmpty()) {
            int intValue = ((java.lang.Integer) arrayDeque.poll()).intValue();
            arrayList.add(hashMap.get(java.lang.Integer.valueOf(intValue)));
            java.util.Iterator it6 = ((java.util.List) hashMap2.get(java.lang.Integer.valueOf(intValue))).iterator();
            while (it6.hasNext()) {
                int intValue2 = ((java.lang.Integer) it6.next()).intValue();
                int c17 = bVar.c(intValue2) - 1;
                bVar.f(intValue2, c17);
                if (c17 == 0) {
                    arrayDeque.offer(java.lang.Integer.valueOf(intValue2));
                }
            }
        }
        if (arrayList.size() != list.size()) {
            throw new java.lang.IllegalStateException("Illegal dex format, there's at least one loop in class inheritance graph.");
        }
        this.f376687g = arrayList;
        for (av5.i iVar3 : arrayList) {
            av5.u uVar = this.f376686f;
            uVar.A(uVar.f95990f.f95995a.f95963g, true);
            uVar.f106295a.position();
            uVar.w(iVar3.f95918e);
            uVar.w(iVar3.f95919f);
            uVar.w(iVar3.f95920g);
            uVar.w(iVar3.f95921h);
            uVar.w(iVar3.f95922i);
            uVar.w(iVar3.f95923m);
            uVar.w(iVar3.f95924n);
            uVar.w(iVar3.f95925o);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        this.f376685e.f95953f++;
        this.f376687g.add((av5.i) comparable);
        return 0;
    }
}
