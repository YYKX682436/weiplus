package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class t2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.w2 f79739c;

    public t2(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var) {
        this.f79737a = yVar;
        this.f79738b = i17;
        this.f79739c = w2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.o oVar = (jz5.o) obj;
        r45.j14 j14Var = (r45.j14) oVar.f302841d;
        java.lang.String str = (java.lang.String) oVar.f302842e;
        java.lang.String str2 = (java.lang.String) oVar.f302843f;
        java.lang.Integer valueOf = j14Var != null ? java.lang.Integer.valueOf(j14Var.f377491d) : null;
        int i17 = this.f79738b;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79737a;
        com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var = this.f79739c;
        if (valueOf != null && valueOf.intValue() == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("code", str);
            yVar.a(i17, w2Var.p("ok", hashMap));
        } else if (valueOf == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail invalid ");
            w2Var.getClass();
            if (kotlin.jvm.internal.o.b(str2, "/cgi-bin/mmbiz-bin/js-login")) {
                str2 = "js-login";
            } else if (kotlin.jvm.internal.o.b(str2, "/cgi-bin/mmbiz-bin/js-login-confirm")) {
                str2 = "js-login-confirm";
            }
            sb6.append(str2);
            sb6.append(" response");
            yVar.a(i17, w2Var.o(sb6.toString()));
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail ");
            w2Var.getClass();
            if (kotlin.jvm.internal.o.b(str2, "/cgi-bin/mmbiz-bin/js-login")) {
                str2 = "js-login";
            } else if (kotlin.jvm.internal.o.b(str2, "/cgi-bin/mmbiz-bin/js-login-confirm")) {
                str2 = "js-login-confirm";
            }
            sb7.append(str2);
            sb7.append(" response errcode=");
            sb7.append(valueOf);
            sb7.append(" errmsg=");
            sb7.append(j14Var.f377492e);
            yVar.a(i17, w2Var.o(sb7.toString()));
        }
        return jz5.f0.f302826a;
    }
}
