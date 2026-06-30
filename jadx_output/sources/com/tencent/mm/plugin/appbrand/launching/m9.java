package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public class m9 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f84785d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.launching.l9.f84763p, "LaunchWxaAppPBTable")};

    public m9(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.launching.l9.f84763p, "LaunchWxaAppPBTable", dm.i7.f237602g);
    }

    public boolean y0(java.lang.String str, r45.v54 v54Var) {
        if (android.text.TextUtils.isEmpty(str) || v54Var == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.l9 l9Var = new com.tencent.mm.plugin.appbrand.launching.l9();
        l9Var.field_appId = str;
        l9Var.field_launchPB = v54Var;
        return super.replace(l9Var);
    }
}
