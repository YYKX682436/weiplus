package tw;

/* loaded from: classes9.dex */
public final class h implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tw.i f503934a;

    public h(tw.i iVar) {
        this.f503934a = iVar;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        tw.i iVar = this.f503934a;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "onSwitchGlobalAutoNotify: " + z17);
        e31.k U6 = iVar.U6();
        if (U6 != null) {
            g31.c0 c0Var = ((g31.l) U6).f349625e;
            c0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[updateGlobalAutoNotify] start, isGlobalAutoNotify=%b", java.lang.Boolean.valueOf(z17));
            if (c0Var.f349604c != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[updateGlobalAutoNotify] cancel previous task");
                l31.y yVar = c0Var.f349604c;
                if (yVar != null) {
                    yVar.a();
                }
            }
            l31.y yVar2 = new l31.y(c0Var.f349602a, z17, new g31.b0(c0Var));
            c0Var.f349604c = yVar2;
            yVar2.run();
        }
        java.lang.String str = z17 ? "ecs_tl_notification_setting_auto_notify_switch_on" : "ecs_tl_notification_setting_auto_notify_switch_off";
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Bj(str, "view_clk", kz5.q0.f395534d, 12, false);
        }
        uw.p.f513034a.c(iVar.m158354x19263085());
    }
}
