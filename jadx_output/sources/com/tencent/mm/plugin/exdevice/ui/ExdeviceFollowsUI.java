package com.tencent.mm.plugin.exdevice.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/exdevice/ui/r2", "com/tencent/mm/plugin/exdevice/ui/t2", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ExdeviceFollowsUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f99273p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f99274d;

    /* renamed from: e, reason: collision with root package name */
    public p32.j f99275e;

    /* renamed from: f, reason: collision with root package name */
    public p32.n f99276f;

    /* renamed from: g, reason: collision with root package name */
    public p32.h f99277g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99279i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f99278h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final int f99280m = 4660;

    /* renamed from: n, reason: collision with root package name */
    public final int f99281n = 4661;

    /* renamed from: o, reason: collision with root package name */
    public final int f99282o = 10;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9s;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.j(kz5.q1.j(importUIComponents, z32.s.class), y32.a.class);
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f99280m) {
            if (i17 == this.f99281n && i18 == -1 && intent != null && intent.getBooleanExtra("KeyNeedUpdateRank", false)) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.exdevice.ui.u2 u2Var = new com.tencent.mm.plugin.exdevice.ui.u2(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(u2Var, 500L, false);
                return;
            }
            return;
        }
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        kotlin.jvm.internal.o.d(stringExtra);
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
        if (P1 == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f99279i;
        if (u3Var != null) {
            u3Var.show();
        }
        this.f99277g = new p32.h(P1, null);
        gm0.j1.n().f273288b.g(this.f99277g);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.c58);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.v2(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_add, new com.tencent.mm.plugin.exdevice.ui.x2(this));
        gm0.j1.d().a(1043, this);
        gm0.j1.d().a(1777, this);
        gm0.j1.d().a(1758, this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.lqa);
        this.f99274d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f99274d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$buildItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.exdevice.ui.t2(com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI.this);
                }
            }, this.f99278h, false));
        }
        this.f99275e = new p32.j(this, c01.z1.r(), "", null);
        gm0.j1.d().g(this.f99275e);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        p32.j jVar = this.f99275e;
        if (jVar != null) {
            gm0.j1.d().d(jVar);
        }
        p32.n nVar = this.f99276f;
        if (nVar != null) {
            gm0.j1.d().d(nVar);
        }
        p32.h hVar = this.f99277g;
        if (hVar != null) {
            gm0.j1.d().d(hVar);
        }
        gm0.j1.d().q(1043, this);
        gm0.j1.d().q(1777, this);
        gm0.j1.d().q(1758, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        androidx.recyclerview.widget.f2 adapter;
        java.util.ArrayList arrayList;
        androidx.recyclerview.widget.f2 adapter2;
        java.util.LinkedList linkedList;
        boolean b17 = kotlin.jvm.internal.o.b(m1Var, this.f99275e);
        java.util.ArrayList arrayList2 = this.f99278h;
        int i19 = 0;
        if (b17) {
            if (i17 == 0 && i18 == 0) {
                arrayList2.clear();
                r45.rq3 rq3Var = ((z32.s) pf5.z.f353948a.a(this).a(z32.s.class)).f469937f;
                if (rq3Var != null && (linkedList = rq3Var.f385108q) != null) {
                    int i27 = 0;
                    for (java.lang.Object obj : linkedList) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.e43 e43Var = (r45.e43) obj;
                        kotlin.jvm.internal.o.d(e43Var);
                        arrayList2.add(new com.tencent.mm.plugin.exdevice.ui.r2(this, i27, e43Var));
                        i27 = i28;
                    }
                }
                kz5.g0.t(arrayList2, com.tencent.mm.plugin.exdevice.ui.y2.f99727d);
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f99274d;
                if (wxRecyclerView != null && (adapter2 = wxRecyclerView.getAdapter()) != null) {
                    adapter2.notifyDataSetChanged();
                }
                if (arrayList2.size() == 0) {
                    android.view.View findViewById = findViewById(com.tencent.mm.R.id.kci);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kci);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.kci);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f99279i;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ilt);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f99275e = null;
            return;
        }
        if (kotlin.jvm.internal.o.b(m1Var, this.f99276f)) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f99279i;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                }
                p32.n nVar = this.f99276f;
                if (nVar != null) {
                    java.util.List recentLikeUser = nVar.f351507h;
                    kotlin.jvm.internal.o.f(recentLikeUser, "recentLikeUser");
                    java.util.List mWechatSportFollows = nVar.f351505f;
                    kotlin.jvm.internal.o.f(mWechatSportFollows, "mWechatSportFollows");
                    java.util.List mMyFollows = nVar.f351506g;
                    kotlin.jvm.internal.o.f(mMyFollows, "mMyFollows");
                    android.content.Intent intent = new android.content.Intent();
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(recentLikeUser, ",");
                    intent.putExtra("wechat_sport_contact", com.tencent.mm.sdk.platformtools.t8.c1(mWechatSportFollows, ","));
                    intent.putExtra("wechat_sport_recent_like", c17);
                    java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(mMyFollows, ",");
                    intent.putExtra("titile", getString(com.tencent.mm.R.string.f491132c24));
                    intent.putExtra("list_type", 12);
                    int i29 = this.f99282o;
                    intent.putExtra("max_limit_num", i29);
                    intent.putExtra("too_many_member_tip_string", getString(com.tencent.mm.R.string.f491133c25, java.lang.Integer.valueOf(i29)));
                    intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(2, 4, 1, 131072, 128, 64, 16384));
                    intent.putExtra("always_select_contact", c18);
                    j45.l.v(this, ".ui.contact.SelectContactUI", intent, this.f99280m);
                }
            }
            this.f99276f = null;
            return;
        }
        if (kotlin.jvm.internal.o.b(m1Var, this.f99277g)) {
            if (i17 == 0 && i18 == 0) {
                int size = arrayList2.size();
                p32.h hVar = this.f99277g;
                if (hVar != null && (arrayList = hVar.f351467g) != null) {
                    if (!(!arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        for (java.lang.Object obj2 : arrayList) {
                            int i37 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            r45.e43 e43Var2 = (r45.e43) obj2;
                            kotlin.jvm.internal.o.d(e43Var2);
                            arrayList2.add(new com.tencent.mm.plugin.exdevice.ui.r2(this, size + i19, e43Var2));
                            i19 = i37;
                        }
                    }
                }
                kz5.g0.t(arrayList2, com.tencent.mm.plugin.exdevice.ui.z2.f99735d);
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f99274d;
                if (wxRecyclerView2 != null && (adapter = wxRecyclerView2.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f99279i;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            this.f99277g = null;
        }
    }
}
