package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public final class p2 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f263965a;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f263965a = q5Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (num != null && num.intValue() == 1) {
            jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "创建成功");
            jSONObject.put("code", 100);
            jSONObject.put("err_msg", "openFinderCreateAcctView:ok");
        } else if (num != null && num.intValue() == 2) {
            jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "用户取消");
            jSONObject.put("code", 200);
            jSONObject.put("err_msg", "openFinderCreateAcctView:cancel");
        } else if (num != null && num.intValue() == 3) {
            jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "参数为空");
            jSONObject.put("code", 300);
            jSONObject.put("err_msg", "openFinderCreateAcctView:fail");
        } else if (num != null && num.intValue() == 4) {
            jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "账号已存在");
            jSONObject.put("code", 301);
            jSONObject.put("err_msg", "openFinderCreateAcctView:fail");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f263965a;
        if (q5Var != null) {
            q5Var.a(null, jSONObject);
        }
    }
}
