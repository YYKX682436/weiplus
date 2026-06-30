package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.ProfileSettingUI */
/* loaded from: classes11.dex */
public class ActivityC16866xa4426d5b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235318d;

    /* renamed from: e, reason: collision with root package name */
    public cr3.d0 f235319e;

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (this.f235318d.d1().equals(str)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
                this.f235318d = n17;
                if (n17 != null) {
                    this.f235319e.f303465e = n17;
                    mo43517x10010bd5();
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576446bf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x012c, code lost:
    
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(r8.f235318d.d1()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010c, code lost:
    
        if ("3552365301".equals(r8.f235318d.Q0()) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036c  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16866xa4426d5b.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileSettingUI", "username is null %s", stringExtra);
            finish();
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(stringExtra, true);
        this.f235318d = n17;
        this.f235319e = new cr3.d0(this, n17);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(this.f235318d.d1())) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.pgq);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hni);
        }
        mo54448x9c8c0d33(new hr3.jc(this));
        mo43517x10010bd5();
        ((l75.a1) c01.d9.b().q()).a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        cr3.d0 d0Var = this.f235319e;
        d0Var.getClass();
        ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(d0Var);
        ((l75.a1) c01.d9.b().q()).e(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileSettingUI", str + " item has been clicked!");
        if (str.equals("setting_remark")) {
            this.f235319e.j(1);
            return true;
        }
        if (str.equals("avatar_setting")) {
            this.f235319e.j(14);
            return true;
        }
        if (str.equals("setting_permission")) {
            this.f235319e.j(3);
            return true;
        }
        if (str.equals("setting_send_card")) {
            this.f235319e.j(4);
            return true;
        }
        if (str.equals("setting_send_card_by_card")) {
            this.f235319e.j(13);
            return true;
        }
        if (str.equals("setting_shortcut")) {
            this.f235319e.j(7);
            return true;
        }
        if (str.equals("setting_star")) {
            this.f235319e.j(2);
            return true;
        }
        if (str.equals("setting_blacklist")) {
            this.f235319e.j(5);
            return true;
        }
        if (str.equals("setting_report")) {
            this.f235319e.j(9);
            return true;
        }
        if (str.equals("setting_delete")) {
            this.f235319e.j(6);
            return true;
        }
        if (str.equals("clear_chatbot_msg")) {
            this.f235319e.j(15);
            return true;
        }
        if (!str.equals("shortcut_command")) {
            return false;
        }
        this.f235319e.j(16);
        return true;
    }
}
