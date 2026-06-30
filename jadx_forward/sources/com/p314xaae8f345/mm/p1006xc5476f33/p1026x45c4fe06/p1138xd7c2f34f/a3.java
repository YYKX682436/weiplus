package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class a3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.lb {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 f166017s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p pVar, boolean z17, boolean z18) {
        super(str, i17, str2, str3, i18, c11829x68027553, i19, c12566x87f2d8b7, pVar, z17, z18);
        this.f166017s = x2Var;
        boolean z19 = x2Var.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z5 z5Var = this.f166301n;
        if (z5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8) z5Var).f166648p = z19;
        }
        g(x2Var.d());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.lb
    public void j(int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar;
        if (this.f166017s.f166898h == null || (rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) this.f166017s.f166898h).f166214d) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
        c12334xbda92906.f165922h = i17;
        c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_DOWNLOAD_PROGRESS;
        rVar.a(c12334xbda92906);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.lb
    public void k() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar;
        super.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var = this.f166017s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "preDownload, appId %s, versionType %d", x2Var.f166908r, java.lang.Integer.valueOf(x2Var.f166909s));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        x2Var.f166903o = java.lang.System.currentTimeMillis();
        if (x2Var.f166898h == null || (rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) x2Var.f166898h).f166214d) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
        c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_NEED_DOWNLOAD;
        c12334xbda92906.f165923i = java.lang.System.currentTimeMillis();
        rVar.a(c12334xbda92906);
    }
}
