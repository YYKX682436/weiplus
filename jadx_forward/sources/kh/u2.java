package kh;

/* loaded from: classes12.dex */
public final class u2 extends kh.w2 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f389462f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f389463g;

    /* renamed from: h, reason: collision with root package name */
    public final int f389464h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u2(java.lang.String r1, java.lang.String r2, int r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            r3 = 1
        La:
            java.lang.String r4 = "className"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            java.lang.String r4 = "java"
            r0.<init>(r4, r3)
            r0.f389462f = r1
            r0.f389463g = r2
            r0.f389464h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.u2.<init>(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        jz5.l Bi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadIdCard, "threadIdCard");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a aVar = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.class);
        if (aVar == null || (Bi = ((cr0.a5) aVar).Bi(threadIdCard.f389333b)) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389462f, Bi.f384366d)) {
            return 0;
        }
        java.lang.String str = this.f389463g;
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, Bi.f384367e)) {
            return this.f389464h;
        }
        return 0;
    }
}
