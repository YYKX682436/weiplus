package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes5.dex */
public final class n1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264571d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264572e;

    public n1(int i17, java.lang.String appId, java.lang.String nickname, java.lang.String fileId, java.lang.String oriAvatarUrl, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriAvatarUrl, "oriAvatarUrl");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.in4();
        lVar.f152198b = new r45.jn4();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_modavatar";
        lVar.f152200d = 29251;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264571d = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModAvatarReq");
        r45.in4 in4Var = (r45.in4) fVar;
        in4Var.f458700d = i17;
        in4Var.f458703g = appId;
        in4Var.f458701e = nickname;
        if (z17) {
            in4Var.f458702f = fileId;
        }
        in4Var.f458704h = oriAvatarUrl;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f264572e = u0Var;
        return mo9409x10f9447a(sVar, this.f264571d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 29251;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f264572e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
