package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class e0 implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z53.i f221152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl0.g f221154c;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.f0 f0Var, z53.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, cl0.g gVar) {
        this.f221152a = iVar;
        this.f221153b = q5Var;
        this.f221154c = gVar;
    }

    @Override // u53.x
    public void a(java.util.Map map) {
        cl0.g gVar = this.f221154c;
        z53.i iVar = this.f221152a;
        u53.u uVar = (u53.u) map.get(iVar.f67670x114ef53e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221153b;
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetGameChatRedInfo", "contact is null");
            q5Var.a("contact is null", null);
            return;
        }
        cl0.g gVar2 = new cl0.g();
        try {
            gVar2.h("avatarUrl", ((y53.m) uVar).f67427x81118851);
            gVar2.r("isValid", ((y53.m) uVar).B);
            gVar2.h("nickName", ((y53.m) uVar).f67429x21f9b213);
            gVar2.o("unreadCount", iVar.f67671xa35b5abb);
            gVar2.h("userName", iVar.f67670x114ef53e);
            gVar2.p("lastMsgUpdateTime", iVar.f67672xa783a79b);
            gVar.h("lastUnReadConversationInfo", gVar2);
        } catch (cl0.f unused) {
        }
        q5Var.a(null, gVar);
    }
}
