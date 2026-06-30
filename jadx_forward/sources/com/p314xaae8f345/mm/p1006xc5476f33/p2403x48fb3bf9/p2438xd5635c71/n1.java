package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class n1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1 f269399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269400b;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1 r1Var, java.lang.String str) {
        this.f269399a = r1Var;
        this.f269400b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.lang.String str2;
        java.lang.String str3 = this.f269400b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1 r1Var = this.f269399a;
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeixinWebCompt._callback(");
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.c(str3));
            sb6.append(", ");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WebComptCommCgiResp");
            sb6.append(((r45.h97) fVar).f457503d);
            sb6.append(')');
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1.a(r1Var, sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("WeixinWebCompt._callback(");
        sb7.append(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.c(str3));
        sb7.append(", {errType:");
        sb7.append(i17);
        sb7.append(", errCode:");
        sb7.append(i18);
        sb7.append(", errMsg:");
        if (str == null || (str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.c(str)) == null) {
            str2 = "";
        }
        sb7.append(str2);
        sb7.append("})");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1.a(r1Var, sb7.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.s1 s1Var = r1Var.f269427a.f269345b;
        if (s1Var != null) {
            s1Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.K);
        }
    }
}
