package bq;

/* loaded from: classes.dex */
public final class u0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f105063o;

    /* renamed from: p, reason: collision with root package name */
    public final int f105064p;

    /* renamed from: q, reason: collision with root package name */
    public final long f105065q;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0078, code lost:
    
        if ((r24 == null || r24.length() == 0) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007e, code lost:
    
        if (r25 != 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u0(r45.qt2 r18, long r19, java.lang.String r21, long r22, java.lang.String r24, int r25, com.p314xaae8f345.mm.p2495xc50a8b8b.g r26, com.p314xaae8f345.mm.p2495xc50a8b8b.g r27, long r28, java.lang.String r30, int r31, long r32, java.lang.String r34, r45.tj2 r35) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.u0.<init>(r45.qt2, long, java.lang.String, long, java.lang.String, int, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, long, java.lang.String, int, long, java.lang.String, r45.tj2):void");
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.x81 resp = (r45.x81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(" stream_bufferSize ");
        java.lang.String m75945x2fec8307 = resp.m75945x2fec8307(8);
        sb6.append(m75945x2fec8307 != null ? java.lang.Integer.valueOf(m75945x2fec8307.length()) : null);
        sb6.append(" sndsi ");
        sb6.append(pm0.v.u(resp.m75942xfb822ef2(9)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetNativeDramaListCgi", sb6.toString());
    }
}
