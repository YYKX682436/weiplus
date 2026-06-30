package xx;

/* loaded from: classes14.dex */
public final class x implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xx.y f539359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xx.g f539360b;

    public x(xx.y yVar, xx.g gVar) {
        this.f539359a = yVar;
        this.f539360b = gVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (!u46.l.c(str, "page_out")) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "BrandDataReportPage addDynamicParams");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        long a17 = c01.id.a();
        xx.y yVar = this.f539359a;
        linkedHashMap.put("stay_time", java.lang.Long.valueOf(a17 - yVar.f539361a));
        long j17 = yVar.f539365e;
        if (j17 != 0) {
            linkedHashMap.put("room_id", java.lang.String.valueOf(j17));
        }
        if (this.f539360b == xx.g.f539324f) {
            xx.z zVar = yVar.f539373m;
            linkedHashMap.put("user_comment_cnt", java.lang.String.valueOf(zVar.f539376a));
            linkedHashMap.put("new_question_cnt", java.lang.String.valueOf(zVar.f539377b));
            linkedHashMap.put("avatar_answer_cnt", java.lang.String.valueOf(zVar.f539382g));
            linkedHashMap.put("online_user_cnt", java.lang.String.valueOf(zVar.f539378c));
            linkedHashMap.put("daily_chat_pv", java.lang.String.valueOf(zVar.f539379d));
            linkedHashMap.put("if_answer_question", java.lang.String.valueOf(zVar.f539380e));
            linkedHashMap.put("avatar_self_answer_cnt", java.lang.String.valueOf(zVar.f539381f));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "page out :" + linkedHashMap);
        return linkedHashMap;
    }
}
