package com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m9.f34451x366c91de)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "sy0/a", "sy0/b", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI */
/* loaded from: classes4.dex */
public final class ActivityC11007x7cb63ad9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101 {

    /* renamed from: g, reason: collision with root package name */
    public static final sy0.a f151289g = new sy0.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151290d = jz5.h.b(new sy0.d(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f151291e = jz5.h.b(sy0.e.f495364d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f151292f = jz5.h.b(new sy0.c(this));

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569480ca;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.lang.Class[] clsArr = new java.lang.Class[2];
        clsArr[0] = ((sy0.b) ((jz5.n) this.f151290d).mo141623x754a37bb()) == sy0.b.f495359d ? mz0.x2.class : mz0.l2.class;
        clsArr[1] = pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(dz0.l.class));
        return kz5.z.D0(clsArr);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f c11010x5ff4d15f;
        r45.rz6 rz6Var;
        o25.n1.f(this);
        i95.n0.c(uy0.h.class);
        super.onCreate(bundle);
        if (((sy0.b) ((jz5.n) this.f151290d).mo141623x754a37bb()) == sy0.b.f495360e) {
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = mo273xed6858b4();
            java.lang.String str = (java.lang.String) ((jz5.n) this.f151291e).mo141623x754a37bb();
            android.content.Intent intent = getIntent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
            com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c c11017xf7264b1c = new com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c(str, 133, "shoot_same_video", intent);
            com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2 c11012xa5f608f2 = (com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2) ((jz5.n) this.f151292f).mo141623x754a37bb();
            java.lang.String str2 = (c11012xa5f608f2 == null || (c11010x5ff4d15f = c11012xa5f608f2.f151307e) == null || (rz6Var = (r45.rz6) ((jz5.n) c11010x5ff4d15f.f151300f).mo141623x754a37bb()) == null) ? null : rz6Var.f466853d;
            if (str2 == null) {
                str2 = "";
            }
            c11017xf7264b1c.f151346o.put("templateId", str2);
            c11017xf7264b1c.a("activityid", getIntent().getLongExtra("key_topic_id", 0L));
            mo273xed6858b4.a(c11017xf7264b1c);
        }
        m78583x85ccfe01(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ai3.d.f86640a = true;
        com.p314xaae8f345.mm.ui.v9.d(this);
        getWindow().setFormat(-3);
        m78531x8f8cf1fb();
        m78568xd7114f24();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MaasAlbumTemplatePreviewUI);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ky0.h hVar = ky0.h.f395012a;
    }
}
