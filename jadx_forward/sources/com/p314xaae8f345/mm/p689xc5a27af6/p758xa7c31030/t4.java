package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

@j95.b
/* loaded from: classes12.dex */
public class t4 extends i95.w implements ob0.k3 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 f149267d;

    /* renamed from: e, reason: collision with root package name */
    public final java.text.DateFormat f149268e = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", java.util.Locale.CHINA);

    /* renamed from: f, reason: collision with root package name */
    public long f149269f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f149270g = true;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f149271h;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (wo.w0.q() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t4() {
        /*
            r3 = this;
            r3.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd-HH-mm-ss"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            r3.f149268e = r0
            r0 = 0
            r3.f149269f = r0
            r0 = 1
            r3.f149270g = r0
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k
            if (r1 == 0) goto L23
            int r1 = o45.wf.f424556a
            boolean r1 = wo.w0.q()
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            r3.f149271h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.t4.<init>():void");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        int i17;
        super.mo8845x3e5a77bb(context);
        if (this.f149271h) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            boolean z17 = false;
            int b17 = ih.a.b("clicfg_stack_tracer_enable_type", 0);
            if (b17 > 100 || (b17 > 0 && (i17 = gm0.m.i()) != 0 && java.lang.Math.abs((i17 ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) ^ ((int) java.lang.System.nanoTime())) % 100 < b17)) {
                z17 = true;
            }
            if (z17 && this.f149271h) {
                com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 c4714x3758855 = this.f149267d;
                if (c4714x3758855 == null || !c4714x3758855.f389749d) {
                    com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 c4714x37588552 = new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855(1048576, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    this.f149267d = c4714x37588552;
                    c4714x37588552.g();
                }
            }
        }
    }

    public java.lang.String wi(float f17) {
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 c4714x3758855 = this.f149267d;
        if (c4714x3758855 != null && c4714x3758855.f389749d) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f149269f < java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)) {
                return null;
            }
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
            int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("stack_tracer_last_dumped_date", 0L) == currentTimeMillis / timeUnit.toMillis(1L) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("stack_tracer_today_dumped_count", 0) : 0;
            if (o17 >= 20 || java.lang.Math.random() > f17) {
                return null;
            }
            java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("stackTrace");
            if (!com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                com.p314xaae8f345.mm.vfs.w6.u(c17);
            }
            java.lang.String format = java.lang.String.format(java.util.Locale.CHINESE, "%s/%s_%s.trace", c17, this.f149268e.format(new java.util.Date(currentTimeMillis)), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
            boolean k17 = this.f149267d.k(format);
            r1 = k17 ? format : null;
            if (k17 && this.f149270g) {
                r1 = format + ".zip";
                kk.x.a(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(format)), true, r1);
            }
            if (r1 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StackTraceDumper", "Trace file dumped, filePath = %s", r1);
                this.f149269f = currentTimeMillis;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("stack_tracer_last_dumped_date", currentTimeMillis / timeUnit.toMillis(1L));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("stack_tracer_today_dumped_count", o17 + 1);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StackTraceDumper", "Trace file dump failed, filePath = %s", format);
            }
        }
        return r1;
    }
}
