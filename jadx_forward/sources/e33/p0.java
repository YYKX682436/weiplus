package e33;

/* loaded from: classes4.dex */
public class p0 implements s23.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328962a;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328962a = activityC15653x403456cd;
    }

    @Override // s23.o
    public boolean a() {
        return true;
    }

    @Override // s23.o
    public void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328962a;
        if (i17 <= 0) {
            activityC15653x403456cd.getClass();
        } else {
            activityC15653x403456cd.Q = i17;
            activityC15653x403456cd.a8(activityC15653x403456cd.f220061m.J());
        }
    }

    @Override // s23.o
    public java.util.ArrayList c() {
        e33.b0 b0Var = this.f328962a.f220061m;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f328664g;
    }

    @Override // s23.o
    public boolean d() {
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        ez0.f fVar = ez0.f.f339323a;
        boolean z17 = !((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_maas_album_tips_display_force_disable, false);
        boolean z18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SERVER_VIDEO_TEMPLATE_TIPS_DISABLE_INT, 0) == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", "checkConfigEnableDisplay: " + z17 + ' ' + z18);
        return z17 && z18;
    }

    @Override // s23.o
    /* renamed from: getActivity */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo126862x19263085() {
        return this.f328962a;
    }
}
