package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.PreAttachTimingRecorder */
/* loaded from: classes15.dex */
public class C28600x2bf7fff0 {
    private static final java.lang.String TAG = "PreAttachTimingRecorder";

    /* renamed from: timings */
    private final java.util.Map<java.lang.String, java.lang.Long> f71002xb1b11969 = new java.util.HashMap();

    /* renamed from: startTimes */
    private final java.util.Map<java.lang.String, java.lang.Long> f71001xa19bc004 = new java.util.HashMap();

    /* renamed from: transferred */
    private boolean f71003x884474c6 = false;

    /* renamed from: clearAndMarkTransferred */
    public void m137817x6875920f() {
        this.f71003x884474c6 = true;
        this.f71002xb1b11969.clear();
        this.f71001xa19bc004.clear();
    }

    /* renamed from: endDuration */
    public void m137818x2da32f8f(java.lang.String str) {
        java.lang.Long remove;
        if (this.f71003x884474c6 || (remove = this.f71001xa19bc004.remove(str)) == null) {
            return;
        }
        this.f71002xb1b11969.put(str + "_start", remove);
        this.f71002xb1b11969.put(str + "_end", java.lang.Long.valueOf(java.lang.System.nanoTime()));
    }

    /* renamed from: getDuration */
    public long m137819x51e8b0a(java.lang.String str, java.lang.String str2) {
        java.lang.Long l17 = this.f71002xb1b11969.get(str);
        java.lang.Long l18 = this.f71002xb1b11969.get(str2);
        if (l17 == null || l18 == null) {
            return -1L;
        }
        return (l18.longValue() - l17.longValue()) / 1000;
    }

    /* renamed from: getSummary */
    public java.lang.String m137820xcf13e370() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreAttachTimingRecorder Summary:\n");
        sb6.append(java.lang.String.format("  Transferred: %b\n", java.lang.Boolean.valueOf(this.f71003x884474c6)));
        sb6.append("  Timings:\n");
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : this.f71002xb1b11969.entrySet()) {
            sb6.append(java.lang.String.format("    %s: %d ns\n", entry.getKey(), entry.getValue()));
        }
        return sb6.toString();
    }

    /* renamed from: getTimings */
    public java.util.Map<java.lang.String, java.lang.Long> m137821xef7e5533() {
        return new java.util.HashMap(this.f71002xb1b11969);
    }

    /* renamed from: isTransferred */
    public boolean m137822x3439113c() {
        return this.f71003x884474c6;
    }

    /* renamed from: recordTiming */
    public void m137823x6ef007fb(java.lang.String str) {
        if (this.f71003x884474c6) {
            return;
        }
        this.f71002xb1b11969.put(str, java.lang.Long.valueOf(java.lang.System.nanoTime()));
    }

    /* renamed from: recordTimingWithTimestamp */
    public void m137824x429e4eb5(java.lang.String str, long j17) {
        if (this.f71003x884474c6) {
            return;
        }
        this.f71002xb1b11969.put(str, java.lang.Long.valueOf(j17));
    }

    /* renamed from: reset */
    public void m137825x6761d4f() {
        this.f71003x884474c6 = false;
        this.f71002xb1b11969.clear();
        this.f71001xa19bc004.clear();
    }

    /* renamed from: startDuration */
    public void m137826x90d7f416(java.lang.String str) {
        if (this.f71003x884474c6) {
            return;
        }
        this.f71001xa19bc004.put(str, java.lang.Long.valueOf(java.lang.System.nanoTime()));
    }
}
