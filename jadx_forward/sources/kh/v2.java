package kh;

/* loaded from: classes12.dex */
public final class v2 extends kh.w2 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f389468f;

    /* renamed from: g, reason: collision with root package name */
    public final int f389469g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v2(java.lang.String r1, java.lang.String r2, int r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r2 = r4 & 4
            if (r2 == 0) goto L5
            r3 = 1
        L5:
            java.lang.String r2 = "soName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            java.lang.String r2 = "native"
            r0.<init>(r2, r3)
            r0.f389468f = r1
            r0.f389469g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.v2.<init>(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        jz5.l Di;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadIdCard, "threadIdCard");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a aVar = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.class);
        if (aVar == null || (Di = ((cr0.a5) aVar).Di(threadIdCard.f389333b)) == null) {
            return 0;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389468f, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + ((java.lang.String) Di.f384366d) + ".so")) {
            return this.f389469g;
        }
        return 0;
    }
}
