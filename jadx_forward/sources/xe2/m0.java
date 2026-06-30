package xe2;

/* loaded from: classes3.dex */
public final class m0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535414c = "LiveGiftsUpdateMessageInterceptor";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // we2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.LinkedList r10) {
        /*
            r9 = this;
            java.lang.String r0 = "msgList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.util.Iterator r10 = r10.iterator()
        L9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r10.next()
            r45.ch1 r0 = (r45.ch1) r0
            r1 = 1
            int r1 = r0.m75939xb282bd08(r1)
            r2 = 20130(0x4ea2, float:2.8208E-41)
            if (r1 == r2) goto L1f
            goto L9
        L1f:
            r45.wv1 r1 = new r45.wv1
            r1.<init>()
            r2 = 4
            com.tencent.mm.protobuf.g r0 = r0.m75934xbce7f2f(r2)
            r2 = 0
            if (r0 == 0) goto L31
            byte[] r0 = r0.g()
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 != 0) goto L36
        L34:
            r1 = r2
            goto L47
        L36:
            r1.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L3a
            goto L47
        L3a:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r3, r1, r0)
            goto L34
        L47:
            if (r1 == 0) goto L9
            r0 = 0
            boolean r0 = r1.m75933x41a8a7f2(r0)
            if (r0 != 0) goto L51
            goto L9
        L51:
            java.lang.String r10 = r9.f535414c
            java.lang.String r0 = "Received gifts update command."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
            dk2.ef r10 = dk2.ef.f314905a
            com.tencent.mm.plugin.finder.live.view.k0 r3 = dk2.ef.f314913e
            if (r3 == 0) goto L6a
            r4 = 0
            r5 = 0
            xe2.l0 r6 = new xe2.l0
            r6.<init>(r2)
            r7 = 3
            r8 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.f(r3, r4, r5, r6, r7, r8)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.m0.d(java.util.LinkedList):void");
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20130};
    }
}
