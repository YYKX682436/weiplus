package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class e4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 f180977d;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714) {
        this.f180977d = activityC13474xf9906714;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = this.f180977d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714.V6(activityC13474xf9906714);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC13474xf9906714.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        z32.e0 e0Var = (z32.e0) pf5.z.f435481a.a(activity).a(z32.e0.class);
        java.lang.String userName = activityC13474xf9906714.f180837e;
        java.util.LinkedList linkedList = activityC13474xf9906714.f180847r.f181138g;
        e0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (linkedList != null) {
            int i29 = 0;
            while (i29 < i18) {
                int i37 = i17 + i29;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = e0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity2).a(te5.y1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                te5.y1 y1Var = (te5.y1) a17;
                if (i37 <= linkedList.size() - 1) {
                    java.lang.Object obj = linkedList.get(i37);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    java.lang.Object obj2 = ((java.util.LinkedList) obj).get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    r45.ed6 ed6Var = (r45.ed6) obj2;
                    if (!y1Var.P6().contains(java.lang.String.valueOf(i37))) {
                        int i38 = ed6Var.f454868o;
                        a42.c cVar = a42.c.f82733a;
                        if (i38 != 0) {
                            i28 = i37;
                            i27 = i29;
                            if (i38 == 1) {
                                try {
                                    int i39 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(new org.json.JSONObject(ed6Var.f454866m).optString("finder_username")) ? 1 : 2;
                                    java.lang.String appName = ed6Var.f454861e;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appName, "appName");
                                    cVar.a(2, 2, appName, i39, 2, userName);
                                } catch (org.json.JSONException e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SportScrollReportUIC", e17, "SportScrollReportUIC", new java.lang.Object[0]);
                                }
                            }
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("21f9d636b41b25be", ed6Var.f454860d)) {
                            i28 = i37;
                            i27 = i29;
                            cVar.a(2, 1, e0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jjh), 2, 2, userName);
                        } else {
                            i28 = i37;
                            i27 = i29;
                            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ni(ed6Var.f454860d, new z32.c0(2, userName));
                        }
                        y1Var.P6().add(java.lang.String.valueOf(i28));
                        i29 = i27 + 1;
                    }
                }
                i27 = i29;
                i29 = i27 + 1;
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SportScrollReportUIC", "handleScrollReport: dataList is null");
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
