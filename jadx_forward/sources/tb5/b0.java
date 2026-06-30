package tb5;

/* loaded from: classes5.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f498565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f498566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hd5.n f498567f;

    public b0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, hd5.n nVar) {
        this.f498565d = f9Var;
        this.f498566e = i17;
        this.f498567f = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[rptLowAsyncPreload] msgId: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f498565d;
        sb6.append(f9Var.m124847x74d37ac6());
        sb6.append(" cost: ");
        int i17 = this.f498566e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitorComponent", sb6.toString());
        java.util.Map a17 = tb5.f0.a(f9Var);
        a17.put("cost", java.lang.Integer.valueOf(i17));
        hd5.n nVar = this.f498567f;
        if (nVar == null || (str = nVar.name()) == null) {
            str = "";
        }
        a17.put("action", str);
        km.a.a("chatting_low_async_preload", a17);
    }
}
