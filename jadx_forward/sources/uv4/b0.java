package uv4;

/* loaded from: classes15.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv4.y f512956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512957e;

    public b0(uv4.y yVar, java.lang.String str) {
        this.f512956d = yVar;
        this.f512957e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f512957e;
        uv4.z zVar = (uv4.z) this.f512956d;
        android.content.Context context = zVar.f513000a;
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19223x6a3bf07) zVar.f513001b).a(context, str);
            dp.a.m125854x26a183b(context, "模板已更新，打开搜一搜", 0).show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "DefaultCallback.onSuccess: launch failed: %s", e17.getMessage());
            dp.a.m125854x26a183b(context, "打开搜一搜失败: " + e17.getMessage(), 1).show();
        }
    }
}
