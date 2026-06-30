package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a f168310a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b bVar) {
        this.f168310a = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar = this.f168310a;
        if (aVar.J().R.e()) {
            java.lang.String d17 = aVar.J().R.d(str);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8.equals(d17)) {
                return;
            }
            aVar.f167917v.a(d17, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(d17);
            sb6.append(d17.endsWith("/") ? "" : "/");
            java.lang.String sb7 = sb6.toString();
            e(sb7 + "common.app.js");
            e(sb7 + "webview.app.js");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public void b(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public boolean c(java.lang.String str) {
        return "webview.app.js".equals(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    public void d() {
        this.f168310a.f167917v.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, true);
        e("common.app.js");
        e("webview.app.js");
    }

    public final void e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar = this.f168310a;
        java.lang.String a17 = aVar.O().a(str);
        if (android.text.TextUtils.isEmpty(a17)) {
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6(str);
        }
        aVar.P(str, a17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i
    /* renamed from: name */
    public java.lang.String mo52165x337a8b() {
        return "LazyCodeLoading";
    }
}
