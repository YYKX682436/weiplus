package df2;

/* loaded from: classes3.dex */
public final class kf implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f312112d;

    public kf(df2.qf qfVar) {
        this.f312112d = qfVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mm2.c2 c2Var = (mm2.c2) obj;
        df2.qf qfVar = this.f312112d;
        boolean U6 = qfVar.U6();
        java.lang.String str = "observeDanmakuSpeedChange landscape:" + U6 + ", liveStart:" + ((mm2.c1) qfVar.m56788xbba4bfc0(mm2.c1.class)).a8() + ", speed:" + c2Var + '!';
        java.lang.String str2 = qfVar.f312694m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (U6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "update danmaku speed " + c2Var);
            mm2.y1 P6 = ((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).P6();
            if (P6 != null) {
                df2.qf.c7(qfVar, P6, false, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
