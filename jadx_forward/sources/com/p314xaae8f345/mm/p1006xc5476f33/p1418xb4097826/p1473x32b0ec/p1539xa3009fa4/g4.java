package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class g4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f198644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198644d = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator it = this.f198644d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of ofVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f4) it.next());
            ofVar.getClass();
            if (i17 == 20010 && intent != null) {
                android.content.Context context = ofVar.f199914d;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
                if (abstractActivityC21394xb3d2c0cf == null) {
                    continue;
                } else {
                    android.net.Uri data = intent.getData();
                    java.lang.String path = data != null ? data.getPath() : null;
                    android.net.Uri data2 = intent.getData();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(data2 != null ? data2.getPath() : null)) {
                        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l;
                        ((ub0.r) oVar).getClass();
                        path = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(abstractActivityC21394xb3d2c0cf, intent, str);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansClubAnnouncementEditWidget", "filePath[" + path + "] " + intent);
                    if (path == null) {
                        continue;
                    } else {
                        ofVar.f200832w = path;
                        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(path);
                        java.lang.String str2 = a17.f294812f;
                        if (str2 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                            if (!str2.equals(l17)) {
                                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                            }
                        }
                        java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "openRead(...)");
                        android.graphics.Bitmap O = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(D);
                        android.widget.ImageView imageView = ofVar.f200823n;
                        if (imageView == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentCoverView");
                            throw null;
                        }
                        imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(context.getResources(), O));
                        android.view.View view = ofVar.f200822m;
                        if (view == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverContainer");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view2 = ofVar.f200821i;
                        if (view2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goSelectPhotoView");
                            throw null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ofVar.B();
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f198644d.clear();
    }
}
