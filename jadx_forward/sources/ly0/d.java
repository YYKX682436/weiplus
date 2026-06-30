package ly0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f403720a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f403721b;

    /* renamed from: c, reason: collision with root package name */
    public int f403722c;

    /* renamed from: d, reason: collision with root package name */
    public int f403723d;

    public d(java.lang.String taskId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        this.f403721b = taskId;
        this.f403722c = i17;
        this.f403723d = i18;
    }

    public final void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIGC.AIMediaGeneratePollingTask", "update QueryState: currentInterval:" + this.f403722c + " nextInterval:" + i17 + " currentMaxCount: " + this.f403723d + ", nextQueryCount:" + i18);
        this.f403722c = i17;
        this.f403723d = i18;
        this.f403720a = 0;
    }

    /* renamed from: toString */
    public java.lang.String m146512x9616526c() {
        return "QueryState(serverTasKId='" + this.f403721b + "', clientRetryCount=" + this.f403720a + " serverInterval=" + this.f403722c + ", serverQueryMaxCount=" + this.f403723d + ')';
    }
}
