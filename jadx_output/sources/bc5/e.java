package bc5;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f19185a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f19186b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f19187c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f19188d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f19189e;

    /* renamed from: f, reason: collision with root package name */
    public final java.text.SimpleDateFormat f19190f;

    /* renamed from: g, reason: collision with root package name */
    public final java.text.SimpleDateFormat f19191g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19192h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f19193i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f19194j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f19195k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f19196l;

    public e(android.content.Context context, java.util.List selectItems, com.tencent.mm.storage.z3 z3Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(selectItems, "selectItems");
        this.f19185a = context;
        this.f19186b = selectItems;
        this.f19187c = z3Var;
        this.f19188d = "MicroMsg.MsgListExporter";
        this.f19189e = "%s: %s\n";
        this.f19190f = new java.text.SimpleDateFormat(com.tencent.mm.sdk.platformtools.m2.j() ? "yyyy年MM月dd日 HH:mm" : "yyyy/MM/dd HH:mm");
        this.f19191g = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        this.f19192h = c01.id.c();
        this.f19193i = new java.util.ArrayList();
        this.f19195k = "";
        this.f19196l = jz5.h.b(bc5.c.f19178d);
    }

    public static java.util.List e(bc5.e eVar, boolean z17, boolean z18, int i17, boolean z19, boolean z27, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = true;
        }
        if ((i18 & 2) != 0) {
            z18 = false;
        }
        if ((i18 & 4) != 0) {
            i17 = 1;
        }
        if ((i18 & 8) != 0) {
            z19 = true;
        }
        if ((i18 & 16) != 0) {
            z27 = true;
        }
        eVar.b(z17, i17, z19, z27);
        java.util.ArrayList arrayList = eVar.f19193i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i27 = i19 + 1;
            android.net.Uri uri = null;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            bc5.b bVar = (bc5.b) next;
            int size = arrayList.size();
            bVar.getClass();
            u15.a aVar = new u15.a();
            aVar.u(bVar.f19174a);
            bc5.a aVar2 = bVar.f19175b;
            if (aVar2 != null) {
                android.net.Uri uri2 = aVar2.f19172a;
                if (uri2 == null) {
                    kotlin.jvm.internal.o.o("uri");
                    throw null;
                }
                uri = uri2;
            }
            if (uri != null || (z18 && !bVar.f19177d)) {
                aVar.t(bVar.f19176c);
            }
            aVar.w(i19 == 0);
            aVar.p(i19 == size - 1);
            arrayList2.add(aVar);
            i19 = i27;
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5 != null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.List r24, java.util.List r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bc5.e.a(java.util.List, java.util.List, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x012a, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x023e, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(boolean r30, int r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bc5.e.b(boolean, int, boolean, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0741, code lost:
    
        if (r1.isEmpty() == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r2) == false) goto L249;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(com.tencent.mm.storage.f9 r21) {
        /*
            Method dump skipped, instructions count: 2200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bc5.e.c(com.tencent.mm.storage.f9):java.lang.String");
    }

    public final java.lang.String d(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        return str + '_' + this.f19191g.format(new java.util.Date(this.f19192h)) + '_' + f9Var.getMsgId() + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r16, boolean r17, boolean r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof bc5.d
            if (r2 == 0) goto L16
            r2 = r1
            bc5.d r2 = (bc5.d) r2
            int r3 = r2.f19184i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f19184i = r3
            goto L1b
        L16:
            bc5.d r2 = new bc5.d
            r2.<init>(r15, r1)
        L1b:
            r12 = r2
            java.lang.Object r1 = r12.f19182g
            pz5.a r2 = pz5.a.f359186d
            int r3 = r12.f19184i
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L36
            boolean r2 = r12.f19181f
            java.lang.Object r3 = r12.f19180e
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r12.f19179d
            bc5.e r4 = (bc5.e) r4
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r2
            goto L7b
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.List r1 = r0.f19186b
            java.util.List r1 = kz5.n0.V(r1)
            jz5.g r3 = r0.f19196l
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            oy.j r3 = (oy.j) r3
            java.lang.String r5 = "<get-msgWordingService>(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            android.content.Context r5 = r0.f19185a
            com.tencent.mm.storage.z3 r6 = r0.f19187c
            r12.f19179d = r0
            r12.f19180e = r1
            r13 = r16
            r12.f19181f = r13
            r12.f19184i = r4
            r10 = 0
            r11 = 2
            te5.l1 r3 = (te5.l1) r3
            r4 = r5
            r5 = r1
            r7 = r17
            r8 = r18
            r9 = r19
            java.lang.Object r3 = r3.mj(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L77
            return r2
        L77:
            r4 = r0
            r14 = r3
            r3 = r1
            r1 = r14
        L7b:
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r4.a(r1, r3, r13)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bc5.e.f(boolean, boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
