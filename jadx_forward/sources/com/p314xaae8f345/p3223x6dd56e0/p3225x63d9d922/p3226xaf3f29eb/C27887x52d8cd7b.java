package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.TimeoutCounter */
/* loaded from: classes14.dex */
public class C27887x52d8cd7b {
    private static final java.lang.String TAG = "TimeoutCounter";

    /* renamed from: name */
    private java.lang.String f61637x337a8b;

    /* renamed from: elaspeTimeMs */
    private long f61636xeace2dc1 = 0;

    /* renamed from: targetTimeoutMs */
    private long f61640x854d6456 = 0;

    /* renamed from: needTimer */
    private boolean f61639x3f897c4f = false;

    /* renamed from: needShowTimer */
    private boolean f61638xb5ad7252 = true;

    public C27887x52d8cd7b(java.lang.String str) {
        this.f61637x337a8b = str;
    }

    /* renamed from: cancel */
    public void m120581xae7a2e7a() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61637x337a8b + " cancel");
        this.f61639x3f897c4f = false;
    }

    /* renamed from: checkTimeout */
    public boolean m120582xae11c739() {
        return this.f61639x3f897c4f && this.f61640x854d6456 > 0 && java.lang.System.currentTimeMillis() - this.f61636xeace2dc1 > this.f61640x854d6456;
    }

    /* renamed from: init */
    public void m120583x316510(long j17, boolean z17) {
        this.f61640x854d6456 = j17;
        this.f61638xb5ad7252 = z17;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61637x337a8b + " init with " + this.f61640x854d6456);
    }

    /* renamed from: isRunning */
    public boolean m120584x39e05d35() {
        return this.f61639x3f897c4f && this.f61640x854d6456 > 0;
    }

    /* renamed from: reset */
    public void m120585x6761d4f() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61637x337a8b + " reset");
        this.f61639x3f897c4f = true;
        if (this.f61640x854d6456 > 0 && this.f61638xb5ad7252) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.common.TimeoutCounter.1
                {
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61538x28a145dd);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61546xc0a2c03b, java.lang.Long.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b.this.f61640x854d6456));
                }
            });
        }
        this.f61636xeace2dc1 = java.lang.System.currentTimeMillis();
    }

    /* renamed from: start */
    public void m120586x68ac462() {
        m120585x6761d4f();
    }
}
