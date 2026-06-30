package de;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f310898a;

    public b(de.c cVar, yz5.l lVar) {
        this.f310898a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0
    public final void a(java.lang.String str) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LogoCaptureDelegate", "loadIcon, localPath: " + str);
        android.graphics.Bitmap i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str);
        yz5.l lVar = this.f310898a;
        if (i07 != null) {
            lVar.mo146xb9724478(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(i07, 3));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.mo146xb9724478(null);
        }
    }
}
