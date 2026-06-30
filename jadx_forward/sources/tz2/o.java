package tz2;

/* loaded from: classes14.dex */
public final class o implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tz2.q f504843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tz2.l f504844b;

    public o(tz2.q qVar, tz2.l lVar) {
        this.f504843a = qVar;
        this.f504844b = lVar;
    }

    @Override // h72.r
    public final void a(java.lang.String str) {
        tz2.q qVar = this.f504843a;
        tz2.q.a(qVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video record done. using: ");
        long j17 = qVar.f504852c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        sb6.append(" ms. file path: ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashRecordManagerForPay", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            tz2.q.a(qVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashRecordManagerForPay", "cdn upload filePath is empty");
            h72.s.e().d();
            return;
        }
        int ordinal = this.f504844b.ordinal();
        if (ordinal == 0) {
            h72.s.e().d();
            return;
        }
        if (ordinal == 1) {
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
            if (c20976x6ba6452a != null) {
                v65.i.b(c20976x6ba6452a, null, new tz2.n(str, qVar, null), 1, null);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            tz2.q.a(qVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashRecordManagerForPay", "invalid cdnUploadType");
            h72.s.e().d();
        } else {
            yz5.l lVar = qVar.f504851b;
            if (lVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                lVar.mo146xb9724478(str);
            }
        }
    }
}
