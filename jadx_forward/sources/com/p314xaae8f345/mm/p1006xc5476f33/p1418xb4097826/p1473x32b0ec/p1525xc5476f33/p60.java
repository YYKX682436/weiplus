package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo0.b f195368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f195369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f195370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(qo0.b bVar, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        super(0);
        this.f195368d = bVar;
        this.f195369e = bundle;
        this.f195370f = r60Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] byteArray;
        byte[] byteArray2;
        int ordinal = this.f195368d.ordinal();
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f195370f;
        if (ordinal != 111) {
            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            android.os.Bundle bundle = this.f195369e;
            switch (ordinal) {
                case 117:
                    if (bundle != null && (byteArray = bundle.getByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA")) != null) {
                        zl2.r4 r4Var = zl2.r4.f555483a;
                        cm2.t I2 = r4Var.I2(byteArray);
                        if (I2 != null && I2.f124922h > 0) {
                            p3325xe03a0797.p3326xc267989b.r2 r2Var = r60Var.B;
                            if (r2Var != null && r2Var.a()) {
                                z17 = true;
                            }
                            if (z17) {
                                java.lang.Long l17 = r60Var.D;
                                long j17 = I2.f124918d;
                                if (l17 != null && l17.longValue() == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r60Var.E, I2.f124929r)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r60Var.f195631s, "same item, don not repeat delay!!, only update data!");
                                    ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(I2);
                                    break;
                                }
                            }
                        }
                        cm2.t I22 = r4Var.I2(byteArray);
                        if (I22 != null) {
                            r60Var.w1();
                            r60Var.B = p3325xe03a0797.p3326xc267989b.l.d(i2Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l60(I22, r60Var, null), 3, null);
                            break;
                        }
                    }
                    break;
                case 118:
                    if (bundle != null && (byteArray2 = bundle.getByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA")) != null) {
                        zl2.r4 r4Var2 = zl2.r4.f555483a;
                        cm2.t I23 = r4Var2.I2(byteArray2);
                        if (I23 != null && I23.f124922h > 0) {
                            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = r60Var.B;
                            if (r2Var2 != null && r2Var2.a()) {
                                z17 = true;
                            }
                            if (z17) {
                                java.lang.Long l18 = r60Var.D;
                                long j18 = I23.f124918d;
                                if (l18 != null && l18.longValue() == j18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r60Var.E, I23.f124929r)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r60Var.f195631s, "same item, don not repeat delay!!, only update data!");
                                    ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(I23);
                                    break;
                                }
                            }
                        }
                        r60Var.w1();
                        cm2.t I24 = r4Var2.I2(byteArray2);
                        if (I24 != null) {
                            r60Var.B = p3325xe03a0797.p3326xc267989b.l.d(i2Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n60(r60Var, I24, null), 3, null);
                            break;
                        }
                    }
                    break;
                case 119:
                    r60Var.w1();
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o60(bundle, r60Var));
                    break;
            }
        } else if (r60Var.f195633u instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj) {
            r60Var.z1(false, false, false);
        }
        return jz5.f0.f384359a;
    }
}
