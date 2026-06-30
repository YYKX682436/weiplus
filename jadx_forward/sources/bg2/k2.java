package bg2;

/* loaded from: classes3.dex */
public final class k2 extends bg2.s6 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f101776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(bg2.n2 n2Var, java.lang.Class cls) {
        super(cls);
        this.f101776b = n2Var;
    }

    @Override // bg2.s6
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17) {
        r45.f52 f52Var;
        cm2.t tVar;
        r45.rc2 result = (r45.rc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        bg2.n2 n2Var = this.f101776b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n2Var.f101855e, "[startPollingPromoteInfo] resp = " + pm0.b0.g(result));
        n2Var.f101857g = result.m75934xbce7f2f(6);
        int m75939xb282bd08 = result.m75939xb282bd08(0);
        java.lang.String str = n2Var.f101855e;
        if (m75939xb282bd08 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] return sync no op");
            return;
        }
        if (result.m75939xb282bd08(1) != 0) {
            if (result.m75939xb282bd08(2) <= 0 || (f52Var = (r45.f52) result.m75936x14adae67(3)) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] notify to replace, currentInfo:" + pm0.b0.g(result));
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = n2Var.f101856f;
            if (j2Var == null) {
                return;
            }
            zl2.r4 r4Var = zl2.r4.f555483a;
            byte[] mo14344x5f01b1f6 = f52Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(r4Var.I2(mo14344x5f01b1f6));
            return;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2 = n2Var.f101856f;
        if (j2Var2 == null || (tVar = (cm2.t) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).mo144003x754a37bb()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] notify to del, currentInfo:" + pm0.b0.g(tVar.b()));
        if (result.m75942xfb822ef2(4) == 0 || result.m75942xfb822ef2(4) != tVar.f124918d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] notify to del but return, currentInfo:" + pm0.b0.g(tVar.b()) + ",svrCurrentPromoteId:" + result.m75942xfb822ef2(4));
            return;
        }
        r45.f52 f52Var2 = (r45.f52) result.m75936x14adae67(3);
        n2Var.f101858h = f52Var2 != null ? f52Var2.m75934xbce7f2f(6) : null;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var3 = n2Var.f101856f;
        if (j2Var3 == null) {
            return;
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var3).k(null);
    }
}
