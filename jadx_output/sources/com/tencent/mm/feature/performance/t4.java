package com.tencent.mm.feature.performance;

@j95.b
/* loaded from: classes12.dex */
public class t4 extends i95.w implements ob0.k3 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.matrix.trace.tracer.StackTracer f67734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.text.DateFormat f67735e = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", java.util.Locale.CHINA);

    /* renamed from: f, reason: collision with root package name */
    public long f67736f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67737g = true;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f67738h;

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
            r3.f67735e = r0
            r0 = 0
            r3.f67736f = r0
            r0 = 1
            r3.f67737g = r0
            boolean r1 = com.tencent.mm.sdk.platformtools.z.f193115k
            if (r1 == 0) goto L23
            int r1 = o45.wf.f343023a
            boolean r1 = wo.w0.q()
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            r3.f67738h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.performance.t4.<init>():void");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        int i17;
        super.onCreate(context);
        if (this.f67738h) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            boolean z17 = false;
            int b17 = ih.a.b("clicfg_stack_tracer_enable_type", 0);
            if (b17 > 100 || (b17 > 0 && (i17 = gm0.m.i()) != 0 && java.lang.Math.abs((i17 ^ com.tencent.mm.sdk.platformtools.z.f193112h) ^ ((int) java.lang.System.nanoTime())) % 100 < b17)) {
                z17 = true;
            }
            if (z17 && this.f67738h) {
                com.tencent.matrix.trace.tracer.StackTracer stackTracer = this.f67734d;
                if (stackTracer == null || !stackTracer.f308216d) {
                    com.tencent.matrix.trace.tracer.StackTracer stackTracer2 = new com.tencent.matrix.trace.tracer.StackTracer(1048576, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    this.f67734d = stackTracer2;
                    stackTracer2.g();
                }
            }
        }
    }

    public java.lang.String wi(float f17) {
        com.tencent.matrix.trace.tracer.StackTracer stackTracer = this.f67734d;
        if (stackTracer != null && stackTracer.f308216d) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f67736f < java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)) {
                return null;
            }
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
            int o17 = com.tencent.mm.sdk.platformtools.o4.L().q("stack_tracer_last_dumped_date", 0L) == currentTimeMillis / timeUnit.toMillis(1L) ? com.tencent.mm.sdk.platformtools.o4.L().o("stack_tracer_today_dumped_count", 0) : 0;
            if (o17 >= 20 || java.lang.Math.random() > f17) {
                return null;
            }
            java.lang.String c17 = com.tencent.mm.vfs.q7.c("stackTrace");
            if (!com.tencent.mm.vfs.w6.j(c17)) {
                com.tencent.mm.vfs.w6.u(c17);
            }
            java.lang.String format = java.lang.String.format(java.util.Locale.CHINESE, "%s/%s_%s.trace", c17, this.f67735e.format(new java.util.Date(currentTimeMillis)), com.tencent.mm.sdk.platformtools.z.f193111g);
            boolean k17 = this.f67734d.k(format);
            r1 = k17 ? format : null;
            if (k17 && this.f67737g) {
                r1 = format + ".zip";
                kk.x.a(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(format)), true, r1);
            }
            if (r1 != null) {
                com.tencent.mars.xlog.Log.i("StackTraceDumper", "Trace file dumped, filePath = %s", r1);
                this.f67736f = currentTimeMillis;
                com.tencent.mm.sdk.platformtools.o4.L().B("stack_tracer_last_dumped_date", currentTimeMillis / timeUnit.toMillis(1L));
                com.tencent.mm.sdk.platformtools.o4.L().A("stack_tracer_today_dumped_count", o17 + 1);
            } else {
                com.tencent.mars.xlog.Log.i("StackTraceDumper", "Trace file dump failed, filePath = %s", format);
            }
        }
        return r1;
    }
}
