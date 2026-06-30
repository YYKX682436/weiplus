package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchEntranceUI */
/* loaded from: classes14.dex */
public final class ActivityC16154x39bb67ac extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224639e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224640f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f224641g = jz5.h.b(new y83.b(this));

    public final w83.d T6() {
        return (w83.d) ((jz5.n) this.f224641g).mo141623x754a37bb();
    }

    public final boolean U6(java.lang.String str) {
        char c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? '\b' : com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(str) ? (char) 3 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(str) ? (char) 5 : (c01.e2.U(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.D4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.U4(str)) ? (char) 4 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.B3(str) ? (char) 6 : r26.i0.y(str, "gh_", false) ? (char) 7 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? (char) 2 : (char) 1;
        return (1 == c17) | (2 == c17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bmw;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchEntranceUI", "initView");
        mo54450xbf7c1df6("");
        this.f224638d = getIntent().getStringExtra("intent.key.login.url");
        this.f224639e = getIntent().getStringExtra("intent.key.device.name");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = T6().f525502b;
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c16155xa1f2bfdb.m65191x53bfe316(string);
        T6().f525502b.m65189x5018364b(new y83.a(this));
        T6().f525502b.f224643e.f525493c.setVisibility(0);
        android.widget.ProgressBar progressBar = T6().f525503c;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchEntranceUI", "doLoginConfirmGet, url:" + this.f224638d + ", device:" + this.f224639e);
        gm0.j1.d().a(5218, this);
        gm0.j1.d().g(new x83.j(this.f224638d, this.f224639e));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        mo2533x106ab264.o();
        m78583x85ccfe01(8);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        T6().f525503c.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x048d  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r23, int r24, java.lang.String r25, com.p314xaae8f345.mm.p944x882e457a.m1 r26) {
        /*
            Method dump skipped, instructions count: 1297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16154x39bb67ac.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
