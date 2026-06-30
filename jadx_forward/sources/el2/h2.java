package el2;

/* loaded from: classes3.dex */
public final class h2 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f335340b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(el2.i2 i2Var, java.lang.Class cls) {
        super(cls);
        this.f335340b = i2Var;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.f52 f52Var;
        r45.rc2 result = (r45.rc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        el2.i2 i2Var = this.f335340b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i2Var.f335362m, "[startPollingPromoteInfo] resp = " + pm0.b0.g(result));
        ((mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class)).N = result.m75934xbce7f2f(6);
        int m75939xb282bd08 = result.m75939xb282bd08(0);
        java.lang.String str = i2Var.f335362m;
        if (m75939xb282bd08 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] return sync no op");
            return;
        }
        if (result.m75933x41a8a7f2(7)) {
            pm0.v.X(new el2.g2(result, i2Var));
        }
        if (result.m75939xb282bd08(1) == 0) {
            so2.j5 j5Var = ((mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class)).f410582w;
            cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
            if (tVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] notify to del, currentInfo:" + pm0.b0.g(tVar.b()));
                if (result.m75942xfb822ef2(4) == 0 || result.m75942xfb822ef2(4) != tVar.f124918d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] notify to del but return, currentInfo:" + pm0.b0.g(tVar.b()) + ",svrCurrentPromoteId:" + result.m75942xfb822ef2(4));
                    return;
                }
                mm2.f6 f6Var = (mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class);
                r45.f52 f52Var2 = (r45.f52) result.m75936x14adae67(3);
                f6Var.M = f52Var2 != null ? f52Var2.m75934xbce7f2f(6) : null;
                qo0.b bVar = qo0.b.O2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR", true);
                i2Var.X6(bVar, bundle);
                return;
            }
            return;
        }
        if (result.m75939xb282bd08(2) <= 0 || (f52Var = (r45.f52) result.m75936x14adae67(3)) == null) {
            return;
        }
        long j17 = ((mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class)).L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] notify to replace, promoteIdHideByVisitor:" + j17 + ", currentInfo:" + pm0.b0.g(result));
        if (f52Var.m75942xfb822ef2(4) != j17 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f52Var.m75945x2fec8307(13), result.m75945x2fec8307(5))) {
            qo0.b bVar2 = qo0.b.N2;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            i2Var.X6(bVar2, bundle2);
            return;
        }
        mm2.f6 f6Var2 = (mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class);
        zl2.r4 r4Var = zl2.r4.f555483a;
        byte[] mo14344x5f01b1f6 = f52Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        f6Var2.c7(r4Var.I2(mo14344x5f01b1f6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPollingPromoteInfo] promoteIdHideByVisitor(" + j17 + ") == new_promote_info.id:(" + f52Var.m75942xfb822ef2(4) + "), local sub_id(it.sub_id) == resp.sub_id(" + result.m75945x2fec8307(5) + "), only update data ");
    }
}
