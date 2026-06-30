package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiRecommendPrivacySettingsUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI */
/* loaded from: classes15.dex */
public class ActivityC13315x6be26709 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public final void T6(java.lang.String itemName, android.view.View root, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemName, "itemName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewOnClickListenerC22631x1cc07cc8, "switch");
        root.setContentDescription(viewOnClickListenerC22631x1cc07cc8.f292896x ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efy, itemName) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efx, itemName));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a3e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef == null) {
            return null;
        }
        java.util.Set W0 = kz5.n0.W0(mo43419xa59964ef);
        W0.add(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x2.class);
        return W0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bxe);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.y2(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.cot);
        com.p314xaae8f345.mm.p2621x8fb0427b.h5 h5Var = com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d;
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(h5Var.Ai());
        java.lang.String obj = ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.t2i)).getText().toString();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.t2j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        T6(obj, findViewById, viewOnClickListenerC22631x1cc07cc8);
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z2(this, viewOnClickListenerC22631x1cc07cc8));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.t2h);
        viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(h5Var.Bi());
        java.lang.String obj2 = ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.t2f)).getText().toString();
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.t2g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        T6(obj2, findViewById2, viewOnClickListenerC22631x1cc07cc82);
        viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.a3(this, viewOnClickListenerC22631x1cc07cc82));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.u_m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        arrayList.add(string);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        ((ke0.e) xVar).sj(mo55332x76847179(), arrayList, textView.getText().toString(), kz5.c0.k(textView.getText().toString()), textView);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ui()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.cot);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.t2h);
            viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(false);
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a296 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296();
            c6384xa2a6a296.f137298d = 3;
            c6384xa2a6a296.f137299e = 1L;
            c6384xa2a6a296.k();
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.b3 b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.b3(viewOnClickListenerC22631x1cc07cc82, viewOnClickListenerC22631x1cc07cc8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c3.f179449d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this, 0, 0, false);
            z2Var.k(android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3d, (android.view.ViewGroup) null, false), 0, 0);
            z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.lss).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i4(z2Var, c3Var));
            z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f563869bq).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j4(z2Var, b3Var));
            try {
                android.view.ViewParent parent = z2Var.f293591g.getParent().getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).findViewById(com.p314xaae8f345.mm.R.id.ohv).setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k4.f179611d);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionRecommendPrivacy", "Unable to disable windowCloseOnTouchOutside");
            }
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572564nd5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.widget.TextView textView = (android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.cus);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String string2 = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6s);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            arrayList.add(string2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(this, arrayList, textView.getText().toString(), kz5.c0.k(string), textView);
            z2Var.C();
        }
    }
}
