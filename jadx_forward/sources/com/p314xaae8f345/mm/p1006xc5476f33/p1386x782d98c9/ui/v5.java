package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class v5 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 f181239d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7) {
        this.f181239d = activityC13477xb2a3ecd7;
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
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7.V;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7 = this.f181239d;
        activityC13477xb2a3ecd7.e7();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC13477xb2a3ecd7.D)) {
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC13477xb2a3ecd7.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        z32.e0 e0Var = (z32.e0) pf5.z.f435481a.a(activity).a(z32.e0.class);
        java.util.List list2 = activityC13477xb2a3ecd7.f180867e.f181046p;
        e0Var.getClass();
        if (list2 != null) {
            int i28 = 0;
            while (i28 < i18) {
                int i29 = i17 + i28;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = e0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity2).a(te5.y1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                te5.y1 y1Var = (te5.y1) a17;
                if (y1Var.P6().contains(java.lang.String.valueOf(i29))) {
                    list = list2;
                } else {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                    if (i29 <= arrayList2.size() - 1 && (dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) arrayList2.get(i29)).f180980a) != null && (ed6Var = dVar.f67223x448d7120) != null) {
                        int i37 = ed6Var.f454868o;
                        a42.c cVar = a42.c.f82733a;
                        if (i37 != 0) {
                            list = list2;
                            if (i37 == 1) {
                                try {
                                    int i38 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(new org.json.JSONObject(ed6Var.f454866m).optString("finder_username")) ? 1 : 2;
                                    java.lang.String appName = ed6Var.f454861e;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appName, "appName");
                                    java.lang.String field_username = dVar.f67224xdec927b;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                                    cVar.a(1, 2, appName, i38, 2, field_username);
                                } catch (org.json.JSONException unused) {
                                }
                            }
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("21f9d636b41b25be", ed6Var.f454860d)) {
                            java.lang.String m158362x2fec8307 = e0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jjh);
                            java.lang.String field_username2 = dVar.f67224xdec927b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username2, "field_username");
                            cVar.a(1, 1, m158362x2fec8307, 2, 2, field_username2);
                        } else {
                            list = list2;
                            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ni(dVar.f67223x448d7120.f454860d, new z32.d0(1, dVar));
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
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7.V;
        this.f181239d.e7();
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
