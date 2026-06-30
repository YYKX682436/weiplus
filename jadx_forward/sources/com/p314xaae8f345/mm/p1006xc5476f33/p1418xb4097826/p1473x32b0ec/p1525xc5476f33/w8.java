package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f196417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f196418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b9 f196419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b9 b9Var) {
        super(0);
        this.f196417d = i17;
        this.f196418e = i18;
        this.f196419f = b9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f196417d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b9 b9Var = this.f196419f;
        if (i17 == 0 && this.f196418e == 0) {
            mm2.c1 c1Var = (mm2.c1) b9Var.P0(mm2.c1.class);
            r45.jy1 jy1Var = new r45.jy1();
            jy1Var.set(0, 0);
            jy1Var.set(2, 0);
            c1Var.W9(jy1Var, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v8(b9Var));
        } else if (((mm2.c1) b9Var.P0(mm2.c1.class)).a8()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = b9Var.R0();
            android.content.Context context = b9Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            R0.m57765x2eb2fa87((android.app.Activity) context, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3o), "");
            if (pm0.v.z(((mm2.c1) b9Var.P0(mm2.c1.class)).f410340g2, 524288)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8) b9Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8.class);
                if (t8Var != null) {
                    t8Var.t1();
                }
            } else {
                qo0.c.a(b9Var.f193519p, qo0.b.f446938q4, null, 2, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b9Var.f193520q, "handleResumeLiveResp liveState:" + ((mm2.c1) b9Var.P0(mm2.c1.class)).f410346h2 + '!');
        }
        return jz5.f0.f384359a;
    }
}
