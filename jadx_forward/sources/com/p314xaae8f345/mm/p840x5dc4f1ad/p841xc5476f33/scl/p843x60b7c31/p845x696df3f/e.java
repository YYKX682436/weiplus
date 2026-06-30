package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f;

/* loaded from: classes.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.f f150206d;

    public e(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.f fVar) {
        this.f150206d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10863xd9b89d69 c10863xd9b89d69 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10863xd9b89d69) obj;
        long j17 = c10863xd9b89d69.f150200d;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.f fVar = this.f150206d;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiSetGestureRects", "ipc ret ok");
            fVar.s().mo146xb9724478(fVar.k());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ipc ret: errCode ");
        long j18 = c10863xd9b89d69.f150200d;
        sb6.append(j18);
        sb6.append(", errMsg ");
        java.lang.String str = c10863xd9b89d69.f150201e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiSetGestureRects", sb6.toString());
        fVar.s().mo146xb9724478(fVar.h((int) j18, str));
    }
}
