package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class j0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f163390a;

    public j0(km5.b bVar) {
        this.f163390a = bVar;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public final void mo14598x57429edc(int i17, android.content.Intent intent) {
        km5.b bVar = this.f163390a;
        if (intent == null || i17 == 0) {
            bVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x.f163657a);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
        if (c16527xe4fc886 == null) {
            bVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y("get null sight capture result"));
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z(kz5.b0.c(new com.p314xaae8f345.mm.vfs.r6(c16527xe4fc886.f230340e ? c16527xe4fc886.f230348p : c16527xe4fc886.f230342g)), 2);
        bVar.c(objArr);
    }
}
