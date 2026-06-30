package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI */
/* loaded from: classes.dex */
public final class ActivityC17160xbdca513b extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f239607e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f239608d = jz5.h.b(new yw3.c1(this));

    public final em.x2 U6() {
        return (em.x2) ((jz5.n) this.f239608d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cfk;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerChooseChatroomMemberUI", "selectUsernames " + intent.getStringExtra("Select_Conv_User"));
        }
        if (i17 == 3) {
            java.lang.String stringExtra = intent.getStringExtra("select_chatrooms");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            if (!(!f07.isEmpty())) {
                f07 = null;
            }
            if (f07 != null) {
                java.util.Iterator it = f07.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerChooseChatroomMemberUI", "selectUsername " + ((java.lang.String) it.next()));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new yw3.r0(this));
        em.x2 U6 = U6();
        if (U6.f336452c == null) {
            U6.f336452c = (android.widget.Button) U6.f336450a.findViewById(com.p314xaae8f345.mm.R.id.nge);
        }
        U6.f336452c.setOnClickListener(new yw3.t0(this));
        em.x2 U62 = U6();
        if (U62.f336456g == null) {
            U62.f336456g = (android.widget.Button) U62.f336450a.findViewById(com.p314xaae8f345.mm.R.id.ngd);
        }
        U62.f336456g.setOnClickListener(new yw3.v0(this));
        em.x2 U63 = U6();
        if (U63.f336454e == null) {
            U63.f336454e = (android.widget.Button) U63.f336450a.findViewById(com.p314xaae8f345.mm.R.id.ngu);
        }
        U63.f336454e.setOnClickListener(new yw3.w0(this));
        em.x2 U64 = U6();
        if (U64.f336453d == null) {
            U64.f336453d = (android.widget.Button) U64.f336450a.findViewById(com.p314xaae8f345.mm.R.id.f568626nh1);
        }
        U64.f336453d.setOnClickListener(new yw3.x0(this));
        em.x2 U65 = U6();
        if (U65.f336451b == null) {
            U65.f336451b = (android.widget.Button) U65.f336450a.findViewById(com.p314xaae8f345.mm.R.id.ngg);
        }
        U65.f336451b.setOnClickListener(new yw3.y0(this));
        em.x2 U66 = U6();
        if (U66.f336457h == null) {
            U66.f336457h = (android.widget.Button) U66.f336450a.findViewById(com.p314xaae8f345.mm.R.id.ngs);
        }
        U66.f336457h.setOnClickListener(new yw3.z0(this));
        em.x2 U67 = U6();
        if (U67.f336455f == null) {
            U67.f336455f = (android.widget.Button) U67.f336450a.findViewById(com.p314xaae8f345.mm.R.id.dbc);
        }
        U67.f336455f.setOnClickListener(new yw3.b1(this));
    }
}
