package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class v6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268108e;

    public v6(nw4.k kVar, nw4.y2 y2Var) {
        this.f268107d = kVar;
        this.f268108e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj).f149937d;
        if (i17 == 1) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "创建成功");
            hashMap.put("code", 100);
            hashMap.put("err_msg", "openFinderCreateAcctView:ok");
        } else if (i17 == 2) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "用户取消");
            hashMap.put("code", 200);
            hashMap.put("err_msg", "openFinderCreateAcctView:cancel");
        } else if (i17 == 3) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "参数为空");
            hashMap.put("code", 300);
            hashMap.put("err_msg", "openFinderCreateAcctView:fail");
        } else if (i17 == 4) {
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "账号已存在");
            hashMap.put("code", 301);
            hashMap.put("err_msg", "openFinderCreateAcctView:fail");
        }
        nw4.g gVar = this.f268107d.f422396d;
        nw4.y2 y2Var = this.f268108e;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":success", hashMap);
    }
}
