package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI */
/* loaded from: classes15.dex */
public class ActivityC12632x9feb2048 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f170817r = {0, 1, 2};

    /* renamed from: d, reason: collision with root package name */
    public int f170818d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f170820f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f170821g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb.C11742x9bb9c049 f170822h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb.C11742x9bb9c049 f170823i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb.C11742x9bb9c049 f170824m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f170825n;

    /* renamed from: o, reason: collision with root package name */
    public i11.e f170826o;

    /* renamed from: e, reason: collision with root package name */
    public boolean f170819e = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f170827p = "";

    /* renamed from: q, reason: collision with root package name */
    public final i11.c f170828q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j(this);

    public final void V6() {
        if (!this.f170825n || this.f170821g == null) {
            return;
        }
        this.f170821g.L(((this.f170818d == 0) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f170827p)) ? getIntent().getStringExtra("key_desc") : java.lang.String.format(getIntent().getStringExtra("key_desc_oversea"), this.f170827p));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f170820f).notifyDataSetChanged();
    }

    public final void W6() {
        if (!this.f170819e) {
            setResult(0, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "setResData, has changed, state:%s", java.lang.Integer.valueOf(this.f170818d));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_state", this.f170818d);
        setResult(-1, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576364d;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        W6();
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12632x9feb2048.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "onPreferenceTreeClick, key:%s", c21560x1fce98fb.f279313q);
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb.C11742x9bb9c049) {
            this.f170819e = true;
            if (c21560x1fce98fb.f279313q.equalsIgnoreCase("both")) {
                this.f170818d = 2;
                this.f170822h.M(false);
                this.f170823i.M(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb.C11742x9bb9c049 c11742x9bb9c049 = this.f170824m;
                if (c11742x9bb9c049 != null) {
                    c11742x9bb9c049.M(true);
                }
            } else if (c21560x1fce98fb.f279313q.equalsIgnoreCase("foreground")) {
                this.f170818d = 1;
                this.f170823i.M(true);
                this.f170822h.M(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb.C11742x9bb9c049 c11742x9bb9c0492 = this.f170824m;
                if (c11742x9bb9c0492 != null) {
                    c11742x9bb9c0492.M(false);
                }
            } else {
                this.f170818d = 0;
                this.f170822h.M(true);
                this.f170823i.M(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb.C11742x9bb9c049 c11742x9bb9c0493 = this.f170824m;
                if (c11742x9bb9c0493 != null) {
                    c11742x9bb9c0493.M(false);
                }
            }
            V6();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f170820f).notifyDataSetChanged();
        }
        return false;
    }
}
