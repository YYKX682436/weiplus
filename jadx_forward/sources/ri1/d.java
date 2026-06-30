package ri1;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f477559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f477561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, java.util.LinkedList linkedList) {
        super(1);
        this.f477559d = h0Var;
        this.f477560e = str;
        this.f477561f = linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        r3.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0.moveToNext() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        vz5.b.a(r0, null);
        r8.mo70514xb06685ab("WxaAppWebRenderingCacheAccessStatsTable", (java.lang.String) r1.f391656d, new java.lang.String[]{r2});
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return jz5.f0.f384359a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r0.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r4 = false;
        r5 = r0.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.length() != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r4 != false) goto L12;
     */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r8) {
        /*
            r7 = this;
            l75.k0 r8 = (l75.k0) r8
            java.lang.String r0 = "db"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select cacheFilePath from WxaAppWebRenderingCacheAccessStatsTable where "
            r0.<init>(r1)
            kotlin.jvm.internal.h0 r1 = r7.f477559d
            java.lang.Object r2 = r1.f391656d
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r7.f477560e
            java.lang.String[] r3 = new java.lang.String[]{r2}
            android.database.Cursor r0 = r8.B(r0, r3)
            java.util.LinkedList r3 = r7.f477561f
            boolean r4 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L46
        L2d:
            r4 = 0
            java.lang.String r5 = r0.getString(r4)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L3a
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L5a
            if (r6 != 0) goto L3b
        L3a:
            r4 = 1
        L3b:
            if (r4 != 0) goto L40
            r3.add(r5)     // Catch: java.lang.Throwable -> L5a
        L40:
            boolean r4 = r0.moveToNext()     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L2d
        L46:
            r3 = 0
            vz5.b.a(r0, r3)
            java.lang.Object r0 = r1.f391656d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r1 = new java.lang.String[]{r2}
            java.lang.String r2 = "WxaAppWebRenderingCacheAccessStatsTable"
            r8.mo70514xb06685ab(r2, r0, r1)
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        L5a:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            vz5.b.a(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ri1.d.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
