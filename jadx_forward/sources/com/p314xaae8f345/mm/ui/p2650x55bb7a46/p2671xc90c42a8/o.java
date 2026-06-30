package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f283910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f283911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y f283912g;

    public o(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar, boolean z17, long j17, int i17) {
        this.f283912g = yVar;
        this.f283909d = z17;
        this.f283910e = j17;
        this.f283911f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f283909d;
        java.lang.String str = z17 ? "chat_history_search_show_tab_result" : "chat_history_search_tab_result_exit";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("search_chat_sessionid", de5.a.f310930b);
        hashMap.put("clk_search_sessionid", "" + java.lang.System.currentTimeMillis());
        hashMap.put(z17 ? "show_result_duration" : "click_exit_duration", java.lang.Long.valueOf(this.f283910e));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar = this.f283912g;
        hashMap.put("clk_search_tab", java.lang.Integer.valueOf(yVar.k()));
        hashMap.put("chat_msg_cnt", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).j7(yVar.f284075e)));
        hashMap.put("chat_name", yVar.f284075e);
        hashMap.put("search_result_cnt", java.lang.Integer.valueOf(this.f283911f));
        yVar.getClass();
        hashMap.put("from", "v1");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap, 38014);
    }
}
