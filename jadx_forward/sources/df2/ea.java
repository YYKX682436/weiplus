package df2;

/* loaded from: classes5.dex */
public final class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f311581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f311582f;

    public ea(df2.zb zbVar, java.util.List list, java.lang.Float f17) {
        this.f311580d = zbVar;
        this.f311581e = list;
        this.f311582f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.zb zbVar = this.f311580d;
        ((java.util.ArrayList) zbVar.f313475p).clear();
        ((java.util.ArrayList) zbVar.f313475p).addAll(this.f311581e);
        java.lang.Float f17 = this.f311582f;
        if (f17 == null) {
            f17 = java.lang.Float.valueOf(0.0f);
        }
        zbVar.f313476q = f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar.f313472m, "[aiAssistant] fetchWelcomeConfig: cached " + ((java.util.ArrayList) zbVar.f313475p).size() + " welcomes, confidenceThreshold=" + zbVar.f313476q);
    }
}
