package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a f168339a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b bVar) {
        this.f168339a = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar = this.f168339a;
        if (aVar.J().R.e()) {
            java.lang.String d17 = aVar.J().R.d(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(d17);
            sb6.append(d17.endsWith("/") ? "" : "/");
            sb6.append("page-frame.js");
            java.lang.String sb7 = sb6.toString();
            java.lang.String a17 = aVar.O().a(sb7);
            if (android.text.TextUtils.isEmpty(a17)) {
                throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6(sb7);
            }
            aVar.f167917v.a(d17, false);
            aVar.P(sb7, a17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar = this.f168339a;
        aVar.P(str, aVar.O().a(str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public boolean c(java.lang.String str) {
        return "app-wxss.js".equals(str) || "page-frame.html".equals(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar = this.f168339a;
        aVar.f167917v.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, false);
        if (!aVar.J().R.e()) {
            aVar.P("page-frame.html", aVar.O().a("page-frame.html"));
            return;
        }
        java.lang.String a17 = aVar.O().a("app-wxss.js");
        if (android.text.TextUtils.isEmpty(a17)) {
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6("app-wxss.js");
        }
        aVar.P("app-wxss.js", a17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    /* renamed from: name */
    public java.lang.String mo52165x337a8b() {
        return "Legacy";
    }
}
