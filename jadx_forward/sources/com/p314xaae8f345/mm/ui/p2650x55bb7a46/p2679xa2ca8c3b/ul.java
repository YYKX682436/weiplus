package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ul implements xe0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f287245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl f287247d;

    public ul(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl wlVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f287247d = wlVar;
        this.f287244a = str;
        this.f287245b = i17;
        this.f287246c = str2;
    }

    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl wlVar = this.f287247d;
        if (!z17) {
            db5.e1.s(wlVar.f287483s.g(), wlVar.f287483s.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8), "");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("werun_daily_push_list;");
        java.lang.String str2 = this.f287244a;
        sb6.append(str2);
        sb6.append(";");
        sb6.append(this.f287245b);
        java.lang.String sb7 = sb6.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "11";
        arrayList.add(j0Var);
        pj4.j0 j0Var2 = new pj4.j0();
        j0Var2.f436672d = "3";
        j0Var2.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList.add(j0Var2);
        bi4.c1 c1Var = new bi4.c1();
        c1Var.b(str2);
        c1Var.a(this.f287246c);
        c1Var.h(str);
        c1Var.f("wx7fa037cc7dfabad5@jsticket");
        c1Var.g(wlVar.f287483s.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5b));
        c1Var.f102567a.f436487x = sb7;
        c1Var.c(arrayList);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(wlVar.f287483s.g(), c1Var.f102567a);
    }
}
