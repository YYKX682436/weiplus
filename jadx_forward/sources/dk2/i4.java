package dk2;

/* loaded from: classes.dex */
public final class i4 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f315140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315141b;

    public i4(long j17, yz5.p pVar) {
        this.f315140a = j17;
        this.f315141b = pVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WeCoin] getWeCoinBalance onFailed,errorType:");
        sb6.append(i17);
        sb6.append(",errorCode:");
        sb6.append(i18);
        sb6.append(",msg:");
        sb6.append(str);
        sb6.append(", requestId:");
        long j17 = this.f315140a;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", sb6.toString());
        yz5.p pVar = this.f315141b;
        if (pVar != null) {
            pVar.mo149xb9724478(-1L, java.lang.Long.valueOf(j17));
        }
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WeCoin] getWeCoinBalance onSuccess,data:");
        sb6.append(data.f456118d);
        sb6.append(", requestId:");
        long j17 = this.f315140a;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", sb6.toString());
        yz5.p pVar = this.f315141b;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(data.f456118d), java.lang.Long.valueOf(j17));
        }
    }
}
