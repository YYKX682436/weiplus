package ml4;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ml4.c f409942a = new ml4.c();

    public final java.lang.String a(bw5.lp0 lp0Var) {
        java.util.LinkedList linkedList;
        bw5.jq jqVar;
        java.util.LinkedList linkedList2;
        bw5.kc kcVar;
        bw5.gq0 e17 = lp0Var.e();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = e17 != null ? e17.f109500w[3] ? e17.f109486f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b : null;
        if (gVar == null) {
            return null;
        }
        try {
            bw5.yr mo11468x92b714fd = new bw5.yr().mo11468x92b714fd(gVar.g());
            mo11468x92b714fd.getClass();
            bw5.ks ksVar = mo11468x92b714fd.f117194r2[4] ? mo11468x92b714fd.f117171g : new bw5.ks();
            if (ksVar == null || (linkedList = ksVar.f111052e) == null || (jqVar = (bw5.jq) kz5.n0.Z(linkedList)) == null || (linkedList2 = jqVar.T) == null || (kcVar = (bw5.kc) kz5.n0.Z(linkedList2)) == null) {
                return null;
            }
            return kcVar.f110877g[3] ? kcVar.f110876f : "";
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayerCoreGenerator", "getFinderSpecAudioUrl Error: " + e18.getLocalizedMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        if ((r0.length() > 0) == true) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(bw5.lp0 r6) {
        /*
            r5 = this;
            bw5.v70 r0 = r6.d()
            int r0 = r0.f115722e
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L61
            r3 = 2
            if (r0 == r3) goto L5b
            if (r0 == r2) goto L61
            r4 = 4
            if (r0 == r4) goto L3c
            r1 = 5
            if (r0 == r1) goto L3a
            r1 = 7
            if (r0 == r1) goto L38
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L61
            switch(r0) {
                case 100: goto L61;
                case 101: goto L20;
                case 102: goto L61;
                case 103: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L61
        L20:
            bw5.v70 r0 = r6.d()
            bw5.nc0 r0 = r0.l()
            boolean r0 = r0.f112149g
            if (r0 == 0) goto L2d
            goto L61
        L2d:
            bw5.v70 r6 = r6.d()
            bw5.nc0 r6 = r6.l()
            boolean r6 = r6.f112148f
            goto L61
        L38:
            r2 = r3
            goto L61
        L3a:
            r2 = r1
            goto L61
        L3c:
            java.lang.String r0 = r5.a(r6)
            bw5.fq0 r6 = r6.c()
            int r6 = r6.f108991m
            if (r6 != r1) goto L38
            r6 = 0
            if (r0 == 0) goto L57
            int r0 = r0.length()
            if (r0 <= 0) goto L53
            r0 = r1
            goto L54
        L53:
            r0 = r6
        L54:
            if (r0 != r1) goto L57
            goto L58
        L57:
            r1 = r6
        L58:
            if (r1 == 0) goto L38
            goto L61
        L5b:
            bw5.gq0 r6 = r6.e()
            boolean r6 = r6.f109489i
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ml4.c.b(bw5.lp0):int");
    }
}
