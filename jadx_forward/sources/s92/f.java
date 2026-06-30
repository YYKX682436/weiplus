package s92;

/* loaded from: classes2.dex */
public final class f implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f486538b;

    public f(java.lang.String str, android.app.Activity activity) {
        this.f486537a = str;
        this.f486538b = activity;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.sz6 sz6Var;
        r45.sz6 sz6Var2;
        r45.sz6 sz6Var3;
        r45.sz6 sz6Var4;
        r45.r03 r03Var;
        java.lang.String viewId = this.f486537a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        android.app.Activity activity = this.f486538b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f c13669xe2583a4f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f.class);
        java.lang.String str2 = null;
        r45.e21 e21Var = (c13669xe2583a4f == null || (r03Var = (r45.r03) c13669xe2583a4f.f534244w) == null) ? null : (r45.e21) r03Var.m75936x14adae67(16);
        long longExtra = activity.getIntent().getLongExtra("key_activity_id", 0L);
        if (e21Var != null) {
            longExtra = e21Var.m75942xfb822ef2(0);
        }
        java.lang.String u17 = pm0.v.u(longExtra);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getReportMap] viewId:");
        sb6.append(viewId);
        sb6.append(" activityId:");
        sb6.append(u17);
        sb6.append(" templateType:");
        sb6.append((e21Var == null || (sz6Var4 = (r45.sz6) e21Var.m75936x14adae67(26)) == null) ? null : java.lang.Integer.valueOf(sz6Var4.m75939xb282bd08(1)));
        sb6.append(" templateId:");
        sb6.append((e21Var == null || (sz6Var3 = (r45.sz6) e21Var.m75936x14adae67(26)) == null) ? null : sz6Var3.m75945x2fec8307(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityReporter", sb6.toString());
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("page_activityid", u17);
        lVarArr[1] = new jz5.l("template_type", (e21Var == null || (sz6Var2 = (r45.sz6) e21Var.m75936x14adae67(26)) == null) ? null : java.lang.Integer.valueOf(sz6Var2.m75939xb282bd08(1)));
        if (e21Var != null && (sz6Var = (r45.sz6) e21Var.m75936x14adae67(26)) != null) {
            str2 = sz6Var.m75945x2fec8307(2);
        }
        lVarArr[2] = new jz5.l("templateid", str2);
        return kz5.c1.k(lVarArr);
    }
}
