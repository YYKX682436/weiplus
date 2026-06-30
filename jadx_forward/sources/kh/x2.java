package kh;

/* loaded from: classes12.dex */
public final class x2 extends kh.a3 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f389475f;

    /* renamed from: g, reason: collision with root package name */
    public final int f389476g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x2(java.lang.String r1, int r2, int r3, p3321xbce91901.jvm.p3324x21ffc6bd.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            java.lang.String r3 = "pattern"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            r0.<init>(r2)
            r0.f389475f = r1
            r0.f389476g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.x2.<init>(java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadIdCard, "threadIdCard");
        java.lang.String str = threadIdCard.f389332a;
        java.lang.String str2 = this.f389475f;
        if (!r26.i0.o(str, str2, false, 2, null)) {
            if (!r26.i0.o(str, str2 + 'J', false, 2, null)) {
                return 0;
            }
        }
        return this.f389476g;
    }
}
