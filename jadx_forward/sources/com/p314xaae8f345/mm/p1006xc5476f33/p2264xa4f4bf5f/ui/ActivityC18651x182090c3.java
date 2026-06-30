package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Ll75/q0;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity */
/* loaded from: classes8.dex */
public final class ActivityC18651x182090c3 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 implements l75.q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f255172f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255173d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.qc(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f255174e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.rc(this));

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czu;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        int i17 = 2;
        java.lang.String l17 = o13.n.l(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getUnsignedMd5UInt(...)");
        hi4.m.f363089g = l17;
        super.onCreate(bundle);
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(hi4.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        int intValue = ((java.lang.Number) ((jz5.n) ((hi4.j) a17).f363085e).mo141623x754a37bb()).intValue();
        jz5.g gVar = this.f255173d;
        int i18 = 0;
        if (intValue > 1) {
            ((ui4.f) ((jz5.n) this.f255174e).mo141623x754a37bb()).f509673b.m8315x6cab2c8d((p012xc85e97e9.p087x9da2e250.app.e2) ((jz5.n) gVar).mo141623x754a37bb());
        } else {
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.j8i, ((p012xc85e97e9.p087x9da2e250.app.e2) ((jz5.n) gVar).mo141623x754a37bb()).mo7743xfb80e389(0), null, 1);
            m7630xb2c12e75.d();
            if (getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) == 1) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jwe);
                i17 = 1;
            } else {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574905jx3);
            }
            mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.pc(this));
            i18 = i17;
        }
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusLikeListActivity);
        aVar.dk(this, "TextStatusLikeListActivity");
        ((cy1.a) aVar.ik(this, 4, 28809)).fk(this, "status_notif_page_source", java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(hi4.j.class);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k2.class);
        set.add(hi4.m.class);
        hi4.f fVar = hi4.j.f363083g;
        if (fVar.a(this) > 1) {
            set.add(wn.u.class);
            set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.class);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "superImportUIComponents: pageCnt=" + fVar.a(this));
    }
}
