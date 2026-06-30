package df2;

/* loaded from: classes3.dex */
public final class of implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f312498d;

    public of(df2.qf qfVar) {
        this.f312498d = qfVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.qf qfVar = this.f312498d;
        boolean a86 = ((mm2.c1) qfVar.m56788xbba4bfc0(mm2.c1.class)).a8();
        java.lang.String str = qfVar.f312694m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "observePrivilegeFloatMsgSwitch liveStart:" + a86 + ", customerEnableDanmakuFlow:" + booleanValue + '!');
        if (a86) {
            mm2.y1 P6 = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6();
            if (P6 != null && booleanValue == P6.f411086b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateCommentConfig but newCustomPrivilegeFloatMsgSwitch:" + booleanValue + " same with old value");
            } else {
                mm2.y1 P62 = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6();
                if (P62 != null) {
                    P62.f411086b = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).R6() && booleanValue;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update custom privilege float msg switch baseConfig:" + ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6());
                mm2.y1 P63 = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6();
                if (P63 != null) {
                    df2.qf.c7(qfVar, P63, false, 2, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
