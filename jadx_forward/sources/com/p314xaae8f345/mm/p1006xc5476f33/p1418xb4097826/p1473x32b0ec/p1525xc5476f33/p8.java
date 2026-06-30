package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 f195374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var) {
        super(0);
        this.f195374d = t8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kn0.p pVar;
        in0.q e17 = dk2.ef.f314905a.e();
        java.lang.Boolean valueOf = (e17 == null || (pVar = e17.D) == null) ? null : java.lang.Boolean.valueOf(pVar.f391121h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var = this.f195374d;
        if (t8Var.w0() == 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
            t8Var.f195891t++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(t8Var.f195888q, "checkPauseState anchor pause status error:" + t8Var.f195891t + '!');
            long j17 = t8Var.f195891t;
            long j18 = t8Var.f195892u;
            if (j17 < j18) {
                t8Var.t1();
                pm0.z.b(xy2.b.f539688b, "liveAnchorPauseStateError", false, null, null, false, false, null, 124, null);
            } else if (j17 == j18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = t8Var.R0();
                android.content.Context context = t8Var.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                R0.m57765x2eb2fa87((android.app.Activity) context, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3s), "");
            }
        }
        return jz5.f0.f384359a;
    }
}
