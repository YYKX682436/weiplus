package ke3;

/* loaded from: classes7.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c f388539d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c activityC16457xffd292c) {
        this.f388539d = activityC16457xffd292c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c.f229660g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c activityC16457xffd292c = this.f388539d;
        activityC16457xffd292c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "start");
        ke3.i iVar = new ke3.i(new ke3.l(activityC16457xffd292c), activityC16457xffd292c);
        i95.m c17 = i95.n0.c(gq0.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        iq0.c de6 = gq0.t.de((gq0.t) c17, iVar, null, 2, null);
        activityC16457xffd292c.f229662e = de6;
        if (de6 != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            gq0.t.bh((gq0.t) c18, de6, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
