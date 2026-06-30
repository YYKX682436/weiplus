package df2;

/* loaded from: classes3.dex */
public final class cf implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f311413d;

    public cf(df2.qf qfVar) {
        this.f311413d = qfVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.qf qfVar = this.f311413d;
        boolean U6 = qfVar.U6();
        boolean a86 = ((mm2.c1) qfVar.m56788xbba4bfc0(mm2.c1.class)).a8();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qfVar.f312694m, "observeCommentDanmakuSwitch landscape:" + U6 + ", liveStart:" + a86 + ", enable:" + booleanValue + '!');
        if (U6 && a86) {
            qfVar.b7("enableCommentFloatMsg");
        }
        return jz5.f0.f384359a;
    }
}
