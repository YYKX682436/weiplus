package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f150536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b f150537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f150538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b c10915x95dcf60b, int i17) {
        super(1);
        this.f150536d = j17;
        this.f150537e = c10915x95dcf60b;
        this.f150538f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nc downloadInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadInfo, "downloadInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchPatchSizeAsync: got patchSize=");
        long j17 = downloadInfo.f166356d;
        sb6.append(j17);
        sb6.append(", oldPkgPath=");
        sb6.append(downloadInfo.f166358f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", sb6.toString());
        if (j17 <= 0) {
            j17 = this.f150536d;
        }
        com.p314xaae8f345.mm.p874xaefb6cc9.e1 e1Var = new com.p314xaae8f345.mm.p874xaefb6cc9.e1(false, null, this.f150538f, j17, true, 2, null);
        com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b c10915x95dcf60b = this.f150537e;
        c10915x95dcf60b.f150528q = e1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVAModulePkgPathHelper", "fetchPatchSizeAsync: result set, pkgSize=" + j17 + ", hasOldVersion=true");
        c10915x95dcf60b.c();
        return jz5.f0.f384359a;
    }
}
