package com.p314xaae8f345.mm.ui.p2724x335620;

@db5.a(m123858x6ac9171 = 32768)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/mvvm/MvvmContactListUI;", "Lcom/tencent/mm/plugin/mvvmlist/BaseMvvmListActivity;", "Lri5/j;", "<init>", "()V", "ui-selectcontact_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.mvvm.MvvmContactListUI */
/* loaded from: classes.dex */
public class ActivityC22459x1ac69192 extends com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.AbstractActivityC16715x9b8dc11e<ri5.j> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f290785h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f290786d = jz5.h.b(new ni5.h(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f290787e = jz5.h.b(new ni5.a(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f290788f = jz5.h.b(new ni5.g(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f290789g = jz5.h.b(new ni5.f(this));

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (((java.lang.Boolean) ((jz5.n) this.f290788f).mo141623x754a37bb()).booleanValue()) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return ((java.lang.Number) ((jz5.n) this.f290789g).mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c5o;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: isContentAtTop */
    public boolean mo45060x28c9d73() {
        jz5.g gVar = this.f290786d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).h().getVisibility() == 0 ? ((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).h() : ((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).k());
        return !r0.canScrollVertically(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        wi5.n0 n0Var;
        mo48674x36654fab();
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.B3(new wi5.a());
        }
        if (((java.lang.Boolean) ((jz5.n) this.f290787e).mo141623x754a37bb()).booleanValue()) {
            j75.f m67437x4bd53102 = m67437x4bd5310();
            boolean z17 = false;
            if (m67437x4bd53102 != null && (n0Var = (wi5.n0) m67437x4bd53102.mo140437x75286adb()) != null && !n0Var.e()) {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new ni5.b(this));
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.L2(this, new ni5.e(this));
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.content.Intent intent = getIntent();
        iy1.c cVar = iy1.c.MainUI;
        cy1.a aVar = (cy1.a) rVar;
        aVar.Zj(this, intent.getIntExtra("key_select_contact_report_page_id", 1107));
        aVar.Rj(this, iy1.a.NewGroupChat);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
        c6205xeec13785.f136457g.f87952a = 0L;
        c6205xeec13785.e();
        if (getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) == 16) {
            ((qg5.j2) ((ct.y2) i95.n0.c(ct.y2.class))).getClass();
            fk5.y.f345216d.getClass();
            fk5.y.f345217e = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(cj5.j1.class);
        set.add(cj5.l4.class);
        set.add(cj5.z2.class);
        set.add(zi5.b.class);
    }
}
