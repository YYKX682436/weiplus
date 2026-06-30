package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.m0 f269037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f269038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 f269039f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hy4.m0 m0Var, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var) {
        super(1);
        this.f269037d = m0Var;
        this.f269038e = lVar;
        this.f269039f = r0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        hy4.m0 m0Var = this.f269037d;
        m0Var.f367707b = 3;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sourUserName", username);
        m0Var.f367706a = username;
        yz5.l lVar = this.f269038e;
        if (lVar != null) {
            lVar.mo146xb9724478(username);
        } else {
            nw4.n g07 = this.f269039f.g0();
            if (g07 != null) {
                g07.j("sendAppMessage", true);
                g07.j0(hashMap, 2);
            }
        }
        return jz5.f0.f384359a;
    }
}
