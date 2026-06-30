package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes.dex */
public final class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f170072a;

    public p(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f170072a = qVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        boolean z17 = i17 == 0 && i18 == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "generateDefaultPosterPath: sun code request result - success=" + z17 + ", errType=" + i17 + ", errCode=" + i18);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f170072a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandScreenshotComponentHelper", "generateDefaultPosterPath: failed to get sun code");
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetWxaSunCodeResponse");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ((r45.bt3) fVar).f452568d;
        if (gVar != null) {
            byte[] bArr = gVar.f273689a;
        }
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(gVar));
    }
}
