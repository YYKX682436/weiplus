package cp4;

/* loaded from: classes10.dex */
public final class r extends yt3.a implements bp4.b0, bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f302591f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f302592g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f302593h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f302594i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f302595m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f302596n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f302597o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f302598p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f302599q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f302600r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f302601s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f302602t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f302603u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f302604v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f302605w;

    /* renamed from: x, reason: collision with root package name */
    public int f302606x;

    /* renamed from: y, reason: collision with root package name */
    public int f302607y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.r f302608z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 previewHolder, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 editHolder, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewHolder, "previewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editHolder, "editHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f302591f = previewHolder;
        this.f302592g = editHolder;
        android.content.Context context = parent.getContext();
        this.f302593h = context;
        this.f302594i = parent.findViewById(com.p314xaae8f345.mm.R.id.d7d);
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.p314xaae8f345.mm.R.id.d7c);
        this.f302595m = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) parent.findViewById(com.p314xaae8f345.mm.R.id.d7e);
        this.f302596n = imageView2;
        this.f302597o = jz5.h.b(new cp4.g(this));
        this.f302598p = jz5.h.b(new cp4.f(this));
        this.f302599q = kz5.c0.i(new java.util.HashMap(), new java.util.HashMap());
        this.f302600r = kz5.c0.i(new java.util.ArrayList(), new java.util.ArrayList());
        this.f302601s = kz5.c0.i(new java.util.ArrayList(), new java.util.ArrayList());
        this.f302602t = kz5.c0.i(new java.util.HashSet(), new java.util.HashSet());
        this.f302603u = kz5.c0.i(new zu3.d(zu3.e.f557334m), new zu3.d(zu3.e.f557335n));
        this.f302605w = new java.lang.Object();
        this.f302608z = new cp4.e(this);
        parent.setVisibility(0);
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79661xf633afce, -1));
        imageView2.setImageDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80881x4db40400));
        imageView.setOnClickListener(new cp4.d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024f  */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v46, types: [gp.c] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14, types: [gp.c] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(cp4.r r18, int r19) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp4.r.z(cp4.r, int):void");
    }

    public final void A(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (!com.p314xaae8f345.mm.vfs.w6.j(path)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorCaptionPlugin", "file not exist ".concat(path));
            return;
        }
        java.util.List list = this.f302599q;
        if (((java.util.HashMap) list.get(0)).get(path) == null) {
            ((java.util.Map) list.get(0)).put(path, new cp4.b());
        }
    }

    public final void B(int i17) {
        cp4.g1 D = D();
        int i18 = cp4.g1.f302536J;
        D.i(i17, null);
        this.f302596n.setVisibility(4);
    }

    public final cp4.z C() {
        return (cp4.z) ((jz5.n) this.f302598p).mo141623x754a37bb();
    }

    public final cp4.g1 D() {
        return (cp4.g1) ((jz5.n) this.f302597o).mo141623x754a37bb();
    }

    public final java.util.ArrayList E(int i17) {
        java.util.List list = this.f302601s;
        ((java.util.ArrayList) list.get(i17)).clear();
        long j17 = 0;
        for (bv3.a aVar : (java.lang.Iterable) this.f302600r.get(i17)) {
            cp4.b bVar = (cp4.b) ((java.util.HashMap) this.f302599q.get(i17)).get(aVar.f106253a);
            float f17 = aVar.f106256d;
            long j18 = aVar.f106255c;
            long j19 = aVar.f106254b;
            if (bVar != null) {
                int size = bVar.f302509g.size();
                java.lang.String str = aVar.f106253a;
                if (size != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorCaptionPlugin", "set translate caption. path:" + str);
                    for (r45.is isVar : bVar.f302509g) {
                        if (isVar.f458832f >= j19 && isVar.f458831e <= j18) {
                            r45.is isVar2 = new r45.is();
                            isVar2.f458834h = isVar.f458834h;
                            isVar2.f458830d = isVar.f458830d;
                            isVar2.f458831e = ((int) (((float) (isVar.f458831e - j19)) / f17)) + j17;
                            isVar2.f458832f = ((int) (((float) (isVar.f458832f - j19)) / f17)) + j17;
                            ((java.util.ArrayList) list.get(i17)).add(isVar2);
                        }
                    }
                } else if (bVar.f302516q == 0 && bVar.f302515p) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorCaptionPlugin", "set default caption. path:" + str);
                    r45.is isVar3 = new r45.is();
                    isVar3.f458834h = -1L;
                    java.lang.String r17 = i65.a.r(this.f302593h, com.p314xaae8f345.mm.R.C30867xcad56011.k6l);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
                    byte[] bytes = r17.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    isVar3.f458830d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
                    isVar3.f458831e = ((int) (((float) j19) / f17)) + j17;
                    isVar3.f458832f = ((int) (((float) j18) / f17)) + j17;
                    isVar3.f458833g = true;
                    ((java.util.ArrayList) list.get(i17)).add(isVar3);
                }
            }
            j17 += (int) (((float) (j18 - j19)) / f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorCaptionPlugin", "type:" + i17 + ", scriptTransResult size:" + ((java.util.ArrayList) list.get(i17)).size());
        return (java.util.ArrayList) list.get(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[LOOP:1: B:18:0x005c->B:28:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String F() {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp4.r.F():java.lang.String");
    }

    public final void G(int i17) {
        boolean z17;
        java.lang.Object obj;
        java.util.List list = this.f302603u;
        java.util.ArrayList arrayList = new java.util.ArrayList(((zu3.d) list.get(i17)).f557325g);
        java.util.List list2 = this.f302601s;
        java.lang.Iterable iterable = (java.lang.Iterable) list2.get(i17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.is isVar = (r45.is) it.next();
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (((r45.is) obj).f458834h == isVar.f458834h) {
                        break;
                    }
                }
            }
            r45.is isVar2 = (r45.is) obj;
            if (isVar2 != null) {
                isVar.f458830d = isVar2.f458830d;
            }
            arrayList2.add(isVar);
        }
        java.util.Iterator it7 = ((java.lang.Iterable) list2.get(i17)).iterator();
        while (it7.hasNext()) {
            if (!((r45.is) it7.next()).f458833g) {
                cp4.g1 D = D();
                D.getClass();
                java.util.List list3 = D.A;
                ((cp4.k0) list3.get(i17)).f302576f.clear();
                r45.is isVar3 = new r45.is();
                isVar3.f458831e = -2L;
                isVar3.f458832f = -1L;
                ((cp4.k0) list3.get(i17)).f302576f.add(isVar3);
                ((cp4.k0) list3.get(i17)).f302576f.add(isVar3);
                ((cp4.k0) list3.get(i17)).f302576f.addAll(arrayList2);
                r45.is isVar4 = new r45.is();
                isVar4.f458831e = 2147483645L;
                isVar4.f458832f = 2147483646L;
                ((cp4.k0) list3.get(i17)).f302576f.add(isVar4);
                ((cp4.k0) list3.get(i17)).f302576f.add(isVar4);
                ((cp4.k0) D().A.get(i17)).m8146xced61ae5();
                z17 = true;
            }
        }
        ((zu3.d) list.get(i17)).f557325g.clear();
        ((zu3.d) list.get(i17)).f557325g.addAll(arrayList2);
        if (this.f302596n.getVisibility() == 0) {
            if (z17) {
                D().k(i17);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_1_INT", i17);
            bundle.putByteArray("PARAM_1_BYTEARRAY", ((zu3.d) list.get(i17)).mo179488xc3d7db06().mo14344x5f01b1f6());
            this.f546865d.w(ju3.c0.f383433r2, bundle);
        }
    }

    public final void H(byte[] transResult) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transResult, "transResult");
        try {
            r45.is isVar = new r45.is();
            try {
                isVar.mo11468x92b714fd(transResult);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                isVar = null;
            }
            if (isVar != null) {
                int i17 = 0;
                for (java.lang.Object obj2 : this.f302603u) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.Iterator it = ((zu3.d) obj2).f557325g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((r45.is) obj).f458834h == isVar.f458834h) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    r45.is isVar2 = (r45.is) obj;
                    if (isVar2 != null) {
                        I(i17, isVar2);
                    }
                    i17 = i18;
                }
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditorCaptionPlugin", e18, "", new java.lang.Object[0]);
        }
    }

    public final void I(int i17, r45.is transResult) {
        C().f302629d = i17;
        cp4.z C = C();
        C.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transResult, "transResult");
        C.f302636n = 0;
        long j17 = transResult.f458831e;
        java.util.Iterator it = C.f302631f.f302623e.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((r45.is) next).f458831e == j17) {
                C.f302635m = i18;
            }
            i18 = i19;
        }
        int i27 = C.f302635m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorEditCaptionView", "scrollToTimeMs " + transResult.f458831e + ' ' + C.f302635m);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = C.f302630e.getLayoutManager();
        if (layoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView", "selectCaption", "(Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView", "selectCaption", "(Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        ((ku5.t0) ku5.t0.f394148d).E(C.f302637o, 0L);
        C().f302631f.f302623e.clear();
        cp4.z C2 = C();
        java.util.List items = (java.util.List) this.f302601s.get(i17);
        C2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        C2.f302631f.f302623e.addAll(items);
        C().f302631f.m8146xced61ae5();
        C().f302632g.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f302592g;
        if (!(c17043x8103c103.f237545h != null)) {
            c17043x8103c103.m68233x42b83fb3(true);
            if (!(C().f302633h != null)) {
                C().m122421xce495a40(new cp4.n(this));
                C().m122422x251ba805(new cp4.o(this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103.k(c17043x8103c103, C(), null, 2, null);
            c17043x8103c103.m68234x466a35c6(new cp4.p(this));
        }
        c17043x8103c103.m68236x76500a7f(true);
    }

    public final void J(byte[] transResult, int i17, int i18, java.lang.String str) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transResult, "transResult");
        try {
            r45.is isVar = new r45.is();
            try {
                isVar.mo11468x92b714fd(transResult);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                isVar = null;
            }
            if (isVar != null) {
                int i19 = 0;
                for (java.lang.Object obj2 : this.f302603u) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    zu3.d dVar = (zu3.d) obj2;
                    java.util.Iterator it = dVar.f557325g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((r45.is) obj).f458834h == isVar.f458834h) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    r45.is isVar2 = (r45.is) obj;
                    if (isVar2 != null) {
                        D().m(i19, isVar);
                        dVar.f557326h = i17;
                        dVar.f557327i = i18;
                        dVar.f557328j = str;
                        isVar2.f458830d = isVar.f458830d;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("PARAM_1_INT", i19);
                        bundle.putByteArray("PARAM_1_BYTEARRAY", dVar.mo179488xc3d7db06().mo14344x5f01b1f6());
                        this.f546865d.w(ju3.c0.f383433r2, bundle);
                    }
                    i19 = i27;
                }
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditorCaptionPlugin", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // bp4.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17) {
        java.util.List list = this.f302600r;
        ((java.util.ArrayList) list.get(0)).clear();
        if (h1Var != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var : h1Var.m()) {
                java.lang.String str = i1Var.f257149a;
                rm5.j jVar = i1Var.f257160l;
                bv3.a aVar = new bv3.a(str, jVar.f479037f, jVar.f479038g, jVar.f479039h);
                ((java.util.ArrayList) list.get(0)).add(aVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorCaptionPlugin", "update script:" + aVar);
            }
        }
        if (this.f302604v) {
            E(0);
            G(0);
        }
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f302604v) {
            D().j(0, j17);
            D().j(1, j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        C().f302632g.f291933e = null;
        java.util.Iterator it = this.f302599q.iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.HashMap) it.next()).entrySet().iterator();
            while (it6.hasNext()) {
                cp4.b bVar = (cp4.b) ((java.util.Map.Entry) it6.next()).getValue();
                bVar.getClass();
                gm0.j1.n().f354821b.q(3835, bVar);
                try {
                    bVar.f302520u = true;
                    gp.c cVar = bVar.f302508f;
                    if (cVar != null) {
                        cVar.g();
                    }
                    bVar.f302508f = null;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditCaptionDataManager", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f302606x = 0;
        this.f302607y = 0;
        this.f302596n.setVisibility(4);
        this.f302604v = false;
        java.util.Iterator it = this.f302603u.iterator();
        while (it.hasNext()) {
            ((zu3.d) it.next()).f557325g.clear();
        }
        java.util.Iterator it6 = this.f302599q.iterator();
        while (it6.hasNext()) {
            ((java.util.HashMap) it6.next()).clear();
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View view = this.f302594i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        java.util.ArrayList parcelableArrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        android.os.Bundle bundle = configProvider.M;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("media_list")) == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : parcelableArrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
            if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
                java.lang.String mOriginalPath = abstractC15633xee433078.f219963e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mOriginalPath, "mOriginalPath");
                A(mOriginalPath);
            }
            i17 = i18;
        }
    }
}
