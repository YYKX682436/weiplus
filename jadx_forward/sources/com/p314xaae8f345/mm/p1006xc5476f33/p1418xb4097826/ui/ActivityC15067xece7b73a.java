package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI */
/* loaded from: classes8.dex */
public final class ActivityC15067xece7b73a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576419an;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572951d12);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ch(this));
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_liked");
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        h17.L(hc2.x0.k(string, mo55332x76847179, '#', com.p314xaae8f345.mm.R.raw.f79670xb62772ac, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingInteractiveInfoUI", "click " + str);
        if (str == null) {
            return true;
        }
        int hashCode = str.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        switch (hashCode) {
            case -1556120431:
                if (!str.equals("settings_liked")) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, this, getIntent(), 0L, null, 0, 0, false, 0, null, 508, null);
                getIntent().setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13980xf3f8f875.class);
                android.content.Intent intent = getIntent();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                intent.putExtra("finder_username", xy2.c.e(mo55332x76847179));
                android.content.Intent intent2 = getIntent();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleLikedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleLikedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case -1161289907:
                if (!str.equals("settings_follow")) {
                    return true;
                }
                android.content.Intent intent3 = new android.content.Intent();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, this, intent3, 0L, null, 0, 0, false, 0, null, 508, null);
                intent3.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15033x9db96a29.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent3);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleFollowClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleFollowClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case -6902322:
                if (!str.equals("settings_mention")) {
                    return true;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).zk(this, null);
                return true;
            case 734000174:
                if (!str.equals("settings_privacy_msg")) {
                    return true;
                }
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).yk(this, null);
                return true;
            case 1091629613:
                if (!str.equals("settings_collected")) {
                    return true;
                }
                android.content.Intent intent4 = new android.content.Intent();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, this, intent4, 0L, null, 0, 0, false, 0, null, 508, null);
                intent4.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13947xf0a207.class);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleCollectedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleCollectedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            default:
                return true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.String str;
        super.onResume();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_privacy_msg", true);
        }
        r45.rl2 a17 = cu2.f0.f303924a.a("FinderObjectDynamicImageKey_FinderFavOffIcon");
        if (a17 == null || (str = a17.m75945x2fec8307(1)) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_collected");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) h17 : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.A));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.eh ehVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.eh(this, c21549x15041e54);
            b17.getClass();
            b17.f529406d = ehVar;
            b17.a();
            return;
        }
        int dimension = (int) mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        if (c21549x15041e54 == null) {
            return;
        }
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        c21549x15041e54.L(hc2.x0.k(string, mo55332x76847179, '#', com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
    }
}
