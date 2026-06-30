package xx;

/* loaded from: classes5.dex */
public final class w implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xx.y f539358a;

    public w(xx.y yVar) {
        this.f539358a = yVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (!u46.l.c(str, "view_clk")) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "setBrandDataReportBackBtn addDynamicParams");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        long a17 = c01.id.a();
        xx.y yVar = this.f539358a;
        linkedHashMap.put("stay_time", java.lang.Long.valueOf(a17 - yVar.f539361a));
        long j17 = yVar.f539365e;
        if (j17 != 0) {
            linkedHashMap.put("room_id", java.lang.String.valueOf(j17));
        }
        return linkedHashMap;
    }
}
