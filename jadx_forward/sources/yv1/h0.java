package yv1;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Future f547594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f547595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f547596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw1.f f547597g;

    public h0(java.util.concurrent.Future future, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.util.HashSet hashSet, bw1.f fVar) {
        this.f547594d = future;
        this.f547595e = c26987xeef691ab;
        this.f547596f = hashSet;
        this.f547597g = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r1.m108008xc9602be3() == true) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            java.util.concurrent.Future r0 = r3.f547594d
            if (r0 == 0) goto L7
            r0.get()
        L7:
            r0 = 0
            com.tencent.wcdb.support.CancellationSignal r1 = r3.f547595e
            if (r1 == 0) goto L14
            boolean r1 = r1.m108008xc9602be3()
            r2 = 1
            if (r1 != r2) goto L14
            goto L15
        L14:
            r2 = r0
        L15:
            java.lang.String r1 = "MicroMsg.CleanService"
            if (r2 != 0) goto L26
            java.lang.String r2 = "Start CompressOriginalMediaService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            aw1.l0 r1 = aw1.l0.f96101a
            java.util.HashSet r2 = r3.f547596f
            r1.k(r2, r0)
            goto L32
        L26:
            java.lang.String r0 = "CleanPersistOriginalMedia task cancelled"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            jz5.f0 r0 = jz5.f0.f384359a
            bw1.f r1 = r3.f547597g
            r1.a(r0)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.h0.run():void");
    }
}
