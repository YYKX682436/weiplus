package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI */
/* loaded from: classes13.dex */
public class ActivityC13459xe0f36c34 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public java.util.ArrayList A;
    public java.lang.String B;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public final android.content.BroadcastReceiver F = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.z(this);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f180708d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.b0 f180709e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f180710f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f180711g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180712h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f180713i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f180714m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f180715n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f180716o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f180717p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f180718q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f180719r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f180720s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f180721t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f180722u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f180723v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f180724w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f180725x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f180726y;

    /* renamed from: z, reason: collision with root package name */
    public long f180727z;

    public final void T6(int i17) {
        switch (i17) {
            case 1:
                this.f180710f.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2x));
                this.f180711g.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572667c26));
                this.f180712h.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2y));
                break;
            case 2:
                this.f180710f.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2q));
                this.f180711g.setVisibility(8);
                this.f180712h.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2p));
                break;
            case 3:
                this.f180714m.setImageResource(com.p314xaae8f345.mm.R.raw.f78667xd67389c);
                this.f180715n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2j);
                this.f180716o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c28);
                break;
            case 4:
                this.f180714m.setImageResource(com.p314xaae8f345.mm.R.raw.f78667xd67389c);
                this.f180715n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2h);
                this.f180716o.setText("");
                break;
            case 5:
                this.f180714m.setImageResource(com.p314xaae8f345.mm.R.raw.f81428x5380f495);
                this.f180715n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2j);
                this.f180716o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2e);
                break;
            case 6:
                this.f180714m.setImageResource(com.p314xaae8f345.mm.R.raw.f78667xd67389c);
                this.f180715n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2j);
                this.f180716o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c3j);
                break;
        }
        switch (i17) {
            case 1:
            case 2:
                this.f180714m.setVisibility(8);
                this.f180715n.setVisibility(8);
                this.f180716o.setVisibility(8);
                this.f180708d.setVisibility(0);
                this.f180713i.setVisibility(0);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                this.f180714m.setVisibility(0);
                this.f180715n.setVisibility(0);
                this.f180708d.setVisibility(8);
                this.f180713i.setVisibility(8);
                if (i17 == 4) {
                    this.f180716o.setVisibility(8);
                    return;
                } else {
                    this.f180716o.setVisibility(0);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ac  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13459xe0f36c34.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mo55332x76847179().unregisterReceiver(this.F);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
