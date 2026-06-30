package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes11.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 f289105f;

    public s(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var, int i17, int i18) {
        this.f289105f = a0Var;
        this.f289103d = i17;
        this.f289104e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f289103d, this.f289104e);
        android.content.Context context = (android.content.Context) this.f289105f.f484375g.get();
        if (context != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 5, 1);
            boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(4103, null));
            new android.content.Intent().putExtra("KEnterFromBanner", true);
            if (n17) {
                c01.fb b17 = c01.fb.b();
                if (b17 == null) {
                    j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
                } else {
                    java.lang.String d17 = b17.d();
                    if (d17 == null) {
                        d17 = "";
                    }
                    int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(java.lang.Integer.valueOf(b17.f118721b), 0);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || j17 == 0) {
                        j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
                    } else {
                        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                        if (m78443x9cf0d20b != null) {
                            m78443x9cf0d20b.f7().o("tab_find_friend");
                        }
                        m25.a.a(context, new android.content.Intent());
                    }
                }
            } else {
                j45.l.h(context, "nearby", ".ui.NearbyFriendsIntroUI");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
