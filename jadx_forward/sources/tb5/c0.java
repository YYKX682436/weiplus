package tb5;

/* loaded from: classes5.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f498568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f498569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hd5.n f498570f;

    public c0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, hd5.n nVar) {
        this.f498568d = f9Var;
        this.f498569e = i17;
        this.f498570f = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[rptLowPreProcess] msgId: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f498568d;
        sb6.append(f9Var.m124847x74d37ac6());
        sb6.append(" cost: ");
        int i17 = this.f498569e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitorComponent", sb6.toString());
        java.util.Map a17 = tb5.f0.a(f9Var);
        a17.put("cost", java.lang.Integer.valueOf(i17));
        hd5.n nVar = this.f498570f;
        if (nVar == null || (str = nVar.name()) == null) {
            str = "";
        }
        a17.put("action", str);
        km.a.a("chatting_low_pre_process", a17);
    }
}
