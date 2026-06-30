package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class e4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99444d;

    public e4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99444d = exdeviceProfileUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        jz5.f0 f0Var;
        int i27;
        int i28;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99444d;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.V6(exdeviceProfileUI);
        androidx.appcompat.app.AppCompatActivity activity = exdeviceProfileUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        z32.e0 e0Var = (z32.e0) pf5.z.f353948a.a(activity).a(z32.e0.class);
        java.lang.String userName = exdeviceProfileUI.f99304e;
        java.util.LinkedList linkedList = exdeviceProfileUI.f99314r.f99605g;
        e0Var.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        if (linkedList != null) {
            int i29 = 0;
            while (i29 < i18) {
                int i37 = i17 + i29;
                androidx.appcompat.app.AppCompatActivity activity2 = e0Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(te5.y1.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                te5.y1 y1Var = (te5.y1) a17;
                if (i37 <= linkedList.size() - 1) {
                    java.lang.Object obj = linkedList.get(i37);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    java.lang.Object obj2 = ((java.util.LinkedList) obj).get(0);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    r45.ed6 ed6Var = (r45.ed6) obj2;
                    if (!y1Var.P6().contains(java.lang.String.valueOf(i37))) {
                        int i38 = ed6Var.f373335o;
                        a42.c cVar = a42.c.f1200a;
                        if (i38 != 0) {
                            i28 = i37;
                            i27 = i29;
                            if (i38 == 1) {
                                try {
                                    int i39 = !com.tencent.mm.sdk.platformtools.t8.K0(new org.json.JSONObject(ed6Var.f373333m).optString("finder_username")) ? 1 : 2;
                                    java.lang.String appName = ed6Var.f373328e;
                                    kotlin.jvm.internal.o.f(appName, "appName");
                                    cVar.a(2, 2, appName, i39, 2, userName);
                                } catch (org.json.JSONException e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("SportScrollReportUIC", e17, "SportScrollReportUIC", new java.lang.Object[0]);
                                }
                            }
                        } else if (kotlin.jvm.internal.o.b("21f9d636b41b25be", ed6Var.f373327d)) {
                            i28 = i37;
                            i27 = i29;
                            cVar.a(2, 1, e0Var.getString(com.tencent.mm.R.string.jjh), 2, 2, userName);
                        } else {
                            i28 = i37;
                            i27 = i29;
                            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ni(ed6Var.f373327d, new z32.c0(2, userName));
                        }
                        y1Var.P6().add(java.lang.String.valueOf(i28));
                        i29 = i27 + 1;
                    }
                }
                i27 = i29;
                i29 = i27 + 1;
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("SportScrollReportUIC", "handleScrollReport: dataList is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
