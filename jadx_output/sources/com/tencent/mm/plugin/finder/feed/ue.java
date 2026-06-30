package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ue implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f109153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f109154e;

    public ue(com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        this.f109153d = afVar;
        this.f109154e = z17;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String string;
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            int i19 = 0;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            if (!stringArrayListExtra.isEmpty()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                com.tencent.mm.plugin.finder.feed.af afVar = this.f109153d;
                r45.m70 m70Var = afVar.T;
                java.lang.String str2 = "";
                if (m70Var == null || (str = m70Var.getString(0)) == null) {
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
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                hashMap.put("share_wx_username", sb7);
                r45.m70 m70Var2 = afVar.T;
                if (m70Var2 != null && (string = m70Var2.getString(21)) != null) {
                    str2 = string;
                }
                hashMap.put("resource_id", str2);
                hashMap.put("enter_sence", afVar.P);
                hashMap.put("share_content_type", this.f109154e ? "2" : "1");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.Y1, hashMap, afVar.Z, afVar.f106266p0, null, null, false, 112, null);
            }
        }
    }
}
