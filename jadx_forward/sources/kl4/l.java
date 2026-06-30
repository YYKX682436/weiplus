package kl4;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f390482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f390484f;

    public l(kl4.a0 a0Var, java.lang.String str, int i17) {
        this.f390482d = a0Var;
        this.f390483e = str;
        this.f390484f = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((r5.length() > 0) == true) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            kl4.a0 r0 = r8.f390482d
            byte[] r1 = r0.f390407n
            if (r1 != 0) goto Lf
            java.lang.String r0 = r0.f390413t
            java.lang.String r1 = "onEventChanged contextBytes is null, can not call onPlayEvent"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            return
        Lf:
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.f390400d
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L76
            java.lang.Object r3 = r2.next()
            com.tencent.unit_rc.WeakPtr r3 = (com.p314xaae8f345.p3118xeeebfacc.C26845xac206036) r3
            r4 = 0
            java.lang.String r5 = r8.f390483e
            if (r5 == 0) goto L33
            int r6 = r5.length()
            r7 = 1
            if (r6 <= 0) goto L2f
            r6 = r7
            goto L30
        L2f:
            r6 = r4
        L30:
            if (r6 != r7) goto L33
            goto L34
        L33:
            r7 = r4
        L34:
            if (r7 == 0) goto L42
            java.nio.charset.Charset r4 = r26.c.f450398a
            byte[] r4 = r5.getBytes(r4)
            java.lang.String r5 = "getBytes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            goto L44
        L42:
            byte[] r4 = new byte[r4]
        L44:
            java.lang.Object r5 = r3.m106052x32c52b()
            jm4.u3 r5 = (jm4.u3) r5
            int r6 = r8.f390484f
            if (r5 == 0) goto L51
            r5.o(r1, r6, r4)
        L51:
            r5 = 7
            if (r6 != r5) goto L65
            boolean r5 = r0.f390404h
            if (r5 != 0) goto L65
            java.lang.Object r5 = r3.m106052x32c52b()
            jm4.u3 r5 = (jm4.u3) r5
            if (r5 == 0) goto L65
            r7 = 15
            r5.F2(r1, r7, r4)
        L65:
            r5 = 2
            if (r6 != r5) goto L15
            java.lang.Object r3 = r3.m106052x32c52b()
            jm4.u3 r3 = (jm4.u3) r3
            if (r3 == 0) goto L15
            r5 = 14
            r3.F2(r1, r5, r4)
            goto L15
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kl4.l.run():void");
    }
}
