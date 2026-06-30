package eg4;

/* loaded from: classes4.dex */
public final class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d f334361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.c f334362e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d, in5.c cVar) {
        this.f334361d = activityC18505x6ae0de9d;
        this.f334362e = cVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d.f253695p;
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d = this.f334361d;
            activityC18505x6ae0de9d.getClass();
            in5.c cVar = this.f334362e;
            if (!(cVar instanceof eg4.h2)) {
                if (cVar instanceof eg4.i2) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = ((eg4.i2) cVar).f334265d;
                    r21.v.a(m7Var.f66370x5ea2cb68, m7Var.f66376x114ef53e);
                    activityC18505x6ae0de9d.W6();
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar = ((eg4.h2) cVar).f334257d;
            java.lang.String str = ibVar.f68087x5285fa99;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "deleteNewData: " + str);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC18505x6ae0de9d, activityC18505x6ae0de9d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
            xg3.u uVar = (xg3.u) i95.n0.c(xg3.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String str2 = ibVar.f68090x114ef53e;
            eg4.k0 k0Var = new eg4.k0(activityC18505x6ae0de9d, f17, str);
            ft1.j jVar = (ft1.j) uVar;
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "deleteVerifyRecord: encryptUsername=" + str + ", talker=" + str2);
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) jVar.f348027d).mo141623x754a37bb(), null, new ft1.e(str, jVar, k0Var, null), 1, null);
        }
    }
}
