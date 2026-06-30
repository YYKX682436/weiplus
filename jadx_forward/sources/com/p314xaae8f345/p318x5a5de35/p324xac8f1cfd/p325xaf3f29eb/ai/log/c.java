package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log;

/* loaded from: classes14.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public java.text.SimpleDateFormat f127418a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Date f127419b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2904xd06a783e f127420c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.f f127421d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.content.Context> f127422e;

    public c(android.os.Looper looper, com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2904xd06a783e c2904xd06a783e, android.content.Context context) {
        super(looper);
        this.f127420c = c2904xd06a783e;
        this.f127422e = new java.lang.ref.WeakReference<>(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.c.a(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = r4.what
            r1 = 1
            if (r0 != r1) goto L3b
            java.lang.Object r4 = r4.obj
            boolean r0 = r4 instanceof com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.d
            if (r0 == 0) goto L3b
            r0 = 0
            com.tencent.cloud.component.common.ai.log.d r4 = (com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.d) r4     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            java.lang.String r0 = r3.a(r4)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r3.a(r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r4 == 0) goto L3b
            goto L2d
        L1b:
            r0 = move-exception
            goto L33
        L1d:
            r0 = move-exception
            goto L28
        L1f:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L33
        L24:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
        L28:
            r0.getMessage()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L3b
        L2d:
            com.tencent.cloud.component.common.ai.log.e r0 = com.tencent.cloud.component.common.ai.log.e.a.f127430a
            r0.a(r4)
            goto L3b
        L33:
            if (r4 == 0) goto L3a
            com.tencent.cloud.component.common.ai.log.e r1 = com.tencent.cloud.component.common.ai.log.e.a.f127430a
            r1.a(r4)
        L3a:
            throw r0
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.c.handleMessage(android.os.Message):void");
    }

    public final java.lang.String a(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.d dVar) {
        if (this.f127420c.m21657x93b1d4dc()) {
            return dVar.f127426d;
        }
        long j17 = dVar.f127424b;
        if (this.f127418a == null) {
            this.f127418a = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
        if (this.f127419b == null) {
            this.f127419b = new java.util.Date();
        }
        this.f127419b.setTime(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f127418a.format(this.f127419b));
        sb6.append(" ");
        sb6.append(dVar.f127427e);
        sb6.append("/");
        sb6.append(dVar.f127428f);
        int i17 = dVar.f127423a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" ");
        switch (i17) {
            case 2:
                sb7.append("VERBOSE");
                break;
            case 3:
                sb7.append("DEBUG");
                break;
            case 4:
                sb7.append("INFO");
                break;
            case 5:
                sb7.append("WARN");
                break;
            case 6:
                sb7.append("ERROR");
                break;
            case 7:
                sb7.append("ASSERT");
                break;
            default:
                sb7.append("null");
                break;
        }
        sb6.append(sb7.toString());
        sb6.append("/");
        sb6.append(dVar.f127425c);
        sb6.append(": ");
        sb6.append(dVar.f127426d);
        return sb6.toString();
    }
}
