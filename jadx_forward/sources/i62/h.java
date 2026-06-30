package i62;

/* loaded from: classes13.dex */
public final class h implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public long f370478a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f370479b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f370480c;

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
        int i17 = this.f370479b;
        int i18 = this.f370480c;
        long nanoTime = this.f370478a != -1 ? java.lang.System.nanoTime() - this.f370478a : -1L;
        this.f370478a = -1L;
        this.f370479b = -1;
        this.f370480c = 0;
        if (i17 == -1 || nanoTime == -1 || i18 == 0) {
            return;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            java.util.Objects.toString(obj);
            java.util.Objects.toString(obj2);
        }
        i62.o oVar = i62.o.f370496a;
        i62.o.f370498c.add(new i62.j("", nanoTime, i18, i17));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    @Override // yj0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5, java.lang.Object[] r6) {
        /*
            r1 = this;
            int r2 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()
            r4 = 1
            if (r2 > r4) goto L11
            java.util.Objects.toString(r5)
            i62.i r2 = i62.i.f370481a
            java.lang.String r5 = "a:"
            r2.a(r6, r5)
        L11:
            r2 = 0
            if (r6 == 0) goto L1f
            int r5 = r6.length
            if (r5 != 0) goto L19
            r5 = r4
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = r2
            goto L20
        L1f:
            r5 = r4
        L20:
            if (r5 == 0) goto L25
        L22:
            r4 = r2
            goto La7
        L25:
            if (r3 == 0) goto L22
            int r5 = r3.hashCode()
            r0 = 0
            switch(r5) {
                case -1249345311: goto L8a;
                case -43291373: goto L6d;
                case 1268565932: goto L4e;
                case 1945326087: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L22
        L30:
            java.lang.String r5 = "inflate"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L39
            goto L22
        L39:
            r3 = r6[r2]
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L42
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
        L42:
            if (r0 == 0) goto L22
            int r2 = r0.intValue()
            r1.f370479b = r2
            r2 = 5
            r1.f370480c = r2
            goto La7
        L4e:
            java.lang.String r5 = "openRawResource"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L58
            goto L22
        L58:
            r3 = r6[r2]
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L61
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
        L61:
            if (r0 == 0) goto L22
            int r2 = r0.intValue()
            r1.f370479b = r2
            r2 = 2
            r1.f370480c = r2
            goto La7
        L6d:
            java.lang.String r5 = "getDrawableForDensity"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L76
            goto L22
        L76:
            r3 = r6[r2]
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L7f
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
        L7f:
            if (r0 == 0) goto L22
            int r2 = r0.intValue()
            r1.f370479b = r2
            r1.f370480c = r4
            goto La7
        L8a:
            java.lang.String r5 = "getXml"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L93
            goto L22
        L93:
            r3 = r6[r2]
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L9c
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
        L9c:
            if (r0 == 0) goto L22
            int r2 = r0.intValue()
            r1.f370479b = r2
            r2 = 3
            r1.f370480c = r2
        La7:
            if (r4 == 0) goto Laf
            long r2 = java.lang.System.nanoTime()
            r1.f370478a = r2
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i62.h.b(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[]):void");
    }
}
