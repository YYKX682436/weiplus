package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ue implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f190686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f190687e;

    public ue(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, boolean z17) {
        this.f190686d = afVar;
        this.f190687e = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            int i19 = 0;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            if (!stringArrayListExtra.isEmpty()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f190686d;
                r45.m70 m70Var = afVar.T;
                java.lang.String str2 = "";
                if (m70Var == null || (str = m70Var.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                hashMap.put("activityId", str);
                hashMap.put("is_fast_share", "0");
                hashMap.put("share_type", "1");
                hashMap.put("enter_sence", afVar.P);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.lang.Object obj : stringArrayListExtra) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str3 = (java.lang.String) obj;
                    if (i19 == 0) {
                        sb6.append(str3);
                    } else {
                        sb6.append("#" + str3);
                    }
                    i19 = i27;
                }
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                hashMap.put("share_wx_username", sb7);
                r45.m70 m70Var2 = afVar.T;
                if (m70Var2 != null && (m75945x2fec8307 = m70Var2.m75945x2fec8307(21)) != null) {
                    str2 = m75945x2fec8307;
                }
                hashMap.put("resource_id", str2);
                hashMap.put("enter_sence", afVar.P);
                hashMap.put("share_content_type", this.f190687e ? "2" : "1");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.Y1, hashMap, afVar.Z, afVar.f187799p0, null, null, false, 112, null);
            }
        }
    }
}
