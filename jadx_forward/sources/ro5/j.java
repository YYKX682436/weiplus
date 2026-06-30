package ro5;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f479747a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f479748b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f479749c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f479750d;

    /* renamed from: e, reason: collision with root package name */
    public int f479751e;

    /* renamed from: f, reason: collision with root package name */
    public ro5.f f479752f;

    /* renamed from: g, reason: collision with root package name */
    public int f479753g;

    public j(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 textureRegistry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRegistry, "textureRegistry");
        this.f479747a = textureRegistry;
        this.f479748b = new android.util.SparseArray();
        this.f479749c = new android.util.SparseArray();
        this.f479750d = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ro5.c a(int r36) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.j.a(int):ro5.c");
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "release All");
        android.util.SparseArray sparseArray = this.f479748b;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            int keyAt = sparseArray.keyAt(i17);
            ro5.a target = (ro5.a) sparseArray.valueAt(i17);
            ro5.f fVar = this.f479752f;
            if (fVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
                ro5.m1 m1Var = ((ro5.r) fVar).f479820a.f479678b;
                if (m1Var != null) {
                    m1Var.f(keyAt, target);
                }
            }
            com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d;
            if (c22889xa2f9dd79 != null) {
                android.view.Surface mo138084xcf572877 = target.f479661d.mo138084xcf572877();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo138084xcf572877, "getSurface(...)");
                c22889xa2f9dd79.m82961x5325f4d1(mo138084xcf572877);
            }
            target.f479661d.mo138094x41012807();
        }
        sparseArray.clear();
        android.util.SparseArray sparseArray2 = this.f479749c;
        int size2 = sparseArray2.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size2; i19++) {
            int keyAt2 = sparseArray2.keyAt(i19);
            if (this.f479750d.get(java.lang.Integer.valueOf(keyAt2)) == null) {
                if (keyAt2 == this.f479751e) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 27L, 1L);
                    this.f479753g |= 1;
                } else {
                    i18++;
                }
            }
        }
        if (i18 > 0) {
            ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 28L, i18);
            this.f479753g |= 2;
        }
        sparseArray.clear();
        this.f479751e = 0;
    }

    public final long c(int i17, int i18, int i19) {
        ro5.a aVar = (ro5.a) this.f479748b.get(i17);
        if (aVar == null) {
            return 0L;
        }
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d;
        android.view.Surface surface = aVar.f479662e;
        if (c22889xa2f9dd79 != null) {
            c22889xa2f9dd79.m82961x5325f4d1(surface);
        }
        aVar.a(i18, i19);
        android.view.Surface mo138084xcf572877 = aVar.f479661d.mo138084xcf572877();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo138084xcf572877, "getSurface(...)");
        aVar.f479662e = mo138084xcf572877;
        aVar.f479663f = c22889xa2f9dd79 != null ? c22889xa2f9dd79.m82960x88d6288a(mo138084xcf572877) : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "setTextureSize memberId: " + i17 + ", width: " + i18 + ", height: " + i19 + ", new surfacePtr: " + aVar.f479663f);
        android.util.SparseArray sparseArray = this.f479749c;
        ro5.e eVar = (ro5.e) sparseArray.get(i17);
        if (eVar != null) {
            int i27 = eVar.f479714a;
            int i28 = eVar.f479717d;
            boolean z17 = eVar.f479718e;
            sparseArray.put(i17, new ro5.e(i27, i18, i19, i28, z17));
            d(i17, i18, i19, i28, z17, true);
        }
        return aVar.f479663f;
    }

    public final void d(int i17, int i18, int i19, int i27, boolean z17, boolean z18) {
        int i28;
        android.util.SparseArray sparseArray = this.f479749c;
        ro5.e eVar = (ro5.e) sparseArray.get(i17);
        if (eVar == null) {
            sparseArray.put(i17, new ro5.e(i17, i18, i19, i27, z17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "onUpdate() initial called with: memberId = " + i17 + ", width = " + i18 + ", height = " + i19 + ", rotate = " + i27);
        } else {
            if (i18 == eVar.f479715b && i19 == eVar.f479716c && i27 == eVar.f479717d) {
                if (z17 == eVar.f479718e && !z18) {
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "onUpdate() update called with: memberId = " + i17 + ", width = " + i18 + ", height = " + i19 + ", rotate = " + i27);
            sparseArray.put(i17, new ro5.e(i17, i18, i19, i27, z17));
        }
        android.util.SparseArray sparseArray2 = this.f479748b;
        if (sparseArray2.indexOfKey(i17) >= 0) {
            ro5.a aVar = (ro5.a) sparseArray2.get(i17);
            if (aVar != null) {
                if (!((aVar.f479665h.getWidth() == i18 && aVar.f479665h.getHeight() == i19) ? false : true)) {
                    aVar = null;
                }
                if (aVar != null) {
                    java.lang.Object obj = sparseArray.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    ro5.e eVar2 = (ro5.e) obj;
                    aVar.a(eVar2.f479715b, eVar2.f479716c);
                }
            }
            er4.w wVar = new er4.w();
            wVar.f(((ro5.a) sparseArray2.get(i17)).f479661d.id());
            wVar.e(((ro5.e) sparseArray.get(i17)) != null ? r5.f479717d : 0L);
            ro5.e eVar3 = (ro5.e) sparseArray.get(i17);
            wVar.d((eVar3 == null || (i28 = eVar3.f479716c) == 0) ? 1.0d : eVar3.f479715b / i28);
            wVar.g(((ro5.e) sparseArray.get(i17)) != null ? r5.f479715b : 0.0d);
            wVar.b(((ro5.e) sparseArray.get(i17)) != null ? r5.f479716c : 0.0d);
            ro5.e eVar4 = (ro5.e) sparseArray.get(i17);
            wVar.c(eVar4 != null ? eVar4.f479718e : false);
            wVar.f337726m = ((ro5.a) sparseArray2.get(i17)).f479663f;
            wVar.f337727n[7] = true;
            this.f479750d.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.G(i17, wVar, true, ro5.i.f479740a);
        }
    }
}
