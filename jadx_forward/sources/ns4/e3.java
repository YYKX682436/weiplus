package ns4;

/* loaded from: classes8.dex */
public final class e3 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421045a;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421045a = activityC19068x49d5e62b;
    }

    @Override // wd0.p1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        ((vd0.j2) ((wd0.q1) i95.n0.c(wd0.q1.class))).wi(false, 8L);
        ms4.o0 o0Var = this.f421045a.f260718d;
        if (o0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        o0Var.P6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "changeSwitchWechatForStatus2CommonTips onPositionBtn.");
    }
}
