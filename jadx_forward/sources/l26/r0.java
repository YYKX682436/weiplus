package l26;

/* loaded from: classes16.dex */
public final class r0 extends l26.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f396804b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "must have at least "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " value parameter"
            r0.append(r1)
            r1 = 1
            if (r3 <= r1) goto L15
            java.lang.String r1 = "s"
            goto L17
        L15:
            java.lang.String r1 = ""
        L17:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.<init>(r0, r1)
            r2.f396804b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l26.r0.<init>(int):void");
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionDescriptor, "functionDescriptor");
        return functionDescriptor.W().size() >= this.f396804b;
    }
}
