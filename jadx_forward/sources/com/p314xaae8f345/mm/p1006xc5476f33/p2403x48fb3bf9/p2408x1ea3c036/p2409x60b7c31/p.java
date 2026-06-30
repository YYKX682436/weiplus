package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f263955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q f263958g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q qVar, java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2) {
        this.f263958g = qVar;
        this.f263955d = linkedList;
        this.f263956e = str;
        this.f263957f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q qVar = this.f263958g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6 x6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) qVar.f263971a.f488129a).f488143d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o(this);
        sd.b bVar = qVar.f263971a;
        java.util.LinkedList linkedList = this.f263955d;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "scopeInfoList is empty!");
            bVar.c("fail", null);
        } else {
            if (x6Var.a(linkedList, this.f263956e, this.f263957f, null, oVar)) {
                return;
            }
            bVar.c("fail", null);
        }
    }
}
