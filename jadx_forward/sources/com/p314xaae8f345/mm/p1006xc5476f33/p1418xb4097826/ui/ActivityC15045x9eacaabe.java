package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI */
/* loaded from: classes2.dex */
public final class ActivityC15045x9eacaabe extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int D = 0;
    public boolean B;
    public fc2.c C;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f210156w;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f210153t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ma(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f210154u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fa(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f210155v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ga(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f210157x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.na(this));

    /* renamed from: y, reason: collision with root package name */
    public final cw2.f8 f210158y = new cw2.f8(0, 1, null);

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f210159z = new java.util.LinkedList();
    public boolean A = true;

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f210153t).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 d7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f210157x).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21) mo141623x754a37bb;
    }

    public final boolean e7(boolean z17) {
        cw2.da videoView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f m61652x7f02fdf3 = c7().m62206xf9f03e51().m61652x7f02fdf3();
        if (m61652x7f02fdf3 == null || (videoView = m61652x7f02fdf3.getVideoView()) == null) {
            return false;
        }
        boolean mo58787xc00617a4 = videoView.mo58787xc00617a4();
        if (mo58787xc00617a4 || z17) {
            videoView.mo58788x65825f6();
        } else {
            videoView.mo58789x348b34();
        }
        return !mo58787xc00617a4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b2i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(201326592, 201326592);
        m78568xd7114f24();
        com.p314xaae8f345.mm.ui.bk.i0(getWindow(), false);
        this.B = getIntent().getBooleanExtra("long_video_preview", false);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        fc2.c cVar = this.C;
        if (cVar != null) {
            cVar.c();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17 && this.A) {
            this.A = false;
            if (c7().getMediaType() == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214439e) {
                this.f210158y.j0();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f m61652x7f02fdf3 = c7().m62206xf9f03e51().m61652x7f02fdf3();
            if (m61652x7f02fdf3 != null) {
                m61652x7f02fdf3.m61487x4ed8f404().j0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
                c14994x9b99c079.m59394x4a87835d(new java.util.LinkedList<>());
                c14994x9b99c079.m59263x143e8851().addAll(this.f210159z);
                if (m61652x7f02fdf3.isLongVideo) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ea eaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ea(this);
                    java.lang.Object mo141623x754a37bb = ((jz5.n) this.f210154u).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                    ((com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) mo141623x754a37bb).m82546x198fa353(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.da(eaVar));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.v(m61652x7f02fdf3, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(c14994x9b99c079), null, 0, null, null, false, false, null, 508, null);
                cw2.v9.n(m61652x7f02fdf3, 0, null, null, 7, null);
            }
        }
    }
}
