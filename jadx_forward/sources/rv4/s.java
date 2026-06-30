package rv4;

/* loaded from: classes12.dex */
public final class s extends rv4.a0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(rv4.w r1, boolean r2, java.lang.String r3, boolean r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 1
        L5:
            java.lang.String r5 = "session"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r5)
            java.lang.String r5 = "title"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r5)
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.s.<init>(rv4.w, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // rv4.a0
    public java.lang.String b() {
        if (this.f481961b) {
            ov4.g[] gVarArr = ov4.g.f430768d;
            return "1205";
        }
        ov4.g[] gVarArr2 = ov4.g.f430768d;
        return "1206";
    }

    @Override // rv4.a0
    public boolean d() {
        return this.f481961b;
    }

    @Override // rv4.a0
    public void e(boolean z17) {
        sv4.d dVar;
        this.f481961b = z17;
        java.lang.ref.WeakReference weakReference = this.f481964e;
        if (weakReference == null || (dVar = (sv4.d) weakReference.get()) == null) {
            return;
        }
        ((qv4.r0) dVar).m(z17);
    }
}
