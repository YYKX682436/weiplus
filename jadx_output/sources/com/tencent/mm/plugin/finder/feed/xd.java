package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class xd extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f111057a;

    public xd(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f111057a = afVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(view, "view");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1003");
        com.tencent.mm.plugin.finder.feed.af afVar = this.f111057a;
        r45.m70 m70Var = afVar.T;
        java.lang.String str2 = "";
        if (m70Var == null || (str = m70Var.getString(0)) == null) {
            str = "";
        }
        hashMap.put("activityId", str);
        r45.l70 l70Var = afVar.U;
        if (l70Var != null && (string = l70Var.getString(0)) != null) {
            str2 = string;
        }
        hashMap.put("resource_id", str2);
        hashMap.put("enter_sence", afVar.P);
        hashMap.put("share_content_type", "2");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.Q1, hashMap, afVar.Z, afVar.f106266p0, null, null, false, 112, null);
    }
}
