package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class j9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 f198704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var) {
        super(1);
        this.f198704d = v9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.of1 it = (r45.of1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var = this.f198704d;
        v9Var.getClass();
        v9Var.A = it.m75939xb282bd08(2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v9Var.f199018d, "updateVisitorRole chooseType:" + v9Var.A);
        int i17 = v9Var.A;
        if (i17 == 10001) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v9Var.m158354x19263085();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", it.m75945x2fec8307(0));
            intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", it.m75945x2fec8307(1));
            intent.putExtra("KEY_SOURCE", v9Var.m158359x1e885992().getIntExtra("KEY_SOURCE", 0));
            intent.putExtra("KEY_REPORT_TO_SVR_SCENE", v9Var.f199036y);
            intent.putExtra("KEY_REPORT_TO_SVR_TS", c01.id.a() - v9Var.f199037z);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Gj(m158354x19263085, intent, 1);
        } else if (v9Var.f199035x) {
            p3325xe03a0797.p3326xc267989b.l.d(v9Var.f199034w, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u9(v9Var, null), 3, null);
        } else {
            v9Var.Q6(i17);
        }
        return jz5.f0.f384359a;
    }
}
