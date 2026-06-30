package sm2;

/* loaded from: classes3.dex */
public final class j implements ke2.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f491046b;

    public j(sm2.o4 o4Var, yz5.l lVar) {
        this.f491045a = o4Var;
        this.f491046b = lVar;
    }

    @Override // ke2.f0
    public void a(int i17, int i18, java.lang.String str, r45.h62 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        sm2.o4 o4Var = this.f491045a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "cancel random match: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        yz5.l lVar = this.f491046b;
        if (i17 == 0 && i18 == 0) {
            ((mm2.o4) o4Var.c(mm2.o4.class)).R7(false);
            zn0.x.f555947a.i(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = o4Var.N;
            if (c4Var != null) {
                c4Var.E1();
            }
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        ((mm2.o4) o4Var.c(mm2.o4.class)).R7(false);
        long m75942xfb822ef2 = ((mm2.e1) o4Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicWatcher", "onCloseRandomMatchMicFail errCode: " + i18 + " errType: " + i17 + " liveId: " + m75942xfb822ef2);
        pm0.z.b(xy2.b.f539688b, "micpk_anchorCloseRandomMatchMicFail", false, null, null, false, false, new dk2.ra(i18, i17, m75942xfb822ef2), 60, null);
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
