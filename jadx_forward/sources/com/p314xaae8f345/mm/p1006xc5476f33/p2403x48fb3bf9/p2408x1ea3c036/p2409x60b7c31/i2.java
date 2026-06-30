package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f263873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j2 f263876h;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j2 j2Var, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3) {
        this.f263876h = j2Var;
        this.f263872d = str;
        this.f263873e = linkedList;
        this.f263874f = str2;
        this.f263875g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j2 j2Var = this.f263876h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6 x6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) j2Var.f263887a.f488129a).f488143d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.h2(this);
        sd.b bVar = j2Var.f263887a;
        java.util.LinkedList linkedList = this.f263873e;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "scopeInfoList is empty!");
            bVar.c("fail", null);
        } else {
            if (x6Var.a(linkedList, this.f263874f, this.f263875g, null, h2Var)) {
                return;
            }
            bVar.c("fail", null);
        }
    }
}
