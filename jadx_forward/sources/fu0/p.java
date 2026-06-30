package fu0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final fu0.p f348342a = new fu0.p();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(fu0.p r5, java.util.List r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof fu0.n
            if (r0 == 0) goto L16
            r0 = r7
            fu0.n r0 = (fu0.n) r0
            int r1 = r0.f348337f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f348337f = r1
            goto L1b
        L16:
            fu0.n r0 = new fu0.n
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.f348335d
            pz5.a r7 = pz5.a.f440719d
            int r1 = r0.f348337f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)     // Catch: java.lang.Exception -> L5c
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            wt3.k0 r5 = new wt3.k0     // Catch: java.lang.Exception -> L5c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L5c
            r1.<init>(r6)     // Catch: java.lang.Exception -> L5c
            st3.v r6 = st3.v.f494138d     // Catch: java.lang.Exception -> L5c
            wt3.a0 r6 = new wt3.a0     // Catch: java.lang.Exception -> L5c
            r6.<init>()     // Catch: java.lang.Exception -> L5c
            r4 = 10
            r5.<init>(r1, r4, r6)     // Catch: java.lang.Exception -> L5c
            r5.c()     // Catch: java.lang.Exception -> L5c
            r5.a()     // Catch: java.lang.Exception -> L5c
            r0.f348337f = r3     // Catch: java.lang.Exception -> L5c
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: java.lang.Exception -> L5c
            if (r5 != r7) goto L58
            goto L75
        L58:
            r7 = r5
            com.tencent.mm.protobuf.g r7 = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) r7     // Catch: java.lang.Exception -> L5c
            goto L75
        L5c:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "extractClassifyResult: failed, error="
            r6.<init>(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MJCC.MusicRecommendCtx"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r5)
            r7 = r2
        L75:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fu0.p.a(fu0.p, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.util.List b(fu0.p pVar, java.util.List list) {
        java.lang.String str;
        pVar.getClass();
        if (list.isEmpty()) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            try {
                i95.m c17 = i95.n0.c(q80.g0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                str = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) c17)).zj("wxalite94c410838e79a4cecb3dcd66bc6054a3", 0L, str2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.MusicRecommendCtx", "resolveLocalIdToPath: failed, error=" + e17.getMessage());
                str = null;
            }
            boolean z17 = true;
            if (str == null || !(!r26.n0.N(str))) {
                str = null;
            }
            if (str != null) {
                str2 = str;
            } else if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
