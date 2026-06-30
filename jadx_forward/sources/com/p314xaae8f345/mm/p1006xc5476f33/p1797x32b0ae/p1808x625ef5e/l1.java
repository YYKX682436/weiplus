package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes8.dex */
public class l1 implements kh0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h f225539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225542d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar, java.lang.String str, java.lang.String str2) {
        this.f225542d = g1Var;
        this.f225539a = hVar;
        this.f225540b = str;
        this.f225541c = str2;
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f225539a;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkCustomDownloadLiteApp fail: %s", this.f225540b);
        } else {
            hVar.mo25333x2fd71e(this.f225541c, 5);
        }
    }

    @Override // kh0.e
    /* renamed from: onSuccess */
    public void mo45046xe05b4124(java.lang.String str) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = this.f225542d.y(str, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f225539a;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkCustomDownloadLiteApp success: %s", str);
        } else if (y17 != null) {
            hVar.mo25334x90b54003(y17, 0);
        } else {
            hVar.mo25333x2fd71e(str, 5);
        }
    }
}
