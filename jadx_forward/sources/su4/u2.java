package su4;

/* loaded from: classes8.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f494643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f494644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su4.v2 f494645g;

    public u2(su4.v2 v2Var, java.lang.String str, int i17, boolean z17) {
        this.f494645g = v2Var;
        this.f494642d = str;
        this.f494643e = i17;
        this.f494644f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "sending broadcast");
        this.f494645g.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_param_preload_url", this.f494642d);
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_PRELOAD_SEARCH");
        intent.putExtra("tools_param_preload_search_biz", this.f494643e);
        intent.putExtra("tools_param_preload_search_biz_need_reset", this.f494644f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }
}
