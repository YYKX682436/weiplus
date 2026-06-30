package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class v5 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99706d;

    public v5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99706d = exdeviceRankInfoUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.List list;
        r32.d dVar;
        r45.ed6 ed6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        int i27 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99706d;
        exdeviceRankInfoUI.e7();
        if (com.tencent.mm.sdk.platformtools.t8.L0(exdeviceRankInfoUI.D)) {
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = exdeviceRankInfoUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        z32.e0 e0Var = (z32.e0) pf5.z.f353948a.a(activity).a(z32.e0.class);
        java.util.List list2 = exdeviceRankInfoUI.f99334e.f99513p;
        e0Var.getClass();
        if (list2 != null) {
            int i28 = 0;
            while (i28 < i18) {
                int i29 = i17 + i28;
                androidx.appcompat.app.AppCompatActivity activity2 = e0Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(te5.y1.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                te5.y1 y1Var = (te5.y1) a17;
                if (y1Var.P6().contains(java.lang.String.valueOf(i29))) {
                    list = list2;
                } else {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                    if (i29 <= arrayList2.size() - 1 && (dVar = ((com.tencent.mm.plugin.exdevice.ui.e7) arrayList2.get(i29)).f99447a) != null && (ed6Var = dVar.field_sportRecord) != null) {
                        int i37 = ed6Var.f373335o;
                        a42.c cVar = a42.c.f1200a;
                        if (i37 != 0) {
                            list = list2;
                            if (i37 == 1) {
                                try {
                                    int i38 = !com.tencent.mm.sdk.platformtools.t8.K0(new org.json.JSONObject(ed6Var.f373333m).optString("finder_username")) ? 1 : 2;
                                    java.lang.String appName = ed6Var.f373328e;
                                    kotlin.jvm.internal.o.f(appName, "appName");
                                    java.lang.String field_username = dVar.field_username;
                                    kotlin.jvm.internal.o.f(field_username, "field_username");
                                    cVar.a(1, 2, appName, i38, 2, field_username);
                                } catch (org.json.JSONException unused) {
                                }
                            }
                        } else if (kotlin.jvm.internal.o.b("21f9d636b41b25be", ed6Var.f373327d)) {
                            java.lang.String string = e0Var.getString(com.tencent.mm.R.string.jjh);
                            java.lang.String field_username2 = dVar.field_username;
                            kotlin.jvm.internal.o.f(field_username2, "field_username");
                            cVar.a(1, 1, string, 2, 2, field_username2);
                        } else {
                            list = list2;
                            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ni(dVar.field_sportRecord.f373327d, new z32.d0(1, dVar));
                        }
                        y1Var.P6().add(java.lang.String.valueOf(i29));
                    }
                    list = list2;
                    y1Var.P6().add(java.lang.String.valueOf(i29));
                }
                i28++;
                list2 = list;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        int i18 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
        this.f99706d.e7();
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
