package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class g5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 f198645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f198646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var, android.content.Intent intent) {
        super(0);
        this.f198645d = r5Var;
        this.f198646e = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = this.f198645d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = r5Var.N6();
        if (!(N6 != null && N6.isFinishing())) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = r5Var.N6();
            if (!(N62 != null && N62.isDestroyed())) {
                android.content.Intent intent = this.f198646e;
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("KEY_PARAMS_DO_ACTION_PARAMS") : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5Var.f198891m, "[clickGame] param = " + stringExtra);
                qo0.b bVar = qo0.b.B2;
                android.os.Bundle bundle = new android.os.Bundle();
                if (stringExtra != null) {
                    bundle.putString("KEY_PARAMS_DO_ACTION_PARAMS", stringExtra);
                }
                r5Var.X6(bVar, bundle);
            }
        }
        return jz5.f0.f384359a;
    }
}
