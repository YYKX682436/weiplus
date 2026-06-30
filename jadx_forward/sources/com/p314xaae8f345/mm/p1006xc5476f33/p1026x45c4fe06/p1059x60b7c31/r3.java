package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class r3 implements vg3.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s3 f164424c;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s3 s3Var) {
        this.f164422a = lVar;
        this.f164423b = i17;
        this.f164424c = s3Var;
    }

    @Override // vg3.h3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s3 s3Var = this.f164424c;
        int i17 = this.f164423b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164422a;
        if (z17) {
            if (str2 == null || str2.length() == 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("openId", str2);
                if (lVar != null) {
                    lVar.a(i17, s3Var.p("ok", hashMap));
                    return;
                }
                return;
            }
        }
        if (lVar != null) {
            lVar.a(i17, s3Var.o("fail"));
        }
    }
}
