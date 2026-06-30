package p00;

/* loaded from: classes11.dex */
public final class c extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public final p00.a f431884n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f431885o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.SparseArray f431886p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f431887q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f431888r;

    /* renamed from: s, reason: collision with root package name */
    public int f431889s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, p00.a option) {
        super(abstractActivityC22312xbd689c47, list, z17, z18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        this.f431887q = new java.util.ArrayList();
        this.f431888r = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "create EcsGiftSelectContactAdapter");
        this.f431884n = option;
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(option.f431882c);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "onNotifyChange event = " + i17);
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "onNotifyChange obj is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(obj.toString());
        if (L == null || !L.r2()) {
            return;
        }
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int size = this.f431887q.size();
        android.util.SparseArray sparseArray = this.f431886p;
        return size + (sparseArray != null ? sparseArray.size() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar;
        android.util.SparseArray sparseArray = this.f431886p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray);
        boolean z17 = false;
        if (sparseArray.indexOfKey(i17) >= 0) {
            android.util.SparseArray sparseArray2 = this.f431886p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray2);
            java.lang.Object obj = sparseArray2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            o00.d dVar = new o00.d(i17);
            dVar.f423391y = (java.lang.String) obj;
            dVar.f288367c = false;
            if (i17 == 0 && this.f431889s > 0) {
                z17 = true;
            }
            dVar.f423392z = z17;
            uVar = dVar;
        } else {
            int i18 = i17;
            int i19 = 0;
            do {
                android.util.SparseArray sparseArray3 = this.f431886p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray3);
                if (i19 > sparseArray3.size()) {
                    break;
                }
                android.util.SparseArray sparseArray4 = this.f431886p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray4);
                if (sparseArray4.indexOfKey(i18) >= 0) {
                    i19++;
                }
                i18--;
            } while (i18 >= 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((p00.d) ((java.util.ArrayList) this.f431887q).get(i17 - i19)).f431891b;
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
            uVar2.f(z3Var);
            p00.a aVar = this.f431884n;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f431882c)) {
                uVar2.f288382r = aVar.f431882c;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
                uVar2.f288369e = false;
                uVar2.f288372h = false;
                uVar2.f288371g = false;
                uVar2.F = true;
            } else {
                uVar2.f288369e = this.f288611f;
                uVar2.f288372h = this.f288612g;
                uVar2.F = false;
            }
            uVar2.f288367c = false;
            uVar2.G = false;
            uVar = uVar2;
        }
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "finish!");
        this.f431887q.clear();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i17 = item.f288366b + 1;
        android.util.SparseArray sparseArray = this.f431886p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray);
        return sparseArray.indexOfKey(i17) >= 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "res data");
        ((java.util.ArrayList) this.f431887q).clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f431888r;
        arrayList.clear();
        java.util.HashMap hashMap = this.f431885o;
        if (hashMap != null) {
            hashMap.clear();
        } else {
            this.f431885o = new java.util.HashMap();
        }
        android.util.SparseArray sparseArray = this.f431886p;
        if (sparseArray != null) {
            sparseArray.clear();
        } else {
            this.f431886p = new android.util.SparseArray();
        }
        p00.a aVar = this.f431884n;
        boolean z17 = aVar.f431880a;
        java.lang.Object obj = this.f288609d;
        if (z17) {
            java.lang.String str = null;
            java.util.List O1 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f431881b) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(aVar.f431881b, ",") : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(O1)) {
                ((java.util.ArrayList) this.f431887q).clear();
            } else {
                int i17 = 1;
                if (O1 != null) {
                    ((java.util.ArrayList) this.f431887q).clear();
                    int size = O1.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) O1.get(i18), true);
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f431882c) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(aVar.f431882c) : null;
                        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                        ((qd0.u0) g1Var).getClass();
                        ((java.util.ArrayList) this.f431887q).add(new p00.d(si5.b.f489858a.c(0, n17, z07), n17));
                    }
                }
                if (((java.util.ArrayList) this.f431887q).size() > 0) {
                    kz5.g0.t(this.f431887q, p00.b.f431883d);
                    java.util.List S0 = kz5.n0.S0(this.f431887q);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    ((java.util.ArrayList) this.f431887q).clear();
                    int size2 = S0.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(((p00.d) S0.get(i19)).f431891b.d1())) {
                            ((java.util.ArrayList) this.f431887q).add(S0.get(i19));
                        } else {
                            arrayList2.add(S0.get(i19));
                        }
                    }
                    this.f431889s = ((java.util.ArrayList) this.f431887q).size();
                    this.f431887q = kz5.n0.V0(kz5.n0.t0(this.f431887q, arrayList2));
                }
                arrayList.add("🔍");
                if (this.f431889s > 0) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.content.Context");
                    java.lang.String string = ((android.content.Context) obj).getString(com.p314xaae8f345.mm.R.C30867xcad56011.neg);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    t(0, string);
                    arrayList.add("openIm");
                } else {
                    i17 = 0;
                }
                java.util.Iterator it = ((java.util.ArrayList) this.f431887q).iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    int i28 = i27 + 1;
                    p00.d dVar = (p00.d) it.next();
                    int i29 = this.f431889s;
                    if (i27 < i29) {
                        i27 = i28;
                    } else {
                        java.lang.String str2 = dVar.f431890a.f489861c;
                        if (i27 != i29 || str2 == null) {
                            if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) && str2 != null) {
                                t(i27 + i17, str2);
                                arrayList.add(str2);
                            }
                            i27 = i28;
                            str = str2;
                        } else {
                            t(i27 + i17, str2);
                            arrayList.add(str2);
                        }
                        i17++;
                        i27 = i28;
                        str = str2;
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI");
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10525x5dea5ff activityC10525x5dea5ff = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10525x5dea5ff) obj;
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            activityC10525x5dea5ff.E = strArr;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3 = activityC10525x5dea5ff.f287980e;
            if (c21465x84498b3 != null) {
                c21465x84498b3.m78861xe90b84f5(strArr);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "memberList:%d headerPosMap=%s", java.lang.Integer.valueOf(((java.util.ArrayList) this.f431887q).size()), java.lang.String.valueOf(this.f431885o));
        h();
        notifyDataSetChanged();
    }

    public final void t(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f431885o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap);
        hashMap.put(str, valueOf);
        android.util.SparseArray sparseArray = this.f431886p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray);
        sparseArray.put(i17, str);
    }
}
