package xx0;

/* loaded from: classes5.dex */
public final class i implements com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f539436a;

    /* renamed from: b, reason: collision with root package name */
    public final vt3.n f539437b;

    /* renamed from: c, reason: collision with root package name */
    public final vt3.r f539438c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f539439d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.p3 f539440e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f539441f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f539442g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f539443h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f539444i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f539445j;

    public i(int i17, vt3.n followContext, vt3.r defaultTabItem, java.util.List defaultTabTemplateList, mx0.p3 p3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followContext, "followContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTabItem, "defaultTabItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTabTemplateList, "defaultTabTemplateList");
        this.f539436a = i17;
        this.f539437b = followContext;
        this.f539438c = defaultTabItem;
        this.f539439d = defaultTabTemplateList;
        this.f539440e = p3Var;
        this.f539441f = new java.lang.Object();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(java.lang.Long.valueOf(defaultTabItem.f521572a), this.f539439d);
        this.f539442g = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (vt3.p pVar : this.f539439d) {
            linkedHashMap2.put(pVar.f521553b, pVar);
        }
        this.f539443h = linkedHashMap2;
        this.f539444i = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(vt3.r r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.i.a(vt3.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xx0.e
            if (r0 == 0) goto L13
            r0 = r8
            xx0.e r0 = (xx0.e) r0
            int r1 = r0.f539420f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f539420f = r1
            goto L18
        L13:
            xx0.e r0 = new xx0.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f539418d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f539420f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L5b
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Class<e42.e0> r8 = e42.e0.class
            i95.m r8 = i95.n0.c(r8)
            e42.e0 r8 = (e42.e0) r8
            e42.c0 r2 = e42.c0.clicfg_finder_maas_shoot_fav_template_enabled
            r5 = 0
            h62.d r8 = (h62.d) r8
            int r8 = r8.Ni(r2, r5)
            vt3.n r2 = r6.f539437b
            int r5 = r6.f539436a
            if (r8 != r4) goto L5c
            us2.u r8 = us2.u.f512081a
            r0.f539420f = r4
            java.lang.Object r8 = r8.j(r5, r2, r7, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            return r8
        L5c:
            us2.u r8 = us2.u.f512081a
            r0.f539420f = r3
            java.lang.Object r8 = r8.j(r5, r2, r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L72:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r8.next()
            r1 = r0
            vt3.r r1 = (vt3.r) r1
            boolean r1 = r1.f521575d
            r1 = r1 ^ r4
            if (r1 == 0) goto L72
            r7.add(r0)
            goto L72
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.i.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(vt3.r r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.i.c(vt3.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider
    /* renamed from: onRequestTemplateMetadata */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586 mo9344x9a8f6999(java.lang.String templateID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        synchronized (this.f539441f) {
            vt3.p pVar = (vt3.p) ((java.util.LinkedHashMap) this.f539443h).get(templateID);
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MoreTemplateDataProvider", "onRequestTemplateMetadata >> no find ".concat(templateID));
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreTemplateDataProvider", "onRequestTemplateMetadata >> find it");
            return new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586(pVar.f521553b, pVar.f521556e, pVar.f521555d, 0L, 0L);
        }
    }
}
