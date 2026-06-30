package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAccountManagent;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/f", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderAccountManagent extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.ui.f f109198g = new com.tencent.mm.plugin.finder.feed.ui.f(null);

    /* renamed from: h, reason: collision with root package name */
    public static boolean f109199h = true;

    /* renamed from: e, reason: collision with root package name */
    public r45.d1 f109201e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f109200d = true;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f109202f = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.g(this));

    public final void V6(boolean z17) {
        java.util.LinkedList<r45.g1> list;
        java.util.LinkedList<r45.h1> list2;
        java.util.LinkedList list3;
        if (z17) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).t();
        }
        r45.d1 d1Var = this.f109201e;
        if ((d1Var == null || (list3 = d1Var.getList(1)) == null || !(list3.isEmpty() ^ true)) ? false : true) {
            r45.d1 d1Var2 = this.f109201e;
            if (d1Var2 != null && (list2 = d1Var2.getList(1)) != null) {
                for (r45.h1 h1Var : list2) {
                    kotlin.jvm.internal.o.d(h1Var);
                    if (!h1Var.getList(1).isEmpty()) {
                        com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(this, null);
                        preferenceTitleCategory.L(h1Var.getString(0));
                        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).d(preferenceTitleCategory, -1);
                        java.util.LinkedList<r45.g1> list4 = h1Var.getList(1);
                        kotlin.jvm.internal.o.f(list4, "getConfigs(...)");
                        for (r45.g1 g1Var : list4) {
                            com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
                            kotlin.jvm.internal.o.d(g1Var);
                            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).d(new sy2.a(g1Var, this), -1);
                        }
                    }
                }
            }
        } else {
            r45.d1 d1Var3 = this.f109201e;
            if (d1Var3 != null && (list = d1Var3.getList(0)) != null) {
                for (r45.g1 g1Var2 : list) {
                    com.tencent.mm.ui.base.preference.r preferenceScreen2 = getPreferenceScreen();
                    kotlin.jvm.internal.o.d(g1Var2);
                    ((com.tencent.mm.ui.base.preference.h0) preferenceScreen2).d(new sy2.a(g1Var2, this), -1);
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494876ah;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        V6(false);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.d1 d1Var;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f491245mg0);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.h(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("ACCOUNT_EXTRA_CONFIG");
        if (byteArrayExtra != null) {
            d1Var = new r45.d1();
            d1Var.parseFrom(byteArrayExtra);
        } else {
            d1Var = null;
        }
        this.f109201e = d1Var;
        if (d1Var != null) {
            initView();
        } else {
            finish();
            com.tencent.mars.xlog.Log.e("Finder.AccountManagementUI", "onCreate accountExtConfig is null");
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.e(preference, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderAccountManagementPref");
        sy2.a aVar = (sy2.a) preference;
        r45.g1 g1Var = aVar.L;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = g1Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) g1Var.getCustom(7) : null;
        android.content.Context context = aVar.f197770d;
        if (finderJumpInfo != null) {
            com.tencent.mars.xlog.Log.i("Finder.AccountManagementPref", "jumpLiteApp, liteAppId: " + finderJumpInfo);
            xc2.y2 y2Var = xc2.y2.f453343a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.y2.L(y2Var, context, new xc2.p0(finderJumpInfo), null, null, null, 28, null);
        } else {
            r45.g1 g1Var2 = aVar.L;
            java.lang.Integer valueOf = g1Var2 != null ? java.lang.Integer.valueOf(g1Var2.getInteger(3)) : null;
            if (valueOf != null && valueOf.intValue() == 2) {
                android.content.Intent intent = new android.content.Intent();
                l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String e17 = xy2.c.e(context);
                r45.g1 g1Var3 = aVar.L;
                intent.putExtra("rawUrl", ((k40.f) eVar).Ai(e17, g1Var3 != null ? g1Var3.getString(4) : null));
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                l81.b1 b1Var = new l81.b1();
                r45.g1 g1Var4 = aVar.L;
                java.lang.String str2 = "";
                if (g1Var4 == null || (str = g1Var4.getString(0)) == null) {
                    str = "";
                }
                b1Var.f317012a = str;
                r45.g1 g1Var5 = aVar.L;
                if (g1Var5 != null && (string = g1Var5.getString(1)) != null) {
                    str2 = string;
                }
                b1Var.f317022f = str2;
                r45.g1 g1Var6 = aVar.L;
                b1Var.f317032k = g1Var6 != null ? g1Var6.getInteger(5) : 1000;
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f109200d) {
            this.f109200d = false;
        } else {
            kotlinx.coroutines.l.d(getLifecycleAsyncScope(), null, null, new com.tencent.mm.plugin.finder.feed.ui.j(this, null), 3, null);
        }
    }
}
