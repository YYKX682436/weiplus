package kf2;

/* loaded from: classes.dex */
public final class r0 extends kf2.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f388829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(df2.k controller, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s liteAppStore) {
        super(controller, liteAppStore);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppStore, "liteAppStore");
        this.f388829d = "GamePendantStartChannelLive";
    }

    @Override // kf2.x
    public boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        kn0.p pVar;
        kf2.w wVar = kf2.x.f388843c;
        java.lang.Integer b17 = wVar.b(obj, "live_entry_scene");
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (!((w0Var == null || (pVar = w0Var.D) == null || !pVar.f()) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388829d, "no float mode, ignore");
            return false;
        }
        if (b17 != null && b17.intValue() == 3) {
            f(1, null);
        } else if (b17 != null && b17.intValue() == 4) {
            f(0, null);
        } else if (b17 != null && b17.intValue() == 5) {
            f(2, null);
        } else if (b17 != null && b17.intValue() == 7) {
            f(3, null);
        } else if (b17 != null && b17.intValue() == 9) {
            f(5, null);
        } else if (b17 != null && b17.intValue() == 10) {
            f(6, null);
        } else if (b17 != null && b17.intValue() == 12) {
            f(11, null);
        } else if (b17 != null && b17.intValue() == 13) {
            f(14, null);
        } else if (b17 != null && b17.intValue() == 14) {
            f(15, wVar.c(obj, "url"));
        } else if (b17 != null && b17.intValue() == 15) {
            f(16, wVar.c(obj, "initDataFromGame"));
        }
        return false;
    }

    @Override // kf2.x
    public java.lang.String e() {
        return "StartChannelLive";
    }

    public final void f(int i17, java.lang.String str) {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        long j17 = c1Var != null ? ((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410516m : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077 c14198xcf03f077 = this.f388844a.f312058p;
        if (c14198xcf03f077 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388829d, "goAnchorUIWithAction " + i17 + ", params:" + str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_DO_ACTION", i17);
            if (str != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION_PARAMS", str);
            }
            em2.u.e(dk2.ef.f314919h, c14198xcf03f077, false, j17, null, intent, 8, null);
        }
    }
}
