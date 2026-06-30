package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class wd extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f192501a;

    public wd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar) {
        this.f192501a = afVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1003");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f192501a;
        r45.m70 m70Var = afVar.T;
        java.lang.String str2 = "";
        if (m70Var == null || (str = m70Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        hashMap.put("activityId", str);
        r45.l70 l70Var = afVar.U;
        if (l70Var != null && (m75945x2fec8307 = l70Var.m75945x2fec8307(0)) != null) {
            str2 = m75945x2fec8307;
        }
        hashMap.put("resource_id", str2);
        hashMap.put("enter_sence", afVar.P);
        hashMap.put("share_content_type", afVar.Z6() ? "1" : "2");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.N1, hashMap, afVar.Z, afVar.f187799p0, null, null, false, 112, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.O1, hashMap, afVar.Z, afVar.f187799p0, null, null, false, 112, null);
    }
}
