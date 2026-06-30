package ew4;

/* loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f338598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f338600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338602h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338603i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338604m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338605n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ew4.c f338606o;

    public b(ew4.c cVar, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f338606o = cVar;
        this.f338598d = j17;
        this.f338599e = str;
        this.f338600f = j18;
        this.f338601g = str2;
        this.f338602h = str3;
        this.f338603i = str4;
        this.f338604m = str5;
        this.f338605n = str6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        if (r2.moveToFirst() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e5, code lost:
    
        r6 = new ew4.a();
        r6.mo9015xbf5d97fd(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f5, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6.f67266x52c1c682) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f7, code lost:
    
        r7 = com.p314xaae8f345.mm.vfs.z7.a(ew4.d.P0() + r6.f67266x52c1c682);
        r9 = r7.f294812f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0112, code lost:
    
        if (r9 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
    
        r13 = com.p314xaae8f345.mm.vfs.e8.l(r9, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011c, code lost:
    
        if (r9.equals(r13) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011e, code lost:
    
        r7 = new com.p314xaae8f345.mm.vfs.z7(r7.f294810d, r7.f294811e, r13, r7.f294813g, r7.f294814h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x012d, code lost:
    
        r7 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0138, code lost:
    
        if (r7.a() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0142, code lost:
    
        if (r7.f294799a.d(r7.f294800b) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0144, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0147, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), delete data file:%s, ret:%b", r6.f67266x52c1c682, java.lang.Boolean.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0156, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), delete data appIdKey:%s, ret:%b", r6.f67264x62210b48, java.lang.Boolean.valueOf(r1.mo9951xb06685ab(r6, new java.lang.String[0])));
        r7 = r6.f67263x28d45f97;
        r9 = r1.L0(r7) - r6.f67267x22618426;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), currSize:%d", java.lang.Long.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0183, code lost:
    
        if (r9 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0185, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0186, code lost:
    
        r1.W0(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018d, code lost:
    
        if (r2.moveToNext() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018f, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0192, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ew4.b.run():void");
    }
}
